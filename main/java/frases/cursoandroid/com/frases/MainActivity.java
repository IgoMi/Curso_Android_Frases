package frases.cursoandroid.com.frases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int naoRepita; //Criada variavel que será utilizada para usar que a mesma frase se repita 2 vezes seguidas
    private Button botao; //Variavel do botão
    private TextView frasesText; //Variavel do textView
    private String frases[] = {
            "Frase 1", "Frase 2", "Frase 3", "Frase 4", "Frase 5", "Frase 6", "Frase 7", "Frase 8", "Frase 9", "Frase 10",
            "Frase 11", "Frase 12", "Frase 13", "Frase 14", "Frase 15", "Frase 16", "Frase 17", "Frase 18", "Frase 19", "Frase 20",
            "Frase 21", "Frase 22", "Frase 23", "Frase 24", "Frase 25", "Frase 26", "Frase 27", "Frase 28", "Frase 29", "Frase 30",
            "Frase 31", "Frase 32", "Frase 33", "Frase 34", "Frase 35", "Frase 36", "Frase 37", "Frase 38", "Frase 39", "Frase 40"
    }; //Array de frases que serão exibidas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoFraseId); // Variavel associada ao respectivo ID
        frasesText = (TextView) findViewById(R.id.frasesId); // Variavel associada ao respectivo ID

        botao.setOnClickListener(new View.OnClickListener() { //Inicio da ação a ser executada ao pressionar o botão Nova frase
            @Override
            public void onClick(View view) {
                Random fraseAleatoria = new Random(); //Inicia variavel que gera números aleatorios
                int numFrase =  fraseAleatoria.nextInt(frases.length); //Inicia variavel que vai armazenar os números aleatorios usando como parametro o tamanho maximo da Array das frases

                while (naoRepita == numFrase) { // Testa se o numero da Array indicada é repitido e em caso positivo gera um novo número
                    numFrase =  fraseAleatoria.nextInt(frases.length);
                }

                frasesText.setText(frases[numFrase]); //Atribui a frase ao textView
                naoRepita = numFrase; //Salva o número do Array para verificar repetição
            }
        });

    }
}

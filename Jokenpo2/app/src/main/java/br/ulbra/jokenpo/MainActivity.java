package br.ulbra.jokenpo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;

    private TextView txtPlacar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Inicializando os ImageViews e TextViews
        ImageView pedra = findViewById(R.id.imageViewPedra);
        ImageView papel = findViewById(R.id.imageViewPapel);
        ImageView tesoura = findViewById(R.id.imageViewTesoura);
        txtPlacar = findViewById(R.id.txtPlacar);
        Button reiniciar = findViewById(R.id.btnReiniciar);

        // Definindo os ouvintes de clique
        pedra.setOnClickListener(this::selecionarPedra);
        papel.setOnClickListener(this::selecionarPapel);
        tesoura.setOnClickListener(this::selecionarTesoura);

        // Ouvinte do botão de reinício
        reiniciar.setOnClickListener(this::reiniciarJogo);
    }

    public void selecionarPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }

    public void selecionarPapel(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void selecionarTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String opcaSelecionada) {
        ImageView imageresultado = findViewById(R.id.imageResultado);
        TextView txtResultado = findViewById(R.id.txtResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp) {
            case "Pedra":
                imageresultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imageresultado.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imageresultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((opcaoApp.equals("Tesoura") && opcaSelecionada.equals("Papel")) ||
                (opcaoApp.equals("Papel") && opcaSelecionada.equals("Pedra")) ||
                (opcaoApp.equals("Pedra") && opcaSelecionada.equals("Tesoura"))) {
            txtResultado.setText("VOCÊ PERDEU XIRU!!! (っ °Д °;)っ");
            derrotas++;
        } else if ((opcaSelecionada.equals("Tesoura") && opcaoApp.equals("Papel")) ||
                (opcaSelecionada.equals("Papel") && opcaoApp.equals("Pedra")) ||
                (opcaSelecionada.equals("Pedra") && opcaoApp.equals("Tesoura"))){
            txtResultado.setText("VOCÊ VENCEU! PARABÉNS!!! ╰(*°▽°*)╯");
            vitorias++;
        } else {
            txtResultado.setText("EMPATE! O_O");
            empates++;
        }

        // Atualiza o placar
        atualizarPlacar();

        // Mostra um toast
        Toast.makeText(this, "Foi clicado em: " + opcaSelecionada, Toast.LENGTH_SHORT).show();
    }

    private void atualizarPlacar() {
        txtPlacar.setText("Vitórias: " + vitorias + " | Derrotas: " + derrotas + " | Empates: " + empates);
    }

    public void reiniciarJogo(View view) {
        vitorias = 0;
        derrotas = 0;
        empates = 0;

        // Limpa o resultado e o placar
        ImageView imageresultado = findViewById(R.id.imageResultado);
        TextView txtResultado = findViewById(R.id.txtResultado);
        imageresultado.setImageResource(R.drawable.padrao); // Ou outra imagem padrão
        txtResultado.setText("");
        atualizarPlacar();
    }
}

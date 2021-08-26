package com.ezequieldaniel.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewJogar = findViewById(R.id.imageViewJogar);

        //Evento click na imagemView
        imageViewJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //Gera numero randominco para o jogo
                int numero = new Random().nextInt(2); //gera apenas 0 1

                //Passa por paramentro o numero para a outra activity
                intent.putExtra("numero", numero);

                startActivity(intent);

            }
        });
    }
}
package com.ezequieldaniel.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageViewResultado;
    private ImageView imageViewVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageViewResultado = findViewById(R.id.imageViewResultado);
        imageViewVoltar = findViewById(R.id.imageViewVoltar);

        //recupera os dados passado por parametro via putExtra
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){
            imageViewResultado.setImageResource(R.drawable.moeda_cara);
        }else
        {
            imageViewResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imageViewVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
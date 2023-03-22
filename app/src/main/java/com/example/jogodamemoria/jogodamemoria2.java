package com.example.jogodamemoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class jogodamemoria2 extends AppCompatActivity {
    EditText P2;
    Button btestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogodamemoria2);
        P2=findViewById(R.id.P2);
        btestar=findViewById(R.id.btestar);

        btestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Palavra2 = P2.getText().toString();

                Intent it = getIntent();
                String resultado = it.getStringExtra("palavra");

                String pag3;
                if (resultado.equalsIgnoreCase(Palavra2)){
                    pag3="Acertou! As palavras são iguais.";

                }
                else {
                    pag3="Errou! As palavras são diferentes.";

                }

                Intent it2 = new Intent(jogodamemoria2.this,jogodamemoria3.class);
                it2.putExtra("result",pag3);
                startActivity(it2);

            }
        });

    }
}
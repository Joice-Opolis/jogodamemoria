package com.example.jogodamemoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class jogodamemoria extends AppCompatActivity {
    EditText P1;
    Button bsalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogodamemoria);
        P1=findViewById(R.id.P1);
        bsalvar=findViewById(R.id.bsalvar);

        bsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Palavra = P1.getText().toString();

                Intent it = new Intent(jogodamemoria.this,jogodamemoria2.class);
                it.putExtra("palavra",Palavra);
                startActivity(it);


            }
        });
    }
}
package com.example.jogodamemoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class jogodamemoria3 extends AppCompatActivity {
    EditText palavrafinal;
    Button bverresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogodamemoria3);
        palavrafinal=findViewById(R.id.palavrafinal);
        bverresultado=findViewById(R.id.bverresultado);

        bverresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = getIntent();
                String resultadofinal = it2.getStringExtra("result");


                palavrafinal.setText(resultadofinal);
            }
        });


    }
}
package com.example.login;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

        public void accederLogin(View view) {

            //Declarar los TextView
            EditText usuario = (EditText) findViewById(R.id.usuario);
            EditText password = (EditText) findViewById(R.id.password);

            String usuarioCadena = usuario.getText().toString();
            String passwordCadena = password.getText().toString();

            Toast.makeText(getApplicationContext(),
                    "usuario: "+usuarioCadena +"\n passwordCadena: "+passwordCadena,
                    Toast.LENGTH_LONG).show();

        }
    }


    }
}
package cl.ist.proyectoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button Aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Aceptar = (Button) findViewById(R.id.btnAceptar);

        Aceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Aceptar = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(Aceptar);
                Snackbar.make(v, "Coloca tus datos", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
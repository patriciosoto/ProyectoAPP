package cl.ist.proyectoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity3 extends AppCompatActivity {
    private Button Volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Volver = (Button) findViewById(R.id.btVolver);

        Volver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Aceptar = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(Aceptar);
            }
        });



    }
}
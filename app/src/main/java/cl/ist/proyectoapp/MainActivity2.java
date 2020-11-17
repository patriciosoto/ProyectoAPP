package cl.ist.proyectoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {
    private Button Aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Aceptar = (Button) findViewById(R.id.btnAceptar);

        Aceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Aceptar = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(Aceptar);
                Snackbar.make(v, "Esos son tus datos", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}

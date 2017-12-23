package mx.com.devare.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button preferencias = (Button) findViewById(R.id.button1);
        Button consulta = (Button) findViewById(R.id.button2);
        final TextView nombre = (TextView) findViewById(R.id.nombre);
        final TextView edad = (TextView) findViewById(R.id.edad);
        final TextView sexo = (TextView) findViewById(R.id.sexo);
        final TextView sonido = (TextView) findViewById(R.id.sonido);

        preferencias.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PantallaPreferencias.class);
                startActivity(i);
            }
        });

        consulta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

                nombre.setText("Nombre: " + sharedPref.getString("nombre", "ol"));
                edad.setText("Mayor de edad: " + sharedPref.getBoolean("mayorDeEdad", false));
                sexo.setText("Sexo: " + sharedPref.getString("sexo", "Mujer"));
                sonido.setText("Sonido: " + sharedPref.getBoolean("sonido", false));
            }
        });
    }


}

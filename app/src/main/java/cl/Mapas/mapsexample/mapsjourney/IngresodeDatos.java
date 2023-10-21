package cl.Mapas.mapsexample.mapsjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IngresodeDatos extends AppCompatActivity {

    private EditText Ubicacion1;
    private EditText Ubicacion2;
    private EditText Ubicacion3;

    private Button agregarButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresode_datos);

        Ubicacion1 = findViewById(R.id.L1);
        Ubicacion1 = findViewById(R.id.L2);
        Ubicacion1 = findViewById(R.id.L3);
        agregarButon = findViewById(R.id.BtAgregar);

        agregarButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ubi1 = Ubicacion1.getText().toString();
                String ubi2 = Ubicacion1.getText().toString();
                String ubi3 = Ubicacion1.getText().toString();

                Intent intent = new Intent(IngresodeDatos.this,MapaMuestra.class);

                intent.putExtra("Ubicacion1", ubi1);
                intent.putExtra("Ubicacion2", ubi2);
                intent.putExtra("Ubicacion3", ubi3);
                startActivity(intent);
            }
        });
    }
}
package cl.Mapas.mapsexample.mapsjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask maps = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,IngresodeDatos.class);
                        startActivity(intent);
                        finish();
            }
        };

        Timer tiempo =  new Timer();
        tiempo.schedule(maps,5000);
    }
}
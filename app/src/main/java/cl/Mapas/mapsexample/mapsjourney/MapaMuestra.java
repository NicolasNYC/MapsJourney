package cl.Mapas.mapsexample.mapsjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaMuestra extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_muestra);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public  void onMapReady(GoogleMap googleMap){
        mMap = googleMap;

        String ubicacion1 = getIntent().getStringExtra("Ubicacion1");
        String[] partes1 = ubicacion1.split(",");
        String latitud1 = partes1[0];
        String longitud1 = partes1[1];
        double lt1 = Double.parseDouble(latitud1);
        double lg1 = Double.parseDouble(longitud1);

        LatLng ubi1 = new LatLng(lt1,lg1);
        mMap.addMarker(new MarkerOptions()
                .position(ubi1)
                .title("Ubicacion 1"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ubi1, 10));

        mMap = googleMap;
        String ubicacion2 = getIntent().getStringExtra("Ubicacion2");
        String[] partes2 = ubicacion2.split(",");
        String latitud2 = partes2[0];
        String longitud2 = partes2[1];
        double lt2 = Double.parseDouble(latitud2);
        double lg2 = Double.parseDouble(longitud2);

        LatLng ubi2 = new LatLng(lt2,lg2);
        mMap.addMarker(new MarkerOptions()
                .position(ubi2)
                .title("Ubicacion 2"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ubi2, 10));

        mMap = googleMap;
        String ubicacion3 = getIntent().getStringExtra("Ubicacion3");
        String[] partes3 = ubicacion3.split(",");
        String latitud3 = partes3[0];
        String longitud3 = partes3[1];
        double lt3 = Double.parseDouble(latitud3);
        double lg3 = Double.parseDouble(longitud3);

        LatLng ubi3 = new LatLng(lt3,lg3);
        mMap.addMarker(new MarkerOptions()
                .position(ubi3)
                .title("Ubicacion3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ubi3, 10));
    }
}


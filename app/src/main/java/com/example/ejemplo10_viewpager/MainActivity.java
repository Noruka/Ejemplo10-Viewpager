package com.example.ejemplo10_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.ejemplo10_viewpager.adapters.AdapterCoche;
import com.example.ejemplo10_viewpager.pojo.Coche;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;

    private ArrayList<Coche> listaCoches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        circleIndicator = findViewById(R.id.circleIndicator);

        inicializarCoches();

        // Crear el adapter con los datos
        AdapterCoche adapterCoche = new AdapterCoche(listaCoches, this);
        // Asociar el adapter al viewPager
        viewPager.setAdapter(adapterCoche);
        // Asociar el circleIndicator al viewPager que le corresponde
        circleIndicator.setViewPager(viewPager);


    }

    private void inicializarCoches(){

        listaCoches = new ArrayList<>();

        listaCoches.add(new Coche(R.drawable.ka, 2, 9000, "KA", "Esto es un KA"));
        listaCoches.add(new Coche(R.drawable.fiest, 3, 10000, "FIESTA", "Esto es un FIESTA"));
        listaCoches.add(new Coche(R.drawable.bmax, 3, 12000, "BMAX", "Esto es un BMAX"));
        listaCoches.add(new Coche(R.drawable.focus, 3, 15000, "FOCUS", "Esto es un FOCUS"));
        listaCoches.add(new Coche(R.drawable.kuga, 4, 18000, "KUGA", "Esto es un KUGA"));
        listaCoches.add(new Coche(R.drawable.mustang, 2, 40000, "MUSTANG", "Esto es un MUSTANG"));
    }

}

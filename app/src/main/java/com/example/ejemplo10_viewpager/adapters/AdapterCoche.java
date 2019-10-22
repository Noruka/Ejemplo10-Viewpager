package com.example.ejemplo10_viewpager.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.ejemplo10_viewpager.R;
import com.example.ejemplo10_viewpager.pojo.Coche;

import java.text.NumberFormat;
import java.util.ArrayList;

public class AdapterCoche extends PagerAdapter{


    // Los datos
    private ArrayList<Coche> listaCoches;

    // Contexto
    private Context contexto;

    // LayoutInflater
    private LayoutInflater layoutInflater;

    public AdapterCoche(ArrayList<Coche> listaCoches, Context contexto) {
        this.listaCoches = listaCoches;
        this.contexto = contexto;
        layoutInflater = LayoutInflater.from(contexto);

    }

    /*
    * Para indicar cuantas PAGES tienes que crear
    * @return
    * */

    @Override
    public int getCount() {
        return listaCoches.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals((View) object);
    }

    /**
     * dar valores cada una de las pages que se crearan
     * @param container
     * @param position
     * @return
     */

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = layoutInflater.inflate(R.layout.coche_layout, container, false);

        ImageView img = view.findViewById(R.id.imgCoche);
        RatingBar rt = view.findViewById(R.id.ratingBar);
        TextView txtModelo = view.findViewById(R.id.txtModelo);
        TextView txtPrecio = view.findViewById(R.id.txtPrecio);
        TextView txtDescripcion = view.findViewById(R.id.txtDescripcion);

        Coche c = listaCoches.get(position);
        img.setImageResource(c.getImagen());
        rt.setRating(c.getRating());
        txtModelo.setText(c.getModelo());
        txtDescripcion.setText(c.getDescricpcion());
        //NUmber format -> obtener del formato del telefono
        txtPrecio.setText(NumberFormat.getCurrencyInstance().format(c.getPrecio()));


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);

    }
}

package com.example.probando;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Prueba extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_prueba, container, false);

        Button btnConfguracion = (Button) view.findViewById(R.id.pruebaa3);
        btnConfguracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Probando probando4= new Probando();

                FragmentManager fragmentManager = getFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, probando4)
                        .commit();
            }
        });

        return view;
    }
}
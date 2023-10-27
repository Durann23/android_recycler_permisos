package com.example.android_recycler_permisos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android_recycler_permisos.models.Permiso;
import android.Manifest;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        RecyclerView rvPermiso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Permiso> ListaPermisos = new ArrayList<>();
        ListaPermisos.add(new Permiso(Manifest.permission.CALL_PHONE,"Llamar"));
        ListaPermisos.add(new Permiso(Manifest.permission.CAMERA,"Camara"));


    }
}
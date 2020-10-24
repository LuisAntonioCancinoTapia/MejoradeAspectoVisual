package com.example.mejoradeaspectovisual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> element;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        element = new ArrayList<>();
        element.add(new ListElement("#775447","Luis","Perú","Activo"));
        element.add(new ListElement("#607d8b","Pedro","Mexico","Activo"));
        element.add(new ListElement("#03a9f4","Julio","Chile","Cancelado"));
        element.add(new ListElement("#f44336","Maria","Argentina","Inactivo"));
        element.add(new ListElement("#009688","Armando","Colombia","Activo"));
        element.add(new ListElement("#775447","Luis","Perú","Activo"));
        element.add(new ListElement("#607d8b","Pedro","Mexico","Activo"));
        element.add(new ListElement("#03a9f4","Julio","Chile","Cancelado"));

        ListAdapter listAdapter = new ListAdapter(element, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }
}
package com.example.ricyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("A Muhtar Mertadiwirya", "Ayah", getDrawable(R.drawable.ayah)));
        keluargaArrayList.add(new Keluarga("Endah Tri Yuli P", "Mama", getDrawable(R.drawable.ibuk)));
        keluargaArrayList.add(new Keluarga("Vidya Khansha", "Kakak1", getDrawable(R.drawable.kakak)));
        keluargaArrayList.add(new Keluarga("Naufal Dzaka A", "Kakak2", getDrawable(R.drawable.diriq)));
        keluargaArrayList.add(new Keluarga("Pandya Izazur R", "Adik", getDrawable(R.drawable.adik)));
    }
}

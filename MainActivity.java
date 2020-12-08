package com.example.gisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.esri.arcgisruntime.mapping.view.MapView;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;

public class MainActivity extends AppCompatActivity {

    private MapView map;
    private ArcGISMap AGmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = findViewById(R.id.wenceMapView);
        AGmap = new ArcGISMap(Basemap.Type.OPEN_STREET_MAP, 43.8231, 111.7924, 7);
        map.setMap(AGmap);
        
    }

    @Override
    protected void onPause() {
        super.onPause();
        map.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        map.resume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        map.dispose();

    }

}
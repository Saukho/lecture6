package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewPresident;
    private TextView textViewPresident;

    private ArrayList<String> presidents;
    public static final String EXTRA = "presInd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPresident = findViewById(R.id.listViewPresident);

        listViewPresident.setAdapter(new ArrayAdapter<President>(
                this,
                R.layout.layout_president_info,
                PresidentData.getInstance().getPresidents()
        ));

        listViewPresident.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nextActivity = new Intent(MainActivity.this, PresidentDetailActivity.class);
                nextActivity.putExtra(EXTRA, ""+i);
                startActivity(nextActivity);

            }
        });
    }
}
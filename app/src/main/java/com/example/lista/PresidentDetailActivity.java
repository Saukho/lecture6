package com.example.lista;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PresidentDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.president_details);
        TextView presidentName = findViewById(R.id.textViewName);
        TextView presidentSeasonStart = findViewById(R.id.textViewStartDate);
        TextView presidentSeasonEnd = findViewById(R.id.textViewEndDate);
        TextView presidentDetail = findViewById(R.id.textViewDetail);
        int presInd = Integer.parseInt(getIntent().getStringExtra(MainActivity.EXTRA));

        presidentName.setText(PresidentData.getInstance().getPresidents().get(presInd).getName());
        presidentSeasonStart.setText(String.valueOf(PresidentData.getInstance().getPresidents().get(presInd).getStartDate()));
        presidentSeasonEnd.setText(String.valueOf(PresidentData.getInstance().getPresidents().get(presInd).getEndDate()));
        presidentDetail.setText(PresidentData.getInstance().getPresidents().get(presInd).getDescription());

    }
}

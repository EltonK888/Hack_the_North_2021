package com.example.formai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_activity);

        ImageView homeButton = findViewById(R.id.imageView);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void goToFormCheckActivity(View view) {
        Intent intent = new Intent(this, FormCheckActivity.class);
        intent.putExtra("source", view.getTag().toString());
        startActivity(intent);
    }

}
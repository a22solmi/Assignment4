package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        TextView text = findViewById(R.id.child_text);
        ConstraintLayout layout = findViewById(R.id.layout_child);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("string");
            int color = extras.getInt("color");
            text.setText(string);
            layout.setBackgroundColor(getResources().getColor(color));
        }
    }
}
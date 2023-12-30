package com.example.l6homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        EditText editText = findViewById(R.id.et_text);
        EditText editText1 = findViewById(R.id.et_ili);
        Button button = findViewById(R.id.button);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (!editText.getText().toString().isEmpty() || !editText1.getText().toString().isEmpty()) {
            button.setBackgroundColor(R.color.orange);
        }
    }
}
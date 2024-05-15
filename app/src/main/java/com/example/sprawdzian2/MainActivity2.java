package com.example.sprawdzian2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private static ArrayList images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        images.add(R.drawable.zdj1);
        images.add(R.drawable.zdj2);
        images.add(R.drawable.zdj3);
        images.add(R.drawable.zdj4);
        images.add(R.drawable.zdj5);
        images.add(R.drawable.zdj6);
        images.add(R.drawable.zdj7);

        Random random = new Random();
        ImageView imageView = findViewById(R.id.imageView4);
        imageView.setImageResource((Integer) images.get(random.nextInt(images.size()-1)));

        Bundle bundle = getIntent().getExtras();
        String details = bundle.getString("details");

        TextView detailsView = findViewById(R.id.details);
        detailsView.setText(details);
    }
}
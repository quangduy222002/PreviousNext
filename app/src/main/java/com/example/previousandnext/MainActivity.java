package com.example.previousandnext;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button next, previous;
    int i = 0;
    private int[] textureArrayWin = {R.drawable.image2, R.drawable.image3, R.drawable.image1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);

        updateImageAndButtons();

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                updateImageAndButtons();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                updateImageAndButtons();
            }
        });
    }

    private void updateImageAndButtons() {
        if (i == 0) {
            previous.setVisibility(View.GONE);
        } else {
            previous.setVisibility(View.VISIBLE);
        }

        if (i == textureArrayWin.length - 1) {
            next.setVisibility(View.GONE);
        } else {
            next.setVisibility(View.VISIBLE);
        }

        imageView.setImageResource(textureArrayWin[i]);
    }
}

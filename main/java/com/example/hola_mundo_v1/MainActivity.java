package com.example.hola_mundo_v1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView animated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        animated = (TextView)findViewById(R.id.txt);
    }

    public void mov1 (View view){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.movt_1);
        animated.startAnimation(animation);
    }
    public void mov2 (View view){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.movt_2);
        animated.startAnimation(animation);
    }
    public void mov3 (View view){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.movt_3);
        animated.startAnimation(animation);
    }
}
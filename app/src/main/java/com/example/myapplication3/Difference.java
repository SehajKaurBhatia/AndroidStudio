package com.example.myapplication3;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Difference extends AppCompatActivity {

    private TextView textView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difference_xml);

        textView = findViewById(R.id.textView2);
        textView.setText("Counter: " + counter);


    }

    private void updateCounter() {
        counter++;
        textView.setText("Counter: " + counter);
    }


    private void someEventTriggered() {

        updateCounter();
    }
}

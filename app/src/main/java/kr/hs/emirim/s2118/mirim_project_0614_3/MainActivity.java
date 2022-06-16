package kr.hs.emirim.s2118.mirim_project_0614_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper vFlip;
    EditText editInterval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vFlip = findViewById(R.id.vflip);

        Button btnStart = findViewById(R.id.btn_start);
        Button btnStop = findViewById(R.id.btn_stop);
        Button btnSecond = findViewById(R.id.btn_second);
        editInterval = findViewById(R.id.edit_interval);
        btnStart.setOnClickListener(btnListener);
        btnStop.setOnClickListener(btnListener);
        btnSecond.setOnClickListener(btnListener);
        vFlip.setFlipInterval(1000);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_start:
                    vFlip.startFlipping();
                    break;
                case R.id.btn_stop:
                    vFlip.stopFlipping();
                    break;
                case R.id.btn_second:
                    int second = Integer.parseInt(editInterval.getText().toString());
                    vFlip.setFlipInterval(second*1000);
                    break;
            }
        }
    };
}
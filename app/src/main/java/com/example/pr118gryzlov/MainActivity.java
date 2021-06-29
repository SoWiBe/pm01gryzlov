package com.example.pr118gryzlov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton firstBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void checkClick(View v){
        String result = "";
        switch (v.getId()){
            case R.id.imageButton3:
                result = "1";
                break;
            case R.id.imageButton4:
                result = "2";
                break;
            case R.id.imageButton5:
                result = "3";
                break;
            case R.id.imageButton7:
                result = "4";
                break;
            case R.id.imageButton9:
                result = "5";
                break;
        }
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

}
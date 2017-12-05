package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void gotofunc1(View v)
    {
        Intent intent = new Intent(this, Func1Activity.class);
        startActivity(intent);
    }
    public void gotofunc2(View v)
    {
        Intent intent = new Intent(this, Func2Activity.class);
        startActivity(intent);
    }

    public void gotofunc3(View v)
    {
        Intent intent = new Intent(this, Func3Activity.class);
        startActivity(intent);
        Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
        finish();
    }
    public void gotofunc4(View v)
    {
        Intent intent = new Intent(this, Func4Activity.class);
        startActivity(intent);
    }
    public void gotofunc5(View v)
    {
        Intent intent = new Intent(this, Func5Activity.class);
        startActivity(intent);
    }
    public void gotofunc6(View v)
    {
        Intent intent = new Intent(this, Func6Activity.class);
        startActivity(intent);
    }
    public void gotofunc7(View v)
    {
        Intent intent = new Intent(this, Func7Activity.class);
        startActivity(intent);
    }
    public void gotofunc8(View v)
    {
        Intent intent = new Intent(this, Func8Activity.class);
        startActivity(intent);
    }



}

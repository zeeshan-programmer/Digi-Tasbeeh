package com.example.digitaltasbeeh;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button save,getSaved,reset;
    TextView countt;
    ImageView img;
    public int pos;
    public int imgg;
    public int x=0;
    public String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        countt=findViewById(R.id.count);
        save=findViewById(R.id.save);
        getSaved = findViewById(R.id.getSave);
        reset=findViewById(R.id.reset);
        img = findViewById(R.id.img);

        final SharedPreferences sharedPreferences = getSharedPreferences("IMG_POS",MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        Bundle bundle = getIntent().getExtras();
        imgg = bundle.getInt("img");
        pos = bundle.getInt("pos");
        img.setImageResource(imgg);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x=x+1;
                countt.setText(String.valueOf(x));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("str"+pos,Integer.valueOf(countt.getText().toString()));
                editor.commit();
                x=0;
                countt.setText(String.valueOf(x));
                Toast.makeText(getApplicationContext(),"SAVED",Toast.LENGTH_SHORT).show();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=0;
                countt.setText(String.valueOf(x));
            }
        });
        getSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sharedPreferences.contains(("str"+pos))){
                    int j = sharedPreferences.getInt("str"+pos,0);
                    countt.setText(String.valueOf(j));
                    x = Integer.valueOf(countt.getText().toString());
                }
            }
        });
    }
}

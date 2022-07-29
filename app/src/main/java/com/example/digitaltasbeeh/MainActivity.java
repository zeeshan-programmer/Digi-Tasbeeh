package com.example.digitaltasbeeh;

import android.content.Context;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView grd;
    int pics[]={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,
            R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10,R.drawable.i11,R.drawable.i12,
            R.drawable.i13,R.drawable.i14,R.drawable.i15,R.drawable.i16,R.drawable.i17,R.drawable.i18,
            R.drawable.i19,R.drawable.i20,R.drawable.i21,R.drawable.i22,R.drawable.i23,
            R.drawable.i24,R.drawable.i25,R.drawable.i26,R.drawable.i27,R.drawable.i28,R.drawable.i29,
            R.drawable.i30,R.drawable.i31,R.drawable.i32,R.drawable.i33,R.drawable.i34,R.drawable.i35,
            R.drawable.i36,R.drawable.i37,R.drawable.i38,R.drawable.i39,R.drawable.i40,R.drawable.i41,
            R.drawable.i42,R.drawable.i43,R.drawable.i44,R.drawable.i45,R.drawable.i46,R.drawable.i47,
            R.drawable.i48,R.drawable.i49,R.drawable.i50,R.drawable.i51,R.drawable.i52,R.drawable.i53,
            R.drawable.i54,R.drawable.i55,R.drawable.i56,R.drawable.i57,R.drawable.i58,R.drawable.i59,
            R.drawable.i60,R.drawable.i61,R.drawable.i62,R.drawable.i63,R.drawable.i64,R.drawable.i65,
            R.drawable.i66,R.drawable.i67,R.drawable.i68,R.drawable.i69,R.drawable.i70,R.drawable.i71,
            R.drawable.i72,R.drawable.i73,R.drawable.i74,R.drawable.i75,R.drawable.i76,R.drawable.i77,
            R.drawable.i78,R.drawable.i79,R.drawable.i80,R.drawable.i81,R.drawable.i82,R.drawable.i83,
            R.drawable.i84,R.drawable.i85,R.drawable.i86,R.drawable.i87,R.drawable.i88,R.drawable.i89,R.drawable.i90,
            R.drawable.i91,R.drawable.i92,R.drawable.i93,R.drawable.i94,R.drawable.i95,R.drawable.i96,
            R.drawable.i97,R.drawable.i98,R.drawable.i99};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grd = findViewById(R.id.grd);
        adapter adapter=new adapter(getApplicationContext(),pics);
        grd.setAdapter(adapter);

        grd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("img",pics[position]);
                i.putExtra("pos",position);
                startActivity(i);
            }
        });
    }
}

package com.firstwork.redrock.neteasesurface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class MainSurface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_surface);
        Button login =  (Button) findViewById(R.id.login);
        Button register = (Button)  findViewById(R.id.register);
        ImageView qq =(ImageView)   findViewById(R.id.qq);
        ImageView vx =(ImageView)   findViewById(R.id.vx);
        ImageView wb = (ImageView)  findViewById(R.id.wb);
        ImageView wy =(ImageView) findViewById(R.id.wy);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(MainSurface.this,RegisterSurface.class);
                startActivity(regIntent);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logIntent = new Intent(MainSurface.this,LoginSurface.class);
                startActivity(logIntent);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainSurface.this,"qq注册功能未实现！",Toast.LENGTH_SHORT).show();
            }
        });
        vx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainSurface.this,"微信注册功能未实现！",Toast.LENGTH_SHORT).show();
            }
        });
        wb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainSurface.this,"微博注册功能未实现！",Toast.LENGTH_SHORT).show();
            }
        });
        wy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainSurface.this,"网易邮箱注册功能未实现！",Toast.LENGTH_SHORT).show();
            }
        });


    }
}

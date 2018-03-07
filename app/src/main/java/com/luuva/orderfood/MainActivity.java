package com.luuva.orderfood;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        Toast.makeText(MainActivity.this,"Bạn chọn Home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_noti:
                        Toast.makeText(MainActivity.this,"Bạn chọn Thông báo",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_acc:
                        Toast.makeText(MainActivity.this,"Bạn chọn Tài khoản",Toast.LENGTH_SHORT).show();
                        break;

                }
                return true;
            }
        });
    }
}

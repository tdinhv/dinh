package com.luuva.orderfood;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import com.luuva.adapter.CategoryAdapter;
import com.luuva.model.Category;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvCategory;
    ArrayList<Category> categories;
    CategoryAdapter adapter;
    HomeFragment homeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment =null;
                switch (item.getItemId()){
                    case R.id.action_home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.action_noti:
                        fragment = new NotificationsFragment();
                        break;
                    case R.id.action_acc:
                        Intent intent = new Intent(MainActivity.this, MainLoginActivity.class);
                        startActivity(intent);
                        break;

                }
                return loadFragment(fragment);
            }
        });
        loadFragment(new HomeFragment());
//        addControll();
//        addEvent();

    }

//    private void addEvent() {
//
//    }

    /*@SuppressLint("ResourceType")
    private void addControll() {

        categories = new ArrayList<>();
        categories.add(new Category(1,"Cơm",R.drawable.rice));
        categories.add(new Category(2,"Đồ ăn",R.drawable.rice));
        categories.add(new Category(3,"Thức uống",R.drawable.rice));
        categories.add(new Category(4,"Tráng miệng",R.drawable.rice));
        categories.add(new Category(5,"Nhà làm",R.drawable.rice));
        categories.add(new Category(6,"Đồ ăn nhẹ",R.drawable.rice));

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //add a fragment
        homeFragment = new HomeFragment();
        fragmentTransaction.add(R.id.fragment_container,homeFragment);
        fragmentTransaction.commit();

        gvCategory = findViewById(R.id.gvCategory);


        adapter = new CategoryAdapter(MainActivity.this,R.layout.gv_item,categories);
        gvCategory.setAdapter(adapter);
    }*/

    private boolean loadFragment(Fragment fragment){
        if (fragment!=null){
            getFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }


}

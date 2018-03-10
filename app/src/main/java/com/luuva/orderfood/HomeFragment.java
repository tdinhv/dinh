package com.luuva.orderfood;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.luuva.adapter.CategoryAdapter;
import com.luuva.model.Category;

import java.util.ArrayList;

/**
 * Created by luuva on 3/9/2018.
 */

public class HomeFragment extends Fragment {

    GridView gvCategory;
    ArrayList<Category> categories;
    CategoryAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        gvCategory = view.findViewById(R.id.gvCategory);

        categories = new ArrayList<>();
        categories.add(new Category(1,"Cơm",R.drawable.rice));
        categories.add(new Category(2,"Đồ ăn",R.drawable.food));
        categories.add(new Category(3,"Thức uống",R.drawable.drinks));
        categories.add(new Category(4,"Tráng miệng",R.drawable.fruit));
        categories.add(new Category(5,"Nhà làm",R.drawable.homefood));
        categories.add(new Category(6,"Đồ ăn nhẹ",R.drawable.snacks));

        adapter = new CategoryAdapter(getActivity(),R.layout.gv_item,categories);
        gvCategory.setAdapter(adapter);
        return view;
    }




}

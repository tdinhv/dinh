package com.luuva.orderfood;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by luuva on 3/9/2018.
 */

public class UserFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user,null);
    }
}
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by NhuongPH on 3/24/2018.
 */
    public class UserFragment extends Fragment {
        TextView tvTT;
        ListView lvItem;
        ArrayList<String> items;
        ArrayAdapter<String> adapter;
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_user,container,false);
            tvTT = view.findViewById(R.id.btnInformation);
            lvItem = view.findViewById(R.id.lvItem);

            items = new ArrayList<>();
            items.add("Lịch sử");
            items.add("Yêu thích");
            items.add("PayNow");
            items.add("Điạ chỉ");
            items.add("Hóa đơn");
            items.add("Mời bạn bè");
            items.add("Góp ý");
            items.add("Chính sách quy định");
            items.add("Cài đặt");

            adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,items);
            lvItem.setAdapter(adapter);
            tvTT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    thongTin(view);
                }
            });
            return view;
        }

        public void thongTin(View view){
            Intent intent = new Intent(view.getContext(),UserInformation.class) ;
            startActivity(intent);
        }

}


package com.luuva.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.luuva.model.Product;
import com.luuva.orderfood.R;
import java.util.List;

/**
 * Created by My PC on 3/24/2018.
 */

public class ProductAdapter extends ArrayAdapter<Product> {

    Activity context;
    int resource;
    List<Product> objects;

    public ProductAdapter(@NonNull Activity context, int resource, @NonNull List<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View view = inflater.inflate(R.layout.list_product, null);
        Product product = this.objects.get(position);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewProduct);
        imageView.setImageResource(product.getPicture());

        TextView textViewName = (TextView) view.findViewById(R.id.tvProductName);
        textViewName.setText(product.getName());

        TextView textViewPrice = (TextView) view.findViewById(R.id.tvProductPrice);
        textViewPrice.setText("Giá: " + product.getPrice() + "Đ");

        return view;
    }
}

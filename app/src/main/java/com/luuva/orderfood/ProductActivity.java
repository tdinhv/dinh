package com.luuva.orderfood;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.luuva.adapter.ProductAdapter;
import com.luuva.model.Product;
import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    private ListView lvProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        lvProduct = (ListView) findViewById(R.id.lv_Product);
        ArrayList<Product> arrProduct = new ArrayList<>();

        Product objProduct1 = new Product(1,2,25000,"Hủ tiếu",R.drawable.anh1);
        Product objProduct2 = new Product(1,2,25000,"Hủ tiếu",R.drawable.anh2);
        Product objProduct3 = new Product(1,2,25000,"Hủ tiếu",R.drawable.anh3);
        Product objProduct4 = new Product(1,2,25000,"Hủ tiếu",R.drawable.anh4);
        Product objProduct5 = new Product(1,2,25000,"Hủ tiếu",R.drawable.anh5);
        Product objProduct6 = new Product(1,2,25000,"Hủ tiếu",R.drawable.anh6);

        arrProduct.add(objProduct1);
        arrProduct.add(objProduct2);
        arrProduct.add(objProduct3);
        arrProduct.add(objProduct4);
        arrProduct.add(objProduct5);
        arrProduct.add(objProduct6);

        ProductAdapter productAdapter = new ProductAdapter(ProductActivity.this,R.layout.list_product,arrProduct);
        lvProduct.setAdapter(productAdapter);
    }
}

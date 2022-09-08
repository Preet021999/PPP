package com.example.ppp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name,dest,price,height,width;
    Button btn;
    DatabaseReference truck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        dest = findViewById(R.id.dest);
        price = findViewById(R.id.price);
        height = findViewById(R.id.height);
        width = findViewById(R.id.width);
        btn = findViewById(R.id.btn);
        truck = FirebaseDatabase.getInstance().getReference().child("Order");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertOrderData();
            }
        });
    }

    private void insertOrderData() {
        String cusname = name.getText().toString();
        String cusdest = dest.getText().toString();
        String orderprice = price.getText().toString();
        String pheight = height.getText().toString();
        String pwidth = width.getText().toString();

        order Order = new order(cusname,cusdest,orderprice,pheight,pwidth);

        truck.push().setValue(Order);
        Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();

    }
}
package com.example.quideestore;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyOrdersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private OrderAdapter orderAdapter;
    private List<Order> orderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_orders);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        orderList = new ArrayList<>();
        orderAdapter = new OrderAdapter(this, orderList);
        recyclerView.setAdapter(orderAdapter);

        loadOrders();
    }

    private void loadOrders() {
        // Simulating API call
        orderList.add(new Order("Order Placed", "R$ 36,00", "Cacau Show - Jardins", "Bombons Gourmet 470g", "Q12345", "12:04", "12:30"));
        orderList.add(new Order("Waiting for payment", "R$ 36,00", "Cacau Show - Jardins", "Bombons Gourmet 470g", "Q12345", "12:04", "12:30"));
        orderList.add(new Order("Waiting for payment", "R$ 36,00", "Cacau Show - Jardins", "Bombons Gourmet 470g", "Q12345", "12:04", "12:30"));

        orderAdapter.notifyDataSetChanged();
    }

}
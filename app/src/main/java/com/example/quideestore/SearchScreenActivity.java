package com.example.quideestore;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchScreenActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StoreAdapter storeAdapter;
    private List<Store> storeList;
    private List<Store> filteredStoreList;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.searchView);

        storeList = new ArrayList<>();
        filteredStoreList = new ArrayList<>();

        // Sample data
        storeList.add(new Store("Cacau Show - Jardins", "4.9 - Chocolates", "60-80 min - R$ 5,99", R.drawable.ic_store));
        storeList.add(new Store("Cacau Show - Morumbi", "4.9 - Chocolates", "60-80 min - R$ 5,99", R.drawable.ic_store));
        storeList.add(new Store("Cacau Show - Bela Vista", "4.9 - Chocolates", "60-80 min - R$ 5,99", R.drawable.ic_store));
        storeList.add(new Store("Cacau Show - Itaquera", "4.9 - Chocolates", "60-80 min - R$ 5,99", R.drawable.ic_store));
        storeList.add(new Store("Cacau Show - Berrini", "4.9 - Chocolates", "60-80 min - R$ 5,99", R.drawable.ic_store));

        filteredStoreList.addAll(storeList);

        storeAdapter = new StoreAdapter(filteredStoreList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(storeAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });
    }

    private void filter(String text) {
        filteredStoreList.clear();
        for (Store store : storeList) {
            if (store.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredStoreList.add(store);
            }
        }
        storeAdapter.notifyDataSetChanged();
    }
}

package com.exmple.netclanexplorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Explore extends AppCompatActivity {

    ImageView nextpage;

    RecyclerView recyclerView;

    SearchView searchView;

    List<Item> items;

    MyAdapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);


        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

        nextpage = findViewById(R.id.nextpage);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        recyclerView = findViewById(R.id.recycleview);

         items = new ArrayList<Item>();
        items.add(new Item("Poonam Verma","Indore,Within 13.8KM","Software Engineer","Charges INR 30000 Per Month","Prefer with Indore,Madhay Pradesh,India","Application Tester"));
        items.add(new Item("Shivnanda Malakar","Indore,Within 21.5KM","Software Testing Engineer","Charges INR 30000 Per Month","Prefer with Indore,Madhay Pradesh,India","software Testing Engineer"));
        items.add(new Item("Siddhartha Jhariya","Indore,Within 24.9KM","Fresher","","Prefer with Indore,Madhay Pradesh,India","BPO Executive"));
        items.add(new Item("Rahul Chouhan","Indore,Within 25.1KM","Software Tester","Charges INR 30000 Per Month","Prefer with Indore,Madhay Pradesh,India","Manual Tester"));
        items.add(new Item("Komal Deshmukh","Pune,Within 26.2KM","QA Engineer","Charges INR 35000 Per Month","Prefer with Pune,Maharashta ,India","Job"));
        items.add(new Item("Neha Soni","Indore,Within 26.3KM","UI and UX Designer","Charges INR 80000 Per Month","Prefer with Indore,Madhay Pradesh,India","Aircraft Designer"));
        items.add(new Item("Shubhangi Ranade","Indore,Within 27.1KM","Software Testing Trainee","","Prefer with Indore,Madhay Pradesh,India","Manual Tester"));
        items.add(new Item("Himanshu Mandade","Indore,Within 28.2KM","Developer Webr","Charges INR 400000 Per annum","Prefer with Remote","Testing Engineer"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));




    }

    private void filterList(String newText) {
        List<Item>  filterList = new ArrayList<>();
        for(Item item : items){
            if(item.getName().toLowerCase().contains(newText.toLowerCase())){
                filterList.add(item);
            }
        }
        if(filterList.isEmpty()){
            Toast.makeText(this, "No data Found", Toast.LENGTH_SHORT).show();
        }
        else
        {
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),filterList));

        }
    }
}
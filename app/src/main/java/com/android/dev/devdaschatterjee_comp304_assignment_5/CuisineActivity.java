package com.android.dev.devdaschatterjee_comp304_assignment_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.android.dev.devdaschatterjee_comp304_assignment_5.R.layout.activity_cuisine;

public class CuisineActivity extends AppCompatActivity {
    private ListView listView;
    TextView textView;
    String[] cuisins;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);
        //textView = findViewById(R.id.tvRestaurant);
        //String textViewLabel = getString(R.string.cuisine_selection);
        //textView.setText(textViewLabel);

        listView = findViewById(R.id.listView_cuisine);
        cuisins = getResources().getStringArray(R.array.cuisine);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cuisins);
        listView.setAdapter(adapter);

        cuisineSelection();
    }
    public void cuisineSelection() {


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                       Intent firstIntent = new Intent(CuisineActivity.this,RestaurantActivity.class);
                        firstIntent.putExtra("cuisines", "italian");
                        startActivity(firstIntent);
                        break;
                    case 1:
                        Intent secondIntent = new Intent(CuisineActivity.this,RestaurantActivity.class);
                        secondIntent.putExtra("cuisines", "greek");
                        startActivity(secondIntent);
                        break;
                    case 2:
                        Intent thirdIntent = new Intent(CuisineActivity.this,RestaurantActivity.class);
                        thirdIntent.putExtra("cuisines", "chinese");
                        startActivity(thirdIntent);
                        break;
                    case 3:
                        Intent fourthIntent = new Intent(CuisineActivity.this,RestaurantActivity.class);
                        fourthIntent.putExtra("cuisines", "indian");
                        startActivity(fourthIntent);
                        break;

                }
            }
        });
    }
}

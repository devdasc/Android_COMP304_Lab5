package com.android.dev.devdaschatterjee_comp304_assignment_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RestaurantActivity extends AppCompatActivity {
    String cuisines;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        cuisines = getIntent().getExtras().getString("cuisines");
        listView= findViewById(R.id.restaurantSelection);
        selectRestaurants();


    }
    public void selectRestaurants(){
        if(cuisines.equals("italian")){
            String[] restaurants = getResources().getStringArray(R.array.italian_restaurants);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,restaurants);
            listView.setAdapter(adapter);
            selectItalian();

        }else if(cuisines.equals("greek")){
            String[] restaurants = getResources().getStringArray(R.array.greek_restaurants);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,restaurants);
            listView.setAdapter(adapter);
            selectGreek();

        }else if(cuisines.equals("chinese")){
            String[] restaurants = getResources().getStringArray(R.array.chinese_restaurants);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,restaurants);
            listView.setAdapter(adapter);
            selectChinese();

        }else if(cuisines.equals("indian")){
            String[] restaurants = getResources().getStringArray(R.array.indian_restaurants);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,restaurants);
            listView.setAdapter(adapter);
            selectIndian();

        }
    }
    public void selectItalian(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(RestaurantActivity.this,MapsActivity.class);
                switch(position){

                    case 0://Napoli
                        intent.putExtra("res","Paisano");
                        startActivity(intent);
                        break;
                    case 1://
                        intent.putExtra("res","Sambucas On Church");
                        startActivity(intent);
                        break;
                    case 2://
                        intent.putExtra("res","Scaddabush");
                        startActivity(intent);
                        break;
                    case 3://
                        intent.putExtra("res","Donatello Restaurant");
                        startActivity(intent);
                        break;
                }

            }
        });
    }
    public void selectGreek(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(RestaurantActivity.this,MapsActivity.class);
                switch(position){

                    case 0://Napoli
                        intent.putExtra("res","MR. GREEK");
                        startActivity(intent);
                        break;
                    case 1://
                        intent.putExtra("res","Pantheon Restaurant");
                        startActivity(intent);
                        break;
                    case 2://
                        intent.putExtra("res","Wynona Toronto");
                        startActivity(intent);
                        break;
                    case 3://
                        intent.putExtra("res","Athens Restaurant");
                        startActivity(intent);
                        break;
                }

            }
        });
    }
    public void selectChinese(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(RestaurantActivity.this,MapsActivity.class);
                switch(position){

                    case 0://Napoli
                        intent.putExtra("res","Chung King Garden");
                        startActivity(intent);
                        break;
                    case 1://
                        intent.putExtra("res","Lee Chen Asian Bistro");
                        startActivity(intent);
                        break;
                    case 2://
                        intent.putExtra("res","China Gourmet Takeout");
                        startActivity(intent);
                        break;
                    case 3://
                        intent.putExtra("res","Peking Express");
                        startActivity(intent);
                        break;
                }

            }
        });
    }
    public void selectIndian(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(RestaurantActivity.this,MapsActivity.class);
                switch(position){

                    case 0://
                        intent.putExtra("res","Little India Restaurant");
                        startActivity(intent);
                        break;
                    case 1://
                        intent.putExtra("res","Bindia Indian Bistro");
                        startActivity(intent);
                        break;
                    case 2://
                        intent.putExtra("res","Kothur Indian Cuisine");
                        startActivity(intent);
                        break;
                    case 3://
                        intent.putExtra("res","Bhoj Indian Cuisine");
                        startActivity(intent);
                        break;
                }

            }
        });
    }
}

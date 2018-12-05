package com.android.dev.devdaschatterjee_comp304_assignment_5;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String res;
    private Button mapDisplay;
    private Button sateliteDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        res = getIntent().getExtras().getString("res");
        mapDisplay = findViewById(R.id.display_map);
        sateliteDisplay = findViewById(R.id.display_satellite);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //italian
        if (res.equals("Paisano")){
            //Call method
            italian_Paisano();
        }
        else if (res.equals("Sambucas On Church")){
            //Call method
            italian_Sambucas_On_Church();
        }
        else if (res.equals("Scaddabush")){
            //Call method
            italian_Scaddabush();
        }
        else if (res.equals("Donatello Restaurant")){
            //Call method
            italian_Donatello_Restaurant();
        }//greek
        else if (res.equals("MR. GREEK")){
            //Call method
            greek_MR_GREEK();
        }//
        else if (res.equals("Pantheon Restaurant")){
            //Call method
            greek_Pantheon_Restaurant();
        }
        else if (res.equals("Wynona Toronto")){
            //Call method
            greek_Wynona_Toronto();
        }
        else if (res.equals("Athens Restaurant")){
            greek_Athens_Restaurant();
        }// chinese
        else if (res.equals("Chung King Garden")){
            chinese_Chung_King_Garden();
        }
        else if (res.equals("Lee Chen Asian Bistro")){
            chinese_Lee_Chen_Asian_Bistro();
        }
        else if (res.equals("China Gourmet Takeout")){
            chinese_China_Gourmet_Takeout();
        }
        else if (res.equals("Peking Express")){
            chinese_Peking_Express();
        }//indian
        else if (res.equals("Little India Restaurant")){
            indian_Little_India_Restaurant();
        }
        else if (res.equals("Bindia Indian Bistro")){
            indian_Bindia_Indian_Bistro();
        }
        else if (res.equals("Kothur Indian Cuisine")){
            indian_Kothur_Indian_Cuisine();
        }
        else if (res.equals("Bhoj Indian Cuisine")){
            indian_Bhoj_Indian_Cuisine();
        }

       /* // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
    }

    public void italian_Paisano(){
        //43.7544° N, 79.3501° W
        //865 York Mills Rd #8, North York, ON M3B 1Y6
        LatLng Paisano = new LatLng(43.7544, -79.3501);
        mMap.addMarker(new MarkerOptions()
                .position(Paisano)
                .title("Paisano")
                .snippet("North York" + "\n"
                        + "865 York Mills Rd #8" + "\n"
                        + "ON M3B 1Y6"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Paisano));

        //Call Italian Custom Window
        Italian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void italian_Sambucas_On_Church(){
        //43.7037° N, 79.4137° W
        //516 Eglinton Ave W, Toronto, ON M5N 1A5

        LatLng Sambucas_On_Church = new LatLng(43.7037, -79.4137);
        mMap.addMarker(new MarkerOptions()
                .position(Sambucas_On_Church)
                .title("Paisano")
                .snippet("Toronto" + "\n"
                        + "516 Eglinton Ave W" + "\n"
                        + "ON M5N 1A5"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sambucas_On_Church));

        //Call Italian Custom Window
        Italian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void italian_Scaddabush(){
        //43.6590° N, 79.3829° W
        //382 Yonge St, Toronto, ON M5B 1S8

        LatLng Scaddabush = new LatLng(45.6590, -79.3829);
        mMap.addMarker(new MarkerOptions()
                .position(Scaddabush)
                .title("Scaddabush")
                .snippet("Toronto" + "\n"
                        + "382 Yonge St" + "\n"
                        + "ON M5B 1S8"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Scaddabush));

        //Call Italian Custom Window
        Italian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();
    }

    public void italian_Donatello_Restaurant(){
        //43.6573° N, 79.3835° W
        //37 Elm St, Toronto, ON M5G 1H1

        LatLng Donatello_Restaurant = new LatLng(45.6573, -79.3835);
        mMap.addMarker(new MarkerOptions()
                .position(Donatello_Restaurant)
                .title("Donatello Restaurant")
                .snippet("Toronto" + "\n"
                        + "37 Elm St" + "\n"
                        + "ON M5G 1H1"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Donatello_Restaurant));

        //Call Italian Custom Window
        Italian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }
    // greek
    public void greek_MR_GREEK(){
        //43.7688° N, 79.4692° W
        //333 Bremner Blvd, Toronto, ON M5V 3X9

        LatLng MRGREEK = new LatLng(43.7688, -79.4692);
        mMap.addMarker(new MarkerOptions()
                .position(MRGREEK)
                .title("MR GREEK")
                .snippet("Toronto" + "\n"
                        + "333 Bremner Blvd" + "\n"
                        + "ON M5V 3X9"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MRGREEK));

        //Call Italian Custom Window
        Greek_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void greek_Pantheon_Restaurant(){
        //43.6775° N, 79.3514° W
        //407 Danforth Ave, Toronto, ON M4K 1P1

        LatLng Pantheon_Restaurant = new LatLng(43.6775, -79.3514);
        mMap.addMarker(new MarkerOptions()
                .position(Pantheon_Restaurant)
                .title("Pantheon Restaurant")
                .snippet("Toronto" + "\n"
                        + "407 Danforth Ave" + "\n"
                        + "ON M4K 1P1"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pantheon_Restaurant));

        //Call Italian Custom Window
        Greek_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();
    }

    public void greek_Wynona_Toronto(){
        //43.6671° N, 79.3446° W
        //819 Gerrard St E, Toronto, ON M4M 1Y8

        LatLng Wynona_Toronto = new LatLng(43.6771, -79.3446);
        mMap.addMarker(new MarkerOptions()
                .position(Wynona_Toronto)
                .title("Wynona Toronto")
                .snippet("Toronto" + "\n"
                        + "819 Gerrard St E" + "\n"
                        + "ON M4M 1Y8"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Wynona_Toronto));

        //Call Italian Custom Window
        Greek_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void  greek_Athens_Restaurant(){
        //43.6790° N, 79.3435° W
        //707 Danforth Ave, Toronto, ON M4J 1L2
        LatLng Athens_Restaurant = new LatLng(43.6790, -79.3435);
        mMap.addMarker(new MarkerOptions()
                .position(Athens_Restaurant)
                .title("Athens_Restaurant")
                .snippet("Toronto" + "\n"
                        + "707 Danforth Ave" + "\n"
                        + "ON M4J 1L2"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Athens_Restaurant));

        //Call Greek Custom Window
        Greek_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void chinese_Chung_King_Garden(){
        //43.8062° N, 79.4232° W
        // 7330 Yonge St, Thornhill, ON L4J 7Y7
        LatLng Chung_King_Garden = new LatLng(43.8062, -79.4232);
        mMap.addMarker(new MarkerOptions()
                .position(Chung_King_Garden)
                .title("Chung King Garden{")
                .snippet("Thornhill" + "\n"
                        + "7330 Yonge St" + "\n"
                        + "ON L4J 7Y7"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chung_King_Garden));

        //Call Greek Custom Window
        Chinese_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();
    }

    public void chinese_Lee_Chen_Asian_Bistro(){
        //43.6724° N, 79.3874° W
        //813 Yonge St, Toronto, ON M4W 2G8
        LatLng Lee_Chen_Asian_Bistro = new LatLng(43.6724, -79.3874);
        mMap.addMarker(new MarkerOptions()
                .position(Lee_Chen_Asian_Bistro)
                .title("Lee Chen Asian Bistro")
                .snippet("Toronto" + "\n"
                        + "813 Yonge St" + "\n"
                        + "ON M4W 2G8"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lee_Chen_Asian_Bistro));

        //Call Greek Custom Window
        Chinese_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void chinese_China_Gourmet_Takeout(){
        //43.6641° N, 79.3684° W
        //235 Carlton St, Toronto, ON M5A 2L2
        LatLng China_Gourmet_Takeout = new LatLng(43.6641, -79.3684);
        mMap.addMarker(new MarkerOptions()
                .position(China_Gourmet_Takeout)
                .title("China Gourmet Takeout")
                .snippet("Toronto" + "\n"
                        + "235 Carlton St" + "\n"
                        + "ON M5A 2L2"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(China_Gourmet_Takeout));

        //Call Greek Custom Window
        Chinese_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void chinese_Peking_Express(){
        //43.6567° N, 79.3646° W
        //217 Parliament St, Toronto, ON M5A 2Z4
        LatLng Peking_Express = new LatLng(43.6567, -79.3646);
        mMap.addMarker(new MarkerOptions()
                .position(Peking_Express)
                .title("Peking_Express")
                .snippet("Toronto" + "\n"
                        + "217 Parliament St" + "\n"
                        + "ON M5A 2Z4"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Peking_Express));

        //Call Greek Custom Window
        Chinese_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();


    }
    // indian
    public void indian_Little_India_Restaurant(){
        //43.6502° N, 79.3890° W
        //255 Queen St W, Toronto, ON M5V 1Z4
        LatLng Little_India_Restaurant = new LatLng(43.6502, -79.3890);
        mMap.addMarker(new MarkerOptions()
                .position(Little_India_Restaurant)
                .title("Little India Restaurant")
                .snippet("Toronto" + "\n"
                        + "255 Queen St W" + "\n"
                        + "ON M5V 1Z4"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Little_India_Restaurant));

        //Call Indian Custom Window
        Indian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();


    }

    public void indian_Bindia_Indian_Bistro(){
        //43.6485° N, 79.3721° W
        //16 Market St, Toronto, ON M5E 1A9
        LatLng Bindia_Indian_Bistro = new LatLng(43.6485, -79.3721);
        mMap.addMarker(new MarkerOptions()
                .position(Bindia_Indian_Bistro)
                .title("Bindia Indian Bistro")
                .snippet("Toronto" + "\n"
                        + "16 Market St" + "\n"
                        + "ON M5E 1A9"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bindia_Indian_Bistro));

        //Call Indian Custom Window
        Indian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void indian_Kothur_Indian_Cuisine(){
        //43.6144° N, 79.4886° W
        //2403 Lake Shore Blvd W, Etobicoke, ON M8V 1C5
        LatLng Kothur_Indian_Cuisine = new LatLng(43.6144, -79.4886);
        mMap.addMarker(new MarkerOptions()
                .position(Kothur_Indian_Cuisine)
                .title("Kothur_Indian_Cuisine")
                .snippet("Etobicoke" + "\n"
                        + "2403 Lake Shore Blvd W" + "\n"
                        + "ON M8V 1C5"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kothur_Indian_Cuisine));

        //Call Indian Custom Window
        Indian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }

    public void indian_Bhoj_Indian_Cuisine(){
        //43.6728° N, 79.3891° W
        //21 Davenport Rd, Toronto, ON M5R 1H2
        LatLng Bhoj_Indian_Cuisine = new LatLng(43.6728, -79.3891);
        mMap.addMarker(new MarkerOptions()
                .position(Bhoj_Indian_Cuisine)
                .title("Bhoj Indian Cuisine")
                .snippet("Toronto" + "\n"
                        + "21 Davenport Rd" + "\n"
                        + "ON M5R 1H2"));

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bhoj_Indian_Cuisine));

        //Call Indian Custom Window
        Indian_CustomWindow();

        //Call View Methods
        mapView();
        sateliteView();

    }
    public void mapView(){
        mapDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMap.setMapType(mMap.MAP_TYPE_NORMAL);
            }
        });
    }
    public void sateliteView(){
        sateliteDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMap.setMapType(mMap.MAP_TYPE_SATELLITE);
            }
        });
    }
    //Method for Italian Custom Window
    public void Italian_CustomWindow(){
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                Context context = getApplicationContext();

                LinearLayout info = new LinearLayout(context);
                info.setOrientation(LinearLayout.VERTICAL);
                LinearLayout image = new LinearLayout(context);
                image.setOrientation(LinearLayout.VERTICAL);
                image.setGravity(Gravity.CENTER_HORIZONTAL);

                ImageView icon = new ImageView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                icon.setLayoutParams(layoutParams);
                //icon.setImageDrawable(info.getResources().getDrawable(R.drawable.centennial_college_icon));

                TextView title = new TextView(context);
                title.setTextColor(Color.BLACK);
                title.setGravity(Gravity.CENTER);
                title.setTypeface(null, Typeface.BOLD);
                title.setText(marker.getTitle());

                TextView snippet = new TextView(context);
                snippet.setTextColor(Color.BLACK);
                snippet.setText(marker.getSnippet());

                info.addView(image);
                image.addView(icon);
                info.addView(title);
                info.addView(snippet);

                return info;
            }
        });
    }
    //Method for Greek Custom Window
    public void Greek_CustomWindow(){
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                Context context = getApplicationContext();

                LinearLayout info = new LinearLayout(context);
                info.setOrientation(LinearLayout.VERTICAL);
                LinearLayout image = new LinearLayout(context);
                image.setOrientation(LinearLayout.VERTICAL);
                image.setGravity(Gravity.CENTER_HORIZONTAL);

                ImageView icon = new ImageView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                icon.setLayoutParams(layoutParams);
                //icon.setImageDrawable(info.getResources().getDrawable(R.drawable.centennial_college_icon));

                TextView title = new TextView(context);
                title.setTextColor(Color.BLACK);
                title.setGravity(Gravity.CENTER);
                title.setTypeface(null, Typeface.BOLD);
                title.setText(marker.getTitle());

                TextView snippet = new TextView(context);
                snippet.setTextColor(Color.BLACK);
                snippet.setText(marker.getSnippet());

                info.addView(image);
                image.addView(icon);
                info.addView(title);
                info.addView(snippet);

                return info;
            }
        });
    }
    // Chinese custom window
    public void Chinese_CustomWindow(){
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                Context context = getApplicationContext();

                LinearLayout info = new LinearLayout(context);
                info.setOrientation(LinearLayout.VERTICAL);
                LinearLayout image = new LinearLayout(context);
                image.setOrientation(LinearLayout.VERTICAL);
                image.setGravity(Gravity.CENTER_HORIZONTAL);

                ImageView icon = new ImageView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                icon.setLayoutParams(layoutParams);
                //icon.setImageDrawable(info.getResources().getDrawable(R.drawable.centennial_college_icon));

                TextView title = new TextView(context);
                title.setTextColor(Color.BLACK);
                title.setGravity(Gravity.CENTER);
                title.setTypeface(null, Typeface.BOLD);
                title.setText(marker.getTitle());

                TextView snippet = new TextView(context);
                snippet.setTextColor(Color.BLACK);
                snippet.setText(marker.getSnippet());

                info.addView(image);
                image.addView(icon);
                info.addView(title);
                info.addView(snippet);

                return info;
            }
        });
    }
    // Indian custom window
    public void Indian_CustomWindow(){
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                Context context = getApplicationContext();

                LinearLayout info = new LinearLayout(context);
                info.setOrientation(LinearLayout.VERTICAL);
                LinearLayout image = new LinearLayout(context);
                image.setOrientation(LinearLayout.VERTICAL);
                image.setGravity(Gravity.CENTER_HORIZONTAL);

                ImageView icon = new ImageView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                icon.setLayoutParams(layoutParams);
                //icon.setImageDrawable(info.getResources().getDrawable(R.drawable.centennial_college_icon));

                TextView title = new TextView(context);
                title.setTextColor(Color.BLACK);
                title.setGravity(Gravity.CENTER);
                title.setTypeface(null, Typeface.BOLD);
                title.setText(marker.getTitle());

                TextView snippet = new TextView(context);
                snippet.setTextColor(Color.BLACK);
                snippet.setText(marker.getSnippet());

                info.addView(image);
                image.addView(icon);
                info.addView(title);
                info.addView(snippet);

                return info;
            }
        });
    }


}

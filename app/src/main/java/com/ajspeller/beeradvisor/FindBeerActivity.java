package com.ajspeller.beeradvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // call when the user click the button
    public void onClickFindBeer(View v) {

        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String beerType = (color.getSelectedItem()).toString();
        brands.setText(beerType);

    }
}

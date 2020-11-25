package com.zainpradana.basicview3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] pbkMobileProgramming = {
            "Rizky, 085211345481",
            "Nur Zain, 082125652279",
            "Didik, 083830082299",
            "Kunto, 081387690506",
            "Afif, 08988981908",
            "Alfahri, 081295120669",
            "Marbun, 081263816274",
            "Ravi, 083869147788",
            "Lala, 081388438315",
            "Dinny, 085771101779",
            "Fahri, 085156298710",
            "Dika, 081385745468",
            "Rico, 081804847455",
            "Ariq, 081285459750",
            "Dede, 085714266056"
    };
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, pbkMobileProgramming);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.txtCountries);
        textView.setThreshold(3);
        textView.setAdapter(adapter);
    }
}
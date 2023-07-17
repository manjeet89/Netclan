package com.exmple.netclanexplorer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {


    AppCompatButton coffee,business,hobbies,friendship,movies,dinning,dating,matrimony;
    static int coffe = 1,
                busine = 1,
                hobbie = 1,
                friend = 1,
                movie = 1,
                dinng = 1,
                date = 1,
                matri = 1;

    TextView count;
    //TextInputEditText editText;

    Spinner spinner;

    TextInputEditText countedit;




    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.edit_text);
        ArrayAdapter<CharSequence> charSequenceArrayAdapter = ArrayAdapter.createFromResource(this,R.array.NamesForJobs,android.R.layout.simple_spinner_item);
        charSequenceArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(charSequenceArrayAdapter);

        spinner.setOnItemSelectedListener(this);


     //   editText  = findViewById(R.id.edit_text);
        count  = findViewById(R.id.count);
        countedit = findViewById(R.id.edit_text1);
        countedit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                count.setText(String.valueOf(charSequence.length()+"/250"));

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });


        coffee = findViewById(R.id.coffee);
        coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(coffe==1) {
                    coffee.setTextColor(Color.parseColor("#ffffff"));
                    coffee.setBackgroundResource(R.drawable.curve_shap);
                    coffe++;
                }
                else{
                    coffee.setTextColor(Color.parseColor("#000000"));
                    coffee.setBackgroundResource(R.drawable.button_curve);
                    coffe--;

                }

            }
        });

        business = findViewById(R.id.business);
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(busine==1) {
                    business.setTextColor(Color.parseColor("#ffffff"));
                    business.setBackgroundResource(R.drawable.curve_shap);
                    busine++;
                }
                else{
                    business.setTextColor(Color.parseColor("#000000"));
                    business.setBackgroundResource(R.drawable.button_curve);
                    busine--;

                }

            }
        });

        hobbies = findViewById(R.id.hobbies);
        hobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hobbie==1) {
                    hobbies.setTextColor(Color.parseColor("#ffffff"));
                    hobbies.setBackgroundResource(R.drawable.curve_shap);
                    hobbie++;
                }
                else{
                    hobbies.setTextColor(Color.parseColor("#000000"));
                    hobbies.setBackgroundResource(R.drawable.button_curve);
                    hobbie--;

                }

            }
        });

        friendship = findViewById(R.id.friendship);
        friendship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(friend==1) {
                    friendship.setTextColor(Color.parseColor("#ffffff"));
                    friendship.setBackgroundResource(R.drawable.curve_shap);
                    friend++;
                }
                else{
                    friendship.setTextColor(Color.parseColor("#000000"));
                    friendship.setBackgroundResource(R.drawable.button_curve);
                    friend--;

                }

            }
        });

        movies = findViewById(R.id.movies);
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(movie==1) {
                    movies.setTextColor(Color.parseColor("#ffffff"));
                    movies.setBackgroundResource(R.drawable.curve_shap);
                    movie++;
                }
                else{
                    movies.setTextColor(Color.parseColor("#000000"));
                    movies.setBackgroundResource(R.drawable.button_curve);
                    movie--;

                }

            }
        });

        dinning = findViewById(R.id.dinning);
        dinning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dinng==1) {
                    dinning.setTextColor(Color.parseColor("#ffffff"));
                    dinning.setBackgroundResource(R.drawable.curve_shap);
                    dinng++;
                }
                else{
                    dinning.setTextColor(Color.parseColor("#000000"));
                    dinning.setBackgroundResource(R.drawable.button_curve);
                    dinng--;

                }

            }
        });

        dating = findViewById(R.id.dating);
        dating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(date==1) {
                    dating.setTextColor(Color.parseColor("#ffffff"));
                    dating.setBackgroundResource(R.drawable.curve_shap);
                    date++;
                }
                else{
                    dating.setTextColor(Color.parseColor("#000000"));
                    dating.setBackgroundResource(R.drawable.button_curve);
                    date--;

                }

            }
        });

        matrimony = findViewById(R.id.matrimony);
        matrimony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matri==1) {
                    matrimony.setTextColor(Color.parseColor("#ffffff"));
                    matrimony.setBackgroundResource(R.drawable.curve_shap);
                    matri++;
                }
                else{
                    matrimony.setTextColor(Color.parseColor("#000000"));
                    matrimony.setBackgroundResource(R.drawable.button_curve);
                    matri--;

                }

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
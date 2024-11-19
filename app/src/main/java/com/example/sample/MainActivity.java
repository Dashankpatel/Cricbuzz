package com.example.sample;

import  android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sample.Getroot.Getroot;
import com.example.sample.main_note.Retrofitintence;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Retrofitintence retrofitinstance = new Retrofitintence();

                Call<Getroot> call = retrofitinstance.instance().getnotes();

                call.enqueue(new Callback<Getroot>() {
                    @Override
                    public void onResponse(Call<Getroot> call, Response<Getroot> response) {
                        Log.d("--+--", "onResponse: " + response.body().appIndex.seoTitle);
                    }

                    @Override
                    public void onFailure(Call<Getroot> call, Throwable throwable) {
                        Log.d("--+--", "onFailure: " + throwable.getLocalizedMessage());
                    }
                });

            }
        });

    }
}
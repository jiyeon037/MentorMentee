package com.eyesteam.mentormentee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JoinActivity extends AppCompatActivity {
    RetroService service;
    EditText idEt, pwEt, emailEt;
    Button btnDone;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        idEt = findViewById(R.id.editID);
        pwEt = findViewById(R.id.editPWD);
        emailEt = findViewById(R.id.editEmail);
        btnDone = findViewById(R.id.btnDone);





        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://15.164.95.90")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(RetroService.class);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = idEt.getText().toString();
                String pw = pwEt.getText().toString();
                String email = emailEt.getText().toString();

                Log.d("RETROFIT", "id : " + id + ", pw : " + pw + ", email : " + email);
                final Call<Void> call = service.postJoin(id, pw, id, email);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        Log.d("RETROFIT", "On response call : " + response);
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Log.d("RETROFIT", "On failure call");
                    }
                });
            }
        });

    }
}

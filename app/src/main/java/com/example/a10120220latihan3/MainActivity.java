package com.example.a10120220latihan3;


import static com.example.a10120220latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if(getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false));
    }

        @OnClick(R.id.btnWalkthroughStart)
        void mulai() {
            Intent intent = new Intent(this, LoginCodeActivity.class);
            startActivity(intent);
        }
}
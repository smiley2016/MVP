package com.bartalus.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyView{

    private TextView textView;
    private Presenter presenter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        button = findViewById(R.id.button);

        presenter = new PresenterImpl(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.handleLogin(textView.getText().toString(), textView.getText().toString());
            }
        });
    }

    @Override
    public void showText(String text) {
        textView.setText(text);
    }

    @Override
    public void showNextActivity() {
        //Open next Activity
    }
}
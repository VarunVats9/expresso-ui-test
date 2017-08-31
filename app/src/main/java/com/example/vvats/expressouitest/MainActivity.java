package com.example.vvats.expressouitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        editText = (EditText) findViewById(R.id.editText);
        String value = editText.getText().toString();

        Intent intent = new Intent(this, Second.class);
        intent.putExtra("key", value);

        startActivity(intent);
    }
}

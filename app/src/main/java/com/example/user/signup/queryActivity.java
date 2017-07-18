package com.example.user.signup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class queryActivity extends AppCompatActivity {
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        list = (ListView)findViewById(R.id.list);
        new querytimeActivity(this).execute("123456789");
        finish();
    }

                list.setAdapter(adapter)
}

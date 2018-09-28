package com.example.usuario.sendmessage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class ViewMessageActivity extends AppCompatActivity {

    private EditText msg;
    private EditText autor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        autor=findViewById(R.id.tvAutor);
        msg=findViewById(R.id.tvMessage);

        //  1. Leemos los extras del Intent


    }
}

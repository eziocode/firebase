package com.example.firebase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText edtText;
    private DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText = (EditText) findViewById(R.id.edtText);
        Button btn = (Button) findViewById(R.id.chngBtn);
          db = FirebaseDatabase.getInstance().getReference();
          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String name = edtText.getText().toString().trim();
                  db.child("Name").setValue(name);
              }
          });

    }
}
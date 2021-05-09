package com.nextken.tutorialcodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view) {
        TextView fnameView = (TextView)findViewById(R.id.firstNameView);
        TextView snameView = (TextView)findViewById(R.id.secondNameView);
        TextView emailView = (TextView)findViewById(R.id.emailView);

        EditText fnameEdit = (EditText)findViewById(R.id.firstNameEdit);
        EditText snameEdit = (EditText)findViewById(R.id.secondNameEdit);
        EditText emailEdit = (EditText)findViewById(R.id.emailEdit);

        fnameView.setText("First Name: " +fnameEdit.getText().toString());
        snameView.setText("Second Name: "+snameEdit.getText().toString());
        emailView.setText("Email: "+emailEdit.getText().toString());
    }

}
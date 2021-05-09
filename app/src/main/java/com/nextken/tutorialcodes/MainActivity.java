package com.nextken.tutorialcodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtHello;
    private EditText editTxtName;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        txtHello = (TextView)findViewById(R.id.txtHello);
        editTxtName = (EditText)findViewById(R.id.editTxtName);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(MainActivity.this, "Hello Button Pressed", Toast.LENGTH_LONG).show();
                txtHello.setText(" Hello " + editTxtName.getText().toString());
                break;
            default:
                break;
        }
    }
}
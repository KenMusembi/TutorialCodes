package com.nextken.tutorialcodes;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxHarry, checkBoxMatrix, checkBoxHobbit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxHarry = findViewById(R.id.checkBoxHarry);
        checkBoxMatrix = findViewById(R.id.checkBoxMatrix);
        checkBoxHobbit = findViewById(R.id.checkBoxHobbit);
        
        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "You have watched harry potter", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "You need to watch harry potter", Toast.LENGTH_LONG).show();}
            }
        });
    }
}
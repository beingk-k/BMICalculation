package com.e.bmicalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMICalculation extends AppCompatActivity {

    private EditText etWeight, etHeight;
    private Button btnCalculate;
    private TextView tvBMI;
    private double massindex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculation);

        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvBMI = findViewById(R.id.tvBMI);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnCalculate){
                    massindex = new bmiarithmetic(Double.parseDouble(etWeight.getText().toString()), Double.parseDouble(etHeight.getText().toString())).calculateBMI();
                    tvBMI.setText(Double.toString(massindex));

                    if (massindex<18.5){
                        Toast.makeText(BMICalculation.this, "You are UnderWeight", Toast.LENGTH_LONG).show();
                    }
                    else if (massindex>=18.5 && massindex<=24.9){
                        Toast.makeText(BMICalculation.this, "Your BMI is Normal.", Toast.LENGTH_LONG).show();
                    }
                    else if (massindex>=25 && massindex<=29.9){
                        Toast.makeText(BMICalculation.this, "You are OverWeight", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(BMICalculation.this, "Obesity Level", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}

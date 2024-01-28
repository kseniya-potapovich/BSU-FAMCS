package by.bsu.patapovich;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;

import by.bsu.patapovich.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());



        binding.calculateButton.setOnClickListener(view -> {
            String s = binding.inputParameterField.getText().toString();
            if(!s.isEmpty()) {
                double v = Double.parseDouble(s);
                if(v != 0) {
                    calculate(v);
                }
                else {
                    binding.inputParameterField.setError("X must be not equal 0");
                }
            }
            else binding.inputParameterField.setError("Empty value");
        });

    }

    private void calculate(double x) {
        double result = cth(x);
        if(binding.roundCheckBox.isChecked()) result = new BigDecimal(result).setScale(3, RoundingMode.HALF_UP).doubleValue();
        binding.calculateResult.setText("Result: " + result);
    }

    private double cth(double x) {
        return (Math.exp(x) + Math.exp(-x)) / (Math.exp(x) - Math.exp(-x));
    }
}
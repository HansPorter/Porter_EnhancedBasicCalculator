package mcm.edu.ph.porter_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.btnAddition);
        Button btnAdd = findViewById(R.id.btnSubtraction);
        Button btnAdd = findViewById(R.id.btnMultiplication);
        Button btnAdd = findViewById(R.id.btnDivision);
        Button btnAdd = findViewById(R.id.btnModulo);

        btnAdd, setOnClickListener(this);
        btnSub, setOnClickListener(this);
        btnDiv, setOnClickListener(this);
        btnMul, setOnClickListener(this);
        btnMod, setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        double operand1=0;
        double operand2=0;

        EditText op1 = findViewById(R.id.txtOperand1);
        EditText op2 = findViewById(R.id.txtOperand2);
        TextView ans = findViewById(R.id.txtAnswer);

        operand1 = Double.parseDouble(op1.getText().toString());
        operand2 = Double.parseDouble(op2.getText().toString());

        switch(view.getId()) {
            case R.id.btnAddition:
                ans.setText(Double.toString(doAddition(operand1,operand2)));
                break;
            case R.id.btnDivision:
                ans.setText(Double.toString(doDivision(operand1,operand2)));
                break;
            case R.id.btnMultiplication:
                ans.setText(Double.toString(doMultiplication(operand1,operand2)));
                break;
            case R.id.btnSubtraction:
                ans.setText(Double.toString(doSubtraction(operand1,operand2)));
                break;
            case R.id.btnModulo:
                ans.setText(Double.toString(doModulo(operand1,operand2)));
                break;
        }



    }
}
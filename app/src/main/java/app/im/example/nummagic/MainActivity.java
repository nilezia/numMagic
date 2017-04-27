package app.im.example.nummagic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import app.im.example.nummagic.data.ResponseNumber;

public class MainActivity extends AppCompatActivity implements MainManager.onUpdateData {

    private MainManager manager;
    private TextView tvNumber, tvResult;
    private Button btnRandomNum, btnCheckNumber;
    private EditText edtInput;
    private int serverNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumber = (TextView) findViewById(R.id.tvNumber);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnRandomNum = (Button) findViewById(R.id.btn_random);
        edtInput = (EditText) findViewById(R.id.edtInput);
        btnCheckNumber = (Button) findViewById(R.id.btn_check_num);
        btnRandomNum.setOnClickListener(onRandom());
        btnCheckNumber.setOnClickListener(onCheckNumber());
        manager = new MainManager(this);

    }

    private View.OnClickListener onCheckNumber() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNumber = edtInput.getText().toString();
                if (inputNumber.equals(""))
                    inputNumber = "0";
                if (manager.isCheckNumber(inputNumber, serverNumber)) {
                    tvResult.setText("Correct");
                } else {
                    tvResult.setText("not Correct");
                }
            }
        };
    }

    private View.OnClickListener onRandom() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.RandomNumber();
            }
        };
    }

    @Override
    public void updateUI(ResponseNumber.ResultBean data) {

        tvNumber.setText(data.getRandom().getData().toString());
        serverNumber = data.getRandom().getData().get(0);


    }


}

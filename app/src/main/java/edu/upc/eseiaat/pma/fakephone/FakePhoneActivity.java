package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    TextView phonenumber;
    private String act_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        phonenumber = (TextView)findViewById(R.id.number_content);
        act_number="";

    }

    public void Click(View v){
        Button btn = (Button) v;
        String btn_number = btn.getText().toString();
        act_number = act_number + btn_number;
        phonenumber.setText(act_number);
    }

    public void Erase(View v){
        Button erase = (Button) v;
        act_number = "";
        phonenumber.setText(act_number);
    }

    public void Call(View v){
        Button call = (Button) v;
        String calling = "Calling " + act_number;
        Toast.makeText(this, calling, Toast.LENGTH_SHORT).show();
        act_number = "";
        phonenumber.setText(act_number);
    }
}

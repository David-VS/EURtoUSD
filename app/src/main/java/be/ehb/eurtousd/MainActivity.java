package be.ehb.eurtousd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button convertBTN;
    private EditText usdET, eurET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBTN = findViewById(R.id.btn_convert);
        usdET = findViewById(R.id.et_usd);
        eurET = findViewById(R.id.et_eur);

        convertBTN.setOnClickListener((View view)->{
            double bedrag = Double.parseDouble(eurET.getText().toString());
            double bedragUSD = bedrag * 1.16;
            usdET.setText(String.format("%.2f", bedragUSD, Locale.getDefault()));
        } );

        /*
        convertBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //*/

    }
}
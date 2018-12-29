package app1.meterstoinches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConvertActivity extends AppCompatActivity {


    private EditText entermeters;
    private Button convertButton;
    private TextView resultview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        entermeters=(EditText)findViewById(R.id.metersid);
        resultview=(TextView)findViewById(R.id.resultid);

        convertButton=(Button)findViewById(R.id.buttonid);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multipler=39.37;
                double result=0.0;
                double enteredText=0.0;

                enteredText= Double.parseDouble(entermeters.getText().toString());
                result=enteredText * multipler;
                resultview.setText(String.format("%.2f", result) + "inches");


            }
        });

    }
}

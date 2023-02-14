package hcmute.edu.vn.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtA = (EditText)findViewById(R.id.edtInputA);
        EditText edtB = (EditText)findViewById(R.id.edtInputB);
        EditText edtResult = (EditText)findViewById(R.id.edtResult);
        Button btnSum = (Button)findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edtA.getText().length()>0) && (edtB.getText().length()>0)) {
                    try{
                        double edtextA = Double.parseDouble(edtA.getText().toString());
                        double edtextB = Double.parseDouble(edtB.getText().toString());
                        double result = edtextA + edtextB;
                        edtResult.setText(Double.toString(result));
                    }catch (Exception ex){
                        Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                        toast.show();
                        edtA.requestFocus();
                        edtA.getText().clear();
                        edtB.getText().clear();
                    }
                }else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                    edtA.requestFocus();
                    edtA.getText().clear();
                    edtB.getText().clear();
                }
            }
        });
    }
}
package ipn.cecyt9.holamundoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SumaActivity extends AppCompatActivity {
    private EditText editTextX;
    private EditText editTextY;
    private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        editTextX = findViewById(R.id.editTextNumberX );
        editTextX = findViewById(R.id.editTextNumberY );
        editTextTotal = findViewById(R.id.editTextNumberTotal );
    }
}
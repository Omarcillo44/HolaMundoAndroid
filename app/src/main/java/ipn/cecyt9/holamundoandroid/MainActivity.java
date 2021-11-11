package ipn.cecyt9.holamundoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void suma(View miView)
    { }
    public void resta(View miView)
    { }
    public void multiplicacion(View miView)
    { }
    public void division(View miView)
    { }

    private Button Button_suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button_suma = findViewById(R.id.Button_suma);
        Button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSuma();
            }
        });
    }

    private void abrirSuma() {
        Intent intent = new Intent(this , SumaActivity.class);
    startActivity(intent);
    }

}
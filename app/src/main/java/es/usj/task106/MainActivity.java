package es.usj.task106;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import es.usj.libcalculos.Calculos;

public class MainActivity extends AppCompatActivity {

    EditText etValor1, etValor2;
    Spinner spOperaciones;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = findViewById(R.id.etValor1);
        etValor2 = findViewById(R.id.etValor2);
        spOperaciones = findViewById(R.id.spOperaciones);
        tvResultado= findViewById(R.id.tvResultado);

        CargarSpiner();
    }

    public void Operar(View view){
        String resultado= "";
        switch (spOperaciones.getSelectedItem().toString()){
            case "Sumar":
                resultado = Calculos.Sumar(etValor1.getText().toString(),etValor2.getText().toString());
                break;
            case "Restar":
                resultado = Calculos.Restar(etValor1.getText().toString(),etValor2.getText().toString());
                break;
            case "Multiplicar":
                resultado = Calculos.Multiplicar(etValor1.getText().toString(),etValor2.getText().toString());
                break;
            case "Dividir":
                resultado = Calculos.Dividir(etValor1.getText().toString(),etValor2.getText().toString());
                break;

        }
        tvResultado.setText(resultado);
    }

    private void CargarSpiner(){
        String []opciones={"Sumar","Restar","Multiplicar","Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spOperaciones.setAdapter(adapter);
    }

}

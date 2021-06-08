package com.example.logopostobon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Atributos(Variables)
    EditText cajaHoras;
    TextView cajaResultado;
    Button botonCalcular;

    //Metodos(funciones)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asociar los atributos a los layout
        cajaHoras= findViewById(R.id.numeroHoras);
        cajaResultado= findViewById(R.id.resultado);
        botonCalcular= findViewById(R.id.botonCalcular);

        //escuchador de eventos (boton calcular para hacer click )
        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cajas de tipo EditText para estraer informacion se usa .getText
                //hay que pasar los datos al tipo que se necesitan(String) pues estan en tipo editable
                //String horasDigitadas= cajaHoras.getText().toString();
                //despues se cambian a entero parque estan en tipo string y es para trabajar con ese dato
                int horasDigitadas= Integer.parseInt(cajaHoras.getText().toString());
                if (cajaHoras.getText().toString() != null){

                    if (horasDigitadas<=40){
                        int salario= horasDigitadas*20000;
                        cajaResultado.setText("Su salario fue de "+salario);
                    }else {
                        int salarioBase=800000;
                        int numeroHorasExtra= horasDigitadas - 40;
                        int salario= salarioBase + (numeroHorasExtra*25000);
                        cajaResultado.setText("Su salario fue de "+salario);
                    }}else {

                    Toast.makeText(getApplicationContext(),"digite un valor",Toast.LENGTH_LONG).show();
                }

                //cajaResultado.setText(horasDigitadas);
                //cajas de tipo TextView se usa setText para mostrar resultados
                //cajaResultado.setText();
            }
        });
    }
}
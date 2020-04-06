package com.example.aula5


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompactActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        float imc;
        Button btcalc = (Button) findViewById(R.id.btcalc);
        btcalc.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView tvResult = (TextView) findViewById(R.id.tvResult);
                TextView tvDesc = (TextView) findViewById(R.id.tvDesc);

                int peso = Integer.parseInt(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc = peso / (altura * altura);

                if (imc[0]<18.5){
                    tvResut.setText(imc[0]+"");
                    tvDesc.setText("Abaixo do Peso");
                }

                else if (imc[0]<25){
                    tvResut.setText(imc[0]+"");
                    tvDesc.setText("Peso Adequado");
                }

                else if (imc[0]<30){
                    tvResut.setText(imc[0]+"");
                    tvDesc.setText("Sobrepeso");
                }

                else{
                    tvResut.setText(imc[0]+"");
                    tvDesc.setText("Obesidade");
                }
            }
        });
    }
}
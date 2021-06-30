package net.beastek.ejemplosuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText caja1;
    private EditText resultado;
    private EditText resultadoUpper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.caja1= findViewById(R.id.txtNumero1);
        this.resultado= findViewById(R.id.txtNumero2);
        this.resultadoUpper= findViewById(R.id.txtNumero3);


    }

    public void enviarTexto(View view) {    //obligatorio que reciba un View  el botñon va a llamar a este método, es obligatorio poner View . View dice qué control ha llamado, si tengo dos botones View indica quien lo ha llamado.
        // si desde algun control, al seleccionar un elemento de una lista, al seleccionar un checkbox, desde cualquier control hay que recibir este argumento. Si no lo recibe da error.
        //getTxt rei¡cibo un texto de un campo de texto
        //setText asigno un valor a la caja de texto




        String nombre = this.caja1.getText().toString();


        this.resultado.setText(nombre.toLowerCase());
        this.resultadoUpper.setText(nombre.toUpperCase());


    }


    }

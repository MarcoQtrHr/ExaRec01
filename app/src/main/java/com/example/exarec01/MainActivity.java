package com.example.exarec01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText txtCodigo;
    private EditText txtDescripcion;
    private EditText txtUnidad;
    private EditText txtCompra;
    private EditText txtVenta;
    private EditText txtCantidad;
    private Button btnLimpiar;
    private Button btnEnviar;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCodigo = (EditText) findViewById(R.id.txtCodigo);
        txtDescripcion = (EditText) findViewById(R.id.txtDescripcion);
        txtUnidad = (EditText) findViewById(R.id.txtUnidad);
        txtCompra = (EditText) findViewById(R.id.txtCompra);
        txtVenta = (EditText) findViewById(R.id.txtVenta);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        txtCantidad = (EditText) findViewById(R.id.txtCantidad);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtCodigo.getText().toString().matches("") &&
                        txtDescripcion.getText().toString().matches("") &&
                        txtUnidad.getText().toString().matches("") &&
                        txtVenta.getText().toString().matches("") &&
                        txtCompra.getText().toString().matches("") &&
                        txtCantidad.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "No Hay Campos Llenos", Toast.LENGTH_SHORT).show();
                } else {
                    txtCodigo.setText("");
                    txtDescripcion.setText("");
                    txtUnidad.setText("");
                    txtVenta.setText("");
                    txtCompra.setText("");
                    txtCantidad.setText("");
                    Toast.makeText(MainActivity.this, "Campos Limpios", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtCodigo.getText().toString().matches("") ||
                        txtDescripcion.getText().toString().matches("") ||
                        txtUnidad.getText().toString().matches("") ||
                        txtVenta.getText().toString().matches("") ||
                        txtCompra.getText().toString().matches("") ||
                        txtCantidad.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "Faltan rellenar campos", Toast.LENGTH_SHORT).show();
                } else {
                    String Codigo = txtCodigo.getText().toString();
                    String Descripcion = txtDescripcion.getText().toString();
                    String Unidad = txtUnidad.getText().toString();
                    String Venta = txtVenta.getText().toString();
                    String Compra = txtCompra.getText().toString();
                    String Cantidad = txtCantidad.getText().toString();

                    Intent intent = new Intent(MainActivity.this, ProductoActivity.class);
                    intent.putExtra("Codigo", Codigo);
                    intent.putExtra("Descripcion", Descripcion);
                    intent.putExtra("Unidad", Unidad);
                    intent.putExtra("Venta", Venta);
                    intent.putExtra("Compra", Compra);

                    startActivity(intent);
                }
            }
        });
    }
}
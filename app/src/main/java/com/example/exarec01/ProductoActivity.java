package com.example.exarec01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

     public class ProductoActivity extends AppCompatActivity {
        private TextView lblCompra;
        private TextView lblCodigo;
        private TextView lblVenta;
        private TextView lblResultado;
        private Button btnCalcular;
        private Button btnRegresar;
        private TextView lblGanacia;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.entrada_producto_activity);
            lblCodigo = (TextView) findViewById(R.id.lblCodigo);
            lblVenta = (TextView) findViewById(R.id.lblVenta);
            lblCompra = (TextView) findViewById(R.id.lblCompra);
            lblResultado = (TextView) findViewById(R.id.lblResultado);
            lblGanacia = (TextView) findViewById(R.id.lblGanacia);
            btnCalcular = (Button) findViewById(R.id.btnCalcular);
            btnRegresar = (Button) findViewById(R.id.btnRegresar);

            Productos productos = new Productos();

            Bundle bundle = getIntent().getExtras();
            String Codigo = bundle.getString("Producto");
            String Compra = bundle.getString("Compra");
            String Venta = bundle.getString("Venta");
            String Ganacia = bundle.getString("Ganancia");

            lblCodigo.setText("Producto: " + Codigo);
            lblCompra.setText("Total Precio Compra: " + Venta);
            lblVenta.setText("Total Precio Venta: " + Compra);
            lblGanacia.setText("Total Ganacia: " + Ganacia);


            btnRegresar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
}

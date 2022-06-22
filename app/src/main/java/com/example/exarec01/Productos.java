package com.example.exarec01;

public class Productos {

    private int Cantidad;
    private float Venta;
    private float Compra;


    public Productos() {
        this.setCantidad(Cantidad);
        this.setVenta(Venta);
        this.setCompra(Compra);
    }



    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }


    public float getVenta() {
        return Venta;
    }

    public void setVenta(float Venta) {
        this.Venta = Venta;
    }

    public float getCompra() {
        return Compra;
    }

    public void setCompra(float Compra) {
        this.Compra = Compra;
    }

    public float totalVenta(){
        return (this.Cantidad * this.Venta);
    }

    public float totalCompra(){
        return (this.Cantidad * this.Compra);
    }
    public float totalGanancia(){
        return (this.Venta - this.Compra);
    }
}

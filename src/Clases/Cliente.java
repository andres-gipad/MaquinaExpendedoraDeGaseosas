package Clases;

import javafx.beans.property.IntegerProperty;

public class Cliente {
    private int dinero;
    private Gaseosa gaseosa;

    public Cliente(int dinero) {
        this.dinero = dinero;
    }

    public Cliente() {
    }

    public Cliente(int dinero, Gaseosa gaseosa) {
        this.dinero = dinero;
        this.gaseosa = gaseosa;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Gaseosa getGaseosa() {
        return gaseosa;
    }

    public void setGaseosa(Gaseosa gaseosa) {
        this.gaseosa = gaseosa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dinero=" + dinero +
                ", gaseosa=" + gaseosa +
                '}';
    }
}

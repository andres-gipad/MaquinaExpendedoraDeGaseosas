package Clases;

public class Maquina {
    private int dineroMaquina;
    private Gaseosa gaseosa;

    public Maquina(int dineroMaquina) {
        this.dineroMaquina = dineroMaquina;
    }

    public Maquina(){
    }

    public Maquina(int dineroMaquina, Gaseosa gaseosa) {
        this.dineroMaquina = dineroMaquina;
        this.gaseosa = gaseosa;
    }

    public int getDineroMaquina() {
        return dineroMaquina;
    }

    public void setDineroMaquina(int dineroMaquina) {
        this.dineroMaquina = dineroMaquina;
    }

    public Gaseosa getGaseosa() {
        return gaseosa;
    }

    public void setGaseosa(Gaseosa gaseosa) {
        this.gaseosa = gaseosa;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "dineroMaquina=" + dineroMaquina +
                ", gaseosa=" + gaseosa +
                '}';
    }

}

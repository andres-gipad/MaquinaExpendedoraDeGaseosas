package Vista;

import Clases.Cliente;
import Clases.Gaseosa;
import Clases.Maquina;
import com.jfoenix.controls.JFXButton;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class MaquinaController implements Initializable {
    //Variables
    Cliente cliente = new Cliente(1500);
    Maquina maquina = new Maquina(0);

    private ObservableList<Cliente> clientes;
    private ObservableList<Maquina> maquinas;

    DecimalFormat df2 = new DecimalFormat("###,###,###");
    //FXML
    @FXML private JFXButton btnCoca;
    @FXML private Label lblDineroCliente,lblDineroMaquina;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblDineroCliente.setText(Integer.toString(cliente.getDinero()));
        lblDineroMaquina.setText(Integer.toString(maquina.getDineroMaquina()));
    }

    @FXML private void ingresarDinero(){
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad deseada a la maquina"));
        int dineroActualCliente = cliente.getDinero();
        int dineroActualMaquina = maquina.getDineroMaquina();

        int descuento = dineroActualCliente - respuesta;
        cliente.setDinero(descuento);
        int dineroAgregado = respuesta + dineroActualMaquina;
        maquina.setDineroMaquina(dineroAgregado);

        lblDineroMaquina.setText(Integer.toString(maquina.getDineroMaquina()));
        lblDineroCliente.setText(Integer.toString(cliente.getDinero()));
        //clientes.add(1,new Cliente(10, Gaseosa.Cocas));
    }

    @FXML private void retirarDinero(){
        int dineroActualMaquina = maquina.getDineroMaquina();
        int dineroActualCliente = cliente.getDinero();

        int devolverDineroCliente = dineroActualMaquina + dineroActualCliente;
        cliente.setDinero(devolverDineroCliente);
        int vaciarMaquina = dineroActualMaquina - dineroActualMaquina;
        maquina.setDineroMaquina(vaciarMaquina);

        lblDineroMaquina.setText(Integer.toString(maquina.getDineroMaquina()));
        lblDineroCliente.setText(Integer.toString(cliente.getDinero()));
        JOptionPane.showMessageDialog(null,"Se te a devuelto " + dineroActualMaquina);
    }

}

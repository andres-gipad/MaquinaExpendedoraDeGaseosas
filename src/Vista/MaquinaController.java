package Vista;

import Clases.Cliente;
import Clases.Gaseosa;
import Clases.Maquina;
import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class MaquinaController implements Initializable {
    //Variables
    Cliente cliente = new Cliente(2000);
    Maquina maquina = new Maquina(0);

    private ObservableList<String> clientes = FXCollections.observableArrayList();

    DecimalFormat df2 = new DecimalFormat("###,###,###");
    //FXML
    @FXML private JFXButton btnCoca,btnOrange,btnGrape,btnSprite;
    @FXML private Label lblDineroCliente,lblDineroMaquina;
    @FXML private ListView listInventario;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblDineroCliente.setText(Integer.toString(cliente.getDinero()));
        lblDineroMaquina.setText(Integer.toString(maquina.getDineroMaquina()));
        mostrarGaseosas();
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

    private void obtenerGaseosa(Button btn){

    }

    @FXML private void seleccionOrange(){
        int valorBebida = 500;
        int dineroActualMaquina = maquina.getDineroMaquina();
        int dineroNescesario =  valorBebida - dineroActualMaquina;

        if(dineroActualMaquina>=valorBebida){
            clientes.add(new Cliente(Gaseosa.Oranges).toString());
            dineroActualMaquina = dineroActualMaquina - valorBebida;
            lblDineroMaquina.setText(Integer.toString(dineroActualMaquina));
        }else{
            JOptionPane.showMessageDialog(null,"El valor de una bebida Orange´s es de $500, actualmente tienes $" + dineroActualMaquina + ".\n Necesitas $" + dineroNescesario);
        }
        maquina.setDineroMaquina(dineroActualMaquina);
        mostrarGaseosas();
    }

    @FXML private void seleccionCoca(){
        int valorBebida = 500;
        int dineroActualMaquina = maquina.getDineroMaquina();
        int dineroNescesario =  valorBebida - dineroActualMaquina;

        if(dineroActualMaquina>=valorBebida){
            clientes.add(new Cliente(Gaseosa.Cocas).toString());
            dineroActualMaquina = dineroActualMaquina - valorBebida;
            lblDineroMaquina.setText(Integer.toString(dineroActualMaquina));
        }else{
            JOptionPane.showMessageDialog(null,"El valor de una bebida Orange´s es de $500, actualmente tienes $" + dineroActualMaquina + ".\n Necesitas $" + dineroNescesario);
        }
        maquina.setDineroMaquina(dineroActualMaquina);
        mostrarGaseosas();
    }

    @FXML private void seleccionGrapes(){
        int valorBebida = 500;
        int dineroActualMaquina = maquina.getDineroMaquina();
        int dineroNescesario =  valorBebida - dineroActualMaquina;

        if(dineroActualMaquina>=valorBebida){
            clientes.add(new Cliente(Gaseosa.Grapes).toString());
            dineroActualMaquina = dineroActualMaquina - valorBebida;
            lblDineroMaquina.setText(Integer.toString(dineroActualMaquina));
        }else{
            JOptionPane.showMessageDialog(null,"El valor de una bebida Orange´s es de $500, actualmente tienes $" + dineroActualMaquina + ".\n Necesitas $" + dineroNescesario);
        }
        maquina.setDineroMaquina(dineroActualMaquina);
        mostrarGaseosas();
    }

    @FXML private void seleccionSprite(){
        int valorBebida = 500;
        int dineroActualMaquina = maquina.getDineroMaquina();
        int dineroNescesario =  valorBebida - dineroActualMaquina;

        if(dineroActualMaquina>=valorBebida){
            clientes.add(new Cliente(Gaseosa.Sprites).toString());
            dineroActualMaquina = dineroActualMaquina - valorBebida;
            lblDineroMaquina.setText(Integer.toString(dineroActualMaquina));
        }else{
            JOptionPane.showMessageDialog(null,"El valor de una bebida Orange´s es de $500, actualmente tienes $" + dineroActualMaquina + ".\n Necesitas $" + dineroNescesario);
        }
        maquina.setDineroMaquina(dineroActualMaquina);
        mostrarGaseosas();
    }

    @FXML private void mostrarGaseosas(){
        listInventario.setItems(clientes);
    }

}

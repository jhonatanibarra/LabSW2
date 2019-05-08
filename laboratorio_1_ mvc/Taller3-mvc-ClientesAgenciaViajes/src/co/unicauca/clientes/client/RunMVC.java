package co.unicauca.clientes.client;

import co.unicauca.clientes.controller.GUIBusquedaClientesController;
import co.unicauca.clientes.modelo.ClientesDB;
import co.unicauca.clientes.vista.GUIBusquedaClientes;
import co.unicauca.clientes.vista.GUIClientesProfesion;
import co.unicauca.clientes.vista.GUIEstadisticaSexo;
import co.unicauca.clientes.vista.GUIGrafica;
/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano
 */
public class RunMVC {

    public RunMVC() {
        //create Model and View

        ClientesDB myModel = new ClientesDB();
        //Posición: (horizontal, vertical)
        GUIBusquedaClientes myView = new GUIBusquedaClientes(200, 50);
        GUIClientesProfesion myView2 = new GUIClientesProfesion(200,220);
        GUIEstadisticaSexo myView3 = new GUIEstadisticaSexo(200,400);
        GUIGrafica myView4 = new GUIGrafica(600,250);
        //Agregando objetos  observadores
        myModel.addObserver(myView);
        myModel.addObserver(myView2);
        myModel.addObserver(myView3);
        myModel.addObserver(myView4);
        
        GUIBusquedaClientesController myController = new GUIBusquedaClientesController();
        myController.addModel(myModel);
        myController.addView(myView);
        myController.addView2(myView3); 
        myController.addView3(myView4);
        myView.addController(myController);
    }

}

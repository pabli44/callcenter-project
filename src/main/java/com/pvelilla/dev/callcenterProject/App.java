package com.pvelilla.dev.callcenterProject;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.pvelilla.dev.callcenterProject.beans.Empleado;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
        System.out.println("****************Almundo Call Center Project*****************************");
       
        int numLlamadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita Número de llamadas a realizar"));
        
        Dispatcher disparadorProcesos = new Dispatcher();
        
        disparadorProcesos.dispatchCall(numLlamadas);
        
    }
}

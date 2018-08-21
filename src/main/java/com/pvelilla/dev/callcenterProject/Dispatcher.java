/**
 * 
 */
package com.pvelilla.dev.callcenterProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.pvelilla.dev.callcenterProject.beans.Empleado;
import com.pvelilla.dev.callcenterProject.beans.Llamada;

/**
 * @author pablyuchenko
 *
 */
public class Dispatcher {
	
	private final static Logger LOGGER = Logger.getLogger(Dispatcher.class.getName());

	
	public void dispatchCall(int numeroLlamadas){
		int cont = 0;
		try {
			AppTest.testllamadas(numeroLlamadas, getEmpleados());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Empleado> getEmpleados(){
		
		ArrayList<Empleado> listaEmpleados = new ArrayList();
		 
		//jerarquías para responsables de llamadas, en orden de prioridades
		//Nivel 1 = Operador, Nivel 2 = Supervisor, Nivel 3 = Director
		    
		//creación de empleados para las asignaciones a las llamadas
		Empleado emp1 = new Empleado("Pablo Gabriel", "Velilla Goenaga", "3209909090", "Operador", false);
		Empleado emp2 = new Empleado("Melissa ", "Hernandez Sotero", "3208449078", "Operador", false);
		Empleado emp3 = new Empleado("Ernesto", "Fadres Lopez", "3775656543", "Operador", false);
		Empleado emp4 = new Empleado("Mangle", "Farias Agudelo", "3090443755", "Operador", false);
		
		Empleado emp5 = new Empleado("Giselle", "Can Gonzalez", "3145567676", "Supervisor", false);
		Empleado emp6 = new Empleado("Pedro Niel", "Perez Almendros", "2989898", "Supervisor", false);
		
		Empleado emp7 = new Empleado("Ismael", "Gomez Andrade", "3327878554", "Director", false);
		
		listaEmpleados.add(emp1);
		listaEmpleados.add(emp2);
		listaEmpleados.add(emp3);
		listaEmpleados.add(emp4);
		listaEmpleados.add(emp5);
		listaEmpleados.add(emp6);
		listaEmpleados.add(emp7);
		
		return listaEmpleados;
	}
	
}

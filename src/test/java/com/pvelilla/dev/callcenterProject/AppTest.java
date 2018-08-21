package com.pvelilla.dev.callcenterProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.pvelilla.dev.callcenterProject.beans.Empleado;
import com.pvelilla.dev.callcenterProject.beans.Llamada;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	final static String Op = "Operador";
	final static String Sv = "Supervisor";
	final static String Dt = "Director";
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * test para 10 llamadas, parámetro listaEmpleados, que podrían atender las llamadas
     */
    public static void testllamadas(int numLlamadas, ArrayList<Empleado> listaEmpleados) throws InterruptedException{
    	int empBusy = 0;
    	
    	for(int i=1;i<=numLlamadas;i++){
			Llamada ll = new Llamada();
			//segundos para cada llamada, desde 5 a 10
			int segundos = (int) Math.random() * 10 + 5;
			
			//creación del hilo para para el proceso
			//Thread t = new Thread();
			ll.setDuracion(segundos);
			//t.start();
			Thread.sleep(segundos*1000);
			int indexResponsable = 0;
			
			for(int j = 0;i<listaEmpleados.size();i++){
				Empleado responsable = listaEmpleados.get(j);
				if((responsable.getJerarquia().equals(Op)) && !responsable.isOcupado()){
					ll.setResponsable(responsable);
					indexResponsable = j;
					responsable.setOcupado(true);
					System.out.println("La llamada fue asignada a "+responsable.getNombres()+" "+responsable.getApellidos()+"\n"+ " con una duración de "+ll.getDuracion());
					empBusy++;
					break;
				}else if((responsable.getJerarquia().equals(Sv)) && !responsable.isOcupado()){
					ll.setResponsable(responsable);
					indexResponsable = j;
					responsable.setOcupado(true);
					System.out.println("La llamada fue asignada a "+responsable.getNombres()+" "+responsable.getApellidos()+"\n"+ " con una duración de "+ll.getDuracion());
					empBusy++;
					break;
				}else if((responsable.getJerarquia().equals(Dt)) && !responsable.isOcupado()){
					ll.setResponsable(responsable);
					indexResponsable = j;
					responsable.setOcupado(true);
					System.out.println("La llamada fue asignada a "+responsable.getNombres()+" "+responsable.getApellidos()+"\n"+ " con una duración de "+ll.getDuracion());
					empBusy++;
					break;
				}
			}
			
			//se verifica si el hilo terminó el tiempo para el que se programó, para setear su valo de ocupación y quede libre para atender
			if(Thread.interrupted()){
				listaEmpleados.get(indexResponsable).setOcupado(false);
			}
			
		}
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usojsonstringlista;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usumaniana1
 */
public class UsoJsonStringLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

       /* ArrayList almacen = new ArrayList<Empleado>();
        Empleado a = new Empleado(2, "Carlos", "empresaUno");
        Empleado b = new Empleado(3, "David", "empresaDos");
        Empleado c = new Empleado(1, "Luis", "empresaTres");

        Gson gson = new Gson();
        almacen.add(a);
        almacen.add(b);
        almacen.add(c);
        
        String jRson = gson.toJson(almacen);
        System.out.println(jRson);
        
        
        java.lang.reflect.Type tipoListaEmpleados = new TypeToken<List<Empleado>>(){
        }.getType();
        List<Empleado> lEmpleados = gson.fromJson(jRson, tipoListaEmpleados);
        System.out.println("Lista de empleado obtenida de Json:");
        for(Empleado me:lEmpleados){
            System.out.println(me);
        }*/
        
       /*Gson gson = new Gson();
        try{
            BufferedReader bf =new BufferedReader(new FileReader("Empleados.txt"));
           Empleado e = gson.fromJson(bf, Empleado.class);
            System.out.println(e);
        }catch(Exception e){
            
        }
       
       
       BufferedReader bf2 = null;
       Gson gson = new Gson();
            try{
            
              bf2 =new BufferedReader(new FileReader("listaEmpleados.txt"));

        }catch(Exception e){
                System.out.println(e.getMessage());
        }
            
         
        Type tipoListaEmpleados = new TypeToken<List<Empleado>>(){
        }.getType();
        List<Empleado> lEmpleados = gson.fromJson(bf2, tipoListaEmpleados);
                System.out.println("Lista de empleado obtenida de Json:");
            for(Empleado me:lEmpleados){
            System.out.println(me);
        }
        }*/
        ArrayList almacen = new ArrayList<Empleado>();
        Empleado a = new Empleado(2, "Carlos", "empresaUno");
        Empleado b = new Empleado(3, "David", "empresaDos");
        Empleado c = new Empleado(1, "Luis", "empresaTres");
        Empleado d = new Empleado(4,"Javie","empresaCuatro");
        Empleado e = new Empleado(5, "Antonio","empresaCinco");
        Empleado f = new Empleado(6, "Raúl","empresaSeis");
        
        Gson gson = new Gson();
        almacen.add(a);
        almacen.add(b);
        almacen.add(c);
        almacen.add(d);
        almacen.add(e);
        almacen.add(f);
        
        String jRson = gson.toJson(almacen); 
     
        BufferedReader bf2 = null;
         PrintWriter pw =null;
        try{
            pw=new PrintWriter("listaEmpleados.txt");
            pw.print(jRson);
            bf2 =new BufferedReader(new FileReader("listaEmpleados.txt"));
            

        }catch(FileNotFoundException ex){
                System.out.println(ex.getMessage());
        }finally{
            pw.close();
        }
                 
        Type tipoListaEmpleados = new TypeToken<List<Empleado>>(){
        }.getType();
         List<Empleado> lEmpleados = gson.fromJson(bf2, tipoListaEmpleados);
                System.out.println("Lista de empleado obtenida de Json:");
                System.out.println("-----------------------------------");
            for(Empleado me:lEmpleados){
            System.out.println(me);
        
    }}}



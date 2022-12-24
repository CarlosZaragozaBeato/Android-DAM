/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usumaniana1
 */
public class JsonConIPersistencia implements IPersistencia {

    @Override
    public void guardar(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List recuperar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 /*   @Override
    public void guardar(List l) {
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
        ArrayList almacen = new ArrayList<Equipo>();
        
        for (int i = 0; i < l.size(); i++)
        {
            Equipo e = (Equipo) l.get(i);
            almacen.add(e);
        }
        
        Gson gson = new Gson();
        
        String rJson = gson.toJson(almacen);
        System.out.println(rJson);
        
        try
        {
            pw = new PrintWriter(new FileWriter("ifequipos.txt"));
            pw.print(rJson);
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            pw.close();
        }
        
    }

    @Override
    public List recuperar() 
    {
        List l = new ArrayList();
        Gson mGson = new Gson();
        
        BufferedReader br2=null;
        
        try
        {
            br2 = new BufferedReader(new FileReader("ifequipos.txt"));
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        java.lang.reflect.Type tipoListaEquipos = new TypeToken<List<Equipo>>(){}.getType(); //LINEA IMPORTANTE
        
        List<Equipo> lequipos = mGson.fromJson(br2, tipoListaEquipos);
        
        for (Equipo e1: lequipos)
        {
            l.add(e1);
        }
        
        return l;
    }*/
    
    
}

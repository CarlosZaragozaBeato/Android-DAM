/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author usumaniana1
 */
public class TextoConIPersistencia implements IPersistencia {

    @Override
    public void guardar(List l) {
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try
        {
            fw = new FileWriter("ifequipos.txt");
            pw = new PrintWriter(fw);

            for(int i=0;i<l.size();i++)
            {
                Equipo e = (Equipo) l.get(i);
                pw.println(e.getNombre()+","+e.getPuntos()+","+e.getPresupuesto());
            }
        }
        catch(IOException ex)
        {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                fw.close();
            }
            catch(Exception e2)
            {
                e2.printStackTrace();
            }
        }
    }

    @Override
    public List recuperar() 
    {
        List l = new ArrayList();
        
        FileReader fr=null;
        BufferedReader br=null;
        String linea =null;
        String []trozos;
        
            try
            {
                fr = new FileReader("ifequipos.txt");
                br = new BufferedReader(fr);

                while((linea = br.readLine())!=null)
                {
                    trozos = linea.split(",");
                    Equipo e = new Equipo(trozos[0],Integer.parseInt(trozos[1].trim()),Integer.parseInt(trozos[2].trim()));
                                       
                    
                    l.add(e);
                }
            }
            catch(FileNotFoundException ex)
            {
                System.out.println(ex.getMessage());
            }
            catch(IOException ex)
            {
                System.out.println(ex.getMessage());
            }
            finally
            {
                try
                {
                    fr.close();
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }            
            return l;
        }
}

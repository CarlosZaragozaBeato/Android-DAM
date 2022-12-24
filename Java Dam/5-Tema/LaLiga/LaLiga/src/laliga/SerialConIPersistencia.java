/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author usumaniana1
 */
public class SerialConIPersistencia implements IPersistencia {

    @Override
    public void guardar(List l) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("ifequiposs.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(l);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
        
    

    @Override
    public List recuperar() 
    {
        
        List l = new ArrayList();
        
        try
        {
            FileInputStream fis = new FileInputStream("ifequiposs.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            l = (List)ois.readObject();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
        return l;
        
    }
    
    
    
}

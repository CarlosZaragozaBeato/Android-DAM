/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_json;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Example_Json {


    public static void main(String[] args) throws IOException {
    
        String json="";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("ejemplo.json"));
            String linea;
            while((linea=br.readLine())!=null){
                json+=linea;
            }
            br.close();
        }catch(FileNotFoundException ex){
            
        }catch(IOException ex){
            
        }
        System.out.println(json);
        
        Gson gson = new Gson();
        Persona p = gson.fromJson(json, Persona.class);
        System.out.println(p);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author usumaniana1
 */
public class XmlConIPersistencia implements IPersistencia {

    @Override
    public void guardar(List l) 
    {
        
        Document doc = null;
        Element raiz = null;
        
        l = new ArrayList();
        
        try
        {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("LaLiga");
            doc.appendChild(rootElement);
            
            for (int i = 0; i < l.size(); i++) 
            {
                Element equipo1 = doc.createElement("Equipo");
                Equipo e = (Equipo) l.get(i);
                
                Element e1 = doc.createElement("nombre");
                e1.setTextContent(e.getNombre());
                equipo1.appendChild(e1);
                
                Element e2 = doc.createElement("puntos");
                e2.setTextContent(""+e.getPuntos());
                equipo1.appendChild(e2);
                
                Element e3 = doc.createElement("presupuesto");
                e3.setTextContent(""+e.getPresupuesto());
                equipo1.appendChild(e3);
                
                rootElement.appendChild(equipo1);
            }
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);   

            StreamResult result = new StreamResult(new File("equipos.xml"));
            transformer.transform(source, result);
  
        }
        catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        }
        catch (TransformerException tfe)
        {
            tfe.printStackTrace();
        }          
    }

    @Override
    public List recuperar() {
        
        return null;     
    }
    
}

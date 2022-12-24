/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaragozafranciscocarlos;

import java.awt.List;
import java.awt.PopupMenu;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author usumaniana1
 */
public class ciclistasGui extends javax.swing.JFrame implements IAntidopaje{
    
    

    /**
     * Creates new form ciclistasGui
     */
    
    private DefaultListModel listasCiclistasHombre,listasCiclistasMujeres,listasCiclistasSancionados,listaSancionados;
    private Document doc = null;
    private Element raiz = null;  
    
    
    public ciclistasGui() {
        initComponents();
        
        listaSancionados = new DefaultListModel();
        listasCiclistasHombre = new DefaultListModel();
        listasCiclistasMujeres = new DefaultListModel();
        listasCiclistasSancionados = new DefaultListModel();
        
        lst_CiclistasHombres.setModel(listasCiclistasHombre);
        lst_CiclistasMujeres.setModel(listasCiclistasMujeres);
        lst_CiclistasSancionados.setModel(listasCiclistasSancionados);
        lst_Sancionados.setModel(listaSancionados);
           
    
        
    }



public void sancionar(){
    
    ciclista clc;

             LinkedList listaCiclistas =new LinkedList();
           
             
        
        for(int i = 0;i<listasCiclistasMujeres.size();i++){
            listaCiclistas.add(listasCiclistasMujeres.get(i));
            
        }
          for(int i = 0;i<listasCiclistasHombre.size();i++){
            listaCiclistas.add(listasCiclistasHombre.get(i));
            
        }
          
          for(int j=0;j<listaCiclistas.size();j++ ){
               clc = (ciclista) listaCiclistas.get(j);
  
          }
          
         listasCiclistasSancionados.addAll(sancionarPorHematocrito(listaCiclistas)); 
    
}

    

    
    

    @Override
    public LinkedList sancionarPorHematocrito(java.util.List lista) 
    {          
        LinkedList ls = new LinkedList();
        for (int i = 0; i < lista.size(); i++) {
            ciclista c =  (ciclista) lista.get(i);
                      
            if (c.getHematocrito() > 50)
            {
                ciclistaSancionado c1cSancionado = new ciclistaSancionado(c.getNombre(), "Retirada de licencia por hematocrito");
                ls.add(c1cSancionado);                
            }            
        }
        return ls;
    }

    
    
    
    
    /*Guardar Ciclistas*/
    public void guardarCiclistasHombres(){
         try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("conjunto_ciclistas");
           
            

            doc.appendChild(rootElement);
           
            
            for(int i=0;i<listasCiclistasHombre.getSize();i++){
                
                Element ciclista = doc.createElement("ciclista");
                
                ciclista e = (ciclista) listasCiclistasHombre.get(i);
                
                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(e.getNombre());
                ciclista.appendChild(nombre);
                
                Element equipo = doc.createElement("equipo");
                equipo.setTextContent(e.getEquipo());
                ciclista.appendChild(equipo);
                
                Element hematocrito = doc.createElement("hematocrito");
                hematocrito.setTextContent(""+e.getHematocrito());
                ciclista.appendChild(hematocrito);
                
                Element sexo = doc.createElement("sexo");
                sexo.setTextContent(e.getSexo());
                ciclista.appendChild(sexo);
                
                rootElement.appendChild(ciclista);
                 
            }
            
                   
            
            
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
         
            StreamResult result = new StreamResult(new File("ciclistas_hombres.xml"));             
            transformer.transform(source, result);
              
              
            
        } catch (ParserConfigurationException ex) {
            
        } catch (TransformerConfigurationException ex) {
            
        } catch (TransformerException ex) {
           
        }
        
        
    }
    public void guardarCiclistasMujeres(){
        
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            doc = docBuilder.newDocument();
            Element padre = doc.createElement("conjunto_ciclistas");
           
            

            doc.appendChild(padre);
           
            
            for(int i=0;i<listasCiclistasMujeres.getSize();i++){
                
                Element ciclista = doc.createElement("ciclista");
                
                ciclista e = (ciclista) listasCiclistasMujeres.get(i);
                
                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(e.getNombre());
                ciclista.appendChild(nombre);
                
                Element equipo = doc.createElement("equipo");
                equipo.setTextContent(e.getEquipo());
                ciclista.appendChild(equipo);
                
                Element hematocrito = doc.createElement("hematocrito");
                hematocrito.setTextContent(""+e.getHematocrito());
                ciclista.appendChild(hematocrito);
                
                Element sexo = doc.createElement("sexo");
                sexo.setTextContent(e.getSexo());
                ciclista.appendChild(sexo);
                
                padre.appendChild(ciclista);
                 
            }
            
                   
            
            
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
         
            StreamResult result = new StreamResult(new File("ciclistas_mujeres.xml"));             
            transformer.transform(source, result);
              
              
            
        } catch (ParserConfigurationException ex) {
            
        } catch (TransformerConfigurationException ex) {
            
        } catch (TransformerException ex) {
           
        }
        
    }
    
    /*Obtener Ciclista*/
    public ciclista obtenerCiclista(Element l){
        
        String nombreCiclista, sexo, equipo;
        int hematocrito;
        
        Element el= null;
        NodeList lista = null;
        
        ciclista clc;
        
        lista = l.getElementsByTagName("nombre");
        el = (Element) lista.item(0);
        nombreCiclista = el.getTextContent();
         
        lista = l.getElementsByTagName("equipo");
        el = (Element) lista.item(0);
        equipo = el.getTextContent();
        
        lista = l.getElementsByTagName("hematocrito");
        el = (Element) lista.item(0);
        hematocrito = Integer.parseInt(el.getTextContent());
        
        lista = l.getElementsByTagName("sexo");
        el = (Element) lista.item(0);
        sexo = el.getTextContent();
        
        clc = new ciclista(nombreCiclista,equipo,sexo,hematocrito);
      
        return clc;
        
    
    }
    
    
    /*Recuperar Ciclista*/
    public void recuperarCiclista(){
     
        listasCiclistasHombre.clear();
        listasCiclistasMujeres.clear();
        
         try {
            
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            Document doc = db.parse("ciclistas.xml");
            
            raiz = doc.getDocumentElement();
            
            NodeList nlCiclistas = doc.getElementsByTagName("ciclista");
            
            Element elementoCiclista;
            
            for(int i=0;i<nlCiclistas.getLength();i++){
                
                ciclista e = null;
                
                elementoCiclista = (Element) nlCiclistas.item(i);
                
                e = obtenerCiclista(elementoCiclista);
               
                if(e.getSexo().equalsIgnoreCase("mujer")){
                   
                    listasCiclistasMujeres.addElement(e);
                    
                    if (listaSancionados.contains(e.getEquipo()))
                      {

                      }
                      else
                      {
                          listaSancionados.addElement(e.getEquipo()); 
                      }    
                    
                }else if(e.getSexo().equalsIgnoreCase("hombre")){
                    
                    listasCiclistasHombre.addElement(e);
                    
                       if (listaSancionados.contains(e.getEquipo()))
                      {

                      }
                      else
                      {
                          listaSancionados.addElement(e.getEquipo()); 
                      } 
                }
                

                
            }
            
          
            
         
            
        } catch (ParserConfigurationException ex) {
       
        } catch (SAXException ex) {
        
        } catch (IOException ex) {
          
        }

        
    }
    
    
    /*Cambio de Sexo*/
    public void cambioAMujer(){
    
        ciclista clc;
        
        clc = (ciclista)listasCiclistasHombre.get(lst_CiclistasHombres.getSelectedIndex());
        
        listasCiclistasHombre.remove(lst_CiclistasHombres.getSelectedIndex());
        //System.out.println(clc.getSexo()); 
        clc.setSexo("Mujer");
        listasCiclistasMujeres.addElement(clc);
        //System.out.println(clc.getSexo());
        
       
        
       
        
        
        
    }   
    public void cambioAHombre(){
         
        ciclista clc;
        
        clc = (ciclista)listasCiclistasMujeres.get(lst_CiclistasMujeres.getSelectedIndex());
        
        listasCiclistasMujeres.remove(lst_CiclistasMujeres.getSelectedIndex());
        //System.out.println(clc.getSexo()); 
        clc.setSexo("Hombre");
        listasCiclistasHombre.addElement(clc);
        //System.out.println(clc.getSexo());
    }

    
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_CiclistasHombres = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_CiclistasMujeres = new javax.swing.JList<>();
        btn_LeerYCrear = new javax.swing.JButton();
        btn_GuardarDatos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst_CiclistasSancionados = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btn_ControlDopaje = new javax.swing.JButton();
        btn_CambiarAMujer = new javax.swing.JButton();
        btn_CambiarAHombre = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lst_Sancionados = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ciclistas Hombres");

        jLabel2.setText("Ciclistas Mujeres");

        jScrollPane1.setViewportView(lst_CiclistasHombres);

        jScrollPane2.setViewportView(lst_CiclistasMujeres);

        btn_LeerYCrear.setText("Leer y crear Ciclistas");
        btn_LeerYCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LeerYCrearActionPerformed(evt);
            }
        });

        btn_GuardarDatos.setText("Guardar Datos");
        btn_GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarDatosActionPerformed(evt);
            }
        });

        lst_CiclistasSancionados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lst_CiclistasSancionados);

        jLabel3.setText("Ciclistas Sancionados");

        btn_ControlDopaje.setText("Control Dopaje");
        btn_ControlDopaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ControlDopajeActionPerformed(evt);
            }
        });

        btn_CambiarAMujer.setText("Cambiar a mujer");
        btn_CambiarAMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CambiarAMujerActionPerformed(evt);
            }
        });

        btn_CambiarAHombre.setText("Cambiar a hombre");
        btn_CambiarAHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CambiarAHombreActionPerformed(evt);
            }
        });

        lst_Sancionados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lst_Sancionados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addGap(388, 388, 388)
                .addComponent(jLabel2)
                .addGap(267, 267, 267)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_GuardarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_CambiarAMujer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_CambiarAHombre, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                    .addGap(51, 51, 51)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_LeerYCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(113, 113, 113)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_ControlDopaje)))))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btn_CambiarAMujer)
                                .addGap(63, 63, 63)
                                .addComponent(btn_CambiarAHombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_LeerYCrear)
                            .addComponent(btn_ControlDopaje))))
                .addGap(86, 86, 86)
                .addComponent(btn_GuardarDatos)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CambiarAMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarAMujerActionPerformed
        // TODO add your handling code here:
        cambioAMujer();
        
    }//GEN-LAST:event_btn_CambiarAMujerActionPerformed

    private void btn_LeerYCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LeerYCrearActionPerformed
        // TODO add your handling code here:
        recuperarCiclista();
        
    }//GEN-LAST:event_btn_LeerYCrearActionPerformed

    private void btn_CambiarAHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarAHombreActionPerformed
            // TODO add your handling code here:
            cambioAHombre();
    }//GEN-LAST:event_btn_CambiarAHombreActionPerformed

    private void btn_GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarDatosActionPerformed
        // TODO add your handling code here:
        
        guardarCiclistasHombres();
        guardarCiclistasMujeres();
    }//GEN-LAST:event_btn_GuardarDatosActionPerformed

    private void btn_ControlDopajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ControlDopajeActionPerformed
        // TODO add your handling code here:
      
        sancionar();
    }//GEN-LAST:event_btn_ControlDopajeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ciclistasGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ciclistasGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ciclistasGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ciclistasGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ciclistasGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CambiarAHombre;
    private javax.swing.JButton btn_CambiarAMujer;
    private javax.swing.JButton btn_ControlDopaje;
    private javax.swing.JButton btn_GuardarDatos;
    private javax.swing.JButton btn_LeerYCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lst_CiclistasHombres;
    private javax.swing.JList<String> lst_CiclistasMujeres;
    private javax.swing.JList<String> lst_CiclistasSancionados;
    private javax.swing.JList<String> lst_Sancionados;
    // End of variables declaration//GEN-END:variables

 

   
}

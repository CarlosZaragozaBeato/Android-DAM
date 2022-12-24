/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlejemplo;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
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
import org.w3c.dom.NodeList;


public class xmlGui extends javax.swing.JFrame {

     ArrayList <Libro> almacenLibros = new ArrayList<Libro>();
     
     Element raiz;
     DefaultListModel mLibros= new DefaultListModel();
     
    public xmlGui() {
        initComponents();
        list_Libros.setModel(mLibros);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_Libros = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_Titulo = new javax.swing.JTextField();
        txf_Autor = new javax.swing.JTextField();
        txf_Isbn = new javax.swing.JTextField();
        txf_Precio = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnItem_Cargar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mxItem_Guardar = new javax.swing.JMenu();
        mnItem_Guardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(list_Libros);

        jLabel1.setText("Título");

        jLabel2.setText("Autor");

        jLabel3.setText("Isbn");

        jLabel4.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_Precio, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txf_Isbn)
                    .addComponent(txf_Autor)
                    .addComponent(txf_Titulo))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txf_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txf_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txf_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txf_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        mnItem_Cargar.setText("Cargar");

        jMenuItem1.setText("Cargar Xml");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnItem_Cargar.add(jMenuItem1);

        jMenuBar1.add(mnItem_Cargar);

        mxItem_Guardar.setText("Guardar");

        mnItem_Guardar.setText("Guardar Xml");
        mnItem_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_GuardarActionPerformed(evt);
            }
        });
        mxItem_Guardar.add(mnItem_Guardar);

        jMenuBar1.add(mxItem_Guardar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       
      cargarXml();

        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnItem_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_GuardarActionPerformed
        try {
            // TODO add your handling code here:
            guardarXml();
        } catch (TransformerException ex) {
            Logger.getLogger(xmlGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_mnItem_GuardarActionPerformed
    public void guardarXml() throws TransformerException{
        try {
       
            DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = df.newDocumentBuilder();     
            Document doc = db.newDocument();
            
            Element root = doc.createElement("Biblioteca");
            doc.appendChild(root);
            
            for(int i =0;i<mLibros.getSize();i++){
                
                Libro l=(Libro)mLibros.get(i);
                
                
                Element libro = doc.createElement("libro");
                
                
                Element titulo = doc.createElement("titulo");      
                titulo.setTextContent(l.getTitulo());
                
                Element autor = doc.createElement("autor");
                autor.setTextContent(l.getAutor());
                
                Element isbn = doc.createElement("isb");
                isbn.setTextContent(l.getIsbn());
                
                Element precio = doc.createElement("precio");
                precio.setTextContent(""+l.getPrecio());
                
        
                libro.appendChild(titulo);
                libro.appendChild(autor);
                libro.appendChild(isbn);
                libro.appendChild(precio);
                root.appendChild(libro);
             
                
            }
             
               
          
            TransformerFactory tF = TransformerFactory.newInstance();
            Transformer transformer = tF.newTransformer();
            DOMSource source = new DOMSource(doc);
            
            StreamResult result = new StreamResult(new File("biblioteca.xml"));
            transformer.transform(source, result);
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(xmlGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        
    public Libro ObtenerLibro(Element l){
        
        String sTitulo, sAutor, sIsbn;
        int iPrecio;
        Element el = null;
        NodeList lista = null;
        Libro lLibre = null;
        
        lista = l.getElementsByTagName("titulo");
        el = (Element)lista.item(0);
        sTitulo= el.getTextContent();
         
        lista = l.getElementsByTagName("autor");
        el = (Element)lista.item(0);
        sAutor= el.getTextContent();
        
        lista = l.getElementsByTagName("isbn");
        el = (Element)lista.item(0);
        sIsbn= el.getTextContent();
     
        
        lista = l.getElementsByTagName("precio");
        el = (Element)lista.item(0);
        iPrecio= Integer.parseInt(el.getTextContent());
        
        lLibre=new Libro(sIsbn,sAutor,sTitulo,iPrecio);
        
        return  lLibre;
    }
 
       public void cargarXml(){
              try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
           
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            Document doc=db.parse("Libros.txt");
            
            raiz = doc.getDocumentElement();
            
            NodeList nl = doc.getElementsByTagName("libro");
        
             Element lib;
             for(int i =0; i<nl.getLength(); i++){
                 Libro l = null;
                 lib =(Element)nl.item(i);
                 l = ObtenerLibro(lib);
                 mLibros.addElement(l);
             }
        
     
            } catch (Exception ex) {
            System.out.println("¡Error! No se ha podido cargar el documento XML.");
}  
        }
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xmlGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_Libros;
    private javax.swing.JMenu mnItem_Cargar;
    private javax.swing.JMenuItem mnItem_Guardar;
    private javax.swing.JMenu mxItem_Guardar;
    private javax.swing.JTextField txf_Autor;
    private javax.swing.JTextField txf_Isbn;
    private javax.swing.JTextField txf_Precio;
    private javax.swing.JTextField txf_Titulo;
    // End of variables declaration//GEN-END:variables
}

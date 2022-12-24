
package xmlcoches;


import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;



public class cochesGui extends javax.swing.JFrame {

    DefaultListModel dflCoches = new DefaultListModel();
    ArrayList <coche>arrayCoches = new ArrayList<coche>();
    
    
    public cochesGui() {
        initComponents();
        list_Coches.setModel(dflCoches);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_Coches = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnItem_CargarXml = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnItem_GuardarXml = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnItem_CrearCoche = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(list_Coches);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Cargar");

        mnItem_CargarXml.setText("Cargar Xml");
        mnItem_CargarXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_CargarXmlActionPerformed(evt);
            }
        });
        jMenu1.add(mnItem_CargarXml);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guardar");

        mnItem_GuardarXml.setText("Guardar Xml");
        mnItem_GuardarXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_GuardarXmlActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_GuardarXml);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Crear ");

        mnItem_CrearCoche.setText("Crear Coche");
        mnItem_CrearCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_CrearCocheActionPerformed(evt);
            }
        });
        jMenu3.add(mnItem_CrearCoche);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItem_CargarXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_CargarXmlActionPerformed
       
        dflCoches.clear();
        cargarXml();
    }//GEN-LAST:event_mnItem_CargarXmlActionPerformed

    private void mnItem_CrearCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_CrearCocheActionPerformed
        // TODO add your handling code here:
        dCrearCoche d = new dCrearCoche(this, true);
        d.setVisible(true);
        
        
    }//GEN-LAST:event_mnItem_CrearCocheActionPerformed

    private void mnItem_GuardarXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_GuardarXmlActionPerformed
        // TODO add your handling code here:
        añadirCoche();
    }//GEN-LAST:event_mnItem_GuardarXmlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cochesGui().setVisible(true);
            }
        });
    }
    
    
    public coche obtenerCoches(Element element1){
        
        String sMarca, sModelo;
        double dCilindrada;
        int iId;
        
        Element e1 = null;
        NodeList list = null;
        coche cCoche = null;
        
        
        list = element1.getElementsByTagName("marca");
        e1 = (Element)list.item(0);
        sMarca = e1.getTextContent();
        
        list = element1.getElementsByTagName("modelo");
        e1 = (Element)list.item(0);
        sModelo = e1.getTextContent();
        
        list = element1.getElementsByTagName("cilindrada");
        e1 = (Element)list.item(0);
        dCilindrada = Double.parseDouble(e1.getTextContent());
        
        iId =  Integer.parseInt(element1.getAttribute("id"));
       
        
        
        cCoche = new coche(sMarca, sModelo, dCilindrada);
        return cCoche;
        
        
        
        
    }

    public void cargarXml() {
        try{
            DocumentBuilderFactory dbf =DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("coches.txt");
            NodeList nList = doc.getElementsByTagName("coche");
            Element coch;
           
            for(int i =0; i<nList.getLength();i++){
                coche c =null;
                coch =(Element) nList.item(i);
                c = obtenerCoches(coch);
                dflCoches.addElement(c);
                arrayCoches.add(c);
                System.out.println(arrayCoches.get(i));
            }
            
        }catch(Exception e){
            System.out.println("coche");
        }
    } 
    
    
    public void añadirCoche(){
          
         
               dflCoches.clear();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("equiposXml.txt");
            NodeList nList = doc.getElementsByTagName("equipo");
            Element ec;

            for (int i = 0; i < nList.getLength(); i++) {
                coche e = null;
                ec = (Element) nList.item(i);
                e = obtenerCoches(ec);
                dflCoches.addElement(e);

            }

        } catch (Exception e) {

        }
            
            
            
    
        
        
    }
    
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_Coches;
    private javax.swing.JMenuItem mnItem_CargarXml;
    private javax.swing.JMenuItem mnItem_CrearCoche;
    private javax.swing.JMenuItem mnItem_GuardarXml;
    // End of variables declaration//GEN-END:variables
}

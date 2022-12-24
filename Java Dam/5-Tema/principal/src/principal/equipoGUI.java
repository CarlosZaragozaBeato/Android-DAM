
package principal;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.w3c.dom.NodeList;


public class equipoGUI extends javax.swing.JFrame {

  
    private ArrayList<Equipos> almacenEquipos = new ArrayList<Equipos>();
    private String nombre;
    private int puntos;
    private int presupuesto;
    private DefaultListModel dfl = new DefaultListModel();
    private int contador = 0;

    public equipoGUI() {
        initComponents();
        lst_equipos.setModel(dfl);

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_puntos = new javax.swing.JTextField();
        txf_presupuesto = new javax.swing.JTextField();
        btn_incluir = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_equipos = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txf_nombre = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnitem_GuardarTexto = new javax.swing.JMenuItem();
        mnItem_GuardarSeriando = new javax.swing.JMenuItem();
        mnItem_GuardarJson = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnItem_CargarTexto = new javax.swing.JMenuItem();
        mnItem_CargarSeriando = new javax.swing.JMenuItem();
        mnItem_CargarJson = new javax.swing.JMenuItem();
        mnItem_CargarXml = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnItem_OrdenarNombre = new javax.swing.JMenuItem();
        mnItem_OrdenarPuntos = new javax.swing.JMenuItem();
        mnItem_OrdenarPresupuesto = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Equipos");

        jLabel3.setText("Puntos:");

        jLabel4.setText("Presupuesto:");

        txf_puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_puntosActionPerformed(evt);
            }
        });

        txf_presupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_presupuestoActionPerformed(evt);
            }
        });

        btn_incluir.setText("Incluir");
        btn_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incluirActionPerformed(evt);
            }
        });

        btn_delete.setText("Borrar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        lst_equipos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_equipos);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Lista");

        jLabel2.setText("Nombre:");

        txf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txf_presupuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txf_nombre)
                            .addComponent(txf_puntos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btn_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_presupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_incluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        jMenu1.setText("Guardar");

        mnitem_GuardarTexto.setText("Guardar Texto");
        mnitem_GuardarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitem_GuardarTextoActionPerformed(evt);
            }
        });
        jMenu1.add(mnitem_GuardarTexto);

        mnItem_GuardarSeriando.setText("Guardar Seriando");
        mnItem_GuardarSeriando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_GuardarSeriandoActionPerformed(evt);
            }
        });
        jMenu1.add(mnItem_GuardarSeriando);

        mnItem_GuardarJson.setText("Guardar Json");
        mnItem_GuardarJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_GuardarJsonActionPerformed(evt);
            }
        });
        jMenu1.add(mnItem_GuardarJson);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cargar");

        mnItem_CargarTexto.setText("Cargar Texto");
        mnItem_CargarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_CargarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_CargarTexto);

        mnItem_CargarSeriando.setText("Cargar Seriando");
        mnItem_CargarSeriando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_CargarSeriandoActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_CargarSeriando);

        mnItem_CargarJson.setText("Cargar Json");
        mnItem_CargarJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_CargarJsonActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_CargarJson);

        mnItem_CargarXml.setText("Cargar Xml");
        mnItem_CargarXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_CargarXmlActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_CargarXml);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ordenar");

        mnItem_OrdenarNombre.setText("Ordenar Por Nombre");
        mnItem_OrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_OrdenarNombreActionPerformed(evt);
            }
        });
        jMenu3.add(mnItem_OrdenarNombre);

        mnItem_OrdenarPuntos.setText("Ordenar Por Puntos");
        mnItem_OrdenarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_OrdenarPuntosActionPerformed(evt);
            }
        });
        jMenu3.add(mnItem_OrdenarPuntos);

        mnItem_OrdenarPresupuesto.setText("Ordenar Por Presupuesto");
        mnItem_OrdenarPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_OrdenarPresupuestoActionPerformed(evt);
            }
        });
        jMenu3.add(mnItem_OrdenarPresupuesto);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nombreActionPerformed



    }//GEN-LAST:event_txf_nombreActionPerformed

    private void txf_puntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_puntosActionPerformed
    
    }//GEN-LAST:event_txf_puntosActionPerformed

    private void txf_presupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_presupuestoActionPerformed
   
    }//GEN-LAST:event_txf_presupuestoActionPerformed

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        // TODO add your handling code here:
        incluirLista();
    }//GEN-LAST:event_btn_incluirActionPerformed

    private void mnItem_GuardarSeriandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_GuardarSeriandoActionPerformed
        // TODO add your handling code here:
        guardarSeriando();
    }//GEN-LAST:event_mnItem_GuardarSeriandoActionPerformed

    private void mnItem_OrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_OrdenarNombreActionPerformed
        // TODO add your handling code here:
        ordenarNombre();
    }//GEN-LAST:event_mnItem_OrdenarNombreActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        borrarLista();

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void mnitem_GuardarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitem_GuardarTextoActionPerformed
        // TODO add your handling code here:
        guardarTexto();
    }//GEN-LAST:event_mnitem_GuardarTextoActionPerformed

    private void mnItem_GuardarJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_GuardarJsonActionPerformed
        // TODO add your handling code here:
        guardarSeriando();
    }//GEN-LAST:event_mnItem_GuardarJsonActionPerformed

    private void mnItem_CargarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_CargarTextoActionPerformed
        // TODO add your handling code here:
        cargarTexto();
    }//GEN-LAST:event_mnItem_CargarTextoActionPerformed

    private void mnItem_CargarSeriandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_CargarSeriandoActionPerformed
        // TODO add your handling code here:
        cargarSeriando();
    }//GEN-LAST:event_mnItem_CargarSeriandoActionPerformed

    private void mnItem_CargarJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_CargarJsonActionPerformed
        try {
            // TODO add your handling code here:
            cargarJson();
        } catch (IOException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnItem_CargarJsonActionPerformed

    private void mnItem_OrdenarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_OrdenarPuntosActionPerformed
        // TODO add your handling code here:
        ordenarPuntos();
    }//GEN-LAST:event_mnItem_OrdenarPuntosActionPerformed

    private void mnItem_OrdenarPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_OrdenarPresupuestoActionPerformed
        // TODO add your handling code here:
        ordenarPresupuesto();
    }//GEN-LAST:event_mnItem_OrdenarPresupuestoActionPerformed

    private void mnItem_CargarXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_CargarXmlActionPerformed
        // TODO add your handling code here:
        
        cargarXml();
    }//GEN-LAST:event_mnItem_CargarXmlActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(equipoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equipoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equipoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equipoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new equipoGUI().setVisible(true);
            }
        });
    }
    
    public Equipos obtenerEquipo(Element element1){
        
        String sNombre;
        Double dPresupuesto;
        int iPuntos;
        
        Equipos e1=null;
        NodeList list = null;
        Element el1=null;
        
        list = element1.getElementsByTagName("nombre");
        el1 = (Element)list.item(0);
        sNombre = el1.getTextContent();
         
        list = element1.getElementsByTagName("presupuesto");
        el1 = (Element)list.item(0);
        dPresupuesto = Double.parseDouble(el1.getTextContent());
        
        list = element1.getElementsByTagName("puntos");
        el1 = (Element)list.item(0);
        iPuntos = Integer.parseInt(el1.getTextContent());
        
        
        e1 = new Equipos(sNombre,dPresupuesto,iPuntos);
        
        return e1;
        
        
        
        
    }
    public void cargarXml(){
        
        dfl.clear();
        
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =  db.parse("equiposXml.txt");
            NodeList nList = doc.getElementsByTagName("equipo");
            Element ec;
                
            for(int i=0; i<nList.getLength();i++){
                Equipos e=null;
                ec = (Element) nList.item(i);
                e = obtenerEquipo(ec);
                dfl.addElement(e);
                
            }
            
        }catch(Exception e){
            
        }
     
    }
    
    public void cargarSeriando(){
        
        try {

            FileInputStream fis = new FileInputStream("fEquiposS.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            dfl = ((DefaultListModel) ois.readObject());
            lst_equipos.setModel(dfl);
            lst_equipos.updateUI();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarSeriando(){
          try {
            // TODO add your handling code here:
            FileOutputStream fos = new FileOutputStream("fEquiposS.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(dfl);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarTexto(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            // TODO add your handling code here:
            fw = new FileWriter("equipos.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < dfl.getSize(); i++) {

                Equipos e = (Equipos) dfl.get(i);

                pw.println(e.getNombre() + "," + e.getPresupuesto() + "," + e.getPuntos());

            }
        } catch (IOException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
            }

        }
    }
    
    public void cargarTexto(){
         FileReader fw = null;
        BufferedReader br = null;
        String linea = null;

        String trozos[] = null;

        dfl.clear();
        try {
            // TODO add your handling code here:
            fw = new FileReader("equipos.txt");
            br = new BufferedReader(fw);
            while ((linea = br.readLine()) != null) {
                trozos = linea.split(",");
                Equipos e = new Equipos(trozos[0], Double.parseDouble(trozos[1].trim()), Integer.parseInt(trozos[2].trim()));
                dfl.addElement(e);
                lst_equipos.setModel(dfl);

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(equipoGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
            }

        }
    }
    
    public void incluirLista(){
        almacenEquipos.add(new Equipos(txf_nombre.getText(), Integer.parseInt(txf_presupuesto.getText()), Integer.parseInt(txf_puntos.getText())));
        dfl.addElement(almacenEquipos.get(contador));
        txf_nombre.setText(null);
        txf_presupuesto.setText(null);
        txf_puntos.setText(null);
        contador++;
    }
    
    public void borrarLista(){
          dfl.remove(lst_equipos.getSelectedIndex());

    }
    
    public void ordenarNombre() {
        Equipos[] w = new Equipos[dfl.size()];

        dfl.copyInto(w);

        dfl.clear();

        Arrays.sort(w);

        for (int x = 0; x < w.length; x++) {

            dfl.addElement(w[x]);
        }

        lst_equipos.updateUI();
    }

    public void ordenarPuntos() {
        Equipos[] w = new Equipos[dfl.size()];

        dfl.copyInto(w);

        dfl.clear();

        Arrays.sort(w, new ordenarPorPuntos());

        for (int x = 0; x < w.length; x++) {

            dfl.addElement(w[x]);
        }

        lst_equipos.updateUI();

    }

    public void ordenarPresupuesto() {
        Equipos[] w = new Equipos[dfl.size()];

        dfl.copyInto(w);

        dfl.clear();

        Arrays.sort(w, new ordenarPorPresupuesto());

        for (int x = 0; x < w.length; x++) {

            dfl.addElement(w[x]);
        }

        lst_equipos.updateUI();
    }

    public void guardarJson() {

        Gson gson = new Gson();

        BufferedReader bf2 = null;
        PrintWriter pw = null;

        for (int i = 0; i < dfl.getSize(); i++) {
            almacenEquipos.add((Equipos) dfl.get(i));
        }
        String jRson = gson.toJson(almacenEquipos);

        try {
            pw = new PrintWriter("listaEquiposJson.txt");
            pw.print(jRson);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            pw.close();
        }
    }

    public void cargarJson() throws IOException {

        Gson gson = new Gson();
        String linea = null;
        BufferedReader bf2 = null;
        try {

            bf2 = new BufferedReader(new FileReader("listaEquiposJson.txt"));

            while ((linea = bf2.readLine()) != null) {

                dfl.addElement(linea);

            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {

        }

        java.lang.reflect.Type tipoListaEmpleados = new TypeToken<java.util.List<Equipos>>() {
        }.getType();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_equipos;
    private javax.swing.JMenuItem mnItem_CargarJson;
    private javax.swing.JMenuItem mnItem_CargarSeriando;
    private javax.swing.JMenuItem mnItem_CargarTexto;
    private javax.swing.JMenuItem mnItem_CargarXml;
    private javax.swing.JMenuItem mnItem_GuardarJson;
    private javax.swing.JMenuItem mnItem_GuardarSeriando;
    private javax.swing.JMenuItem mnItem_OrdenarNombre;
    private javax.swing.JMenuItem mnItem_OrdenarPresupuesto;
    private javax.swing.JMenuItem mnItem_OrdenarPuntos;
    private javax.swing.JMenuItem mnitem_GuardarTexto;
    private javax.swing.JTextField txf_nombre;
    private javax.swing.JTextField txf_presupuesto;
    private javax.swing.JTextField txf_puntos;
    // End of variables declaration//GEN-END:variables
}

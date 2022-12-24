/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.*;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class DClientes extends javax.swing.JDialog {

    Fondo3 fondo = new Fondo3();
    int xMouse, yMouse;
    
    private DefaultTableModel dtm = new DefaultTableModel();
    restauranteGUI padre;
    
    /**
     * Creates new form DClientes
     */
    public DClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setContentPane(fondo);
        initComponents();
        padre = (restauranteGUI)parent;
        tbl_clientes.setModel(dtm);
        
        String titulos[] = {"ID","Nombre","Apellidos"};
        dtm.setColumnIdentifiers(titulos);
        
        mostrarClientes(0,null);
        
        
    }
    
    public void mostrarClientes(int opBuscar, String valor)
    {
        
        dtm.setRowCount(0);
        
        String codsql=null;
        
        if (opBuscar == 0 && valor == null)
        {
            codsql = "SELECT * FROM CLIENTES";
        }
        else
        {
            if (opBuscar == 1 && valor != null)
            {
                codsql = "SELECT * FROM CLIENTES WHERE idcliente = '"+valor+"'";
            }
            else
            {
                if (opBuscar == 2 && valor !=null)
                {
                    codsql = "SELECT * FROM CLIENTES WHERE apellidos = '"+valor+"'";
                }
                else
                {
                    codsql = "SELECT * FROM CLIENTES";
                }
            }
        }
        
        txf_filtrarClientes.setText("");
        try
        {
            
            Connection conex = hazConexion2();
        
        
            Statement s = conex.createStatement();
        
            ResultSet rs = s.executeQuery(codsql);

            
            
            while (rs.next())
            {
                Object [] fila = new Object[3];
                
                for (int i=0;i<3;i++)
                {
                    fila[i] = rs.getObject(i+1);
                    
                }
                dtm.addRow(fila);
            }
            
            tbl_clientes.updateUI();
        }
       
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
  
    public Connection hazConexion2()
    {
        Connection conexion = null;
        try
        {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/meltdown?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","toor");
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        return conexion;
    }
    
    public void eliminarCliente()
    {
        Connection conex = hazConexion2();
        int fila = tbl_clientes.getSelectedRow();
        String valor = tbl_clientes.getValueAt(fila, 0).toString();
        
        try 
        {
            PreparedStatement eliminar = conex.prepareStatement("DELETE FROM CLIENTES WHERE idcliente='"+valor+"'");
            eliminar.executeUpdate();
            dtm.removeRow(tbl_clientes.getSelectedRow());
            
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente","Informacion",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente","Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex)
        {
           JOptionPane.showMessageDialog(null, "Debe seleccionar un producto de la lista","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarCliente()
    {
        int fila = tbl_clientes.getSelectedRow();
        int id = Integer.parseInt(this.tbl_clientes.getValueAt(fila,0).toString());
        
        String nombre = tbl_clientes.getValueAt(fila, 1).toString();
        String apellidos = tbl_clientes.getValueAt(fila,2).toString();
        
        try
        {
            Connection conex = hazConexion2();
            
            PreparedStatement st = conex.prepareStatement("UPDATE CLIENTES SET nombre='"+nombre+"',apellidos='"+apellidos+"'"
                    + "                                    WHERE idcliente='"+id+"'");
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente");
            
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null, "ERROR. No se pudo actualizar el cliente");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        pnl_incluirCliente = new javax.swing.JPanel();
        lbl_incluirCliente = new javax.swing.JLabel();
        pnl_eliminarCliente = new javax.swing.JPanel();
        lbl_eliminarCliente = new javax.swing.JLabel();
        pnl_modificar = new javax.swing.JPanel();
        lbl_modificar = new javax.swing.JLabel();
        pnl_barra = new javax.swing.JPanel();
        pnl_cerrar = new javax.swing.JPanel();
        lbl_cerrar = new javax.swing.JLabel();
        pnl_retroceder = new javax.swing.JPanel();
        lbl_retroceder = new javax.swing.JLabel();
        cbox_filtrarClientes = new javax.swing.JComboBox<>();
        txf_filtrarClientes = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        lbl_titulo.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("CLIENTES");

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_clientes);

        lbl_incluirCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_incluirCliente.setText("INCLUIR");
        lbl_incluirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_incluirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_incluirClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_incluirClienteMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnl_incluirClienteLayout = new javax.swing.GroupLayout(pnl_incluirCliente);
        pnl_incluirCliente.setLayout(pnl_incluirClienteLayout);
        pnl_incluirClienteLayout.setHorizontalGroup(
            pnl_incluirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_incluirCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl_incluirClienteLayout.setVerticalGroup(
            pnl_incluirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_incluirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        lbl_eliminarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eliminarCliente.setText("ELIMINAR");
        lbl_eliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_eliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eliminarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_eliminarClienteLayout = new javax.swing.GroupLayout(pnl_eliminarCliente);
        pnl_eliminarCliente.setLayout(pnl_eliminarClienteLayout);
        pnl_eliminarClienteLayout.setHorizontalGroup(
            pnl_eliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_eliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        pnl_eliminarClienteLayout.setVerticalGroup(
            pnl_eliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_eliminarClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modificar.setText("MODIFICAR");
        lbl_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_modificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_modificarLayout = new javax.swing.GroupLayout(pnl_modificar);
        pnl_modificar.setLayout(pnl_modificarLayout);
        pnl_modificarLayout.setHorizontalGroup(
            pnl_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl_modificarLayout.setVerticalGroup(
            pnl_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnl_barra.setBackground(new java.awt.Color(204, 204, 204));
        pnl_barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barraMouseDragged(evt);
            }
        });
        pnl_barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barraMousePressed(evt);
            }
        });

        pnl_cerrar.setBackground(new java.awt.Color(204, 204, 204));

        lbl_cerrar.setBackground(new java.awt.Color(204, 204, 204));
        lbl_cerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cerrar.setText("X");
        lbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_cerrarLayout = new javax.swing.GroupLayout(pnl_cerrar);
        pnl_cerrar.setLayout(pnl_cerrarLayout);
        pnl_cerrarLayout.setHorizontalGroup(
            pnl_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        pnl_cerrarLayout.setVerticalGroup(
            pnl_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbl_retroceder.setBackground(new java.awt.Color(204, 204, 204));
        lbl_retroceder.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_retroceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_retroceder.setText("<-");
        lbl_retroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_retrocederMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_retrocederMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_retrocederMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_retrocederLayout = new javax.swing.GroupLayout(pnl_retroceder);
        pnl_retroceder.setLayout(pnl_retrocederLayout);
        pnl_retrocederLayout.setHorizontalGroup(
            pnl_retrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_retrocederLayout.createSequentialGroup()
                .addComponent(lbl_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_retrocederLayout.setVerticalGroup(
            pnl_retrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_retroceder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_barraLayout = new javax.swing.GroupLayout(pnl_barra);
        pnl_barra.setLayout(pnl_barraLayout);
        pnl_barraLayout.setHorizontalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barraLayout.createSequentialGroup()
                .addComponent(pnl_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_barraLayout.setVerticalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barraLayout.createSequentialGroup()
                .addComponent(pnl_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cbox_filtrarClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todos", "Identificacion", "Apellidos" }));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(pnl_incluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(pnl_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(pnl_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbox_filtrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txf_filtrarClientes))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btn_buscar)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbl_titulo)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_filtrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_filtrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_incluirCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_eliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_incluirClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_incluirClienteMouseEntered
        
    }//GEN-LAST:event_lbl_incluirClienteMouseEntered

    private void lbl_eliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarClienteMouseClicked
        try
        {
            eliminarCliente();
        }
        catch (Exception ex)
        {
           JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente de la lista","Error", JOptionPane.ERROR_MESSAGE);        
        }
    }//GEN-LAST:event_lbl_eliminarClienteMouseClicked

    private void lbl_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_modificarMouseClicked
        try
        {
            actualizarCliente();
        }
        catch (Exception ex)
        {
           JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente de la lista","Error", JOptionPane.ERROR_MESSAGE);        
        }
    }//GEN-LAST:event_lbl_modificarMouseClicked

    private void lbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_cerrarMouseClicked

    private void lbl_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseEntered
        pnl_cerrar.setBackground(Color.red);
        lbl_cerrar.setForeground(Color.black);
    }//GEN-LAST:event_lbl_cerrarMouseEntered

    private void lbl_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseExited
        pnl_cerrar.setBackground(Color.lightGray);
        lbl_cerrar.setForeground(Color.black);
    }//GEN-LAST:event_lbl_cerrarMouseExited

    private void pnl_barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_pnl_barraMouseDragged

    private void pnl_barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnl_barraMousePressed

    private void lbl_retrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_retrocederMouseClicked
        this.dispose();
        
        DEntrar entrar = new DEntrar(padre, true);
        entrar.setVisible(true);
        
        
    }//GEN-LAST:event_lbl_retrocederMouseClicked

    private void lbl_retrocederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_retrocederMouseEntered
        pnl_retroceder.setBackground(Color.RED);
        lbl_retroceder.setForeground(Color.black);    }//GEN-LAST:event_lbl_retrocederMouseEntered

    private void lbl_retrocederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_retrocederMouseExited
        pnl_retroceder.setBackground(Color.lightGray);
        lbl_retroceder.setForeground(Color.black);     }//GEN-LAST:event_lbl_retrocederMouseExited

    private void lbl_incluirClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_incluirClienteMouseClicked
        this.dispose();

        DIncluir incluir = new DIncluir(padre,true);
        incluir.setVisible(true);
    }//GEN-LAST:event_lbl_incluirClienteMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        int opcion = cbox_filtrarClientes.getSelectedIndex();
        String valorBuscado = txf_filtrarClientes.getText();
        
        
        mostrarClientes(opcion, valorBuscado);
        

    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(DClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DClientes dialog = new DClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    class Fondo3 extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo2.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> cbox_filtrarClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JLabel lbl_eliminarCliente;
    private javax.swing.JLabel lbl_incluirCliente;
    private javax.swing.JLabel lbl_modificar;
    private javax.swing.JLabel lbl_retroceder;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_barra;
    private javax.swing.JPanel pnl_cerrar;
    private javax.swing.JPanel pnl_eliminarCliente;
    private javax.swing.JPanel pnl_incluirCliente;
    private javax.swing.JPanel pnl_modificar;
    private javax.swing.JPanel pnl_retroceder;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txf_filtrarClientes;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author david
 */
public class DEntrar extends javax.swing.JDialog {

    /**
     * Creates new form DEntrar
     */
    Fondo2 fondo = new Fondo2();
    restauranteGUI padre;
    
    int xMouse, yMouse;
    
    public DEntrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setContentPane(fondo);
        initComponents();
        padre = (restauranteGUI)parent;
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
        pnl_clientes = new javax.swing.JPanel();
        lbl_clientes = new javax.swing.JLabel();
        pnl_reservas = new javax.swing.JPanel();
        lbl_reservas = new javax.swing.JLabel();
        pnl_barra = new javax.swing.JPanel();
        pnl_cerrar = new javax.swing.JPanel();
        lbl_cerrar = new javax.swing.JLabel();
        lbl_titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setModal(true);
        setUndecorated(true);
        setResizable(false);

        lbl_titulo.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("ELIJE UNA OPCION");

        pnl_clientes.setBackground(new java.awt.Color(204, 204, 204));
        pnl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_clientesMouseEntered(evt);
            }
        });

        lbl_clientes.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lbl_clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_clientes.setText("CLIENTES");
        lbl_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_clientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_clientesLayout = new javax.swing.GroupLayout(pnl_clientes);
        pnl_clientes.setLayout(pnl_clientesLayout);
        pnl_clientesLayout.setHorizontalGroup(
            pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnl_clientesLayout.setVerticalGroup(
            pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        pnl_reservas.setBackground(new java.awt.Color(204, 204, 204));

        lbl_reservas.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lbl_reservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_reservas.setText("RESERVAS");
        lbl_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_reservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_reservasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_reservasLayout = new javax.swing.GroupLayout(pnl_reservas);
        pnl_reservas.setLayout(pnl_reservasLayout);
        pnl_reservasLayout.setHorizontalGroup(
            pnl_reservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnl_reservasLayout.setVerticalGroup(
            pnl_reservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnl_barraLayout = new javax.swing.GroupLayout(pnl_barra);
        pnl_barra.setLayout(pnl_barraLayout);
        pnl_barraLayout.setHorizontalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_barraLayout.setVerticalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_titulo1.setFont(new java.awt.Font("Braxton", 1, 60)); // NOI18N
        lbl_titulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo1.setText("Meltdown");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnl_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(pnl_reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo1)
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(lbl_titulo)
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(lbl_titulo1)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_clientesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnl_clientesMouseEntered

    private void lbl_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clientesMouseEntered
        pnl_clientes.setBackground(Color.darkGray);
        lbl_clientes.setForeground(Color.white);
    }//GEN-LAST:event_lbl_clientesMouseEntered

    private void lbl_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clientesMouseExited
        pnl_clientes.setBackground(Color.lightGray);
        lbl_clientes.setForeground(Color.black);
    }//GEN-LAST:event_lbl_clientesMouseExited

    private void lbl_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reservasMouseEntered
        pnl_reservas.setBackground(Color.darkGray);
        lbl_reservas.setForeground(Color.white);
    }//GEN-LAST:event_lbl_reservasMouseEntered

    private void lbl_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reservasMouseExited
        pnl_reservas.setBackground(Color.lightGray);
        lbl_reservas.setForeground(Color.black);
        lbl_clientes.setForeground(Color.black);    }//GEN-LAST:event_lbl_reservasMouseExited

    private void lbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clientesMouseClicked
        this.dispose();
        DClientes cliente = new DClientes(padre, true);
        cliente.setVisible(true);    }//GEN-LAST:event_lbl_clientesMouseClicked

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

    private void lbl_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reservasMouseClicked
        this.dispose();
        DReservas reserva = new DReservas(padre, true);
        reserva.setVisible(true);    }//GEN-LAST:event_lbl_reservasMouseClicked

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
            java.util.logging.Logger.getLogger(DEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DEntrar dialog = new DEntrar(new javax.swing.JFrame(), true);
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
    
    class Fondo2 extends JPanel
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
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JLabel lbl_clientes;
    private javax.swing.JLabel lbl_reservas;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JPanel pnl_barra;
    private javax.swing.JPanel pnl_cerrar;
    private javax.swing.JPanel pnl_clientes;
    private javax.swing.JPanel pnl_reservas;
    // End of variables declaration//GEN-END:variables
}

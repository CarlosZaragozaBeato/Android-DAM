/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt5y6tacondeoro;

import edt5tacondeoro1.Articulo;
import edt5tacondeoro1.Bolso;
import edt5tacondeoro1.Complemento;
import edt5tacondeoro1.LineaPedido;
import edt5tacondeoro1.Pedido;
import edt5tacondeoro1.Ruta;
import edt5tacondeoro1.Socio;
import edt5tacondeoro1.Zapato;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class SistemaVP extends javax.swing.JFrame {
    ArrayList<Articulo> listaArticulos;
    ArrayList<Socio> listaSocios;
    ArrayList<Ruta> listaRutas;
    ArrayList<Pedido> listaPedidos;
    ArrayList<LineaPedido> listaLineasP;
    ArrayList<LineaPedido> listaLineasP2;
        
    Pedido p= new Pedido();
 
    /**
     * Creates new form SistemaVP
     */
    public SistemaVP() {
        initComponents();
        listaArticulos= new <Articulo> ArrayList();
        listaSocios= new <Socio> ArrayList();
        listaRutas= new <Ruta> ArrayList();
        listaPedidos= new <Pedido> ArrayList();
        listaLineasP= new <LineaPedido> ArrayList();
        listaLineasP2= new <LineaPedido> ArrayList();
        crearDatosDePrueba();
        
    }
    public Socio saberSocio(){
            DRegistrarseSocio drs;
            drs= new DRegistrarseSocio (this,true);
            drs.setTitle("Registrase");
            drs.setVisible(true);
            Socio s = drs.getS(); 
            drs.dispose();
            return s;
    }
    
    public void nuevoPedido(Pedido p){
        listaPedidos.add(p);
    }
    public void crearDatosDePrueba(){
        LineaPedido lp=null;
        LineaPedido lp2=null;
        //Creamos dos socios: Máxmo hará un pedido desbordando el Stock y Prudencio hará pedido con suficiente stock
        Socio maxi= new Socio("Maximo","maximo@mail.com","C/ Locura, sn","Toledo");
        Socio pruden= new Socio("Prudencio","prudencio@mail.com","C/ Esperanza, sn","Albacete");
        Socio carlao= new Socio("carlao","prudencio@mail.com","C/ Esperanza, sn","Ciudad Real");

        listaSocios.add(maxi);
        listaSocios.add(pruden);
        listaSocios.add(carlao);
        //Creamos unos artículos de ejemplo: bolso zapatos y complemento.
        Bolso b= new Bolso("bandolera","NikeBolso",50,"Blanco, cómodo y flexible","cuero",10,"fotoBolso");
        Zapato z= new Zapato(38,"Deportivas","NikeZapato",200,"Blanco, cómodo y flexible","cuero",10,"fotoBolso");
        Complemento c= new Complemento("Cinturón",54,"NikeComplemento",25,"Blanco, cómodo y flexible","cuero",10,"fotoBolso");
        
        Bolso b2= new Bolso("ban","Bolso adidas",50,"Blanco, cómodo y flexible","cuero",10,"fotoBolso");
        Zapato z2= new Zapato(38,"Zapatuca","ZApato 2",200,"Blanco, cómodo y flexible","cuero",10,"fotoBolso");
        Complemento c2= new Complemento("Cinturon",54,"NikeComplemento",25,"Blanco, cómodo y flexible","cuero",10,"fotoBolso");
        listaArticulos.add(b);
        listaArticulos.add(z);
        listaArticulos.add(c);
        
        
        lp2 = new LineaPedido(b2, 2);
        listaLineasP2.add(lp2);
        
        
        lp2 = new LineaPedido(z2, 21);
        listaLineasP2.add(lp2);
        
        lp2 = new LineaPedido(c2, 121);
        listaLineasP2.add(lp2);
        
        
        //Creamos algunos Pedidos sin las líneas, ya que se las añadimos posteriormente
        
        Pedido pcarlao2 = new Pedido(carlao);
        Pedido pmaxi= new Pedido(maxi);
        Pedido ppruden= new Pedido(pruden);
        //Creamos algunas lineas de pedido
        
        
        
        lp= new LineaPedido (b,15);// bolso, 15 unidades. No hay stock.
        //Metemos esta lineaPedido en la listaLineasPedidos
        listaLineasP.add(lp);
        
        //Metemos esta lista de lineas de pedido en el pedido de Máximo:
        pmaxi.setLineasPedidos(listaLineasP);//Este pedido no se puede cumplimentar por falta de stock.
        //Ahora crearemos lineas de pedido con artículos con suficiente stock y lo meteremos en el pedido de pruden.
        listaPedidos.add(pmaxi);
        //Limpiamos la lista de líneas para dejarla vacía y usarla para el otro pedido
        listaLineasP= new <LineaPedido> ArrayList();
        lp= new LineaPedido (b,50);// bolso, 5 unidades. Hay stock.
        listaLineasP.add(lp);
        lp= new LineaPedido (z,80);// zapato, 8 unidades. Hay stock.
        listaLineasP.add(lp);
         lp= new LineaPedido (c,180);// zapato, 8 unidades. Hay stock.
        listaLineasP.add(lp);
        //Metemos esta lista de lineas de pedido en el pedido de Prudencio:
        ppruden.setLineasPedidos(listaLineasP);
        
        //Metemos los dos pedidos en la lista de pedidos
        
        
        listaPedidos.add(ppruden);
        listaPedidos.add(pcarlao2);
        pcarlao2.setLineasPedidos(listaLineasP2);

        String rn[]={"Guadalajara","Cuenca","Toledo",};
        Ruta Norte=new Ruta("Norte", rn);
     
        Norte.setAreaInfluencia(rn);
               
        String rs[]={"Ciudad Real","Albacete"};
        Ruta Sur=new Ruta("Sur", rs);

        Sur.setAreaInfluencia(rs);
        
        listaRutas.add(Sur);
        listaRutas.add(Norte);
        
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Hacer Pedido (Socio)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cumplimentar Pedido (responsable almacén)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(160, 160, 160))
        );

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DCumplimentarPedido ventana = new DCumplimentarPedido(this, true);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DHacerPedido DHP = new DHacerPedido(this, true);
        DHP.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaVP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

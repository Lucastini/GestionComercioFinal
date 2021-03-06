/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import com.sun.media.jfxmedia.events.NewFrameEvent;
import negocio.Comercio;

/**
 *
 * @author Mosqueteros
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        comercio=new Comercio("Comercio Sin Nombre");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArticulo = new javax.swing.JMenu();
        mItemNuevoArticulo = new javax.swing.JMenuItem();
        mItemModificarArticulo = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        mItemNuevaCompra = new javax.swing.JMenuItem();
        iMenuConsultarCompra = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        mItemNuevaVenta = new javax.swing.JMenuItem();
        mItemConsultarVenta = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        mItemCantVentas = new javax.swing.JMenuItem();
        mItemCapitalTotal = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        mItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Gestion");

        menuArticulo.setText("Articulo");

        mItemNuevoArticulo.setText("Nuevo Articulo");
        mItemNuevoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemNuevoArticuloActionPerformed(evt);
            }
        });
        menuArticulo.add(mItemNuevoArticulo);

        mItemModificarArticulo.setText("Modificar Articulo");
        mItemModificarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemModificarArticuloActionPerformed(evt);
            }
        });
        menuArticulo.add(mItemModificarArticulo);

        jMenuBar1.add(menuArticulo);

        menuCompras.setText("Compras");

        mItemNuevaCompra.setText("Nueva Compra");
        mItemNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemNuevaCompraActionPerformed(evt);
            }
        });
        menuCompras.add(mItemNuevaCompra);

        iMenuConsultarCompra.setText("Consultar Compra");
        iMenuConsultarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iMenuConsultarCompraActionPerformed(evt);
            }
        });
        menuCompras.add(iMenuConsultarCompra);

        jMenuBar1.add(menuCompras);

        menuVentas.setText("Ventas");

        mItemNuevaVenta.setText("Nueva Venta");
        mItemNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemNuevaVentaActionPerformed(evt);
            }
        });
        menuVentas.add(mItemNuevaVenta);

        mItemConsultarVenta.setText("Consultar Venta");
        mItemConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultarVentaActionPerformed(evt);
            }
        });
        menuVentas.add(mItemConsultarVenta);

        jMenuBar1.add(menuVentas);

        menuReportes.setText("Reportes");

        mItemCantVentas.setText("Cantidad Ventas");
        mItemCantVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCantVentasActionPerformed(evt);
            }
        });
        menuReportes.add(mItemCantVentas);

        mItemCapitalTotal.setText("Capital Total");
        mItemCapitalTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCapitalTotalActionPerformed(evt);
            }
        });
        menuReportes.add(mItemCapitalTotal);

        jMenuBar1.add(menuReportes);

        menuSalir.setText("Salir");

        mItemSalir.setText("Salir");
        mItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSalirActionPerformed(evt);
            }
        });
        menuSalir.add(mItemSalir);

        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemNuevoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemNuevoArticuloActionPerformed
        VentanaNuevoArticulo vna=new VentanaNuevoArticulo(this, comercio);
        vna.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mItemNuevoArticuloActionPerformed

    private void mItemModificarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemModificarArticuloActionPerformed
        VentanaModificarArticulo vma=new VentanaModificarArticulo(this, comercio);
        vma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mItemModificarArticuloActionPerformed

    private void mItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mItemSalirActionPerformed

    private void mItemNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemNuevaCompraActionPerformed
        VentanaNuevaCompra vnc=new VentanaNuevaCompra(this, comercio);
        vnc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mItemNuevaCompraActionPerformed

    private void iMenuConsultarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iMenuConsultarCompraActionPerformed
        VentanaConsultarCompra vcc=new VentanaConsultarCompra(this, comercio);
        vcc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_iMenuConsultarCompraActionPerformed

    private void mItemNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemNuevaVentaActionPerformed
        VentanaNuevaVenta vnv=new VentanaNuevaVenta(this, comercio);
        vnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mItemNuevaVentaActionPerformed

    private void mItemCantVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCantVentasActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Volumen de ventas a la fecha: "+comercio.getListadoVentas().size());
    }//GEN-LAST:event_mItemCantVentasActionPerformed

    private void mItemCapitalTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCapitalTotalActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Volumen de ventas a la fecha: $"+comercio.capitalTotalSegunStockArticulos());
    }//GEN-LAST:event_mItemCapitalTotalActionPerformed

    private void mItemConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultarVentaActionPerformed
        VentanaConsultarVenta vcv=new VentanaConsultarVenta(this, comercio);
        vcv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mItemConsultarVentaActionPerformed

    private Comercio comercio;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem iMenuConsultarCompra;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mItemCantVentas;
    private javax.swing.JMenuItem mItemCapitalTotal;
    private javax.swing.JMenuItem mItemConsultarVenta;
    private javax.swing.JMenuItem mItemModificarArticulo;
    private javax.swing.JMenuItem mItemNuevaCompra;
    private javax.swing.JMenuItem mItemNuevaVenta;
    private javax.swing.JMenuItem mItemNuevoArticulo;
    private javax.swing.JMenuItem mItemSalir;
    private javax.swing.JMenu menuArticulo;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
}


package presentacion;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import negocio.Articulo;
import negocio.Comercio;
import negocio.Compra;
import negocio.Item;
import negocio.PedidoEnConstruccion;

public class VentanaNuevaCompra extends javax.swing.JFrame {
    private VentanaPrincipal ventPrin;
    private Comercio comercio;
    private PedidoEnConstruccion pedido;
    private DefaultTableModel modeloPedido;

    public VentanaNuevaCompra(VentanaPrincipal vp, Comercio c) {
        ventPrin=vp;
        comercio=c;
        initComponents();
        pedido=new PedidoEnConstruccion();
        modeloPedido=(DefaultTableModel)tablaPedido.getModel();
       
        
    }
    
    public boolean addItem(Item i){
        return pedido.addItem(i);
    }
    
    public void limpiarTabla(){
        int cantFilas=modeloPedido.getRowCount();
        for(int i=0;i<cantFilas;i++)
            modeloPedido.removeRow(0);
    }
    
    public void actualizarListadoItems(){
        limpiarTabla();
        for(Item iter:pedido.getDetallePedido()){
            Articulo art=iter.getArt();
            Object[] datosFila={iter.getCodigo(),iter.getCant(),art.getCodigo(),art.getDescripcion(),art.descripcionImportado(),art.getCostoUnitario(),iter.valorCompraItem()};
            modeloPedido.addRow(datosFila);
        }
    }
    
    public void actualizarMontoTotal(){
        txtMontoTotal.setText(String.valueOf(pedido.montoTotalPedido()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNuevaCompra = new javax.swing.JLabel();
        btnQuitarItemSeleccionado = new javax.swing.JButton();
        lblMontoTotal = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        btnConfirmarCompra = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblDetalleDeArticulos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregarItemALaCompra1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nueva Compra");

        lblNuevaCompra.setText("Nueva Compra en carga:");

        btnQuitarItemSeleccionado.setText("Quitar Item seleccionado");
        btnQuitarItemSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarItemSeleccionadoActionPerformed(evt);
            }
        });

        lblMontoTotal.setText("Monto Total:");

        txtMontoTotal.setEditable(false);

        btnConfirmarCompra.setText("Confirmar Compra");
        btnConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCompraActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblDetalleDeArticulos.setText("Detalle de articulos a comprar:");

        btnAgregarItemALaCompra1.setText("Agregar Item a la Compra");
        btnAgregarItemALaCompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarItemALaCompra1ActionPerformed(evt);
            }
        });

        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Nº", "Cant.", "Cod.Art.", "Descripcion", "Importado", "Precio Unit.", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnConfirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDetalleDeArticulos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNuevaCompra)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAgregarItemALaCompra1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuitarItemSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevaCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDetalleDeArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoTotal)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuitarItemSeleccionado)
                    .addComponent(btnAgregarItemALaCompra1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarCompra)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventPrin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnQuitarItemSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarItemSeleccionadoActionPerformed
        int[] filasSeleccionadas=tablaPedido.getSelectedRows();
        if(filasSeleccionadas.length==0)
            javax.swing.JOptionPane.showMessageDialog(null, "Seleccione items a eliminar");
        else{
        int cantFilasAEliminar=filasSeleccionadas.length;
        for(int i=0;i<cantFilasAEliminar;i++){
            int fila=filasSeleccionadas[i];
            int codItem=(int)modeloPedido.getValueAt(fila,0);
            pedido.removeItem(codItem);
        }
        actualizarListadoItems();
        actualizarMontoTotal();
        }
    }//GEN-LAST:event_btnQuitarItemSeleccionadoActionPerformed

    private void btnConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCompraActionPerformed
        if(pedido.getDetallePedido().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "Agregue primero los items a comprar");
        else{
            LinkedList<Item> copiaDetPed=new LinkedList(pedido.getDetallePedido());
            Compra c=new Compra(copiaDetPed);
            comercio.addCompra(c);
            limpiarTabla();
            pedido.getDetallePedido().clear();
            txtMontoTotal.setText("");
            javax.swing.JOptionPane.showMessageDialog(null, "La compra se registro correctamente");
        }
    }//GEN-LAST:event_btnConfirmarCompraActionPerformed

    private void btnAgregarItemALaCompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarItemALaCompra1ActionPerformed
        VentanaNuevoItem vni=new VentanaNuevoItem(this, pedido, comercio);
        vni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarItemALaCompra1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarItemALaCompra1;
    private javax.swing.JButton btnConfirmarCompra;
    private javax.swing.JButton btnQuitarItemSeleccionado;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDetalleDeArticulos;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblNuevaCompra;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}

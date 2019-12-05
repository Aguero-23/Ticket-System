package com.ticketsystem.ticketsys;

import javax.swing.JOptionPane;

/**
 *
 * @author Su asd sadsa
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        jtf_Nombre.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_PanelPrincipal = new javax.swing.JPanel();
        jp_FormTransacciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jl_NumEnCola = new javax.swing.JLabel();
        jb_BuscarTransaccion = new javax.swing.JButton();
        ButtonTransaction = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtf_Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_Apellido1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtf_Apellido2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_Identificacion = new javax.swing.JTextField();
        jb_GenerarBoton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(350, 190));
        setSize(new java.awt.Dimension(500, 500));

        jp_PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Atender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Personas en Cola");

        jb_BuscarTransaccion.setText("Buscar");

        ButtonTransaction.setText("Mostrar cola");
        ButtonTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTransactionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_FormTransaccionesLayout = new javax.swing.GroupLayout(jp_FormTransacciones);
        jp_FormTransacciones.setLayout(jp_FormTransaccionesLayout);
        jp_FormTransaccionesLayout.setHorizontalGroup(
            jp_FormTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_FormTransaccionesLayout.createSequentialGroup()
                .addGroup(jp_FormTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_FormTransaccionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_FormTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_FormTransaccionesLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jl_NumEnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_FormTransaccionesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(86, 86, 86))))
                    .addGroup(jp_FormTransaccionesLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jp_FormTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_BuscarTransaccion)
                            .addComponent(jButton1)))
                    .addComponent(ButtonTransaction))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_FormTransaccionesLayout.setVerticalGroup(
            jp_FormTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_FormTransaccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jb_BuscarTransaccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_NumEnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonTransaction)
                .addGap(14, 14, 14))
        );

        jLabel3.setText("Formulario de transacciones");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel7.setText("Ticket System");

        jtf_Nombre.setToolTipText("Nombre");
        jtf_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_NombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel4.setText("Apellido 1");

        jtf_Apellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_Apellido1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido 2");

        jLabel6.setText("Identificación");

        jtf_Identificacion.setText("0");

        jb_GenerarBoton.setText("Generar Ticket");
        jb_GenerarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_GenerarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GenerarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_PanelPrincipalLayout = new javax.swing.GroupLayout(jp_PanelPrincipal);
        jp_PanelPrincipal.setLayout(jp_PanelPrincipalLayout);
        jp_PanelPrincipalLayout.setHorizontalGroup(
            jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Nombre)
                            .addComponent(jtf_Apellido1)
                            .addComponent(jtf_Apellido2)
                            .addComponent(jtf_Identificacion)
                            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jb_GenerarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 23, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_FormTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_PanelPrincipalLayout.setVerticalGroup(
            jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jp_FormTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_GenerarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jtf_Nombre.getAccessibleContext().setAccessibleName("");
        jb_GenerarBoton.getAccessibleContext().setAccessibleName("jb_GenerarBoton");
        jb_GenerarBoton.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("Clientes");

        jMenuItem1.setText("Añadir Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jp_PanelPrincipal.getAccessibleContext().setAccessibleName("jp_PanelPrincipal");

        setSize(new java.awt.Dimension(345, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int numTicket = 1;
    Lista lis = new Lista();
    static Cola c = new Cola();
    private void jb_GenerarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GenerarBotonActionPerformed
        //Asignar tickete a persona y agregar a la lista.

        try {
            if (lis.buscar(Integer.parseInt(jtf_Identificacion.getText()))) {
                JOptionPane.showMessageDialog(this, "Ya estas en espera.");
            } else if (jtf_Nombre.getText().equals("") || jtf_Apellido1.getText().equals("")
                    || jtf_Apellido2.getText().equals("") || jtf_Identificacion.getText().equals("")
                    || jtf_Nombre.getText().equals(null) || jtf_Apellido1.getText().equals(null)
                    || jtf_Apellido2.getText().equals(null) || jtf_Identificacion.getText().equals(null)
                    || jtf_Nombre.getText().equals(" ") || jtf_Apellido1.getText().equals(" ")
                    || jtf_Apellido2.getText().equals(" ") || jtf_Identificacion.getText().equals(" ")) {
                JOptionPane.showMessageDialog(this, "El formulario está vacio o le faltan datos.");
            } else {
                lis.insert(new Persona(Integer.parseInt(jtf_Identificacion.getText()), numTicket,
                        jtf_Nombre.getText(), jtf_Apellido1.getText(), jtf_Apellido2.getText()));
                c.encola(lis.buscarPersona(Integer.parseInt(jtf_Identificacion.getText())));
                jl_NumEnCola.setText("" + numTicket);
                numTicket++;
                jtf_Nombre.setText("");
                jtf_Apellido1.setText("");
                jtf_Apellido2.setText("");
                jtf_Identificacion.setText("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_GenerarBotonActionPerformed

    private void jtf_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_NombreActionPerformed

    private void jtf_Apellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_Apellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Apellido1ActionPerformed

    private void ButtonTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTransactionActionPerformed
        // TODO add your handling code here:
        System.out.println(c.toString());
    }//GEN-LAST:event_ButtonTransactionActionPerformed

    //Botón atender
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuAtencion ma = new menuAtencion();
        ma.show();
        this.hide(); this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Crea cliente
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Clientes.creaCliente cu = new Clientes.creaCliente();
        cu.show();
        this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTransaction;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_BuscarTransaccion;
    private javax.swing.JButton jb_GenerarBoton;
    private javax.swing.JLabel jl_NumEnCola;
    private javax.swing.JPanel jp_FormTransacciones;
    private javax.swing.JPanel jp_PanelPrincipal;
    private javax.swing.JTextField jtf_Apellido1;
    private javax.swing.JTextField jtf_Apellido2;
    private javax.swing.JTextField jtf_Identificacion;
    private javax.swing.JTextField jtf_Nombre;
    // End of variables declaration//GEN-END:variables
}

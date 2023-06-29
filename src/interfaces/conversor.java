/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import conversoralura.operacines;

/**
 *
 * @author rober
 */
public class conversor extends javax.swing.JFrame {

    Double valor;
    int divisa;
    int divisafin;

    /**
     * Creates new form conversor
     */
    public conversor() {
        initComponents();
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
        cantidad = new javax.swing.JTextField();
        diviza2 = new javax.swing.JComboBox<>();
        diviza = new javax.swing.JComboBox<>();
        comver = new javax.swing.JButton();
        result = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidad.setFont(new java.awt.Font("Cascadia Mono", 3, 14)); // NOI18N
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 30));

        diviza2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolares", "Euros", " " }));
        jPanel1.add(diviza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        diviza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolares", "Euros", " " }));
        jPanel1.add(diviza, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        comver.setText("Convertir");
        comver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comverActionPerformed(evt);
            }
        });
        jPanel1.add(comver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        result.setColumns(20);
        result.setFont(new java.awt.Font("Cascadia Mono", 2, 14)); // NOI18N
        result.setRows(5);
        jPanel1.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 279, 180, 100));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ña.gif"))); // NOI18N
        jPanel1.add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void comverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comverActionPerformed

        double valor = Double.parseDouble(cantidad.getText());

        int divisa = diviza.getSelectedIndex();
        int divisafin = diviza2.getSelectedIndex();

        //intacia de las operaciones
        operacines puente = new operacines();

        //metodos
        
        puente.setValor(valor);
        puente.setDiviza(divisa);
        puente.setDiviza2(divisafin);
        
        //ejecucion
        double resultfin = puente.convertir();
        result.setText(" ");
        //resultado
        result.append("" + resultfin);
    }//GEN-LAST:event_comverActionPerformed

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
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton comver;
    private javax.swing.JComboBox<String> diviza;
    private javax.swing.JComboBox<String> diviza2;
    private javax.swing.JLabel fond;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea result;
    // End of variables declaration//GEN-END:variables
}

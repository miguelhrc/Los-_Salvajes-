/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author MHC <miguel.hrc>
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }
    
    public int uno;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTblConsulta = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnArchivo = new javax.swing.JMenu();
        JMItCargar = new javax.swing.JMenuItem();
        MnAgregar = new javax.swing.JMenu();
        JMItListaA = new javax.swing.JMenuItem();
        JMItAlumnoA = new javax.swing.JMenuItem();
        JMItProductoA = new javax.swing.JMenuItem();
        JMItConocimientoA = new javax.swing.JMenuItem();
        JMItActitudA = new javax.swing.JMenuItem();
        JMItDesempeñoA = new javax.swing.JMenuItem();
        JMItEvalDA = new javax.swing.JMenuItem();
        MnConsultar = new javax.swing.JMenu();
        JMItListaC = new javax.swing.JMenuItem();
        JMItAlumnoC = new javax.swing.JMenuItem();
        JMItProductoC = new javax.swing.JMenuItem();
        JMItConocimientoC = new javax.swing.JMenuItem();
        JMItActitudC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTblConsulta);

        MnArchivo.setText("Archivo");

        JMItCargar.setText("Cargar");
        JMItCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItCargarActionPerformed(evt);
            }
        });
        MnArchivo.add(JMItCargar);

        jMenuBar1.add(MnArchivo);

        MnAgregar.setText("Agregar");

        JMItListaA.setText("Lista");
        MnAgregar.add(JMItListaA);

        JMItAlumnoA.setText("Alumno");
        MnAgregar.add(JMItAlumnoA);

        JMItProductoA.setText("Producto");
        JMItProductoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItProductoAActionPerformed(evt);
            }
        });
        MnAgregar.add(JMItProductoA);

        JMItConocimientoA.setText("Conocimiento");
        MnAgregar.add(JMItConocimientoA);

        JMItActitudA.setText("Actitud");
        MnAgregar.add(JMItActitudA);

        JMItDesempeñoA.setText("Desempeño");
        MnAgregar.add(JMItDesempeñoA);

        JMItEvalDA.setText("Evaluación diagnóstica");
        JMItEvalDA.setToolTipText("");
        MnAgregar.add(JMItEvalDA);

        jMenuBar1.add(MnAgregar);

        MnConsultar.setText("Consultar");

        JMItListaC.setText("Lista");
        MnConsultar.add(JMItListaC);

        JMItAlumnoC.setText("Alumno");
        JMItAlumnoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMItAlumnoCMouseClicked(evt);
            }
        });
        JMItAlumnoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItAlumnoCActionPerformed(evt);
            }
        });
        MnConsultar.add(JMItAlumnoC);

        JMItProductoC.setText("Producto");
        MnConsultar.add(JMItProductoC);

        JMItConocimientoC.setText("Conocimiento");
        MnConsultar.add(JMItConocimientoC);

        JMItActitudC.setText("Actitud");
        MnConsultar.add(JMItActitudC);

        jMenuBar1.add(MnConsultar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMItCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItCargarActionPerformed
        // TODO add your handling code here:
        uno = 0;
        FrmBusquedaLista mFrmBusquedaLista = new FrmBusquedaLista(uno);
        mFrmBusquedaLista.setVisible(true);
    }//GEN-LAST:event_JMItCargarActionPerformed

    private void JMItProductoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItProductoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMItProductoAActionPerformed

    private void JMItAlumnoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMItAlumnoCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMItAlumnoCMouseClicked

    private void JMItAlumnoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItAlumnoCActionPerformed
        // TODO add your handling code here:
        uno =1;
        FrmBusquedaLista mFrmBusquedaLista = new FrmBusquedaLista(uno);

        System.out.println(uno);
        mFrmBusquedaLista.setVisible(true);
        //this.setVisible(false);

    }//GEN-LAST:event_JMItAlumnoCActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMItActitudA;
    private javax.swing.JMenuItem JMItActitudC;
    private javax.swing.JMenuItem JMItAlumnoA;
    private javax.swing.JMenuItem JMItAlumnoC;
    private javax.swing.JMenuItem JMItCargar;
    private javax.swing.JMenuItem JMItConocimientoA;
    private javax.swing.JMenuItem JMItConocimientoC;
    private javax.swing.JMenuItem JMItDesempeñoA;
    private javax.swing.JMenuItem JMItEvalDA;
    private javax.swing.JMenuItem JMItListaA;
    private javax.swing.JMenuItem JMItListaC;
    private javax.swing.JMenuItem JMItProductoA;
    private javax.swing.JMenuItem JMItProductoC;
    private javax.swing.JMenu MnAgregar;
    private javax.swing.JMenu MnArchivo;
    private javax.swing.JMenu MnConsultar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTblConsulta;
    // End of variables declaration//GEN-END:variables
}

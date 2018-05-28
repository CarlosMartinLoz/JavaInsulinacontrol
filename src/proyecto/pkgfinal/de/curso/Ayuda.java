/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.de.curso;

/**
 *
 * @author User21
 */
public class Ayuda extends javax.swing.JFrame {

    /**
     * Creates new form Ayuda
     */
    public Ayuda() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        ayud.setText("Acerca de: programa por Carlos Martín Lozano                     Fecha 11/09/2017"
    +"\nAyuda sobre el programa:\n"+"El programa se divide en 3 partes principales insulina, recetas e información de los carbohidratos de los alimentos.\n"
    +"\n1.- Insulina: Aquí podrá hacer un seguimiento de la insulinar y el azúcar en sangre, para entrar será necesaria una contraseña la cual solo se podrá introducir una vez"
    +"Después de ello podrá intercambiar entre el modo introducir o consultar según la necesidad del momento"
    +"\n2.- Recetas: Unas recetas que podrá consultar cuando quiera y que son aptas para diabéticos"
    +"\n3.- Informacion de los carbohidratos: Podrá ver los carbohidratos contenidos en 100gr de un amplia variedad de alimentos");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ayud = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ayud.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(ayud);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ayud;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

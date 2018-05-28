/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.de.curso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author User21
 */
public class Enviar_1 extends javax.swing.JFrame implements Runnable {

    private String mins,seg;
    private Calendar calendario;
    private PreparedStatement stmt;
    private int limite = 3;
    private Thread h1;
    //inicio necesario envio de datos
    private String url = "jdbc:mysql://192.168.1.215:3306/insulina";
    private String user = "root";
    private String password = "";
    private Connection cn = null;
    private Statement sn;
    private int d, m, a, h, min, s;
    private int id;
    /**
     * Creates new form NewJFrame
     */
    public Enviar_1(int id) {
        initComponents();
        //se inicia el Thread que nos servirá para el reloj
        h1 = new Thread(this);
        h1.start();
        //id para introducir en la base de datos
        this.id=id;
        //efectos gráficos
        setLocationRelativeTo(null);
        Dimension dim = getSize();
        Imagenfondo im = new Imagenfondo(dim);
        ImageIcon ic = new ImageIcon("src/cosa/insulina.png");
        this.setIconImage(ic.getImage());
        im.setImage("/cosa/fondo.png");
        setTitle("Medinsa");
        this.setResizable(false);
        this.add(im,BorderLayout.CENTER);
        this.pack();

    }

    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            fechaj.setText(d + "/" + m + "/" + a + "       " + h + ":" + mins + ":" + seg);
            try {
                //se actualiza cada segundo
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

    public void calcula() {
        calendario = new GregorianCalendar();
        Date fecha = new Date();
        //se pasa Date a la clase calendar
        calendario.setTime(fecha);
        //Se obtienen todos los datos necesarios para el display del reloj

        d = calendario.get(Calendar.DAY_OF_MONTH);
        m = calendario.get(Calendar.MONTH)+1;
        a = calendario.get(Calendar.YEAR);
        h = calendario.get(Calendar.HOUR_OF_DAY);
        min = calendario.get(Calendar.MINUTE);
        s = calendario.get(Calendar.SECOND);

        if (s < 10) {
            seg = "0" + Integer.toString(s);           
        } else {
            seg = Integer.toString(s);
        }
        if(min<10){
            mins = "0"+Integer.toString(min);
        } else {
            mins = Integer.toString(min);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        azucar = new javax.swing.JTextField();
        insulina = new javax.swing.JTextField();
        swit = new javax.swing.JButton();
        fechaj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Insulina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        Salir.setText("Salir"
        );
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        azucar.setText("");
        azucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                azucarKeyTyped(evt);
            }
        });

        insulina.setText("");
        insulina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                insulinaKeyTyped(evt);
            }
        });

        swit.setText("Modo consulta"

        );
        swit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switActionPerformed(evt);
            }
        });

        fechaj.setText(""
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Fecha"
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Hora");

        aceptar.setText("Aceptar"
        );
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Azúcar");

        Insulina.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Insulina.setText("Insulina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(swit, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaj, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(azucar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(insulina, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(Insulina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Insulina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(azucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insulina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(swit)
                    .addComponent(aceptar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();        
    }//GEN-LAST:event_SalirActionPerformed

    private void azucarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_azucarKeyTyped
        //limitación de caracteres que se pueden introducir
        char entrada = evt.getKeyChar();
        if (azucar.getText().length() == limite || entrada < '0' || entrada > '9' && entrada != '\b') {
            evt.consume();
       }
    }//GEN-LAST:event_azucarKeyTyped

    private void insulinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insulinaKeyTyped
        //limitación de caracteres que se pueden introducir
        char entrada = evt.getKeyChar();
        if (insulina.getText().length() == limite || entrada < '0' || entrada > '9' && entrada != '\b') {
            evt.consume();
        }
    }//GEN-LAST:event_insulinaKeyTyped

    private void switActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switActionPerformed
        // TODO add your handling code here:
        Insulina in = new Insulina(id);
        dispose();
    }//GEN-LAST:event_switActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // Se pasan 
        int insulint = Integer.parseInt(insulina.getText());
        int azucaint = Integer.parseInt(azucar.getText());
        if (insulina.getText() != null && azucar.getText() != null) {           
                try{
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Enviar_1.class.getName()).log(Level.SEVERE, null, ex);                        
                    }                
                cn = DriverManager.getConnection(url,user,password);
                sn = cn.createStatement();
                stmt = cn.prepareStatement("INSERT INTO insulina (d,m,a,hora,min,sulina,azucar,id) VALUES(?,?,?,?,?,?,?,?)");                
                stmt.setInt(1, d);
                stmt.setInt(2, m);
                stmt.setInt(3, a);
                stmt.setInt(4, h);
                stmt.setInt(5, min);
                stmt.setInt(6, insulint);
                stmt.setInt(7, azucaint);
                stmt.setInt(8, id);                
                stmt.executeUpdate();                
                stmt.close();           
                cn.close();
                JOptionPane.showMessageDialog(this, "Información enviada", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Enviar_1.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error trying to connect to the database", "Error :0001b", JOptionPane.ERROR_MESSAGE);
            }
                
            
        }
    }//GEN-LAST:event_aceptarActionPerformed

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Insulina;
    private javax.swing.JButton Salir;
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField azucar;
    private javax.swing.JLabel fechaj;
    private javax.swing.JTextField insulina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton swit;
    // End of variables declaration//GEN-END:variables
}

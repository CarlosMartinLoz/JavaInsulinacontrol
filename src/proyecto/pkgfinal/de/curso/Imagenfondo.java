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
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Imagenfondo extends javax.swing.JPanel {
    //Obtenemos la ruta del archivo y el tamaño del jframe
        private String ruta;
        Dimension tam;
        
        public void setImage(String ruta){
            this.ruta = ruta;
            
        }
	public Imagenfondo(Dimension dim){
		setSize(dim);
                tam=dim;
	}
        //metodo pintado
	public void paintComponent(Graphics g){
		setVisible(true);		
		ImageIcon im = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage());
                /*Al pintarlo pasamos Dimension para que la imagen se 
                amolde al jframe
                */
		g.drawImage(im.getImage(), 0, 0, tam.width,tam.height,null);
		setOpaque(false);
		super.paintComponent(g);	
	}
}

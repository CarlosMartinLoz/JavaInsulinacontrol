/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.de.curso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Durfen
 */
public class Descifrar {
    public String descifrar(String lectura){
        

        //leemos el fichero y almacenamos en un String
         String skey = "estoesunallave";
        String desencryptedtext = "";
        try {
            
            //se descodifica de base 64 y se preparan los distintos arrays
            byte[] basebitstext = Base64.decodeBase64(lectura);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestpassword = md.digest(skey.getBytes("utf-8"));
            byte[] keyinbytes = Arrays.copyOf(digestpassword, 24);
            
            //se inicia el cipher y la secretkey
            SecretKey key = new SecretKeySpec(keyinbytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            
            //se pasa a texto plano
            byte[] textoplano = decipher.doFinal(basebitstext);
            desencryptedtext = new String(textoplano);
            
            
            
        }catch(Exception e){
            
        }
        return desencryptedtext;
    }
}

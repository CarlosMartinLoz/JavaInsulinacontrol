/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.de.curso;

import java.security.MessageDigest;
import java.util.Arrays;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/**
 *
 * @author Durfen
 */
public class Cifrar {
    public String cifrar(String contraseña){
            //llave para el hasing y string de uso
            String skey = "estoesunallave";
            String encryptedtext = "";
            
            try {
                //seempieza digeriendo el texto en md5 y pasando la contraseña a un array de bytes
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte [] digestpassword = md.digest(skey.getBytes("utf-8"));
                byte [] keyinbytes = Arrays.copyOf(digestpassword, 24);
                
                //se inicia la clase cipher con el metodo DESede
                SecretKey key = new SecretKeySpec(keyinbytes,"DESede");
                Cipher cipher = Cipher.getInstance("DESede");
                cipher.init(Cipher.ENCRYPT_MODE, key);
                
                //finalmente se pasa a base 64 y se pasa por la clase cipher
                byte [] plaintext = contraseña.getBytes("utf-8");
                byte [] buf = cipher.doFinal(plaintext);
                byte [] basebitstext = Base64.encodeBase64(buf);
                encryptedtext = new String(basebitstext);
                
            } catch (Exception e) {
            	
            }
            return encryptedtext;
    }
}

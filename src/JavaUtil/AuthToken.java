/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaUtil;

import java.util.Random;
import jframe.Usuario;

/**
 *
 * @author guifami
 */
public class AuthToken {
    public void gerarToken(){
        Random gerador = new Random();
        Usuario.token = gerador.nextInt(100000,999999);
    }
}

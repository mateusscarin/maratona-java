package br.com.orientacaoobjetos.exception.exception.test;

import br.com.orientacaoobjetos.exception.exception.model.LoginInvalidoException;
import java.util.Scanner;

public class LoginInvalidoExceptionTest {

    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        
        String usernameBD = "Mateus";
        String passwordBD = "1234";
        
        System.out.println("Usuário:");
        String usernameDigitado = teclado.nextLine();
        
        System.out.println("Senha:");
        String senhaDigitado = teclado.nextLine();

        
        if(!usernameDigitado.equals(usernameBD)|| !senhaDigitado.equals(passwordBD)){
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }
        System.out.println("Usuário Logado com sucesso");
    }
}

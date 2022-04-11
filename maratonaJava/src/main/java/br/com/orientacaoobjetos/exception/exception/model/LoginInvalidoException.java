package br.com.orientacaoobjetos.exception.exception.model;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Login Inválido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }

    
    
}

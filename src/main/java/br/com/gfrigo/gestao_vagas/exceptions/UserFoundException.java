package br.com.gfrigo.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException{
  public UserFoundException(){
    super("Usuário já existe.");
  }
}

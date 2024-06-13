package edu.lucas.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem-vindos");

        String primeiroNome = "Lucas";
        String segundoNome = "Moreira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}

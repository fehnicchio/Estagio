import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Por favor digite o cnpj: ");
        Scanner cnpj = new Scanner( System.in ); //recebe a entrada do teclado
        CNPJ.validarCnpj(cnpj.nextLine()); //chama o metodo para a validaçao do CNPJ
    }
}

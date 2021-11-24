import java.lang.String;

public class CNPJ{
    public String cnpj;

    public void Cnpj(String cpf) {
        this.cnpj = cnpj;
    }
    private String getCNPJ(){ return cnpj;}

    public static boolean validarCnpj(String cnpj){ //valida a entrada
        boolean valido = true;
        if ((cnpj.length() != 14) && (cnpj.length() != 18)) { // verifica se a entrada possui o tamanho que precisa ter
            valido = false;
        }

        if (cnpj.length() == 14) {  //caso a entrada seja só numero ele verifica se são só numeros
            if (!cnpj.substring(0).matches("[0-9]*")){
                valido = false;
            }
        }
        if (cnpj.length() == 18){ //caso não for só numero verifica se está na formatação correta
            if (!cnpj.substring(0,2).matches("[0-9]*")){
                valido = false;
            }
            if (!cnpj.substring(4,6).matches("[0-9]*")){
                valido = false;
            }
            if (!cnpj.substring(8,10).matches("[0-9]*")){
                valido = false;
            }
            if (!cnpj.substring(12,15).matches("[0-9]*")){
                valido = false;
            }
            if (!cnpj.substring(17,18).matches("[0-9]*")){
                valido = false;
            }
            if (!cnpj.substring(3,3).matches(".")){
                valido = false;
            }
            if (!cnpj.substring(7,7).matches(".")){
                valido = false;
            }
            if (!cnpj.substring(11,11).matches("/")){
                valido = false;
            }
            if (!cnpj.substring(16,16).matches("-")){
                valido = false;
            }
        }
        System.out.println(valido);
        return valido;
    }
}

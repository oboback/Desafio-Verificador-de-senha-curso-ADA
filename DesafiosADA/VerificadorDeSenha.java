//Desafio Verificar senha!!


class VerificadorDeSenha{
    public static void main(String[] args) {
        
        boolean LetraMaiuscula = false;
        boolean LetraMinuscula = false;
        boolean SenhaNumero = false;
        boolean CaractEspe = false;
        
        for (char caractere : args[0].toCharArray()){
            if (Character.isUpperCase(caractere)){
                LetraMaiuscula = true;
            }else if(Character.isLowerCase(caractere)){
                LetraMinuscula = true;
            }else if(Character.isDigit(caractere)){
                SenhaNumero = true;
            }else{
                CaractEspe = true;
            }
        }

        boolean SenhaCadas = args[0].length() >= 8 && LetraMaiuscula && LetraMinuscula && SenhaNumero && CaractEspe;
        if(SenhaCadas == true){
            System.out.println("Senha cadastrada com sucesso!");
        }else{
            System.out.println("Senha deve conter Caracter especial!");
            System.out.println("Pelo menos um número!");
            System.out.println("Pelo menos uma letra maíscula!");
            System.out.println("Pelo menos uma letra minuscula!");
            System.out.println("Tamanho 8 ou maior!");
        }   
        
    }
}
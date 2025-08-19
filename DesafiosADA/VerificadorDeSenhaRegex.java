class VerificadorDeSenhaRegex {
    public static void main(String[] args) {
        String senha = args.length > 0 ? args[0] : "";
        
        boolean minimoDeLetra = senha.length() >= 8;
        boolean temDigito = senha.matches(".*\\d.*");
        boolean temMaiscula = senha.matches(".*[A-Z].*");
        boolean temMinuscula = senha.matches(".*[a-z].*");
        //Considerando letra acentuada como caracter especial!
        boolean temCaracEspe = senha.matches(".*[^A-Za-z0-9].*");

        boolean naoContemNumerosEmSequencia = naoContemNumerosEmSequencia(senha);
        boolean naoContemLetrasEmSequencia = naoContemLetrasEmSequencia(senha);

        boolean senhaCorreta = minimoDeLetra && temDigito && temCaracEspe && temMaiscula && temMinuscula && naoContemNumerosEmSequencia && naoContemLetrasEmSequencia;

        if (senhaCorreta == true) {
            System.out.println("Sua senha está armazenada em nosso banco de dados! \nObrigado pela confiança!");
        }else if (!minimoDeLetra){
            System.out.println("Sua senha deve conter pelo menos 8 caracter!");
        }else if(!temDigito){
            System.out.println("Sua senha deve conter pelo menos um digito!");
        }else if(!temMaiscula){
            System.out.println("Sua senha deve conter pelo menos uma letra maíscula!");
        }else if(!temMinuscula){
            System.out.println("Sua senha deve conter pelo menos uma letra mínuscula!");
        }else if(!temCaracEspe){
            System.out.println("Sua senha deve conter pelo menos um caracter especial!");
        }else if(!naoContemLetrasEmSequencia){
            System.out.println("Sua senha não deve conter letras em sequência!\nPor mais segurança!");
        }else if(!naoContemNumerosEmSequencia){
            System.out.println("Sua senha não deve conter números em sequência!\nPor mais segurança!");
        }
    }

    static boolean naoContemLetrasEmSequencia(String senha) {
        for (int i = 0; i < senha.length() - 1; i++) {
            char atual = senha.charAt(i);
            char proximo = senha.charAt(i + 1);
            if (Character.isLetter(atual) && Character.isLetter(proximo)) {
                if (proximo == atual + 1 || proximo == atual - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean naoContemNumerosEmSequencia(String senha) {
        for (int i = 0; i < senha.length() - 1; i++) {
            char atual = senha.charAt(i);
            char proximo = senha.charAt(i + 1);

            if (Character.isDigit(atual) && Character.isDigit(proximo)) {
                
                if (proximo == atual + 1 || proximo == atual - 1) {
                    return false;
                }
            }
        }
        
        return true;
    }
}

# (Verificador de Senhas em Java)

Este é um projeto simples em Java desenvolvido como parte de um estudo sobre a linguagem. O programa valida se uma senha fornecida atende a um conjunto robusto de critérios de segurança.

## 🚀 Funcionalidades

A senha, para ser considerada válida, precisa atender a **TODOS** os seguintes critérios:

-Ter no mínimo **8 caracteres** de comprimento.
-Conter pelo menos uma **letra maiúscula** (A-Z).
-Conter pelo menos uma **letra minúscula** (a-z).
-Conter pelo menos um **número** (0-9).
-Conter pelo menos um **caractere especial** (ex: `!@#$`, ou letras acentuadas como `áçõ`).
-Não pode conter **números em sequência** (ex: `123` ou `987`).
-Não pode conter **letras em sequência** (ex: `abc` ou `zyx`).

## ⚙️ Como Executar

1.Clone este repositório para a sua máquina.
2.Compile o arquivo Java:
    ```bash
    javac VerificadorDeSenhaRegex.java
    ```
3.Execute o programa passando a senha como um argumento na linha de comando:
    ```bash
    java VerificadorDeSenhaRegex SuaSenha@123!
    ```
4. O programa retornará se a senha é válida ou inválida, listando os critérios não atendidos!
import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        /*
        //Concatenacao e Simulacao de Entrada
        String nome;
        String sobrenome;
        byte idade;

        Scanner entradaUsuario = new Scanner(System.in); //A Classe Scanner simula a entrada do Usuario //O System.in é o fluxo entrada //O System.out é o Fluxo de saida
        System.out.println("Digite seu nome abaixo:");
        nome = entradaUsuario.nextLine();               //O next.Line significa que quando passar um valor para tal variavel ele pula para a proxima linha
        System.out.println("Digite seu sobrenome abaixo:");
        sobrenome = entradaUsuario.nextLine();
        System.out.println("Digite sua idade abaixo:");
        idade = entradaUsuario.nextByte();

        System.out.println(" Nome: " + nome + " - " + "Sobrenome: " + sobrenome + " - " + "Idade: " + idade);

        //Variaveis Com Mutabilidade
        String nome = "Ana";
        nome = "Joao";

        //Variaveis com Imutabilidade ou Variaveis constantes 'FINAL'

        final String nome = "Ana";

        //Numeros Inteiros & Tipos Primitivos
        string nome = "Leanderson";
        byte idade = 24;
        short estoque = 32767;
        int numeros = 2147483647;
        long contaCorrente = 9223372036844775807L;

        //Numeros Decimais
        float real = 100.00f;
        double dolar = 1.123456789023456;

        //Valores Booleanos
        boolean botaoAtivado = true;
        boolean botaoDesativado = false;

        //Classes Wrappers
        String apelido = "Lele";
        Byte idade = 24;
        Short estoque = 2323;
        Integer numeros = 1234567;
        Long contaCorrtente = 12343523522345L;

        //Operadores Aritiméticos
        adicao +
        subtracao -
        divisao /
        resto %

        byte numero1;
        byte numero2;
        byte total;

        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite um Numero abaixo:");
        numero1 = entradaUsuario.nextByte();
        System.out.println("Digite outro numero abaixo:");
        numero2 = entradaUsuario.nextByte();
        total = (byte) (numero1 + numero2);
        System.out.println("A soma dos numeros é:" + total);

        //Operadores Relacionais //Operadores Relacionais que retornam um valor Booleano
        Operadores de Igualdade (==, !=)
        Operadores Relacionais ( >, >=, <, <= )


        int numero1;
        int numero2;
        boolean resultado;

        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite um numero abaixo:");
        numero1 = entradaUsuario.nextInt();
        System.out.println("Digite o segundo numero:");
        numero2 = entradaUsuario.nextInt();
        resultado = numero1 >= numero2;
        System.out.println("O numero 1 é maior que o numero 2 ? " + resultado);

        //Estrutura Condicional IF/ELSE

        boolean condicao;  //Essa condicao So executa se for algo TRUE
        if (condicao){
            System.out.println("Condicao executada por ser verdadeira");
        } else{
            System.out.println("Condicao executada por ser falsa");
        }

        int idade;
        Scanner idadeUsuario = new Scanner(System.in);
        System.out.println("Digite sua Idade");
        idade = idadeUsuario.nextInt();

        if(idade <=15 ){
            System.out.println("Crianca");
        } else if (idade <=17) {
            System.out.println("Adolescente");
        } else if (idade >=18) {
            System.out.println("Adulto");
        }
        */

        /*Exercicio Caixa Eletronico
        Crie um programa onde simula um caixa eletronico, onde o saldo inicial será de 2000$ reais, o saque máximo poderá ser de 1000$ e o saque minimo de 10$.
        O caixa deverá conter um menu onde terá as seguintes opcoes:
        1- Deposito
        2- Saque
        3- Sair
        */

        /*final int saldoInicial = 2000;
        final int saqueMin = 10;
        final int saqueMax = 1000;

        int opcao;
        float deposito, saque, saldoDisponivel;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                 ==============================
                 |        CAIXA ELETRÔNICO    \s
                 ==============================
                 | Opções Disponíveis:        \s
                 | 1 - Depositar              \s
                 | 2 - Sacar                  \s
                 | 3 - Sair                   \s
                 ==============================
                 | Escolha uma opção:         \s
                 ==============================
                \s"""));

        switch (opcao) {

            case 1:
                deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto deseja depositar ?"));

                saldoDisponivel = saldoInicial + deposito;
                JOptionPane.showMessageDialog(null, "Seu saldo é " + saldoDisponivel);

                break;

            case 2:
                saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto deseja sacar ?"));

                if (saque > saldoInicial) {
                    JOptionPane.showMessageDialog(null, "Valor Indisponivel, pois ultrapassa seu saldo atual!");

                } else if (saque > saqueMax) {
                    JOptionPane.showMessageDialog(null, "O saque nao pode ser realizado pois, o valor máximo do saque é de 1000$(mil reais)!");

                } else if (saque < saqueMin) {
                    JOptionPane.showMessageDialog(null, "O saque nao pode ser realizado pois, o valor minimo do saque é de 10$(dez reais)!");
                }else {
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                }

                break;

            case 3:
                break;

            default:
                JOptionPane.showMessageDialog(null, "OPCAO INFORMADA NAO DISPONIVEL NO MENU");


        //Calculadora de média de Notas

        System.out.println("Boas Vindas ao Sistema de Gestao Escolar! ");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do Estudante: ");
        String nome = leitor.nextLine();
        System.out.println("Digite a idade de " + nome);
        int idade = leitor.nextInt();

        int opcao = 0;
        double somatorio = 0.0;
        int quantidadeDeNotas = 0;

        while (opcao != -1){
        System.out.println("Digite a Nota de " + nome); //O parametro do while sempre espera um valor booleano, sempre que esse parametro for verdadeiro ele continua executando em loop.
        double nota = leitor.nextDouble();              //Caso esse parametro der falso ele encerra.

        somatorio += nota;
        quantidadeDeNotas++;

        System.out.println("Digite outra nota desse aluno. (Caso nao tenha mais notas digite -1)");

        }

        double media = somatorio / quantidadeDeNotas;
        System.out.println("A média do " + nome + "é: " + media);

        if (media >= 7) {
        System.out.println("Estudante aprovado!");      //Se média for maior ou igual a 7 execute "Estudante aprovado", caso contrário "Estudante reprovado".
        }else {
            System.out.println("Estudante reprovado!");
        }

        //Cadastro de Estudantes
        System.out.println("""
                +-----------------------+
                | Cadastro de Estudantes |
                +-----------------------+
                """);

        var leitor  = new Scanner(System.in);

        var estudante = new Estudante();    //Instancia uma nova classe já existente criada chamada "Estudante" que ja tem requisitos pré definidos.

        System.out.println("Nome do Estudante: ");
        estudante.nome = leitor.nextLine();

        System.out.println("Sobrenome: ");
        estudante.sobrenome = leitor.nextLine();

        System.out.println("Idade do Estudante: ");
        estudante.idade = leitor.nextLine();

        System.out.println("Endereco do Estudante: ");
        estudante.endereco = leitor.nextLine();

        System.out.println("Nome do Responsavel: ");
        estudante.responsavel = leitor.nextLine();

        System.out.println("Nome do estudante: " + estudante.nome);
        System.out.println("Sobrenome do esudante: " + estudante.sobrenome);
        System.out.println("Idade do estudante: " + estudante.idade);
        System.out.println("Endereco do estudante: " + estudante.endereco);
        System.out.println("Responsavel: " + estudante.responsavel);



        //Sistema de cadstro de varios objetos em um array


        System.out.println("""
                +-----------------------+
                | Cadastro de Estudantes |
                +-----------------------+
                """);
        var leitor  = new Scanner(System.in);

        System.out.println("Quantidade de Estudantes que deseja cadastrar: ");
        var qtdEstudantes = Integer.parseInt(leitor.nextLine());

        var estudantes = new Estudante[qtdEstudantes];  //Cria uma variavel "estudantes" que cria uma nova classe Estudante, que vai armazenar a qtdEstudantes por um array.

        var qtdCadastrados = 0;

        while (qtdCadastrados != qtdEstudantes){        //Se "0" que é a qtdCadastrados for DIFERENTE da qtdEstudantes que é "?". Que é "true" realmente é diferente.
        var estudante = new Estudante();                //Vai continuar executando o Loop. No momento em que a qtdCadastrados for == a qtdEstudantes vai dar "false" e o Loop vai encerrar.


        System.out.println("Nome do Estudante: ");
        estudante.nome = leitor.nextLine();

        System.out.println("Sobrenome do Estudante: ");
        estudante.sobrenome = leitor.nextLine();

        System.out.println("Idade do Estudante: ");
        estudante.idade = Integer.parseInt(leitor.nextLine());

        System.out.println("Endereco do Estudante: ");
        estudante.endereco = leitor.nextLine();

        System.out.println("Nome do Responsavel: ");
        estudante.responsavel = leitor.nextLine();

        estudantes[qtdCadastrados] = estudante;     //Aqui executa o nome da variavel do array "estudantes" que armazena um array "qtdCadastrados" que comeca no indice "0"
        qtdCadastrados++;
        }

        for (Estudante e : estudantes){             //Para cada objeto Estudante cria uma variavel "e" e percorra a variavel estudantes que é um array.
            System.out.println("Nome do estudante: " + e.nome);
            System.out.println("Sobrenome do esudante: " + e.sobrenome);
            System.out.println("Idade do estudante: " + e.idade);
            System.out.println("Endereco do estudante: " + e.endereco);
            System.out.println("Responsavel: " + e.responsavel + "\n");
        }
*/
        }

    }


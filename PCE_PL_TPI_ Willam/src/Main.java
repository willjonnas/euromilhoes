import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static String nome = "";


    public static void main(String[] args) {

        System.out.println("Qual o seu nome?");
        nome = in.nextLine();

        int op;

        do {
            System.out.println("************************** ");
            System.out.println("*******EUROMILHOES******** ");
            System.out.println("************************** ");
            System.out.print("\n");
            System.out.println("Bem Vindo " + nome);
            System.out.print("\n");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1- Números Sorteados");
            System.out.println("2- Jogar Inserindo Números ");
            System.out.println("3- Jogar Com Números Gerados Aleatorios");
            System.out.println("4- Probabilidade");
            System.out.println("0- Sair");
            op = in.nextInt();

            switch (op) {
                case 1 -> Numeros_sorteados();
                case 2 -> Numeros_inseridos();
                case 3 -> Numeros_aleatorios();
                case 4 -> Probabilidade();
                default -> System.out.println("Opção inválida");
            }
        } while (op != 0);

    }

    private static void Numeros_sorteados() {

        int[] numeros = new int[5];
        int[] estrelas = new int[2];
        for (int i = 0; i < 5; i++) {
            numeros[i] = new Random().nextInt(50) + 1;
            for (int j = 0; j < i; j++)
                if (numeros[i] == numeros[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(numeros);
        for (int i = 0; i < 2; i++) {
            estrelas[i] = new Random().nextInt(12) + 1;
            for (int j = 0; j < i; j++)
                if (estrelas[i] == estrelas[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(estrelas);

        System.out.print("\n");
        System.out.print("\n");
        System.out.print(" Os numeros gerados nesse Sorteio foram \n" + Arrays.toString(numeros) + "\n");
        System.out.print(" As estrelas geradas nesse Sorteio foram \n" + Arrays.toString(estrelas) + "\n");
        System.out.print("\n");
        System.out.print("\n");
    }

    private static void Numeros_inseridos() {

        int[] numeros = new int[5];
        int[] estrelas = new int[2];
        int[] nums = new int[5];
        int[] estr = new int[2];
        int acertos_num= 0;
        int acertos_est= 0;

        for (int i = 0; i < 5; i++) {
            numeros[i] = new Random().nextInt(50) + 1;
            for (int j = 0; j < i; j++)
                if (numeros[i] == numeros[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(numeros);
        for (int i = 0; i < 2; i++) {
            estrelas[i] = new Random().nextInt(12) + 1;
            for (int j = 0; j < i; j++)
                if (estrelas[i] == estrelas[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(estrelas);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu numero da sorte: ");
            nums[i] = in.nextInt();
            if (nums[i] >= 51 || nums[i] < 1) {
                System.out.println("Digite um numero entre 1 e 50");
                i--;
            }
            for (int j = 0; j < i; j++)
                if (nums[i] == nums[j]) {
                    System.out.println("Esse número já foi inserido, digite outro: ");
                    i--;
                }
        }
        Arrays.sort(nums);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o número da sua estrela: ");
            estr[i] = in.nextInt();
            if (estr[i] > 12 || estr[i] < 1) {
                System.out.println("Digite um numero entre 1 e 12");
                i--;
            }
            for (int j = 0; j < i; j++)
                if (estr[i] == estr[j]) {
                    System.out.println("Esse número já foi inserido, digite outro: ");
                    i--;
                }
        }

        Arrays.sort(estr);

        System.out.print("\n");
        System.out.print("\n");
        System.out.println(" Os numeros gerados nesse Sorteio foram \n" + Arrays.toString(numeros));
        System.out.println(" As estrelas geradas nesse Sorteio foram \n" + Arrays.toString(estrelas));
        System.out.println("\t Seus numero escolhidos foram \n" + Arrays.toString(nums));
        System.out.println("\t Suas estrelas escolhidas foram\n" + Arrays.toString(estr));
        System.out.print("\n");
        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                if (numeros[i] == nums[j]) {
                    acertos_num += 1;
                }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (estrelas [i] == estr[j]) {
                    acertos_est += 1;
                }
            }
        }
        System.out.println(" Você Acertou " + acertos_num + " números e " + acertos_est + " estrelas");

        System.out.print("\n");
        System.out.print("\n");
    }

    private static void Numeros_aleatorios() {

        int[] numeros = new int[5];
        int[] estrelas = new int[2];
        int[] nums = new int[5];
        int[] estr = new int[2];
        int acertos_num = 0;
        int acertos_est = 0;


        for (int i = 0; i < 5; i++) {
            numeros[i] = new Random().nextInt(50) + 1;
            for (int j = 0; j < i; j++)
                if (numeros[i] == numeros[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(numeros);
        for (int i = 0; i < 2; i++) {
            estrelas[i] = new Random().nextInt(12) + 1;
            for (int j = 0; j < i; j++)
                if (estrelas[i] == estrelas[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(estrelas);

        for (int i = 0; i < 5; i++) {
            nums[i] = new Random().nextInt(50) + 1;
            for (int j = 0; j < i; j++)
                if (nums[i] == nums[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(nums);
        for (int i = 0; i < 2; i++) {
            estr[i] = new Random().nextInt(12) + 1;
            for (int j = 0; j < i; j++)
                if (estr[i] == estr[j]) {
                    i--;
                    break;
                }
        }
        Arrays.sort(estr);


        System.out.print("\n");
        System.out.print("\n");
        System.out.println(" Os numeros gerados nesse Sorteio foram \n" + Arrays.toString(numeros));
        System.out.println(" As estrelas geradas nesse Sorteio foram \n" + Arrays.toString(estrelas));
        System.out.println("\t Seus numero escolhidos foram \n" + Arrays.toString(nums));
        System.out.println("\t Suas estrelas escolhidas foram\n" + Arrays.toString(estr));
        System.out.print("\n");
        System.out.print("\n");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++)
                    if (numeros[i] == nums[j]) {
                    acertos_num += 1;
                }
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (estrelas [i] == estr[j]) {
                        acertos_est += 1;
                    }
                }
            }
        System.out.println(" Você Acertou " + acertos_num + " números e " + acertos_est + " estrelas");

        System.out.print("\n");
        System.out.print("\n");

    }
    private static void Probabilidade() {

        double n1=50, n2=12, r1=5, r2=2;


        System.out.println("Com 5 números escolhidos são possiveis gerar  " + Math.round(nCr1(n1, r1)));
        System.out.println();
        System.out.println("Com 2 números de estrelas  escolhidos são possiveis gerar  " + Math.round(nCr2(n2, r2)));
        System.out.println();
        System.out.println("Com a combinação de numeros e estrelas são possiveis gerar  " + Math.round(nCr1(n1, r1) * nCr2(n2, r2)) + " de chaves do Euromilhões");
        System.out.printf("Ou seja a probabilidade é de, %.7f", (100/((nCr1(n1, r1)) * (nCr2(n2, r2)))));
        System.out.println();
        System.out.println();
        System.out.println();

    }


    //function calculates nCr using the simplified formula
    private static double nCr1(double n1, double r1){
        if(n1<r1 || n1==0)
            return 1;

        double num = 1, den = 1;
        for(double i=r1; i>=1; i--){
            num = num * n1--;
            den = den * i;
        }

        return num/den;
    }

    private static double nCr2(double n2, double r2){
        if(n2<r2 || n2==0)
            return 1;

        double num = 1, den = 1;
        for(double i=r2; i>=1; i--){
            num = num * n2--;
            den = den * i;
        }

        return num/den;
    }
    }




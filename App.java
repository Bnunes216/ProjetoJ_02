import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Pessoa pessoa[] = new Pessoa[10];

        pessoa[0] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[1] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[2] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[3] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[4] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[5] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[6] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[7] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[8] = new Pessoa(null, null, null, 0, 0, 0, 0, null);
        pessoa[9] = new Pessoa(null, null, null, 0, 0, 0, 0, null);

        String nome;
        String sobrenome;
        String obesidade;
        int idade;
        double peso;
        double altura;
        double imc;
        Data data_nacimento;
        int i = 0, limite = 0;

        while (limite == 0) {

            for (i = 0; i < 10; i++) {

                System.out.println("\nInforme seu nome e sobrenome: ");
                nome = in.next();
                pessoa[i].setNome(nome);
                sobrenome = in.nextLine();
                pessoa[i].setSobrenome(sobrenome);

                System.out.println("Informe sua Data de nascimento (dd mm aaaa): ");
                int dia = in.nextInt();
                int mes = in.nextInt();
                int ano = in.nextInt();
                Data data_nascimento = new Data(dia, mes, ano);
                pessoa[i].setData_nascimento(data_nascimento);

                System.out.println("Informe seu peso: ");
                peso = in.nextDouble();
                pessoa[i].setPeso(peso);
                System.out.println("Informe sua Altura: ");
                altura = in.nextDouble();
                pessoa[i].setAltura(altura);

                imc = pessoa[i].calculaIMC();
                obesidade = pessoa[i].informaObesidade();
                idade = pessoa[i].CalculaIdade();

                if (i >= 1 && pessoa[i].getNome().equals(pessoa[i - 1].getNome()) && pessoa[i].getSobrenome().equals(pessoa[i - 1].getSobrenome())) {
                    limite++;
                    System.out.println("\nNomes Iguais Informados. Fechando Programa.");
                    break;
                }
            }
        }

        for (i = 0; i < 10; i++) {
            System.out.println("\nCadastro " + (i + 1) +
                    "\nNome Completo: " + pessoa[i].getNome() + " " + pessoa[i].getSobrenome() +
                    "\nNome de Referencia: " + pessoa[i].getSobrenome() + ", " + pessoa[i].getNome() +
                    "\nIdade: " + pessoa[i].getIdade() +
                    "\nPeso: " + pessoa[i].getPeso() +
                    "\nAltura: " + pessoa[i].getAltura() +
                    "\nIMC: " + pessoa[i].getImc() +
                    "\nClassificação: " + pessoa[i].getObesidade() +
                    "\n    ");

        }
    }
}
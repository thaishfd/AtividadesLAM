import java.util.Scanner;

public class QuestaoUm {
    public static void main(String args[]) {
        Scanner ent = new Scanner(System.in);
        String nome;
        int horas, valor, salario;
        System.out.println("Digite o nome do funcionário");
        nome = ent.nextLine();
        System.out.println("Digite o número de horas trabalhadas");
        horas = ent.nextInt();
        System.out.println("Digite o valor pago por hora");
        valor = ent.nextInt();
        salario = (horas*valor);
        System.out.println("O valor a ser recebido é: " + salario);
    }
}

import java.util.Scanner;

public class Desafio {
    public static void main(String args[]) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o decimal para converter para binário: ");
        int x = ent.nextInt();
        int y = 0;
        int i = 0;
        int c = 0;
        int array[] = new int[10];
        do {
            y = x%2;
            x = x/2;
            array[i] = y;
            i++;
            c++;
        }while(x!=0);

        System.out.println("Binário: ");
        while (c!=0){
            System.out.print(array[c]);
            c--;
        }
    }
}

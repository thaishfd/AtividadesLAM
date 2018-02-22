import java.util.Scanner;
import java.util.Random;

public class QuestaoTres {
    public static void main(String args[]) {
        Scanner ent = new Scanner(System.in);
        Random ran = new Random();
        int y;
        int tentativas = 0;
        int x = ran.nextInt(11);
        do {
            System.out.println("Tente advinhar o número: ");
            y = ent.nextInt();
            if (x==y){
                System.out.println("Acertou!");
                break;
            }else{
                System.out.println("Errou, tente outra vez!");
            }
            tentativas++;
        }while(tentativas < 3);
    }
}

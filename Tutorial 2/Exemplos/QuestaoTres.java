import java.util.Scanner;
import java.util.Random;

public class QuestaoTres {
    public static void main(String args[]) {
        Scanner ent = new Scanner(System.in);
        Random ran = new Random();
        int y;
        int tentativas = 3;
        int x = ran.nextInt(11);
        System.out.println("Tente advinhar o número: ");
        do {
            tentativas--;
            y = ent.nextInt();
            if (x==y){
                System.out.println("Acertou!");
                break;
            }else if(tentativas==0){
                System.out.println("Você Perdeu!");
            }else{
                System.out.println("Errou, tente outra vez!");
            }
        }while(tentativas > 0);
        System.out.println("O número era: " + x);
    }
}

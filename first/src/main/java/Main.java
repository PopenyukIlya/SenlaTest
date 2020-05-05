import java.util.Scanner;

public class Main {

    private static String isPrime(int n) {
        if (n < 2) return "1 не является простым или сложным";
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) return "Составное";
        return "Простое";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String answer="";
        int q=scanner.nextInt();//сообщит об ошибке при введении не целого числа
if(q%2==0){
    answer+="Четное ";
}else answer+="Нечетное ";
answer+=isPrime(q);
 System.out.println(answer);
    }
}

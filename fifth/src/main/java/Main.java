import java.util.Scanner;

public class Main {

     static boolean palindrom(String str) {
        return str.equals(new StringBuilder().append(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String answer="";
        int n=scanner.nextInt();
       while (n>99){
           System.out.println("Введите число меньше 99");
           n=scanner.nextInt();
       }
        for (int i=0;i<n;i++){
            if (palindrom(String.valueOf(i))){
                answer+=i+" ";
            }
        }
        System.out.println(answer);
    }
}

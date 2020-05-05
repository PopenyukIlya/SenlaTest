import java.util.Scanner;

public class Main {

    static int gcd(int a,int b){//НОД (Наибольший общий делитель) или gcd (Greatest Common Divisor)
        return b == 0 ? a : gcd(b,a % b);
    }

   static int lcm(int a,int b){//НОК (Наименьшее общее кратное) или lcm (Least Common Multiple)
        return a / gcd(a,b) * b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        System.out.println("НОД="+gcd(first,second)+" "+"НОК="+lcm(first,second));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sentence=scanner.nextLine();
        String[] array = sentence.split(" ");

        for(int i = 0; i < array.length; i++){//сортировка пузырьком по кол-ву букв
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j].length() > array[j + 1].length()){
                    String str = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = str;
                }
            }
        }
        System.out.println("Кол-во слов="+array.length);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i].substring(0, 1).toUpperCase() + array[i].substring(1)+" ");//вывод с заглавной
        }
    }
}

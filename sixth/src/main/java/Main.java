public class Main {
    public static void main(String[] args) {
Controller controller=new Controller();
        int i=100000;
while (i>0){
controller.start();
i--;
}
        System.out.println(controller.bestBackpack);
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        int num = input();
        MyThread t = new MyThread("odd_till",num);
        t.start();
    }
    public static int input(){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(number<0){
            System.out.println("Only Positive Integers Allowed...");
            return  input();
        }
        else{
            return number;
        }
    }
}
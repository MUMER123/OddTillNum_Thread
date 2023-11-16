import java.sql.SQLOutput;
import java.util.Scanner;

public class MyThread extends Thread{
    private int num;
    MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Enter a positive Integer: ");
        this.num = input();
        for(int i=0;i<=num;i++){
            if(!(i%2==0)){
                System.out.println(i);
            }
        }
    }
    public int input(){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(num<0){
            System.out.println("Only Positive Integers Allowed...");
            return  input();
        }
        else{
            return number;
        }
    }
}

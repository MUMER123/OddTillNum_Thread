import java.sql.SQLOutput;
import java.util.Scanner;

public class MyThread extends Thread{
    private int num;
    MyThread(String name,int num){
        super(name);
        this.num =  num;
    }
    @Override
    public void run(){
        for(int i=0;i<=num;i++){
            if(!(i%2==0)){
                System.out.println(i);
            }
        }
    }

}

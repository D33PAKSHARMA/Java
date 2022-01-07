import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entre your age :");
        int age=sc.nextInt();//input int values
        System.out.println(age);
        System.out.println("Entre your name :");
        String name=sc.next();//next for input Strings and (nextLine for input whole line)
        System.out.println(name);

    }
    
}

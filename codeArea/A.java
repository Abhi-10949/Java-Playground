import java.util.Scanner;

public class A {
public static void main(String[] args){
    System.out.println("Enter value of a, b, c:");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b&& a>c){
        System.out.println("a is greater");
    }
    else{
        if(b>c){
            System.out.println("b is greate");
        }
        else{
            System.out.println("c is greater");
        }
    }

}
}


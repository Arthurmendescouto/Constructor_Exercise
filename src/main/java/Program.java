package src.main.java;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Enter account number: ");
        int account=entrada.nextInt();
        System.out.print("Enter account holder: ");
        String holder=entrada.next();
        System.out.println("Is there na initial deposit (y/n)?");
        char response=entrada.next().charAt(0);

        if(response=='y') {

            System.out.print("Enter initial deposit value: ");
            float balance=entrada.nextInt();
            System.out.println("Account data:");
            //Product product=new Product(account,holder,balance);//
        } else if (response=='n') {

        }else {

        }
    }
}

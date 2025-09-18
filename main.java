import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operation,num1,num2;
        int result=0;
        System.out.println(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        System.out.println(" choose opertaion: ");
        operation=sc.nextInt();
        System.out.println("Enter Num1: ");
        num1=sc.nextInt();
        System.out.println("Enter Num12: ");
        num2=sc.nextInt();

        switch (operation) {
            case 1:
            result=num1+num2;
                break;
            case 2:
            result=num1-num2;
                break;
            case 3:
            result=num1*num2;
                break;
            case 4:
            result=num1/num2;
                break;
        
            default:
            System.out.println("Invalid input.Try again ");
                break;
        }
        System.out.println("Result = "+ result);
    }
}
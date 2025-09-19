import java.util.Scanner;

public class main{
    public static void calculator(){
        Scanner sc=new Scanner(System.in);
        int result=0;
        while(true){
            chooseOperation();
            int num=sc.nextInt();

            if(num==0 || num>4){
                System.out.println("Invalid Input..existing from calculator: ");
                break;
            }   
            System.out.println("Enter 1st Num: ");
            int num1=sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int num2=sc.nextInt();  

            if(num==1){
                result=num1+num2;
            }
            else if(num==2){
                result=num1-num2;
            }
            else if(num==3){
                result=num1*num2;
            }
            else if(num==4){
                if(num2!=0){
                    result=num1/num2;
                }
                else{
                    System.out.println("Error Division By Zero");
                    continue;
                }
            }
    
        System.out.println("Result= "+ result);
        System.out.println();
    
        System.out.println("Continue? Click S otherwise N:");
        sc.nextLine(); 
        String pass = sc.nextLine();

        if (pass.equalsIgnoreCase("S")) { 
            continue;
        }else {
            break;
        }
    }
    }
    public static void chooseOperation(){
        System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division ");
        System.out.println("Select your Operation: ");


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operation,num1,num2;
        calculator();
        
    }
}
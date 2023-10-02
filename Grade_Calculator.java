import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter marks in all the Five Subjects out of 100");
        System.out.print("Enter your mark in Tamil: ");
        int tamil=in.nextInt();
        System.out.print("Enter your mark in English: ");
        int eng=in.nextInt();
        System.out.print("Enter your mark in Maths: ");
        int maths=in.nextInt();
        System.out.print("Enetr your mark in Scienc: ");
        int sci=in.nextInt();
        System.out.print("Enter your mark in social Science: ");
        int soc=in.nextInt();
        int sum=tamil+eng+maths+sci+soc;
        System.out.println();
        System.out.println("Sum of all the marks are: "+sum);
        int avg=(sum)/5;
        System.out.println();
        System.out.println("Average of all the marks is: "+avg);
        if(avg>90)
        {
            System.out.println();
            System.out.println("Congratulations! You have obtained O grade");
        }
        else if (avg>=80 && avg<=89)
        {
            System.out.println();
        System.out.println("You have Obtained A+ grade");
        }
        else if(avg>=70 && avg<=79)
        {
            System.out.println();
            System.out.println("You have Obtained A grade");
        }
        else if(avg>=60 && avg<=69)
        {
            System.out.println();
            System.out.println("You have Obtained B+ grade");
        }
        else if(avg>=50 && avg<=59)
        {
            System.out.println();
            System.out.println("You have Obtained B grade");
        }
        else if(avg>=40 && avg<=49)
        {
            System.out.println();
            System.out.println("You have Obtained C grade");
        }
        else
        {
            System.out.println();
            System.out.println("You have failed the exam");
        }

    }
}


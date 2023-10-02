import java.util.Scanner;

public class Number_Game {
  public static void main(String[] args) {
    
    int answer = (int)(Math.random() * 100) + 1;
  
    int number_of_trials = 7;
    int score=number_of_trials;
    
    Scanner in = new Scanner(System.in);
   
    boolean correct = false;
    System.out.println("Guess a number from 1 to 100 \n You have Seven trials");

    while (number_of_trials >= 0) {
      System.out.println("Enter your guess: ");
     int guess = in.nextInt();
      
      if (guess == answer)
       {
        System.out.println("You guessed the number! \nYou win! Congratulations");
        System.out.println("Your score is "+score);
        correct=true;
        break;
      }
      
      else if (guess > answer)
       {
        System.out.println("Your guess is too high.\nYou have " + number_of_trials + " tries left.");
    
        score--;
      }
      
      else 
      {
        System.out.println("Your guess is too low.\nYou have " + number_of_trials + " tries left.");
        score--;
      }
      
      number_of_trials--;
    }
   

    if (correct == false) 
    {
      System.out.println("Oops!! You ran out of tries.\nYou lose! Better luck next time");
      System.out.println("Your score is Zero");
    }
  }
}


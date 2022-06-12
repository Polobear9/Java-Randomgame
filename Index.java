import java.util.Random;
import java.util.Scanner;


//Make a info of number and source
public class Index {
	int UserAnswer;
	int counter = 0;
	int life = 5;
	
	public static void main(String[] args) {
		
		//Random class is help to make a random number.
		Random ran = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ComputerNum cn = new ComputerNum(ran.nextInt(100));
		Index ua = new Index();
		
		//when game is over >>> life == 0
		while(ua.UserAnswer != cn.Answer) {
			if(ua.life == 0) {
				System.out.println("The life is Zero... Game is over");
				break;
			}
			
			//help to how many times user answer.
			System.out.println("Now you Try : " + ua.counter + " Times");
			System.out.println("Tell me the answer");
			int AN = sc.nextInt();
			ua.UserAnswer = AN;
			
			//help to find a position a number.
			if(AN > cn.Answer) {
				System.out.println("The Number is Lower Then Your Answer");
			}else {
				System.out.println("The Number is higher Then Your Answer");
			}

			//Check a User Answer input value for correct
			System.out.println("You Answer is : " + AN);
			if(ua.UserAnswer == cn.Answer) {
				System.out.println("correct!");
				System.out.println("--------------------");
			}else {
				System.out.println("Try again");	
				System.out.println("Life is " + (ua.life -1 ) + " left");
					ua.counter += 1;
					ua.life -= 1;
				System.out.println("--------------------");
			}
		}
		
		System.out.println("welcome back!");
		System.out.println("The CoumputerNumber is " + cn.Answer);
	}
}

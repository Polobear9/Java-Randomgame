import java.util.Random;
import java.util.Scanner;


class ComputerNum {
	
	int Answer;
	
	public ComputerNum(int Answer) {
		this.Answer = Answer;
	}
}



public class Index {
	
	int UserAnswer;
	int counter = 0;
	int life = 5;
	public static void main(String[] args) {
		Random ran = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ComputerNum cn = new ComputerNum(ran.nextInt(100));
		Index ua = new Index();
		
		// TODO Auto-generated method stub
		while(ua.UserAnswer != cn.Answer) {
			System.out.println("Now you Try : " + ua.counter + " Times");
			System.out.println("-----The Number of Computer is-------");
			System.out.println("The CoumputerNumber is " + cn.Answer);
			System.out.println("Tell me the answer");
			int AN = sc.nextInt();
			ua.UserAnswer = AN;

			System.out.println("You Answer is : " + AN);
			if(ua.UserAnswer == cn.Answer) {
				System.out.println("correct!");
			}else {
				System.out.println("Try again");	
				
				
			System.out.println("Life is " + ua.life + " left");
				ua.counter += 1;
				ua.life -= 1;
				
			}
		}
		
		System.out.println("welcome back!");
		
	}

}

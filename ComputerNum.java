
public class ComputerNum {
	private int Answer;
	private ComputerNum(int number) {
		this.Answer = number;
	}

	public static ComputerNum createNumber(int number){
		return new ComputerNum(number);
	}

	public int getAnswer(){
		return Answer;
	}

	public boolean isAnswer(int userAnswer , int computerAnswer){
		if(userAnswer > computerAnswer) {
			System.out.println("The Number is Lower Then Your Answer");
			return false;
		}else if(userAnswer < computerAnswer) {
			System.out.println("The Number is higher Then Your Answer");
			return false;
		}else{
			System.out.println("Yap!");
			return true;
		}
	}
}

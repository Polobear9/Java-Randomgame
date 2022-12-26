public class Index {

	public static void main(String[] args) {
		int userRandomLange = Tools.getScannerInstance().nextInt();
		int userAnswer = 0;
		ComputerNum computerNumber = ComputerNum.createNumber(Tools.getrandomInstance().nextInt(userRandomLange));

		while(userAnswer != computerNumber.getAnswer()) {
			userAnswer = Tools.getScannerInstance().nextInt();
			computerNumber.isAnswer(userAnswer, computerNumber.getAnswer());
		}
	}
}

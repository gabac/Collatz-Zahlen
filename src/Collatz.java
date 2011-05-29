public class Collatz {

	private int number;
	private int iterations = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collatz collatz;
		for (int i = 1; i <= 20; i++) {
			collatz = new Collatz(i);
			System.out.println("Collatz-Reihe für:"+ i);
			collatz.printNumbers();
			System.out.println("Anzahl Iterationen: "+collatz.getIteration());
			System.out.println("------------------------");
		}

	}

	public Collatz(int number) {
		this.number = number;
	}

	private void printNumbers() {
		
		if (number == 1) {
			return;
		}
		
		iterations++;
		
		if (number % 2 == 0) {
			number = number / 2;
			System.out.println(number);
		} else {
			number = number * 3 + 1;
			System.out.println(number);
		}

		if (number == 1) {
			return;
		} else {
			printNumbers();
		}

	}
	
	public int getIteration() {
		return iterations;
	}
	

}

package c.string;

public class checkCompare {

	public static void main(String[] args) {
		checkCompare compare = new checkCompare();
		compare.checkCompare();
	}

	public void checkCompare() {
		String text = "Check value";
//		String text2 = "Check value";
		String text2 = new String("Check value");
		String text3 = "check value";

		if (text == text2) {
			System.out.println("text == text2 result is same.");
		} else {
			System.out.println("text==text2 result is different.");
		}
		if (text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same.");
		}
		if(text.equalsIgnoreCase(text3)){
			System.out.println("text.equalsIgnoreCase(text3) result is same.");
		}
		
	}
	

}

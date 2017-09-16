package c.string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringCompare sample = new StringCompare();
//		sample.checkString();
		sample.checkCompareTo();
	}

	public void checkString() {
		String text = "you must know String class.";
		System.out.println("text.length()=" + text.length());
		System.out.println("text.isEmpty()=" + text.isEmpty());
	}
	
	public void checkCompareTo(){
		String text="a";
		String text2="b";
		String text3="c";
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
		System.out.println(text.compareTo(text3));
		
	}

}

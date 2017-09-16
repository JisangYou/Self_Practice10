package c.string;

public class checkReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "The String class represents character strings";
		System.out.println(text.replace('s', 'z'));
		System.out.println(text);
		System.out.println(text.replace("tring", "trike"));
		System.out.println(text.replaceAll(" ", "|"));
		System.out.println(text.replaceFirst(" ", "|"));

	}

}

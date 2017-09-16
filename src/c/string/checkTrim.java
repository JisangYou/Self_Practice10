package c.string;

public class checkTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkTrim tr = new checkTrim();
		tr.trimTest2();
		

	}

	
	public void trimTest1(){
		String strings[] = new String[] { " a", " b ", "     c", "d     ", "e      f", "       " };

		for (String string : strings) {
			System.out.println("[" + string + "]");
			System.out.println("[" + string.trim() + "]");
		}
	}
	
	public void trimTest2(){
		String text=" a ";
		
		if(text != null && text.trim().length()>5){
			System.out.println("OK");
		}
	}
}

package c.string;

public class checkSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="Java technology is both a programming language and a platform";
		String [] splitArray = text.split(" ");
		
		for(String temp:splitArray){
			
			System.out.println(temp);
		}
	}

}

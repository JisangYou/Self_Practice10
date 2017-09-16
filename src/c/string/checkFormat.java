package c.string;

public class checkFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = " 제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, " + "하루에  %f %%의 시간을 책을 쓰는데 할애하고 있습니다.";
		String realText = String.format(text, "이상민", 7, 10.5);
		//String realText = String.format(text, "이상민", 7);
		System.out.println(realText);
	}

}

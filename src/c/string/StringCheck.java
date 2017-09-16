package c.string;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCheck sample = new StringCheck();
		String addresses[] = new String[] { "����� ���α� �ŵ�����", "��⵵ ������ �д籸 ���ڵ� ���� ����", "����� ���α� ������", };

		// sample.checkAddress(addresses);
		// sample.containsAddress(addresses);
//		sample.checkMatch();
//		sample.checkIndexOf();
//		sample.checkLastIndexOf();
		sample.checkSubstring();

	}

	public void checkAddress(String[] addresses) {
		int startCount = 0, endCount = 0;
		String startText = "�����";
		String endText = "��";
		for (String address : addresses) {
			if (address.startsWith(startText)) {
				startCount++;
			}
			if (address.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("Start with " + startText + " count is " + startCount);
		System.out.println("Ends with " + endText + " count is " + endCount);
	}

	public void containsAddress(String[] addresses) {
		int containCount = 0;
		String containText = "��";
		for (String address : addresses) {
			if (address.contains(containText)) {
				containCount++;
			}
		}
		System.out.println("Contains " + containText + " count is " + containCount);
	}

	public void checkMatch() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4));

	}

	public void checkIndexOf() {
		String text = "Java technology is both a programming language and a platform";
		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ", 20));
		System.out.println(text.indexOf('z'));

	}

	public void checkLastIndexOf() {
		String text = "Java technology is both a programming language and a platform";
		System.out.println(text.lastIndexOf('a'));
		System.out.println(text.lastIndexOf("a "));
		System.out.println(text.lastIndexOf('a', 20));
		System.out.println(text.lastIndexOf("a ", 20));
		System.out.println(text.lastIndexOf('z'));
		System.out.println(text.charAt(26));

	}

	
	public void checkSubstring(){
		String text = "Java technology";
		String technology = text.substring(5);
		System.out.println(technology);
		
		String tech = text.substring(5, 9);
		System.out.println(tech);
	}
}




































































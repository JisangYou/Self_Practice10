package c.string;

public class checkFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = " �� �̸��� %s�Դϴ�. ���ݱ��� %d���� å�� ���, " + "�Ϸ翡  %f %%�� �ð��� å�� ���µ� �Ҿ��ϰ� �ֽ��ϴ�.";
		String realText = String.format(text, "�̻��", 7, 10.5);
		//String realText = String.format(text, "�̻��", 7);
		System.out.println(realText);
	}

}

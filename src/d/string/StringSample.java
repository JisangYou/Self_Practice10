package d.string;

import java.io.UnsupportedEncodingException;

public class StringSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringSample sample = new StringSample();
//		sample.convert();
		sample.convertUTF16();
	}

	public void convert() {
		try {
			String korean="한글";
			byte[] array1 =korean.getBytes();
			for(byte data : array1){
				System.out.println(data+" ");
			}
			System.out.println();
			String korean2 = new String(array1);
			System.out.println(korean2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printByteArray(byte[] array){
		for(byte data : array){
			System.out.print(data+" ");
		}
		System.out.println();
	}
	
	public void convertUTF16(){
		try {
			String korean = "한글";
			byte[] array1 = korean.getBytes("UTF-16");
			printByteArray(array1);
			String korean2 = new String(array1,"UTF-16");
			System.out.println(korean2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}






















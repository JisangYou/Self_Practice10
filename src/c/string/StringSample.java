package c.string;

import java.io.UnsupportedEncodingException;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringSample sample = new StringSample();
		sample.convert();
	
	}

	public void convert() {
		try {
			String korean="ÇÑ±Û";
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
	
	

}
















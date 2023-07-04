package sample;

public class CountAllChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="janan";
		int[] count = new int[256];
		
		for(int i=0;i<name.length();i++)
		{
			count[name.charAt(i)]++;
			System.out.println(count[name.charAt(i)]++);
		}
		
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0)
			{
				System.out.println("element :"+(char)i+" have ->"+count[i]);
			}
		}
	}

}

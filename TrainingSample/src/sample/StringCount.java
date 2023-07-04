package sample;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="janan";
		
		int count=0;
		char a='a';
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==a)
				{
					System.out.print(a);
					count++;
				}
		}
		
		System.out.println("occurance of char"+a+"is"+count);

	}

}

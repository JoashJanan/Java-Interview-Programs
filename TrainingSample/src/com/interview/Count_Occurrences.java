package com.interview;

public class Count_Occurrences {
	
	static final int MAX_CHAR=256;
	public static void getOccurrencesOfChar(String name)
	{
		int count[]= new int[MAX_CHAR];
		
		int len= name.length();
		
		for(int i=0;i<len;i++)
		{
			count[name.charAt(i)]++;
		}
		//create an array of given String size  
		char ch[]= new char[name.length()]; 
		for(int i=0;i<len;i++)
		{
			ch[i]= name.charAt(i);
			int find=0;
			
			for(int j=0;j<=i;j++)
			{
				if(name.charAt(i)== ch[j])
				{
					find++;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="janan";
		
		getOccurrencesOfChar(name);
	}

}

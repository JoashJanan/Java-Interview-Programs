package com.interview;

public class RemoveSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome$%#";
int count =0;

String charremoved ="";

for(int i=0;i<s.length();i++)
{
	if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
	{
		count++;
	}
	else
	{
		charremoved = charremoved+s.charAt(i);
		
	}
		
	

}

if(count==0)
{
	System.out.println("no special character");
}
else
{
	System.out.println("number of special character :"+count);
}

System.out.println("removed special character are:"+charremoved);
//System.out.println(+s.indexOf(count));

	}

}

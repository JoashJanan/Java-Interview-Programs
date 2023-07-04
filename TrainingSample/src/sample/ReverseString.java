package sample;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="Joash";
     String rev="";
     char chr;
     for(int i=0;i<name.length();i++)
     {
    	 chr=name.charAt(i);
    	 rev=chr+rev;
     }
     System.out.print(rev);
	}

}

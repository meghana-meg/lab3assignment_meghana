/**  Author name : MEGHANA T
     date: 23/10/2020
     desc: testing compliation and running next charcater of consonants
*/


import java.util.Scanner;
public class Consonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String(sc.next().toLowerCase());
        System.out.println("The resultant array is: "+alterString(str));
	}
   
	public static String alterString(String str)
	{
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			if((array[i]!='a' && array[i]!='e'	&& array[i]!='i' && array[i]!='0' && array[i]!='u' )) {
				if(array[i]=='z')
					array[i]='b';
				else  {
					array[i]=(char)(array[i]+1);
				
				   if((array[i]=='a' && array[i]=='e'	&& array[i]=='i' && array[i]=='o' && array[i]=='u' ))
					{
						array[i]=(char)(array[i]+1);
					}
				}
			}
				
			
		}
		
		return String.valueOf(array);
		
		// TODO Auto-generated method stub

	}

}

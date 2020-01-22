import java.util.*;

class CheckStringAndCharacterExample
{
	public static void main(String args[])
	{
		char ch[]=new char[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 cahracters :");
		
		for(int i=0;i<5;i++)
		{
			char chh=sc.next().charAt(0);
			ch[i]=chh;
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='/')
			{
				getData('%','2','0',i,ch,50);
			/*	ch[i]='%';
				char xx='2';
				char yy='0';
				for(int j=i+1;j<50;j=j+2)
				{
					char aa=ch[j];
					char bb=ch[j+1];
					ch[j]=xx;
					ch[j+1]=yy;
					xx=aa;
					yy=bb;
				}
			*/
			}
			
			if(ch[i]=='$')
			{
				getData('%','2','F',i,ch,50);
			/*	ch[i]='%';
				char xx='2';
				char yy='F';
				for(int j=i+1;j<50;j=j+2)
				{
					char aa=ch[j];
					char bb=ch[j+1];
					ch[j]=xx;
					ch[j+1]=yy;
					xx=aa;
					yy=bb;
				}
			*/
			}
		}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(""+ch[i]);
		}
	}
	
	static void getData(char x,char y,char z,int i,char ch[],int size)
	{
		ch[i]=x;
		char xx=y;
		char yy=z;
		for(int j=i+1;j<50;j=j+2)
		{
			char aa=ch[j];
			char bb=ch[j+1];
			ch[j]=xx;
			ch[j+1]=yy;
			xx=aa;
			yy=bb;
		}
	}
}
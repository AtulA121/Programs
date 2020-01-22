Hii ma'm ,

I am Shankar Pisal ,
----------------------------------------------------------------------------------------------------------
Point - 1] I was rejected from second round , just bcz of silly mistake that i did .
Ans --->
Que 1] It was Right .
Que - 2 ] Remove duplicate prime number's (Logically it was right , but some little mistake that i was't recognized at that time) .
 
ma'm logically i am right .

but ma'm as you said mi that , sir who checked my paper they didn't find logically right program , ma'm the sir who checked my paper they even don't see my program logic , they just said mi that do a right code , execute and show mi a exact answer that want , but bcz of silly mistake i won't be able to show them a right answer at that time .

And ma'm as also you said mi that you want a 110% logically correct students , yes am i , but bcz of sir's mistake i was rejected .


here is code  :

class removeDuplicates
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,3,4,2,5,4,6,3,4,3,3,3,3};
		
		int n=arr.length-1;
		int m=n-1;
		int temp=0;
		
		for(int i=m;i>=0;i--)
		{
			temp=arr[n];
			if(temp==arr[i])
			{
				arr[i]=0;
			}
			
			if(i==0)
			{
				if(arr[n]!=0)
				{
					System.out.print(" "+arr[n]);
					m=m-1;
		            i=m; //here is mistake that i did in test(only i=m+1 need)
					n=n-1;
				}
				else
				{
					m=m-1;
		            i=m; //here is mistake that i did in test(only i=m+1 need)
					n=n-1;
				}
			}
			
			if(n==0)
			{
				if(arr[n]!=0)
				{
					System.out.print(" "+arr[n]);//check only for last number
				}
				break;
			}
		}
	}
}

comment show's what i did wrong .

ma'm please check my paper if you find time , i am not saying that give mi a one more chance , but my point is to tell you that i am logically right that time also .

----------------------------------------------------------------------------------------------------------
point - 2 ] Ma'm you asked mi about feedback ?
Ans --->
1) On Saturday , sir's who going to checked all papers , hole day they bored and at the last they are trying to hurry to end that , so i think that's why they didn't check my logic , so i think it's wrong .
2)sir's who going to check the papers who have at least 3-5 years of experience
3) About your Management is very nice , i never saw before like that .
4)Companies freeness  towards employees is also a very nice .
5)about ma'm you , i never seen a that much nice behaviour like you ma'm .
6)And thanx for your politeness at last .
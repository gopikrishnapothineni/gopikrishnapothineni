import java.util.Scanner;
class Project 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-----welcome to amazon app------");
		System.out.println("------enter the details for registration-----");
		System.out.println("enter the name:");
		String a=sc.nextLine();
		System.out.println("enter the mobile number:");
		long l=sc.nextLong();
		System.out.println("enter the gmailid:");
		String s=sc.next();
		System.out.println("enter the user name:");
		String uname=sc.next();
		System.out.println("enter password:");
		String pwd=sc.next();
		System.out.println("reenter your password:");
		String x=sc.next();
		System.out.println("=====thank you for registeration=======");
		System.out.println("---------------------------------------");
		System.out.println("DO YOU WANT TO CONTINUE");
		System.out.println("enter 1 for login or 2 for exit");
		int i=sc.nextInt();
		if(i==1)
		{
			System.out.println("enter the user name");
			String nuname=sc.next();
			System.out.println("enter your password");
			String npwd=sc.next();
			if(uname.equals(nuname)&&pwd.equals(npwd))
			{
			
				System.out.println("===========================");
				System.out.println("     login successful      ");
				System.out.println("===========================");
				System.out.println("enter 1 for shopping");
				System.out.println("enter 2 for acceries");
				System.out.println("enter 3 for electronics");
				int r=sc.nextInt();
				switch(r)
				{
					case 1:
					{
						System.out.println("=========");
						System.out.println("thanks for choose for shoping");
						System.out.println("==========");
						System.out.println("enter 1 for mens");
						System.out.println("enter  2 for womens");
						System.out.println("enter 3 for kids");
						int t=sc.nextInt();
						switch(t)
						{
							case 1:System.out.println("welcome to mens section:");break;
							case 2:System.out.println("welcome for womens section:");break;
							case 3:System.out.println("welcome to kids section:");break;
							case 4:System.out.println("sorry section is not avalible:");break;
						}
						break;
					}
				 
				case 2:
					{
						System.out.println("thanks for choosing grociries");break;
					}
					case 3:
						{
						System.out.println("thanks for choose electronics"); break;
					}
					default:System.out.println("sorry section is not avlaible");
				}
			}
			else 
				{
				System.out.println("==============");
				System.out.println("incorect username or password");
				System.out.println("-------------");
			}
			}
		
			else if(i==2)
			{
				System.out.println(a+"visit again---");
			}
			else
				System.out.println("invalid input please check your input");
	}
}

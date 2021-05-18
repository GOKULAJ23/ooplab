import java.util.Scanner;

public class employee {
	int empno,empsalary;
	String empname;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee[] em=new employee[3];
		System.out.println("Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details:");
			em[i]=new employee();
			em[i].empno=sc.nextInt();
			em[i].empsalary=sc.nextInt();
			em[i].empname=sc.next();
		}
		System.out.println("Enter the empno:");
		int empnoo=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(em[i].empno==enoo)
			{
				System.out.println("Employee found");
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found:");
			}
		}


	}

}

                                                            *OUTPUT*
                                         Limit
                                         2
                                         Enter the details:
                                         1
                                         2
                                         GOKUL
                                         Enter the details:
                                         2
                                         3
                                         RAHUL
                                         Enter the eno:
                                         2
                                         Employee found

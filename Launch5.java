package shiva;

public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==0 || j==0 || j==n-1 || (i==1 && j!=6) || (i==2 && j!=5 && j!=6 && j!=7) || (i==3 && j<4) ||
						(i==3 && j>8) || (i==4 && j<3) || (i==4 && j>9) || (i==5 && j<2) || (i==5 && j>10) || (i==6 && j<1) || (i==6 && j>11)
						|| i==n-1)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
package shiva;

public class Launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n-1 || i==n-2 || (i==n-3 && j<6) || (i==n-3 && j>7) || (i==n-4 && j<5) || (i==n-4 && j>8) || 
						(i==n-5 && j<4) || (i==n-5 && j>9) || (i==n-6 && j<3) || (i==n-6 && j>10) || (i==n-7 && j<2) || (i==n-7 && j>11) || 
						(i==n-8 && j<1) || (i==n-8 && j>12))
					
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

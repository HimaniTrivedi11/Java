class  Floyd_triangle
{
	public static void main(String[] args) 
	{
		int no = 5;

        int k = 1;

        for (int i = 1; i <= no; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(k + "  ");
                k++;
            }
            System.out.println();
        }	
	}
}
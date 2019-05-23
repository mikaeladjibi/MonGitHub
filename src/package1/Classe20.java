package package1;

public class Classe20 {

	public static void main(String[] args) {
		int [][] tab = new int [6][13];
		for (int i = 0; i<6; i++)
		{
			for (int j = 0; j<13; j++)
			{
				tab[i][j] = 0;
			}
		}
		for (int i = 0; i<6; i++)
		{
			for (int j = 0; j<13; j++)
			{
				if (j%2==0) tab[i][j] = 1;
			}
		}
		for (int i = 0; i<6; i++)
		{
			for (int j = 0; j<13; j++)
			{
				if (j==12) System.out.println("" + tab[i][j]);
				else System.out.print("" + tab[i][j]);
			}
		}
	}

}

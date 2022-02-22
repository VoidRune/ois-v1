import java.util.Scanner;

public class Gravitacija
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nadmorskaVisina = sc.nextDouble();
        Izpis(nadmorskaVisina);
    }
	
    //nadmorska visina je v kilometrih je v kilometrih
	public static double Izracun (double v)
    {
		double G = 6.674 * Math.pow(10, -11);
		double M = 5.972 * Math.pow(10, 24);
		double r = 6.371 * Math.pow(10, 6);
		
		return (G*M) / Math.pow(r + v * 1000.0, 2);
	}

    public static void Izpis(double v)
    {
        System.out.printf("Nadmorska višina: %f\n", v);
        System.out.printf("Gravitacijski pospešek: %f ", Izracun(v));
    }

}
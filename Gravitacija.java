public class Gravitacija
{
    public static void main(String[] args)
    {
        System.out.println("OIS je zakon!");
    }
	
	public double Izracun (double v) {
		double G = 6.674 * Math.pow(10, -11);
		double M = 5.972 * Math.pow(10, 24);
		double r = 6.371 * Math.pow(10, 6);
		
		return (G*M) / Math.pow(r + v, 2);
	}
}
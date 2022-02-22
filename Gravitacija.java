public class Gravitacija
{
    public static void main(String[] args)
    {
        System.out.println("OIS je zakon!");
    }

    public static void izpis(double v)
    {
        System.out.printf("Nadmorska višina: %f", v);
        System.out.printf("Gravitacijski pospešek: %f ", Izracun(v));
    }

}
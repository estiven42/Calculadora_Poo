public class Main
{
    public static void main(String[] args)
    {
        System.out.println("CALCULADORA");

        Calculadora operacones = new Calculadora();
        operacones.consola();
        operacones.sumar();
        operacones.restar();
        operacones.multiplicar();
        operacones.division();
    }
}
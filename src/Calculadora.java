import java.util.Scanner;

public class Calculadora
{
    int numero,numero2;
    public void consola()
    {
        System.out.println("ingrese dos numeros para operar:");
        Scanner entrada1=new Scanner(System.in);
        Scanner entrada2=new Scanner(System.in);
        numero=entrada1.nextInt();
        numero2=entrada2.nextInt();
    }
    public void sumar()
    {
        if(numero>0 && numero2>0)
        {
            int suma=numero+numero2;
            System.out.println("la suma es:"+suma);
        }
        else
        {
            System.out.println("error");
        }

    }
    public int restar()
    {
        int resta=numero-numero2;
        System.out.println("la resta es:"+resta);
        return resta;
    }
    public int multiplicar()
    {
        int multi=numero*numero2;
        System.out.println("la multiplicacion es:"+multi);
        return multi;
    }
    public int division()
    {
        int divi=numero/numero2;
        System.out.println("la division es:"+divi);
        return divi;
    }
}

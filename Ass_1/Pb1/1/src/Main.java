//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static boolean is_prime(int x)
    {
        if(x == 0 || x == 1 )
            return false;
        if(x == 2)
            return true;
        for(int i = 2; i <= Math.sqrt(x); i++)
            if(x%i == 0)
                return false;
        return true;
    }
    // Pb1
    public static void all_prime(String[] args){
for(String arg : args)
    {
        int i = Integer.parseInt(arg);
        if (is_prime(i))
            System.out.println(i);
    }}
    //ends here
    public static double Max_Value(String[] args)
    { double max = -99999;
        for (String arg : args)
        {
            double i = Double.parseDouble(arg);
            if(i > max)
                max = i;
        }
        return max;
    }
    public static int GCD(int a,int b)
    {
        while(a != b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public static void Pb3(String[] args)
    { int cmm;
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        cmm = GCD(i,j);
        for(int k = 2; k < args.length; k++)
        {
            cmm = GCD(cmm,Integer.parseInt(args[k]));
        }

        System.out.println(cmm);
    }
    public static void main(String[] args)
    {
        if(args.length < 1)
            System.out.println("No args given");
//all_prime(args);
        //Pb2
        //System.out.println(Max_Value(args));
//ends here
        //Pb3
        Pb3(args);



    }

    }

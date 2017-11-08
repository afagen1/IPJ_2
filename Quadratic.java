public class Quadratic {
    //IPJ_2_1.3.2

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = b*b - 4.0*a*c;
        double d = Math.sqrt(discriminant);

        if(a==0)
            System.out.println("This is not a quadratic equation.");
        else if(discriminant>=0)
        {
            System.out.println((-b+Math.sqrt(d))/(2.0*a));
            System.out.println((-b-Math.sqrt(d))/(2.0*a));
        }
        else if(discriminant<0)
            System.out.println("The solution includes imaginary numbers.");
    }
}

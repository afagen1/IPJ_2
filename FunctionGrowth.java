public class FunctionGrowth {
    // IPJ_2_1.3.12

    public static void main(String[] args) {
        double n;
        double x;
        double y;
        double z;
        double a;
        double b;
        double c;

        System.out.println("log(n)\t\t\t\tn\t\tnlog(n)\t\t\t\tn^2\t\tn^3\t\t2^n");

        for(int i=4; i<12; i++){
            n=Math.pow(2,i);
            x = Math.log10(n);
            y = n;
            z = n*Math.log(n);
            a = n*n;
            b = n*n*n;
            c = Math.pow(2,n);

            System.out.println(x+"\t"+y+"\t"+z+"\t"+a+"\t"+b+"\t"+c);



        }
    }
}

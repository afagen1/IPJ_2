public class Hellos {
    //IPJ_2_1.3.8

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for(int i = 1; i <= a; i++)
        {
            if(i%10==1)System.out.println(i+"st"+ " Hello.");
            else if(i%10==2)System.out.println(i+"nd"+" Hello.");
            else if(i%10==3)System.out.println(i+"rd"+" Hello.");
            else System.out.println(i+"th"+" Hello.");
        }
    }
}

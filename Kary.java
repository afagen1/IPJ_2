public class Kary {
    // IPJ_2_1.3.21
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int power = 1;
        while (power <= n / m)
            power *= m;
        while (power > 0) {
            int x = n / power;
            switch (x) {
                case 1:
                    System.out.print(1);
                    n -= power*x;
                    break;
                case 2:
                    System.out.print(2);
                    n -= power*x;
                    break;
                case 3:
                    System.out.print(3);
                    n -= power*x;
                    break;
                case 4:
                    System.out.print(4);
                    n -= power*x;
                    break;
                case 5:
                    System.out.print(5);
                    n -= power*x;
                    break;
                case 6:
                    System.out.print(6);
                    n -= power*x;
                    break;
                case 7:
                    System.out.print(7);
                    n -= power*x;
                    break;
                case 8:
                    System.out.print(8);
                    n -= power*x;
                    break;
                case 9:
                    System.out.print(9);
                    n -= power*x;
                    break;
                case 10:
                    System.out.print('A');
                    n -= power*x;
                    break;
                case 11:
                    System.out.print('B');
                    n -= power*x;
                    break;
                case 12:
                    System.out.print('C');
                    n -= power*x;
                    break;
                case 13:
                    System.out.print('D');
                    n -= power*x;
                    break;
                case 14:
                    System.out.print('E');
                    n -= power*x;
                    break;
                case 15:
                    System.out.print('F');
                    n -= power*x;
                    break;
                default:
                    System.out.print(0);
                    n -= power*x;

            }
            power /= m ;
        }
        System.out.println();
    }

}

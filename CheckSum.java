public class CheckSum {
    // IPJ_2_1.3.35
    public static void main(String[] args) {

        int d1=0;

        int[] arr = new int[args.length];

        for(int i=0; i<args.length; i++){
            arr[i]=Integer.parseInt(args[i]);
        }

        int sum = 0;
        int temp;

        for(int i=0; i<args.length; i++) sum = sum + (arr[i] * (10-i));

        for(int i=0; i<=10;i++) {
            temp = sum + i;
            if (temp % 11 == 0) {
                if (i == 10) d1 = 'x';
                else d1 = i;
                break;
            }
        }
        for(int i=0; i<args.length; i++)
            System.out.print(args[i] + " ");
        System.out.print(d1);
    }
}

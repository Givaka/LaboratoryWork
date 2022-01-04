public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 14 ; i++){
            if ( i > 9 )
                for (int k = 0; k <= 10; k++)
                    System.out.print(" ");
            else {
                for (int k = 0; k <= 10 - i; k++)
                    System.out.print(" ");

                for (int j = 1; j <= i; j++)
                    System.out.print(j);
            }

            if ( i > 4 ){
                System.out.print(" ");
                for (int v = 14 - i; v > 0 ; v--)
                    System.out.print(v);
            }

            System.out.println();
        }
    }
}

package vong_lap_for;

public class BBB {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == n || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//       for(int i=1;i<=5;i++)
//    {
//        if(i==1||i==5)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        if(i!=1&&i<5)
//        {
//            for(int j=1;j<=5-i;j++)
//            {
//                System.out.print("  ");
//            }
//            System.out.print("*");
//            for(int k=1;k<i;k++)
//            {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//
//    }

}
}


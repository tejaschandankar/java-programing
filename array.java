import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        // int[] rollnum = new int[3];
        // rollnum[0] = 101;
        // rollnum[1] = 102;
        // rollnum[2] = 103;
        // // System.out.println(rollnum[0]);
        // // System.out.println(rollnum[1]);
        // // System.out.println(rollnum[2]);

        // // System.out.println(rollnum.length);
        // for (int i = 0; i < rollnum.length; i++) {
        // System.out.println(rollnum[i]);

        // }
        // System.out.println(rollnum.length);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] rollno = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.println("enter the rollno of student " + (i + 1) + ":");
            rollno[i] = sc.nextInt();

        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(rollno[i]);

        }
        System.out.println("Length of rollno array: " + rollno.length);
    }
}

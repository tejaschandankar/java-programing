// import java.util.Scanner;
// public class mdarray {
//     public static void main(String[] args) {
//         // int[][] marks = new int[3][3];
//         // marks[0][0]=20;
//         // marks[0][1]=21;
//         // marks[0][2]=22;

//         // marks[1][0]=23;
//         // marks[1][1]=24;
//         // marks[1][2]=25;

//         // marks[2][0]=26;
//         // marks[2][1]=27;
//         // marks[2][2]=28;

//         // int[][] marks = {  // without declaring the size of array we can also declare the array and assign the values to it
//         //     {20,21,22},
//         //     {23,24,25},
//         //     {26,27,28}
//         // };
        
//         // for(int row = 0; row <marks.length ; row++){
//         //     for(int col = 0; col <marks[row].length ; col++){
//         //         System.out.print(marks[row][col] + " ");
//         //     }
//         //     System.out.println();

// //....................................................................................
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("enter the number of rows:");      
//         // int rows = sc.nextInt();
//         // System.out.print("enter the number of columns:");
//         // int cols = sc.nextInt();
//         // int[][] marks = new int[rows][cols];
        
//         // // input
//         // for (int row = 0; row < rows; row++) {
//         //     for (int col = 0; col < cols; col++) {
//         //         System.out.print("enter the marks of student " + (row + 1) + " in subject " + (col + 1) + ":");
//         //         marks[row][col] = sc.nextInt();
//         //     }
//         // }

//         // // output
//         // for (int row = 0; row < rows; row++) {
//         //     for (int col = 0; col < cols; col++) {
//         //         System.out.print(marks[row][col] + " ");
//         //     }
//         //     System.out.println();
//         // }

//  //..............................................................................................       
// //     int [][] marks=new int[3][];
// //     marks[0]=new int[1];
// //     marks[1]=new int[2];
// //     marks[2]=new int[3];
// // marks[0][0]=20;
// // marks[1][0]=21;    
// // marks[1][1]=22;
// // marks[2][0]=23;
// // marks[2][1]=24;
// // marks[2][2]=25; 

// // for(int row=0 ; row< marks.length; row++){
// //     for(int col=0 ; col<marks[row].length; col++){
// //         System.out.print(marks[row][col] + " ");
// //     }
// //     System.out.println();

// // }
//  Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows:");      
//         int rows = sc.nextInt();
//         int[][] marks = new int[rows][];
        
//         // input
//         for (int row = 0; row < rows; row++) {
//             System.out.print("enter the number of subjects for student " + (row + 1) + ":");
//             int cols = sc.nextInt();
//             marks[row] = new int[cols];
//             for (int col = 0; col < cols; col++) {
//                 System.out.print("enter the marks of student " + (row + 1) + " in subject " + (col + 1) + ":");
//                 marks[row][col] = sc.nextInt();
//             }
//         }

//         // output
//         for (int row = 0; row < rows; row++) {
//             for (int col = 0; col < marks[row].length; col++) {
//                 System.out.print(marks[row][col] + " ");
//             }
//             System.out.println();
//         }
//     }
// }  
// // }


// example 
// Qs. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.      


import java.util.Scanner;
public class mdarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");  
        int rows = sc.nextInt();
        System.out.print("enter the number of columns:");   
        int cols = sc.nextInt();    
        int[][] marks = new int[rows][cols];
        
        // input
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("enter the marks of student " + (row + 1) + " in subject " + (col + 1) + ":");
                marks[row][col] = sc.nextInt();
            }
        }

        System.out.print("enter the number to search:");
        int x = sc.nextInt();   
        boolean found = false;

        // search
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (marks[row][col] == x) {
                    System.out.println("the number is found at index [" + row + "][" + col + "]");
                    found = true;
                }
                
            }
        }
        if (!found) {
            System.out.println("the number is not found in the matrix");
        }

    }

}
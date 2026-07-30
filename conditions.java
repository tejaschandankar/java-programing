// import java.util.*;
// public class conditions {
//     // if else condition
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
//         int age =sc.nextInt();
//         if(age>18){
//             System.out.println("you are eligible to vote");
//         }
//         else{
//             System.out.println("you are not eligible to vote");
//         }
//     }
//     }
// import java.util.*;
// public class conditions {
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
//         int x=sc.nextInt();
//         if(x%2==0){
//             System.out.println("the number is even");
//         }
//         else{
//             System.out.println("the number is odd");
//         }
//     }
// }
// import java.util.*;
// public class conditions{
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the first number:");
//         int a =sc.nextInt();
//         System.out.println("enter the second number:");
//         int b =sc.nextInt();
//         if(a==b){
//             System.out.println("the numbers are equal");
//         }else if(a>b){
//             System.out.println("the first number is greater");
//         }else{
//             System.out.println("the second number is greater"); 
//         }

//     }
// }

import java.util.*;
public class conditions{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int Botton = sc.nextInt();
        
        switch (Botton) {
            case 1:
                System.out.println("the botton is 1");      
                break;
            case 2:
                System.out.println("the botton is 2");  
                break;
            case 3:
                System.out.println("the botton is 3");  
                break;
            default:
                System.out.println("the botton is not valid");
                
        }
    }
}
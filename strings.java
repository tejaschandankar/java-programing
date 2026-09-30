public class strings {
    public static void main(String[] args) {
        String name = "Hello, World!";
        System.out.println(name);

        String upperCaseName = name.toUpperCase();
        System.out.println(upperCaseName);
        String lowerCaseName = name.toLowerCase();
        System.out.println(lowerCaseName);  
        String replacedName = name.replace("World", "Java");
        System.out.println(replacedName);
        String substringName = name.substring(7, name.length());
        System.out.println(substringName);//substring begining index to end index

        //concatination
        String firstName = "John";
        String lastName = "Doe";    
        System.out.println(firstName + " " + lastName);

        //String length
        System.out.println("Length of name: " + name.length());

        //String comparison
        String name1 = "Hello";     
        String name2 = "Hello";
        if(name1.equals(name2)){
            System.out.println("The names are equal.");
        }
        else{
            System.out.println("The names are not equal.");
        } 


        //String comparison ignoring case
        String name3 = "hello";
        System.out.println("Are the names equal ignoring case? " + name1.equalsIgnoreCase(name3)); 
        
        //String immutability
        String originalString = "Hello";
        String modifiedString = originalString.concat(", World!");  
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);   

        //charAt() method
        String name4 ="Tejas";
        String upperCaseName4 = name4.toUpperCase();
        System.out.println("Uppercase Name: " + upperCaseName4);
        
        for (int i=0; i< name4.length();i++){
            System.out.println("Character at index "+    i + ": " + upperCaseName4.charAt(i));
        }


         

    }
}

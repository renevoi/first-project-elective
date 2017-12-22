
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        
    }
}
class Problem1{                                             //problem1 shows the increment of numbers 1 to 9
    public static void main(String[] args) {
        for (int x=1; x<=10;x++){
            System.out.println("Problem1.main()");
            
            for (int y=1; y<=x; y++){
                System.out.println(y);
            }
        }
        System.out.println();
    }
}
class Problem2{                                             //problem2 show the increment of binary codes 1&2
    
    public static void main(String[] args) {
        int x, y;
        int z =1;
        for (x=1;x<=6;x++){
            for(y=1;y<=x;y++){
            System.out.format("%d", z++ %2);
            if(y==x&&x!=6)
                System.out.println("");
        }
        if (x%2==0)
            z =1;
        else
            z=0;
    }
}
}
class Problem3{                                            //nested loop of *-7 and decrement of *-7
    public static void main(String[] args) {
        
        int x,y,z;
        for (x=1;x<=7;x++){
            for( y=x;y<7;y++){
            System.out.println("  ");
        }
            for(z=1;z<(x*2);z++){
                System.out.println("*");
            }
            System.out.println();
        }
        for (x=6;x>=1;x--){
            for(y=7;y>x;y--){
                System.out.println("  ");
            }
            for(z=1;z<(x*2);z++);
        }
        System.out.println();
        
    }
}
class Problem4{                                                 //nested loop of letters A-F and vise versa
    public static void main(String[] args) {                       //with the increment and decrement of A-F
        int x=7;
        int num = 1;
        int num2 =1;
        char y='A';
        
        for (int i=1;i<(x*2);i++){
            for (int z=x - num2;z>0;z--){
                System.out.println("  ");
            }
            if(i<x){
                num2++;
            }
            else{
                num2--;
            }
            for(int w=0;w<num;w++){
                System.out.println(y);
                if(w<num/2){
                    y++;
                }
                
            }
            if (i<x){
                num = num +2;
            }
            else{
                num = num -2;
            }
        }
    }
    
}
class Problem5{                                                        //5 is the original array display
    public static void main(String[] args) {                            //length og the arreay
        int numbers[] = {49,1,3,200,2,4,70,5};                             //get the longest sequence in the original array
        System.out.println("Original array length: "+numbers.length);
        System.out.print("Array elements are: ");
                for(int i=0;i<numbers.length;i++){
                    
                }
                System.out.println("\n The new length of the array is: "+longest_sequence(numbers));
    }
    public static int longest_sequence(int []numbers){
        final  HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : numbers )h_set.add(i);
        
        int longest_sequence_len = 0;
        for (int i : numbers){
            int length = 1;
            for(int j = i-1;h_set.contains(j);--j){
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    }
    
}
class Problem6{
    static void unique_array(int[] my_array){
        System.out.println("Original Array: ");
        for(int i = 0;i<my_array.length;i++){
            System.out.println(my_array[i]+"\t");
        }
        int no_unique_elements = my_array.length;
        for (int i=0;i<no_unique_elements;i++){
            for(int j =i+1; j<no_unique_elements;i++){{
                if(my_array[i]==my_array[j]){
                    my_array[j] = my_array[no_unique_elements];
                    no_unique_elements--;
                    j--;
                }
            }
        }
    }
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
        System.out.println();
        System.out.println("Array with unique value: ");
        for (int i = 0; i<array1.length; i++){
            System.out.println(array1[i]+"\t");
        }
        System.out.println();
}
    public static void main(String[] args) {
        
    
    unique_array(new int[] {20,20,30,40,50,50,50});
}
}
class Problem7{                                                                 //converts uppercase letters to lower case letters
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an upper case String: ");
        String InputString = scanner.nextLine();
        
        System.out.println("Lowercase string: \n"+InputString.toLowerCase());
    }
}
class Problem8{                                                                 //character aray of the string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scanner.nextLine();
        
        char[] A;
        A = s.toCharArray();
        
        System.out.println("Character array of the string: ");
        for (int i = 0; i<A.length;i++)
            System.out.println("A["+i+"] = "+A[i]);
            System.out.println("\n");
    }
}
class Problem9{                                                                 //program restricts the password to alphabet + numeric ombinations
    public static final int PASSWORD_LENGTH = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Password rules:\n"+
                "1. A password must have atleast ten characters.\n"+
                "2. A password consists of only letters and digits.\n"+
                "3. A password mus contain atleast two digits.\n"+
                "Input a password(You are agreeing to the terms above and conditions.)"
        
        
                            );
        String s = input.nextLine();
        
        if (is_Valid_Password(s)){
            System.out.println("Password is valid: "+s);
        }
        else{
            System.out.println("Invalid Password: "+s);
        }
                
    }
    public static boolean is_Valid_Password(String password){
        if(password.length()<PASSWORD_LENGTH) return false;
        int characterCount = 0;
        int numberCount = 0;
        for (int i = 0; i < password.length();i++){
            char charac = password.charAt(i);
            if (is_Numeric(charac))numberCount++;
            else if (is_Letter(charac))characterCount++;
            else return false;
        }
        return (characterCount>=2&& numberCount>=2);
    }
    public static boolean is_Letter(char charac){
        charac = Character.toUpperCase(charac);
        return (charac>='A'&&charac<='Z');
    }
    public static boolean is_Numeric(char charac){
        return (charac>='0'&&charac<='9');
        
    }
    
}
class Problem10{                                                                //the input number will show
    public static void main(String[] args) {                                    //left to right . up and down
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int x =in.nextInt();
        printMatrix(x);
    }
    public static void printMatrix(int x){
        for (int y=0; y<x;y++){
            System.out.println((int)(Math.random()*2)+"");
    }
        System.out.println();
    }
}
class Problem11{                                                                //the output is alternate
    public static void main(String[] args) {
        for (int i = 2; i<100;i++){
            
        }
    }
    public static boolean is_Prime(long n){
        if (n<2) return false;
        for(int i =2; i<=n/2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MainClass{

    public static void main(String[] args) {
        
      


    }


}



class Problem1{
    
    public static void main(String []args) {    //shows the increment of number 1 to 9
        for (int i = 0; i < 10; i++) {
            System.out.println();
            
            for (int j = 0; j <=i; j++) {
                System.out.println(j);
            }
        }
        System.out.println();
    }
    
}

class Problem2{
    public static void main(String[]args){  // increment of binary codes 1 and 2
    int i , j;
    int k =1;
        for ( i = 1; i <= 6; i++) {
            for ( j = 1; j <=i; j++) {
                System.out.format("%d", k++ %2);
                if (j==i&&i!=6) {
                    System.out.println("");
                }
                if (i%2==0) 
                    k=1;
                    else
                    k=0;
                }
            }
        }
    
}
    
    
    


class Problem3{
    
    public static void main(String[] args) {    //nested loop decrement of *-7
        int i,j,k;
        for (i = 0; i < 7; i++) {
            for( j=i; j<7;j++){
                System.out.println(" ");
            }
            for(k=1;k<(i*2);k++){
                System.out.println("*");
            }
            System.out.println();
        }
        for (i=6;i>=1;i--){
            for(j=7;j>i;j--){
                System.out.println("  ");
            }
            for (k=1;k<(i*3);k++);
        }
        System.out.println();
        }
    }
    

class Problem4{
    public static void main(String[] args) {            //nested loop letters A-F and the other way around            
        int q=7;                                        //increment and decrement of A-F
        int number1 = 1;
        int number2 =1;
        char e='A';
        
        for (int i=1;i<(q*2);i++){
            for (int k=q - number2;k>0;k--){
                System.out.println("  ");
            }
            if(i<q){
                number2++;
            }
            else{
                number2--;
            }
            for(int w=0;w<number1;w++){
                System.out.println(e);
                if(w<number1/2){
                    e++;
                }
                
            }
            if (i<q){
                number1 = number1 +2;
            }
            else{
                number1 = number1 -2;
            }
        }
    }
}

class Problem5{                                             
     public static void main(String[] args) {                   //5 is the array dislay                   
        int arraynum[] = {49,1,3,200,2,4,70,5};                 //length of the array                    
        System.out.println("Original array length is : "+arraynum.length);// gets the longest sequence in the orignal array 
        System.out.print("Array elements are: ");
                for(int i=0;i<arraynum.length;i++){
                    
                }
                System.out.println("\n The new length of the array is: "+longest_sequence(arraynum));
    }
    public static int longest_sequence(int []num){
        final  HashSet<Integer> q_set = new HashSet<Integer>();
        for (int i : num )q_set.add(i);
        
        int longest_sequence_len = 0;
        for (int a : num){
            int length = 1;
            for(int y = a-1;q_set.contains(y);--y){
                q_set.remove(y);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    }
}

class Problem6{
    
    static void GoodArray(int[] Adrianarray){
        System.out.println("Original Array: ");
        for(int q = 0;q<Adrianarray.length;q++){
            System.out.println(Adrianarray[q]+"\t");
        }
        int NoUniqueElements = Adrianarray.length;
        for (int i=0;i<NoUniqueElements;i++){
            for(int j =i+1; j<NoUniqueElements;i++){{
                if(Adrianarray[i]==Adrianarray[j]){
                    Adrianarray[j] = Adrianarray[NoUniqueElements];
                    NoUniqueElements--;
                    j--;
                }
            }
        }
    }
        int[] array = Arrays.copyOf(Adrianarray, NoUniqueElements);
        System.out.println();
        System.out.println("Array with unique value: ");
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]+"\t");
        }
        System.out.println();
}
    public static void main(String[] args) {
        
    
    GoodArray(new int[] {20,20,30,40,50,50,50});
}
}

class problem7{                                 //converter it can convert uppercase to lower case letters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an upper case String: ");
        String InputString = sc.nextLine();
        
        System.out.println("Lowercase string: \n"+InputString.toLowerCase());
    }
}

class Problem8{                     // a character array of the string
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String q = scan.nextLine();
        
        char[] w;
        w = q.toCharArray();
        
        System.out.println("Character array of the string: ");
        for (int i = 0; i<w.length;i++)
            System.out.println("w["+i+"] = "+w[i]);
            System.out.println("\n");
    }
}
class problem9{                                         //restricts the password  to alphabet and  numeric cmobinaion
    public static final int PASSWORD_LENGTH = 20;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Password rules:\n"+
                "1. A password must have atleast twenty characters.\n"+
                "2. A password consists of only letters and digits.\n"+
                "3. A password mus contain atleast two digits.\n"+
                "Input a password(You are agreeing to the terms above and conditions.)" );
        
        String q = sc.nextLine();
        
        if (is_Valid_Password(q)){
            System.out.println("Password is valid: "+q);
        }
        else{
            System.out.println("Invalid Password: "+q);
        }
                
    }
    public static boolean is_Valid_Password(String pass){
        if(pass.length()<PASSWORD_LENGTH) return false;
        int characterCount1 = 0;
        int numberCount1 = 0;
        for (int i = 0; i < pass.length();i++){
            char charac = pass.charAt(i);
            if (is_Numeric(charac))numberCount1++;
            else if (is_Letter(charac))characterCount1++;
            else return false;
        }
        return (characterCount1>=2&& numberCount1>=2);
    }
    public static boolean is_Letter(char character){
        character= Character.toUpperCase(character);
        return (character>='A'&&character<='Z');
    }
    public static boolean is_Numeric(char character){
        return (character>='0'&&character<='9');
        
    }
}
class problem10{                                            // the input number will shown from left to right and up to down
    public static void main(String[] args) {                                   
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int q =sc.nextInt();
        printMatrix(q);
    }
    public static void printMatrix(int q){
        for (int y=0; y<q;y++){
            System.out.println((int)(Math.random()*2)+"");
    }
        System.out.println();
    }
}

class problem11{                                    //the output of this program is if we input  the output that will dislay in this
     public static void main(String[] args) {       // in this program will go alternate
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



















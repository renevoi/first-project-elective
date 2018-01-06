import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

      

public class MainClass{

    public static void main(String[] args) {
        
        


    }

}




class Problem1{
    public static void main(String s[]) {
        for (int m = 1; m <=10; m++) {
            System.out.println();
            
            for (int j = 1; j <=m; j++) {
                System.out.println(m);
                
            }
        }
        System.out.println();
    }
}

class Problem2{
 public static void main(String s[]) {
        int m,j;
        int count=1;
        for (m = 1; m <=6; m++) {
            for (j = 1; j <=m; j++) {
                System.out.format("%d",count++ %2);
                if (j==m && m!=6)
                    System.out.println("");
                    
                
                
            }
            if(m%2==0)
            count =1;
            else
            count=0;
        }
    }
}

class Problem3{
    public static void main(String[] args) {
        int m,j,e;
        for (m = 1;  m<=7; m++) {
            for (j = m; j < 7; j++) {
                System.out.println(" ");
            }
            for (e = 1; e < (m*2); e++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (m = 6; m >=1; m--) {
            for (j = 7; j >m; j--) {
                System.out.println(" ");
            }
            for (e = 1; e < (m*2); e--) {
                System.out.println("*");
            }
            System.out.println();
            
        }
    }
}
class Problem4{
    public static void main(String[] args) {
        int m=7;
        int count=1;
        int count2=1;
        char c='M';
        
        for (int j = 1; j < (m*2); j++) {
            for (int spc = m-count2; spc >0; spc--) {
                System.out.println(" ");
            }
            if (j<m) {
                count2++;
            } else {
                count2--;
            }
            for (int h = 0; h < count; h++) {
                System.out.print(c);
                if (h<count/2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (j<m) {
                count=count+2;
            } else {
                count=count-2;
            }
        }
    }
}
class Problem5{
    public static void main(String[] args) {
        int nums[]={49,1,3,200,2,4,70,5};
        System.out.println("Original array length:"+nums.length);
        System.out.print("Array elements are:");
        for (int m = 0; m < nums.length; m++) {
            System.out.print(nums[m]+" ");
            
        }
        System.out.println("\nThe new length of the arrray is: "+longset_sequence(nums));
    }
    public  static int longset_sequence(int [] nums){
        final HashSet<Integer>h_set=new HashSet<Integer>();
        for (int m:nums)h_set.add(m);
        int longest_sequence_len=0;
        for (int m:nums) {
            int length=1;
            for (int j = m-1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = m+1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len=Math.max(longest_sequence_len, length);
            
        }
        return longest_sequence_len;
    }
}
class Problem6{
    static void unique_array(int []my_array){
        System.out.println("Original array:");
        for (int m = 0; m<my_array.length; m++) {
            System.out.println(my_array[m]+"\t");
        }
        int no_unique_elements=my_array.length;
        for (int m = 0; m < no_unique_elements; m++) {
            for (int j = m+1; j < no_unique_elements; j++) {
                
            
            if (my_array[m]==my_array[j]) {
                my_array[j]=my_array[no_unique_elements-1];
                no_unique_elements--;
                j--;
            }
            }
        }
        int[] array1=Arrays.copyOf(my_array,no_unique_elements);
        System.out.println();
        System.out.println("Array with unique values:");
        for (int m = 0; m <array1.length; m++) {
            System.out.println(array1[m]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        unique_array(new int[]{20,20,30,40,50,50,50});
    }
}
class Problem7{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a uppercase string: ");
        String userInputString=scanner.nextLine();
        System.out.println("Lowercase String:\n"+userInputString.toLowerCase());
    }
}
class Problem8{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=scanner.nextLine();
        
        char[] M;
        
        M=s.toCharArray();
        System.out.println("Character array of the string: ");
        for (int j = 0; j < M.length; j++) 
            System.out.println("M{"+j+"}="+M[j]);
            System.out.println("\n");
            
       
    }
}
class  Problem9{
    public static final int PASSWORD_LENGTH=10;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println(
                "Password rules:\n"+
                "1. A password ,ust have at least ten character.\n"+
                "2. A password consists of only letters and digits.\n"+
                "3.A password must contain at leeast two digits \n"+
                "Input a password (you are agreeing to the above Terms and Condition.):");
        String s=input.nextLine();
        
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid:"+s);
        } else {
            System.out.println("Not a valid password:"+s);
        }
    }
    public static boolean is_Valid_Password(String password){
        if(password.length()<PASSWORD_LENGTH)return false;
        int charcount=0;
        int numCount=0;
        for (int m = 0; m < password.length(); m++) {
            char ch=password.charAt(m);
            if(is_Numeric(ch))numCount++;
            else if(is_Letter(ch))charcount++;
            else return false;
        }
        return (charcount>=2&&numCount>=2);
    }
    public static boolean is_Letter(char ch){
        ch=Character.toUpperCase(ch);
        return (ch>='M'&&ch<='J');
    }
    public static boolean is_Numeric(char ch){
        return (ch>='0'&&ch<='9');
    }
    
}
class Problem10{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input a number: ");
        int n=in.nextInt();
        printMatrix(n);
    }    
    public static void printMatrix(int n){
        for(int m=0;m<n;m++){
            for (int h = 0; h < n; h++) {
                System.out.println((int)(Math.random()*2)+"");
            }
            System.out.println();
        }
    }
}
class Problem11{
    public static void main(String[] args) {
        for (int m=2;m<100;m++){
            if(is_Prime(m)&&is_Prime(m+2)){
                System.out.printf("(%d,%d\n",m,m+2);
            }
        }
      
        
    }
    public static boolean is_Prime(long n){
        if(n<2)return false;
        
        for (int m = 2; m < n/2; m++) {
            if(n%m==0)return false;
            
        }
        return true;
    }
}


















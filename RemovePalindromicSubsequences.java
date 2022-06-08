import java.util.*;

public class RemovePalindromicSubsequences{
    public int isPalindrome(String s){        
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }        
        if(rev.equals(s)){
            return 1;
        }
        return 0;
    }

    public int removePalindromeSub(String s){
        RemovePalindromicSubsequences obj = new RemovePalindromicSubsequences();

        int steps = 0;

        //Case 1 - String is Empty
        if(s.equals("")){
            steps = 0;
        }

        // Case 2 - String is palindrome itself
        else if(obj.isPalindrome() == 1){
            steps = 1;
        }

        // Case 3 - String is not Palindrome
        else if(obj.isPalindrome() == 0){
            steps = 2;
        }

        return steps;
    }

    public static void main(String args[]){
        RemovePalindromicSubsequences obj = new RemovePalindromicSubsequences();
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the String - ");
        String s = in.nextLine();
        int steps = obj.removePalindromeSub(s);
        System.out.println(steps);
    }
}
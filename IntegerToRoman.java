import java.util.*;

public class IntegerToRoman{
    public int countDigits(int num){
        String s = Integer.toString(num);
        return s.length();
    }

    public String chooseRoman(int n){
        if(n == 1){
            return("I");
        }
        else if(n == 4){
            return("IV");
        }
        else if(n == 5){
            return("V");
        }
        else if(n == 9){
            return("IX");
        }
        else if(n == 10){
            return("X");
        }
        else if(n == 40){
            return("XL");
        }
        else if(n == 50){
            return("L");
        }
        else if(n == 90){
            return("XC");
        }
        else if(n == 100){
            return("C");
        }
        else if(n == 400){
            return("CD");
        }
        else if(n == 500){
            return("D");
        }
        else if(n == 900){
            return("CM");
        }
        else if(n == 1000){
            return("M");
        }
        else{
            return ("Dholak");
        }
    }

    public String IntToRoman(int num){
        String roman = "";        
        String ded = "";
        IntegerToRoman obj = new IntegerToRoman();
        int l = obj.countDigits(num);

        for(int i = num; i>0; i=i%(int)Math.pow(10, l)){
            l--;           

            int n = i/(int)Math.pow(10, l);

            if(n == 2){
                ded = "1,1";
            }
            else if(n == 3){
                ded = "1,1,1";
            }
            else if(n == 6){
                ded = "5,1";
            }
            else if(n == 7){
                ded = "5,1,1";
            }
            else if(n == 8){
                ded = "5,1,1,1";
            }
            else if(n == 0){
                continue;
            }
            else{
                ded = Integer.toString(n);
            }
            // System.out.println(ded);
            
            String arr[] = ded.split(",");
            
            for(int j = 0; j<arr.length; j++){
                // System.out.print(arr[j] + "\t");
                int prod = Integer.parseInt(arr[j]) * (int)Math.pow(10, l);
                roman = roman + obj.chooseRoman(prod);
            }

        }
        return roman;
    }

    public static void main(String [] args){
        IntegerToRoman obj = new IntegerToRoman();
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter a Number - ");
        int roman = Integer.parseInt(in.nextLine());
        // System.out.println("Roman Equivalent = " + obj.IntToRoman(roman));
        System.out.println(obj.IntToRoman(roman));
    }
}
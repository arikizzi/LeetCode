import java.util.*;

public class RomanToInteger{
    public int RomanToInt(String s){
        s = s + " ";
        int roman = 0;
        int l = s.length();
        for(int i = 0; i<l; i++){
            char x = s.charAt(i);
            if(x == 'I'){
                if(s.charAt(i+1) == 'V'){
                    roman += 4;
                    i++;
                }
                
                else if(s.charAt(i+1) == 'X'){
                    roman += 9;
                    i++;
                }

                else{
                    roman += 1;
                }
            }
            
            else if(x == 'V'){
                roman += 5;
            }
            
            else if(x == 'X'){
                if(s.charAt(i+1) == 'L'){
                    roman += 40;
                    i++;
                }
                
                else if(s.charAt(i+1) == 'C'){
                    roman += 90;
                    i++;
                }
                
                else{
                    roman += 10;
                }
            }

            else if(x == 'L'){
                roman += 50;
            }

            else if(x == 'C'){
                if(s.charAt(i+1) == 'D'){
                    roman += 400;
                    i++;
                }
                
                else if(s.charAt(i+1) == 'M'){
                    roman += 900;
                    i++;
                }
                
                else{
                    roman += 100;
                }
            }

            else if(x == 'D'){
                roman += 500;
            }

            else if(x == 'M'){
                roman += 1000;
            }
            
        }
        return(roman);
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        RomanToInteger obj = new RomanToInteger();
        
        System.out.println("Enter a Roman Numeral - ");
        String roman = in.nextLine();

        System.out.println("Integer Equivalent = " + obj.RomanToInt(roman));

    }
}
//Input a string and check whether it a Anagram or not..
//NOTE : - A string is said to be a Anagram if it is of 
//same length, same characters and 


package String;

import java.util.Scanner;
public class Anagrams {
    
    public static void main(String[] args) {
        //---input string from user--->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String :");
        String str = sc.nextLine();
        System.out.println("Enter the 2st String :");
        String str1 = sc.nextLine();
        boolean isAnagram = false; 
        boolean[] visited = new boolean[str1.length()]; 
        sc.close();

        //---Logic for check string is anagram or not--->

        if(str.length() == str1.length()){ 
            
            for(int i =0 ; i < str.length(); i++){
                char ch = str.charAt(i);
                isAnagram = false;
                for(int j = 0; j < str.length(); j++){
                    if(str1.charAt(j) == ch && !visited[j]){
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram){   //means isAnagram = false;
                    break;
                }
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
}

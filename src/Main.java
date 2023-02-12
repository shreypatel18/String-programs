import java.util.Arrays;

public class Main{
   public static void main(String args[]){
       String sample ="abbbccdee";
       //program to remove duplicates
       duplicate.removeDuplicates(sample);
       //program to print duplicates
       Printduplicates.printDuplicates(sample);
       //program to check palindromes
       Palindrome.palindrome("2552");
       //program to count vowels and consonants , need help if it can be modified to cal special chars like@etc
       CountingSpecialChars.countingSpecialChars1(sample);
       //program to check anagram
       Anagram.checkAnagram("abc", "cab");
       //program to check panagram
       Panagram.checkPanagram("qwertyuiopasdfghjklzxcvbnm");
       //reversing string exp shrey patel to yersh letap preserving position
       ReverseWithPreservingPosition.reverseWithPreservingPosition1("SHREY PATEL");
       //program to sort a string
       SortingString.sort("acbed");
    }
}
class duplicate{


   static void removeDuplicates(String s){
       int [] map = new int[26];
       String Withoutdupicates ="";
        for(int i =0 ; i<s.length(); i++){
            if(map[s.charAt(i)-'a']==0){
                Withoutdupicates += s.charAt(i);
                map[s.charAt(i)-'a']=1;

            }
        }
        System.out.println(Withoutdupicates);
    }
}

class Printduplicates{


    static void printDuplicates(String s){
        int [] map = new int[26];
        int [] mapforduplicates = new int[26];
        String Withoutdupicates ="";
        String duplicates ="";
        for(int i =0 ; i<s.length(); i++){
            if(map[s.charAt(i)-'a']==0){
                Withoutdupicates += s.charAt(i);
                map[s.charAt(i)-'a']=1;

            }else{if(mapforduplicates[s.charAt(i)-'a']==0) {
                duplicates += s.charAt(i);
                mapforduplicates[s.charAt(i)-'a']=1;
            }
            }
        }
        System.out.println(duplicates);
    }
}
class Palindrome{
 static void palindrome(String s ){
     String x  = "";
     for(int i = s.length()-1; i>=0; i--){
         x+= s.charAt(i);
     }
     if(x.equals(s)){
         System.out.println("a palindrome");
     }else{
         System.out.println("not a palindrome");
     }
 }
}
class CountingSpecialChars {
    static void countingSpecialChars1(String s) {
        int [] map = new int[26];
        map[0] = 1;
        map[4] = 1;
        map[8] = 1;
        map[14] = 1;
        map[20] = 1;

        s = s.toLowerCase();
        s.replace(" ","");
        int vowels=0;
        int consonents=0;
        int specialchars=0;

        for (int i = 0; i <s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowels+=1;
            }else if(map[s.charAt(i)-'a']==0){
                consonents+=1;
            }else{
                specialchars+=1;
            }

        }
        System.out.println(vowels+" "+consonents+" "+ specialchars);
    }
}

        class Anagram{

             static void checkAnagram(String s1, String s2){
                 int map1[] = new int[26];
                 String s1x = "";
                 int map2[] = new int[26];
                 String s2x = "";
                 char arr1[] = new char[26];
                 char  arr2[] = new char[26];
                for(int i = 0; i<s1.length(); i++){
                    if(map1[s1.charAt(i)-'a']==0){
                        s1x+=s1.charAt(i);
                        map1[s1.charAt(i)-'a']=1;

                    }
                }
                 for(int i = 0; i<s2.length(); i++){
                     if(map2[s2.charAt(i)-'a']==0){
                         s2x+=s2.charAt(i);
                         map1[s2.charAt(i)-'a']=1;

                     }
                 }
              for(int i = 0; i<s1x.length(); i++){
                  arr1[i]=s1x.charAt(i);
                  arr2[i]=s2x.charAt(i);
              }
              Arrays.sort(arr1);
              Arrays.sort(arr2);
              Boolean m = Arrays.equals(arr1 , arr2);
              System.out.println(m);
            }

        }


class Panagram{

    static void checkPanagram(String s1) {
        int map1[] = new int[26];
        String s1x = "";


        for (int i = 0; i < s1.length(); i++) {
            if (map1[s1.charAt(i) - 'a'] == 0) {
                s1x += s1.charAt(i);
                map1[s1.charAt(i) - 'a'] = 1;

            }
        }
        int temp = 0;
        for (int n : map1){
            if (n == 0) {
                System.out.println("not a PANAGRAM");
                temp = 1;
                break;
            }
    }
            if (temp == 0){
                System.out.println("an panagram");
            }
        }


    }

   class ReverseWithPreservingPosition{
    static void reverseWithPreservingPosition1(String s){
        String[] m = s.split(" ");
String y = "";
        for(String  i : m){
            String x ="";
            for(int j=i.length()-1; j>=0;j--){
                x+=i.charAt(j);
            }
            y+=x;
        }
        System.out.println(y);
    }
   }
   class SortingString {
       static void sort(String s) {
           int[] map = new int[26];
           char[] map2 = new char[26];

           for (int i = 0; i < s.length(); i++) {
               if (map[s.charAt(i) - 'a'] == 0) {
                   map2[s.charAt(i) - 'a']+= s.charAt(i);
                   map[s.charAt(i) - 'a'] = 1;

               }
           }
           String x ="";
           for(int i = 0 ; i<map2.length; i++){
              x += map2[i];
           }
           System.out.println(x);
       }

   }
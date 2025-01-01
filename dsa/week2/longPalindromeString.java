/* Brute Force Approach*/
class longestPalindromeString {
    public static boolean isPalindrome(String s){
        int start = 0;
        int end   = s.length()-1;

        while( start <= end ){
            if( s.charAt(start) != s.charAt(end) )
                return false;
            start+=1;
            end-=1;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        
        String result="";
        int maxsize = 0;
        int size = s.length();
        int start = 0;
        int subindex;

        for( ;start < size; start++ ){
                String subString = "";
            for( subindex=start; subindex < size; subindex++ ){
                subString += s.charAt(subindex);
                int lenSubString = subString.length();
                if( isPalindrome(subString) && lenSubString > maxsize ){
                    result= s.substring(start,subindex+1);;
                    maxsize=lenSubString;
                }
            }
        }

        return result;
    }

}

// Efficent Approach

class EfficentSolution {
    public String longestPalindrome(String s) {
    // odd palindrome checker
            String maxOddString="";
            int index = 0;
            int maxOddLength = 0;
            int size = s.length();

            for(; index < size ; index++ ){

                int before = index-1;
                int after = index+1;

                int currLength=1;
                while( before >= 0 && after < size &&  s.charAt(after) == s.charAt(before) ){
                        before-=1;
                        after+=1;
                        currLength+=2;
            }
              if( currLength > maxOddLength ){
                maxOddString = s.substring(before+1,after);
                maxOddLength=currLength;
              }
            
            }

            index = 0;
            int maxEvenLength=0;
            String maxEvenString="";

            for(; index < size-1 ; index++ ){ //size-1 as we are going index and index+1
                int before = index;
                int after  = index+1;
                int count=0;
                while( before >= 0 && after < size && s.charAt(after) == s.charAt(before) ){
                        before-=1;
                        after+=1;
                        count+=2;
                    }
                if( count > maxEvenLength ){
                    maxEvenString = s.substring(before+1,after);
                    maxEvenLength = count;
                }    
            }

       if(maxOddLength > maxEvenLength){
         return maxOddString;
       }
       return maxEvenString;
    } 
}
    
/* 
BruteForce : Find All the substring and then find biggest palindrome Among them
 babad
 b
 ba
 bab
 babad

 a
 ab
 aba
 abad

 b
 ba
 bad

 a
 ad
 d

 out of them find the palindromes and then return the biggest One
 Time complexity : o(n^3)
 space Complexity : o(n)

*/

/* Efficent Approach
 split string into even and odd based palindromes and find the bigger one
 lossing for the single case : ac,a 
 solution : first check valid case and then after exited while loop then check the case

Time complexity : o(n^2)

*/

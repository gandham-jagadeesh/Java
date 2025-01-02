public class BasicString{
    public static String[] shortForm(String names[]){
        String[] upper = new String[names.length];
        int count = 0;
        for(String str:names){
            int middle = str.indexOf(" ");
            if(middle == -1){
                char firstLetter = str.charAt(0);
                char captializeLetter = Character.toUpperCase(firstLetter);
                String newOne = captializeLetter + str.substring(1);
                upper[count] = newOne;
                count+=1;
            }
            else{
                int totalLength = str.length();
                String newString = "";
                String[] splitted = str.split(" ");
                for(String word:splitted){
                    char firstLetter = word.charAt(0);
                    char captializeLetter = Character.toUpperCase(firstLetter);
                    String newOne = captializeLetter + word.substring(1);
                    newString+=" "+newOne;
                }
                upper[count] = newString;
                count+=1;
            }
        }
        return upper;
    }


    public static void main(String args[]){
        String[] names = {"Sachin thomas","Andrea sen","sai karthik","Rogan raj","zzzzzzzzzzzzzzzzzzzzzzzzz","gandham jagadeesh solved"};
        String[] newOnes = shortForm(names);
        for(String each:newOnes){
            System.out.println(each);
        }
        String biggerOne = names[0];
        for(String str : names){
            if(str.compareTo(biggerOne)  > 0){
                biggerOne=str;
            }
        }
      System.out.println(biggerOne);

    }
}


/*
 String builder : thread sage
 String buffer  : not thread safe
 String  pool 
 immutable vs mutable
*/
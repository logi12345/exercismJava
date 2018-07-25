class ReverseString {


    String reverse(String inputString) {
         if (inputString.isEmpty()) {
             return "";
         }

         else{
             char [] letters = inputString.toCharArray();
             char [] reversed = new char [inputString.length()];
             int currentIndex = inputString.length() - 1;

             for (char x : letters) {
                 if (currentIndex >= 0) {
                     reversed[currentIndex] = x;
                     currentIndex--;
                 }
             }
             String a = new String(reversed);
             return a;
         }

    }
  
}
public class PangramChecker {

  public boolean isPangram(String input) {
        int lettersPresent = 0;
        String inputLC = input.toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {
            if(inputLC.contains(String.valueOf(i))) {  //returns index of char in input. Returns -1 if not found
                lettersPresent++;
            }
        }

        if (input.equals("") || lettersPresent != 26) {
            return false;
        }

        else { return true; }

     }

}

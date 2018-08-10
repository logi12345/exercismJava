

class IsbnVerifier {


    public static void main(String[] args){
        System.out.println(isValid("3-598-21508-8")); //all true
        isValid("3598215088");
        isValid("359821507X");
        isValid("3-598-21507-X");
    }

    /**
     * Checks if ISBN entered is valid.
     * @param x
     * @return boolean
     */
    static boolean isValid(String x){

        //split the original string inorder to remove the dashes.
        String[] temp = x.split("-");

        //join the string back together.
        x = String.join("",temp);

        //ISBN length is always 10 so create array of size 10.
        String[] isbn = new String[10];

        //Loop through the array and take each character convert to String and check if it is valid
        for (int i=0; i<x.length(); i++ ){
            char c = x.charAt(i);
            String b= Character.toString(c);
            if ((i!=9) && !b.equalsIgnoreCase("x") ){
                isbn[i] = b;
            }
            //If there is an x at the end of the series add to 10 the array
            else if ((i==9)) {
                if(b.equalsIgnoreCase("x")){
                    isbn[i] = "10";
                }
                else{
                    isbn[i]=b;
                }
            }
            else
            {

                return false;
            }
        }
       return calculateISBN(isbn);
    }

    /**
     * Check if ISBN is Valid.
      * @param isbn
     * @return boolean
     */
    static boolean calculateISBN(String[] isbn)
    {
        //convert String Arrray into string of numbers.
        int[] intISBN= new int[isbn.length];
        int i=0;
        for(String str:isbn){
            intISBN[i]=Integer.parseInt(str);
            i++;
        }

       return (intISBN[0] * 10 + intISBN[1] * 9 + intISBN[2] * 8 + intISBN[3] * 7 + intISBN[4] * 6 + intISBN[5]  * 5 + intISBN[6]  * 4 + intISBN[7]  * 3 + intISBN[8]  * 2 + intISBN[9] * 1)%11 == 0;
    }


}




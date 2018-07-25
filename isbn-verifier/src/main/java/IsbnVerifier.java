class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        char[] x = stringToVerify.toCharArray();
        char[] y = new char[10];
            int index = 0;
        for(int i = 0; i < x.length; i++) {
            if(x[i] != '-') {
                y[index] = x[i];
                index++;
            }
        }

        if(((y[0] * 10 + y[1] * 9 + y[2] * 8 + y[3] * 7 + y[4] * 6 + y[5] * 5 + y[6] * 4 + y[7] * 3 + y[8] * 2 + y[9] * 1) % 11) == 0) {
            return true;
        }

        else { return false;}
    }

}

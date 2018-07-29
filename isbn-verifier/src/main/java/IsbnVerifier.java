class IsbnVerifier {
    boolean verified;

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replaceAll("-", "");


        if (stringToVerify.length() != 10) {
            verified = false;
        }

        else {
            char[] x = stringToVerify.toCharArray();
            int[] y = new int[10];

                for (int i = 0; i < 9; i++) {
                    if (stringToVerify.charAt(i) < 0 || stringToVerify.charAt(i) > 9) {
                        verified = false;
                    }

                    if(verified != false){

                        if (stringToVerify.charAt(9) < 0 || stringToVerify.charAt(9) > 9 || stringToVerify.charAt(9) == 'X') {
                            verified = false;
                        }

                        else if (((y[0] * 10 + y[1] * 9 + y[2] * 8 + y[3] * 7 + y[4] * 6 + y[5] * 5 + y[6] * 4 + y[7] * 3 + y[8] * 2 + y[9]) % 11) != 0) {
                            verified = false;
                        }
                    }
                }
            }
        return verified;
        }
}



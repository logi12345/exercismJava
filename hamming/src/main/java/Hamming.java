class Hamming {
    int hammingDistance = 0;

    Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        char [] leftS = leftStrand.toCharArray();
        char [] rightS = rightStrand.toCharArray();

        if (leftS.length != rightS.length) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        else{
            for (int i = 0; i < leftS.length; i++){
                if (leftS[i] != rightS[i]) {
                    hammingDistance++;
                }
            }
        }

    }

    int getHammingDistance() {
        return hammingDistance;
    }

}

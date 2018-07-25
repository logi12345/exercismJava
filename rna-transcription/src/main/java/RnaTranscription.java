class RnaTranscription {

    String transcribe(String dnaStrand) {

        char [] nucleotides = dnaStrand.toCharArray();
        char [] dnaNucleotides = new char [nucleotides.length];

        for (int i=0; i < nucleotides.length; i++) {
            if (nucleotides[i] == 'G') {
                dnaNucleotides[i] = 'C';
            }

            if (nucleotides[i] == 'C') {
                dnaNucleotides[i] = 'G';
            }

            if (nucleotides[i] == 'T') {
                dnaNucleotides[i] = 'A';
            }

            else if (nucleotides[i] == 'A') {
                dnaNucleotides[i] = 'U';
            }
        }
        String temp = new String (dnaNucleotides);
        return temp;
    }

}

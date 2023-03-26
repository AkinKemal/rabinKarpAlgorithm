public class RabinKarpAlgorithm {

    public final static int numberOfCharacters = 10;

    public void search(String pattern, String txt) {

        int lengthOfTheText = txt.length();
        int lengthOfThePattern = pattern.length();
        int modulus = 19;

        int tmp;
        tmp = (int) Math.pow(numberOfCharacters, lengthOfThePattern - 1);

        int hashValuePattern = 0, hashValueTxt = 0;

        long getStartTime = System.currentTimeMillis();//başlangınç zamanını tutmak için


        // pattern ve text için hash hesaplama
        for (int i = 0; i < lengthOfThePattern; i++) {
            hashValuePattern = (numberOfCharacters * hashValuePattern + pattern.charAt(i)) % modulus;
            hashValueTxt = (numberOfCharacters * hashValueTxt + txt.charAt(i)) % modulus;
        }

        // match bulma
        for (int i = 0; i <= lengthOfTheText - lengthOfThePattern; i++) {
            if (hashValuePattern == hashValueTxt) {
                int j;
                for (j = 0; j < lengthOfThePattern; j++) {
                    if (txt.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == lengthOfThePattern) {
                    System.out.println("Pattern is found at position: " + (i + 1));
                }
            }
            if (i < lengthOfTheText - lengthOfThePattern) {
                hashValueTxt = (numberOfCharacters * (hashValueTxt - txt.charAt(i) * tmp) + txt.charAt(i + lengthOfThePattern)) % modulus;
                if (hashValueTxt < 0) {
                    hashValueTxt = (hashValueTxt + modulus);
                }
            }
        }
        long getEndTime = System.currentTimeMillis();//bitiş zamanını tutmak için
        long getEstimatedTime = getEndTime - getStartTime;
        double getTotalTime = (double) getEstimatedTime / 1000;
        System.out.println("Time: " + getTotalTime + " seconds");
    }
}
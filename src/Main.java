public class Main {

    public static void main(String[] args) {
        RabinKarpAlgorithm rabinKarpAlgorithm = new RabinKarpAlgorithm();
        String txt = "AABBAKDTTYYASDERTYEGHJJKOPLAKDJHGBNMCDRDEDFYTBHGYUIOPAKDDSESWSDSEDCBUJKOEDWSXRTGJKUGTILKPLŞKASDERTYUIOPLKJHGFDCVBNMKLOIUYTREDFGBVCXSAQWERFGYHAKDSEDFGTHUJKIOLJUYHGQASDFGHJUYTGBNHJKIOLAKDEEEEFTYHUJOHHGFGJJKKLLDMNVBYVTFRDXXTU";
        String pattern = "AKD";
        rabinKarpAlgorithm.search(pattern, txt);
    }
}
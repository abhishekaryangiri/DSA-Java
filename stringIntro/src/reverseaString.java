public class reverseaString {
    public static void main(String[] args) {
        String str = "AbhishekAryanGiri", rvrs = "";

        char ch;

        System.out.println("Original Word: AbhishekAryanGiri");

        for (int i=0; i<str.length(); i++ ) {
            ch = str.charAt(i); //extracts each char
            rvrs =  ch + rvrs; //add each char in front of the exit
        }
        System.out.println("Reversed Word: " + rvrs);
    }
}

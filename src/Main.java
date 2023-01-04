public class Main {
    public static void main(String[] args) {

        StringBuilder pwd = new StringBuilder();
        int random;

        while (pwd.length() < 8) {
            random = (int) (Math.random() * 128);
            if (random <= 90 && random >= 65 || random <= 122 && random >= 97 || random <= 57 && random >= 48) {
                char zeichen = (char) random;
                pwd.append(zeichen);
            }
        }
        System.out.println("Dein Password lautet: " + pwd);
    }
}

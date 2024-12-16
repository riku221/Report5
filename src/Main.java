public class Main {
    public static void main(String[] args) throws Exception {
        String str = null;

        try {
            System.out.println((str.length()));
        } catch (NullPointerException e) {
            System.out.println("エラー〜");
            System.out.println("エラー" + e.getMessage());
        }
    }
}

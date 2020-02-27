public class Applications {

    public static void main(String[] args) {
        Runner runner = new Runner();

        try {
            runner.run();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
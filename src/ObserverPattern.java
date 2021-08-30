
public class ObserverPattern {
    public static void main(String[] args) {
        Observeble observeble = new Observeble();

        new Observer(observeble);
        new Observer(observeble);
        new Observer(observeble);
        new Observer(observeble);

        observeble.setNews("news 1");
        observeble.setNews("news 2");
    }
}
import Observeble.Observeble;
import Observer.Observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Observeble observeble = new Observeble();

        Observer o1 = new Observer(observeble);
        Observer o2 = new Observer(observeble);
        Observer o3 = new Observer(observeble);
        Observer o4 = new Observer(observeble);

        observeble.setUpdate("news 1");
        observeble.remove(o1);
        observeble.setUpdate("news 2");
        observeble.remove(o2);
        observeble.remove(o3);
        observeble.remove(o4);
    }
}

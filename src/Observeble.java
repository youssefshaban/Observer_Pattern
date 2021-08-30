import java.util.ArrayList;
import java.util.List;

public class Observeble implements IObserveble {
    private List<Observer> observers = new ArrayList<Observer>();
    private String news;
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void update() {
        for (Observer observer : observers) {
            observer.update();
        }

    }
    public String getUpdate(){
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        update();
    }
}

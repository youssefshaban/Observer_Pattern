public interface IObserveble {
    public void register(Observer observer);
    public void remove(Observer observer);
    public void update();


}

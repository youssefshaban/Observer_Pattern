public class Observer implements IObserver{
    private Observeble observeble;

    public Observer(Observeble observeble){
        this.observeble=observeble;
        this.observeble.register(this);
    }
    @Override
    public void update() {
        System.out.println(observeble.getUpdate());
    }
}

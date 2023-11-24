public interface Quackable extends QuackObservable {
    void quack();
    void registerObserver(Observer observer);
    void notifyObservers();
}







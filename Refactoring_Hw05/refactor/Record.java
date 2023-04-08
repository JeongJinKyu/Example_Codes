package Refactoring_Hw05.refactor;

import java.util.ArrayList;
import java.util.List;

public abstract class Record {
    private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함
    private static List<Observer_Data> observers = new ArrayList<Observer_Data>();

    public void addScore(int score) { // 새로운 점수를 추가함
        scores.add(score); // scores 목록에 주어진 점수를 추가함
        Record.notifyObserver(); // scores가 변경됨을 통보함
    }
    public void attach(Observer_Data observer){
        observers.add(observer);
    }
    public void detach(Observer_Data observer){
        observers.remove(observer);
    }
    public static void notifyObserver(){
        for(Observer_Data observer : observers){
            observer.update();
        }
    }
}

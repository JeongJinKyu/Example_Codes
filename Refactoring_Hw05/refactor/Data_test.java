package Refactoring_Hw05.refactor;

import java.util.Arrays;

public class Data_test {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = ScoreRecord.getInstance();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.addScore(10);
        scoreRecord.attach(minMaxView);
        System.out.println("attach 하기");
        scoreRecord.addScore(20);
        scoreRecord.addScore(30);
        System.out.println("update 하기");
        minMaxView.update();
        scoreRecord.addScore(40);
        dataSheetView.update();
        scoreRecord.addScore(50);
        System.out.println("minmaxView update 하기");
        minMaxView.update();
}
}

package Refactoring_Hw05.refactor;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Record {
	private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함
	private static ScoreRecord instance = new ScoreRecord();
	private ScoreRecord() {}
	public static ScoreRecord getInstance() {
        return instance;
    }

	public void addScore(int score) { // 새로운 점수를 추가함
		scores.add(score); // scores 목록에 주어진 점수를 추가함
		Record.notifyObserver(); // scores가 변경됨을 통보함
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}

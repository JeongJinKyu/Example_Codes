package before;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String nm;
	private List<Integer> scores = new ArrayList<>() ;
	
	public Student(String name) {
		super();
		this.nm = name;
	}
	public String getName() {
		return nm;
	}
	public void setName(String name) {
		this.nm = name;
	}
	public List<Integer> GetScore() {
		return scores;
	}
	public void SetScore(List<Integer> scores) {
		this.scores = scores;
	}
}

package after;

public class PuzzleBuilder {
	private Word[] words;
	private int index;

	private String puzzle_name;

	public PuzzleBuilder(String puzzle_name, int size) {
		this.puzzle_name = puzzle_name;
		this.words = new Word[size];
		index = 0;
	}

	public int getSize() {
		return index;
	}

	public int addWord(Word add_word) {
		for (int i = 0; i < index; i++)
			if (add_word.is_equal_word(words[i]) || add_word.is_there_cross_word(words[i]))
				return -1;
		words[index++] = add_word;
		return 0;
	}

	public int getWordPosition(int coord, String value, Direction dir) {
		for (int i = 0; i < index; i++) {
			if (words[i].getword().compareTo(value) == 0 && words[i].getWord_positions().getDirection().equals(dir)) {
				if (coord == 0)
					return words[i].getWord_positions().getY_coordinate_of_word();
				else
					return words[i].getWord_positions().getY_coordinate_of_word();
			}
		}

		return -1;
	}

	public int getTotalPoint() {
		int totalPoint = 0;
		for (int i = 0; i < index; i++) {
			totalPoint += words[i].calculatePoint();
		}
		return totalPoint;
	}

	public String getShortReport(Report report) {
		String value;
		if (report.isHTML()) {
			value = "<H1> Report on Puzzle <EM> " + puzzle_name + "</EM></H1>\n";
		} else {
			value = "Report on Puzzle " + puzzle_name + "\n";
		}
		int total_point = getTotalPoint();
		for (int i = 0; i < index; i++) {
			int result = words[i].calculatePoint();
			if (report.isHTML())
				value += "\tWord: <B>" + words[i].getword() + "</B>\tPoint: <B> " + result + "</B>\n";
			else
				value += "\tWord: " + words[i].getword() + "\tPoint: " + result + "\n";
		}
		if (report.isHTML()) {
			value += "<HR> Total Point: <B>" + total_point + "</B><P>\n";
		} else {
			value += "Total Point: " + total_point + "\n";
		}
		return value;
	}

	public String getFullReport(boolean isHTML) {
		String value;
		if (isHTML) {
			value = "<H1> Report on Puzzle <EM> " + puzzle_name + "</EM></H1>\n";
		} else {
			value = "Report on Puzzle " + puzzle_name + "\n";
		}
		int point = 0;
		for (int i = 0; i < index; i++) {
			int result;
			if (words[i].getWord_positions().isHorzontal())
				result = words[i].getword().length();
			else
				result = words[i].getword().length() * 2;

			if (isHTML)
				value += "\tWord: <B>" + words[i].getword() + "\tPosition: [" + words[i].getWord_positions().getY_coordinate_of_word() + ", " + words[i].getWord_positions().getY_coordinate_of_word() + "]" + "\tDir: " + words[i].getWord_positions().getDirection()
						+ " </B> Point: <B> " + result + "</B>\n";
			else
				value += "\tWord: " + words[i].getword() + "\tPosition: [" + words[i].getWord_positions().getY_coordinate_of_word() + ", " + words[i].getWord_positions().getY_coordinate_of_word() + "]" + "\tDir: " + words[i].getWord_positions().getDirection()
						+ " Point: " + result + "\n";

			point += result;
		}
		if (isHTML) {
			value += "<HR> Total Point: <B>" + point + "</B><P>\n";
		} else {
			value += "Total Point: " + point + "\n";
		}
		return value;
	}
}

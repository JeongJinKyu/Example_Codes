package after;

public class PuzzleBuilder {
	private String[] values;
	private Position[] word_positions;
	private int index;

	private String puzzle_name;

	public PuzzleBuilder(String puzzle_name, int size) {
		this.puzzle_name = puzzle_name;
		values = new String[size];
		word_positions = new Position[size];
		index = 0;
	}

	public int getSize() {
		return index;
	}

	public int addWord(String value, Position word_position) {
		for (int i = 0; i < index; i++) {
			if (values[i].compareTo(value) == 0 && word_positions[i].getDirection() == word_position.getDirection())
				return -1;
		}
		boolean result = false;
		for (int i = 0; i < index; i++) {
			if (word_positions[i].isHorzontal()) { // ����
				if (word_position.isHorzontal()) { // ����
					if (ys[i] == y && ((x >= xs[i] && x <= xs[i] + values[i].length())
							|| (x + value.length() >= xs[i] && x + value.length() <= xs[i] + values[i].length()))) {
						result = true;
						break;
					}
				} else { // ����
					if (x >= xs[i] && x <= xs[i] + values[i].length() && ys[i] >= y && ys[i] <= y + value.length()) {
						result = true;
						break;
					}
				}
			} else { // ����
				if (word_position.isHorzontal()) { // ����
					if (xs[i] >= x && xs[i] <= x + value.length() && y >= ys[i] && y <= ys[i] + values[i].length()) {
						result = true;
						break;
					}
				} else { // ����
					if (xs[i] == x && ((y >= ys[i] && y <= ys[i] + values[i].length())
							|| (y + value.length() >= ys[i] && y + value.length() <= ys[i] + values[i].length()))) {
						result = true;
						break;
					}
				}
			}
		}
		if (result)
			return -2;

		values[index] = value;
		xs[index] = x;
		ys[index] = y;
		word_positions[index] = word_position.getDirection();

		index++;
		return 0;
	}

	public int getWordPosition(int coord, String value, int dir) {
		for (int i = 0; i < index; i++) {
			if (values[i].compareTo(value) == 0 && dirs[i] == dir) {
				if (coord == 0)
					return xs[i];
				else
					return ys[i];
			}
		}

		return -1;
	}

	public int getPoint() {
		int totalPoint = 0;
		for (int i = 0; i < index; i++) {
			int point;
			if (dirs[i] == 0)
				point = values[i].length();
			else
				point = values[i].length() * 2;

			totalPoint += point;
		}
		return totalPoint;
	}

	public String getShortReport(boolean isHTML) {
		String value;
		if (isHTML) {
			value = "<H1> Report on Puzzle <EM> " + puzzle_name + "</EM></H1>\n";
		} else {
			value = "Report on Puzzle " + puzzle_name + "\n";
		}
		int point = 0;
		for (int i = 0; i < index; i++) {
			int result;
			if (dirs[i] == 0)
				result = values[i].length();
			else
				result = values[i].length() * 2;

			if (isHTML)
				value += "\tWord: <B>" + values[i] + "</B>\tPoint: <B> " + result + "</B>\n";
			else
				value += "\tWord: " + values[i] + "\tPoint: " + result + "\n";

			point += result;
		}
		if (isHTML) {
			value += "<HR> Total Point: <B>" + point + "</B><P>\n";
		} else {
			value += "Total Point: " + point + "\n";
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
			if (dirs[i] == 0)
				result = values[i].length();
			else
				result = values[i].length() * 2;

			if (isHTML)
				value += "\tWord: <B>" + values[i] + "\tPosition: [" + xs[i] + ", " + ys[i] + "]" + "\tDir: " + dirs[i]
						+ " </B> Point: <B> " + result + "</B>\n";
			else
				value += "\tWord: " + values[i] + "\tPosition: [" + xs[i] + ", " + ys[i] + "]" + "\tDir: " + dirs[i]
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

package before;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Command {
	QUIT(0),
	ADD_STUDENT(1),
	ADD_SCORE(2),
	SHOW_STDUENT(3),
	CLEAR_STUDENT_SCORE(4),
	INIT_STUDENT(-1);

	private final int index;

	Command(int index){
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}
}

public class ScoreReportMain {
	private static Scanner scanner = new Scanner(System.in) ;
	private List<Student> studentlist = new ArrayList<Student>();
	private final String PROMPT_MSG_FOR_STUDENT = "Enter student name: ";

	public static void main(String[] args) {
		ScoreReportMain ui = new ScoreReportMain() ;

		boolean isQuit = false ;

		while ( ! isQuit ) {
			ui.showCommand();
			Command command = ui.getCommand();

			switch ( command ) {
				case QUIT: isQuit = true ; break ;
				case ADD_STUDENT: ui.add("student") ; break ;
				case ADD_SCORE: ui.add("scores") ; break ;
				case SHOW_STDUENT: ui.showStudentReport() ; break ;
				case CLEAR_STUDENT_SCORE: ui.closeSudentScs() ; break ;
				case INIT_STUDENT: ui.init() ; break ;
				default: break ;
			}
		}
		System.out.println("Bye");
	}
	private Command getCommand() {
		int inputCommand = scanner.nextInt();
		for(Command command: Command.values()) {
			if(command.getIndex() == inputCommand) {
				return command;
			}
		}
		return null;

	}
	private void showCommand() {
		System.out.println("\nSelect a command !");
		System.out.println("\t -1. Init");
		System.out.println("\t 0. Quit");
		System.out.println("\t 1. Add student");
		System.out.println("\t 2. Add scores");
		System.out.println("\t 3. Show student report");
		System.out.println("\t 4. Clear student scores");
	}
	private void init() {
		Student james = new Student("James") ;
		james.GetScore().add(20) ;
		james.GetScore().add(10) ;

		Student brown = new Student("Brown") ;
		brown.GetScore().add(30) ;
		brown.GetScore().add(10) ;
		brown.GetScore().add(20) ;
		brown.GetScore().add(60) ;
		brown.GetScore().add(50) ;

		studentlist.add(james) ;
		studentlist.add(brown) ;
	}
	private void closeSudentScs() {
		System.out.println("Enter student name: ");
		String n1 = scanner.next() ;
		//찾는 학생임을 확인 하는 함수 boolean isTargetedStudent()
		for ( Student st : studentlist ) {
			if ( st.getName().equals(n1)) {
				st.GetScore().clear();
				System.out.println("Score cleared");
				break;
			}
		}
	}
	private void showStudentReport() {
		System.out.println("Enter student name: ");
		String n1 = scanner.next() ;
		for ( Student st : studentlist ) {
			if ( st.getName().equals(n1)) {
				//student 를 받아 학생의 점수 합을 리턴하는 함수 sumOfScores()
				int s = 0 ;
				for ( Integer i: st.GetScore()) {
					System.out.print(i + " ");
					s += i ;
				}
				System.out.println("Sum: " + s);
				break;
			}
		}
	}

	private void addStudent() {
		String studentName = getStduetnName(PROMPT_MSG_FOR_STUDENT, new isValidName(){
			@Override
			public boolean validTest(String name) {
				return true;
			}
		});
		/**
		 * **/
		Student newStudent = new Student(studentName);
		studentlist.add(newStudent);
	}
	private void addScores() {

	}

	// student,score 입력 함수 분리 필요
	private void add(String kind) {
		if ( kind.equals("student") ) {
			System.out.println("Enter student name: ");
			String n = scanner.next() ;
			Student s = new Student(n) ;
			studentlist.add(s) ;
		}
		else {
			System.out.println("Enter student name: ");
			String n1 = scanner.next() ;
			for ( Student st : studentlist ) {
				if ( st.getName().equals(n1)) {
					System.out.println("Enter scores( -1 for quit): ") ;
					while ( true ) {
						int n2 = scanner.nextInt() ;
						if ( n2 == -1 ) break ;

						st.GetScore().add(n2) ;
					}
					break;
				}
			}
		}
	}

	private String getStduetnName(final String prompt, isValidName isvalid) {

		String studentName = scanner.next();
		if(isvalid.validTest(studentName)) {
			return studentName;
		}else {
			return null;
		}
	}
	public interface IsValidScore {
		boolean validTest(int score);
	}
	public interface isValidName {
		boolean validTest(String name);
	}
}
import java.io.Serializable;
import java.util.Scanner;

class Quiz implements Serializable {
    private static final long serialVersionUID = 1L;

	//objects
	Service service = new Service();
    Scanner scan;

    public Quiz() {
        scan = new Scanner(System.in);
    }
	//variables
    private String category;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int correctAnswer;
	//constructures
	public Quiz(String category, String question, String option1, String option2, String option3, String option4, int correctAnswer) {
        this.category = category;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
	}
    // Getters and setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

	public Quiz createQuiz() {

		service.cleanScreen();
        System.out.println(category);
		//get question
		System.out.println("Enter the question: ");
		String question = scan.nextLine();

		scan.nextLine(); // Consume newline

		// Get the options
		System.out.println("Enter Option 1: ");
		String option1 = scan.nextLine();

        System.out.println("Enter Option 2: ");
		String option2 = scan.nextLine();

        System.out.println("Enter Option 3: ");
		String option3 = scan.nextLine();

        System.out.println("Enter Option 4: ");
		String option4 = scan.nextLine();

		// Get the answer
		System.out.print("Enter the correct option number (1 to 4 ): ");
		int correctAnswer = scan.nextInt();

		return new Quiz(category,question, option1, option2, option3, option4, correctAnswer);

	}

}

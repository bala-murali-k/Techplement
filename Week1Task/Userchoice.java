
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Userchoice {

	private Service service;
    Scanner scan;

    public Userchoice(Service service) {
		this.service = service;
        scan = new Scanner(System.in);
    }

 	public int createOrPlay() {
		service.cleanScreen();
		service.displayFrame("User Defined","",new String[]{"1.Create a quiz.","2.Play a quiz","Choose an option...."},0,"");
		System.out.println("\nEnter Your choice: ");
		int create_or_play = scan.nextInt();
		if(create_or_play != 1 && create_or_play != 2) {
			service.cleanScreen();
			createOrPlay();
		}
		return create_or_play;
	}

	public void displayQuestion(List<Quiz> data, int score) {
		for(Quiz selectedCategory: data) {
			service.cleanScreen();
			service.displayFrame(selectedCategory.getCategory(),selectedCategory.getQuestion(),new String[]{selectedCategory.getOption1(),selectedCategory.getOption2(),selectedCategory.getOption3(),selectedCategory.getOption4()},score,"");
			System.out.println("Your answer: ");
			int user_answer = scan.nextInt();
			if(user_answer == selectedCategory.getCorrectAnswer()) {
				score++;
			}
			user_answer = 0;
		}
	}

	public List<Quiz> userInput() {
		List<Quiz> userQuestions = new ArrayList<>();
		scan.nextLine();  // Consume newline
        for (int i = 0; i < 10; i++) {
            service.cleanScreen();
			String category = "User Defined";
            System.out.print("\nEnter question: ");
            String question = scan.nextLine();
            System.out.print("\nEnter option 1: ");
            String option1 = scan.nextLine();
            System.out.print("\nEnter option 2: ");
            String option2 = scan.nextLine();
            System.out.print("\nEnter option 3: ");
            String option3 = scan.nextLine();
            System.out.print("\nEnter option 4: ");
            String option4 = scan.nextLine();
            System.out.print("\nEnter correct answer (1-4): ");
            int correctAnswer = scan.nextInt();
            scan.nextLine();  // Consume newline

			Quiz entry = new Quiz(category, question, option1, option2, option3, option4, correctAnswer);
            userQuestions.add(entry);
		}
		return userQuestions;
	}

	public int testDisplay(Quiz data,int score) {
		service.cleanScreen();
		service.displayFrame(data.getCategory(),data.getQuestion(),new String[]{data.getOption1(),data.getOption2(),data.getOption3(),data.getOption4()},score,"");
		System.out.println("\nEnter Your Answer (1-4): ");
		int user_answer = scan.nextInt();
		return user_answer;
	}

}

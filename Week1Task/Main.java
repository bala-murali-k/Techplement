import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String args[]) {
	
		Service service = new Service();
        Userchoice userChoice = new Userchoice(service);
        service.setUserChoice(userChoice);

		//Service service = new Service();
		//Userchoice main_user_choice = new Userchoice();
		Scanner scan = new Scanner(System.in);
		int score = 0,counter = 0;
		String result = "";

		service.cleanScreen();			//clear the screen
		service.Welcome();			//print welcome screen
		service.pressAnyKey();			//press enter to continue
		service.cleanScreen();
		while(true){
			service.cleanScreen();
			int category_choice = service.selectCategory();
			switch(category_choice) {
				case 1:
					score = 0; counter = 0;
					ArrayList<Quiz> programming_move_data = service.userSelectedCategory("Programming");
					for(Quiz test: programming_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					service.lastMessage(score);
					break;

				case 2:
					score = 0; counter = 0;
					ArrayList<Quiz> physics_move_data = service.userSelectedCategory("Physics");
					for(Quiz test: physics_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;

				case 3:
				score = 0; counter = 0;
					ArrayList<Quiz> chemistry_move_data = service.userSelectedCategory("Chemistry");
					for(Quiz test: chemistry_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;

				case 4:
				score = 0; counter = 0;
					ArrayList<Quiz> biology_move_data = service.userSelectedCategory("Biology");
					for(Quiz test: biology_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;

				case 5:
				score = 0; counter = 0;
					ArrayList<Quiz> english_move_data = service.userSelectedCategory("English");
					for(Quiz test: english_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;

				case 6:
				score = 0; counter = 0;
					ArrayList<Quiz> maths_move_data = service.userSelectedCategory("Maths");
					for(Quiz test: maths_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;

				case 7:
				score = 0; counter = 0;
					ArrayList<Quiz> gk_move_data = service.userSelectedCategory("General Knowledge");
					for(Quiz test: gk_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;

				case 8:
				score = 0; counter = 0;
					ArrayList<Quiz> cs_move_data = service.userSelectedCategory("Computer Science");
					for(Quiz test: cs_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;

				case 9:
				score = 0; counter = 0;
					ArrayList<Quiz> geography_move_data = service.userSelectedCategory("Geography");
					for(Quiz test: geography_move_data) {
						if (counter == 10) break; 
						int user_answer = userChoice.testDisplay(test,score);
						score = (user_answer == test.getCorrectAnswer())?score+1:score;
						System.out.println(test.getCorrectAnswer());
						System.out.println("\n");
						counter++;
					}
					result = service.lastMessage(score);
					service.cleanScreen();
					service.displayFrame("Result", "", new String[0], score, result);
					break;
 
				case 10:
					score = 0; counter = 0;
					int create_or_play = userChoice.createOrPlay();
					if (create_or_play == 2) {
						ArrayList<Quiz> ud_move_data = service.userSelectedCategory("User Defined");
						for(Quiz test: ud_move_data) {
							if (counter == 10) break; 
							int user_answer = userChoice.testDisplay(test,score);
							score = (user_answer == test.getCorrectAnswer())?score+1:score;
							System.out.println(test.getCorrectAnswer());
							System.out.println("\n");
							counter++;
						}
						result = service.lastMessage(score);
						service.cleanScreen();
						service.displayFrame("Result", "", new String[0], score, result);
					} else {
						List<Quiz> input_data = userChoice.userInput();
						for(Quiz input: input_data) {
							service.appendData(input.getCategory(), input.getQuestion(), input.getOption1(), input.getOption2(), input.getOption3(), input.getOption4(), input.getCorrectAnswer());
						}
						while(create_or_play == 1) {
							create_or_play = userChoice.createOrPlay();
						}
						ArrayList<Quiz> ud_move_data = service.userSelectedCategory("User Defined");
						for(Quiz test: ud_move_data) {
							if (counter == 10) break; 
							int user_answer = userChoice.testDisplay(test,score);
							score = (user_answer == test.getCorrectAnswer())?score+1:score;
							System.out.println(test.getCorrectAnswer());
							System.out.println("\n");
							counter++;
						}
						result = service.lastMessage(score);
						service.cleanScreen();
						service.displayFrame("Result", "", new String[0], score, result);
					}
					break;


				default:
					System.out.println("Enter the correct value....");
			}
			System.out.println("\nPress any key to continue...");
			System.out.println("If you want to quit press N/No...");
			String quit_choice = scan.nextLine().trim().toLowerCase();
			if(quit_choice.equals("no") || quit_choice.equals("n")) break;
			
		}
		service.cleanScreen();
		scan.close();
		// service.txtToDat();
	}
}

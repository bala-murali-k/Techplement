import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Service {

	private Userchoice userChoice;

    public void setUserChoice(Userchoice userChoice) {
        this.userChoice = userChoice;
    }
    Scanner scan;

    public Service() {
        scan = new Scanner(System.in);
    }
	//Userchoice user_choice = new Userchoice();
	int category_choice = -1;
	boolean check = true;

	public String osType() {
	
		String osName = System.getProperty("os.name");
		return osName;
	}

	public void Welcome() {
		System.out.println("+---------------------------------------------------------------------------------------------------+");
                System.out.println("|                                                                                                   |");
                System.out.println("|                                   Welcome to Quiz Generator                                       |");
                System.out.println("|                                                                                                   |");
                System.out.println("|                                                                                                   |");
                System.out.println("|             ___        _           ____                           _                               |");
                System.out.println("|            / _ \\ _   _(_)____     / ___| ___ _ __   ___ _ __ __ _| |_ ___  _ __                   |");
                System.out.println("|           | | | | | | | |_  /    | |  _ / _ \\ '_ \\ / _ \\ '__/ _` | __/ _ \\| '__|                  |");
                System.out.println("|           | |_| | |_| | |/ /     | |_| |  __/ | | |  __/ | | (_| | || (_) | |                     |");
                System.out.println("|            \\__\\_\\__,_|_/___|     \\____|\\___|_| |_|\\___|_|  \\__,_|\\__\\___/|_|                      |");
                System.out.println("|                                                                                                   |");
                System.out.println("|                                                                                                   |");
                System.out.println("|                                                                                                   |");
                System.out.println("+---------------------------------------------------------------------------------------------------+");
	
	}

	public void cleanScreen() {
		try {
			final String os = System.getProperty("os.name");
	
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public int selectCategory() {
	

		do {
			System.out.println("+---------------------------------------------------------------------------------------------------+");
			System.out.println("|                                                                                                   |");
			System.out.println("|                                   Welcome to Quiz Generator                                       |");
			System.out.println("|                                                                                                   |");
			System.out.println("|                                                                                                   |");
			System.out.println("|                                                                                                   |");
			System.out.println("|1. Programming                                                                                     |");
			System.out.println("|2. Physics                                                                                         |");
			System.out.println("|3. Chemistry                                                                                       |");
			System.out.println("|4. Biology                                                                                         |");
			System.out.println("|5. English                                                                                         |");
			System.out.println("|6. Maths                                                                                           |");
			System.out.println("|7. General Knowledge                                                                               |");
			System.out.println("|8. Computer Science                                                                                |");
			System.out.println("|9. Geography                                                                                       |");
			System.out.println("|10. User designed                                                                                  |");
			System.out.println("|                                                                                                   |");
			System.out.println("|                                                                                                   |");
			System.out.println("|                                                                                                   |");
			System.out.println("|                                                                                                   |");
			System.out.println("+---------------------------------------------------------------------------------------------------+");
			System.out.println("Enter a number to select a category: ");
			
			try {
			
				category_choice = scan.nextInt();
				check = checkCategory(category_choice);
				if(!check && category_choice != 0) {
					System.out.println("Invalid category number. Enter the available numbers.....");
				}
			}
			catch(Exception e) {
			
				System.out.println("Enter numbers only....");
				scan.nextLine();				//clearing the buffer
				check = false;
			}
			cleanScreen();
		}while(!check);
			
		return category_choice;
	}

	public boolean checkCategory(int category_choice) {
		
		return category_choice >= 1 && category_choice <= 10;
	}

	public void pressAnyKey() {
	
		System.out.println("Press Enter to continue....");
		scan.nextLine();
	}

	//method overloading on display
	public void displayFrame() {

		displayFrame("","",new String[0],0,"");
	}
	public void displayFrame(String heading) {

		displayFrame(heading,"",new String[0],0,"");
	}
	public void displayFrame(String heading,String question) {

		displayFrame(heading,question,new String[0],0,"");
	}
	public void displayFrame(String heading,String question,String[] options) {

		displayFrame(heading,question,new String[0],0,"");
	}
	public void displayFrame(String heading,String question,int score) {

		displayFrame(heading,question,new String[0],0,"");
	}
	public void displayFrame(String heading, String question, String[] options,int score, String message) {
		int rows = 25, columns = 106;
		String[][] print_arr = new String[rows][columns];
		
		//initializing array with spaces
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				print_arr[i][j] = " ";
			}
		}

		//initializing array with backslash n
		for(int i=0; i<rows-1; i++) {
			print_arr[i][columns - 1] = "\n";
		}
		
		int top_row = 1, top_column = 1, bottom_row = rows - 2, bottom_column = columns - 4;
		//initializing top and bottom rows with -
		for(int i=1; i < bottom_column; i++) {
			print_arr[top_row][i] = "-";
			print_arr[bottom_row][i] = "-";
		}

		//initializing right and left rows with |
		for(int i=1; i < bottom_row + 1; i++) {
			print_arr[i][top_column] = "|";
			print_arr[i][bottom_column] = "|";
		}

		//printing + on the edges of the frame
		print_arr[top_row][top_column] = "+";
		print_arr[top_row][bottom_column] = "+";
		print_arr[bottom_row][top_column] = "+";
		print_arr[bottom_row][bottom_column] = "+";
		print_arr[top_row][top_column] = "+";

		//placing the heading inside the frame
		int heading_row = top_row + 1;
		int heading_column = bottom_column / 2 - 5;
		String[] words = heading.split(" ");			//word wrapping
		int current_row = heading_row;
		int current_column = heading_column;
		display(print_arr,words,current_column,bottom_column,current_row,heading_column);

		//placing the score inside the frame
		int score_row = top_row + 1;
		int score_column = bottom_column - 11;
		String score_string = "Score=";
		current_column = score_row;
		current_column = score_column;
		displayScore(print_arr,score_string,current_column,bottom_column,current_row,score_column,score);
	
		//placing the question inside the frame
		int question_row = top_row + 4;
		int question_column = top_row+1;
		words = question.split(" ");				//word wrapping
		current_row = question_row;
		current_column = question_column;
		display(print_arr,words,current_column,bottom_column,current_row,question_column);

		//placing the options inside the frame
		int option_start_row = question_row + 3;
		displayOptions(print_arr, options, option_start_row, question_column, bottom_column);

		//placing the final message
		int mesasge_row = top_row + 8;
		int message_column = bottom_column / 3;
		words = message.split(" ");			//word wrapping
		current_row = mesasge_row;
		current_column = message_column;
		display(print_arr,words,current_column,bottom_column,current_row,heading_column);


		//printing array
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(print_arr[i][j]);
			}
		}


		
	
	}
	public static void display(String[][] print_arr,String[] words, int start_column,int end_column,int current_row,int content_start_point) {

		for(String word: words) {

			if(start_column + word.length() > end_column) {

				current_row++;
				start_column = content_start_point;

			}
			for(int i=0; i<word.length(); i++) {

				print_arr[current_row][start_column + i] = String.valueOf(word.charAt(i));

			}
			start_column += word.length() + 1;

		}


	}
	public static void displayScore(String[][] print_arr,String str, int start_column,int end_column,int current_row,int content_start_point,int score) {
			if(start_column + str.length() > end_column) {
				current_row++;
				start_column = content_start_point;
			}
			for(int i=0; i<str.length(); i++) {
				print_arr[current_row][start_column + i] = String.valueOf(str.charAt(i));
			}
			if(score == 10) {
				print_arr[current_row][end_column - 5] = "1";
				print_arr[current_row][end_column - 4] = "0";
			} else {
				print_arr[current_row][end_column - 5] = Integer.toString(score);
			}
			start_column += str.length() + 1;
	}
	public static void displayOptions(String[][] print_arr, String[] options, int start_row, int start_column, int end_column) {
		for (String option : options) {
		    String[] words = option.split(" ");
		    display(print_arr, words, start_column+1, end_column, start_row, start_column);
		    start_row++;
		}
	}
// File Handling



	public List<Quiz> readDataFromFile() {

		String inputFile = "quizData.dat";
		List<Quiz> quizEntries = new ArrayList<>();

        try {
            // Open the binary file for reading
            DataInputStream reader = new DataInputStream(new FileInputStream(inputFile));

            while (reader.available() > 0) {
                // Read category
                int categoryLength = reader.readInt();
                byte[] categoryBytes = new byte[categoryLength];
                reader.readFully(categoryBytes);
                String category = new String(categoryBytes, "UTF-8");

                // Read question
                int questionLength = reader.readInt();
                byte[] questionBytes = new byte[questionLength];
                reader.readFully(questionBytes);
                String question = new String(questionBytes, "UTF-8");

                // Read option1
                int option1Length = reader.readInt();
                byte[] option1Bytes = new byte[option1Length];
                reader.readFully(option1Bytes);
                String option1 = new String(option1Bytes, "UTF-8");

                // Read option2
                int option2Length = reader.readInt();
                byte[] option2Bytes = new byte[option2Length];
                reader.readFully(option2Bytes);
                String option2 = new String(option2Bytes, "UTF-8");

                // Read option3
                int option3Length = reader.readInt();
                byte[] option3Bytes = new byte[option3Length];
                reader.readFully(option3Bytes);
                String option3 = new String(option3Bytes, "UTF-8");

                // Read option4
                int option4Length = reader.readInt();
                byte[] option4Bytes = new byte[option4Length];
                reader.readFully(option4Bytes);
                String option4 = new String(option4Bytes, "UTF-8");

                // Read correctAnswer
                int correctAnswer = reader.readInt();
				

                Quiz entry = new Quiz(category, question, option1, option2, option3, option4, correctAnswer);
                quizEntries.add(entry);
            }

            // Close the stream
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

		return quizEntries;
	}
/* 
	public List<Quiz> readDataFromFile() {
		List<Quiz> questions = new ArrayList<>();
		return questions; 
	}
*/



	public void txtToDat() {
		String inputFile = "gptApp.txt";
        String outputFile = "quizData.dat";

        try {
            // Open the text file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the binary file in append mode
            DataOutputStream writer = new DataOutputStream(new FileOutputStream(outputFile, true));

            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming the format: category,question,option1,option2,option3,option4,correctAnswer
                String[] parts = line.split(",");

                if (parts.length != 7) {
                    System.err.println("Invalid line format: " + line);
                    continue;
                }

                String category = parts[0].trim();
                String question = parts[1].trim();
                String option1 = parts[2].trim();
                String option2 = parts[3].trim();
                String option3 = parts[4].trim();
                String option4 = parts[5].trim();
                int correctAnswer = Integer.parseInt(parts[6].trim());

                // Write category
                byte[] categoryBytes = category.getBytes("UTF-8");
                writer.writeInt(categoryBytes.length);
                writer.write(categoryBytes);

                // Write question
                byte[] questionBytes = question.getBytes("UTF-8");
                writer.writeInt(questionBytes.length);
                writer.write(questionBytes);

                // Write option1
                byte[] option1Bytes = option1.getBytes("UTF-8");
                writer.writeInt(option1Bytes.length);
                writer.write(option1Bytes);

                // Write option2
                byte[] option2Bytes = option2.getBytes("UTF-8");
                writer.writeInt(option2Bytes.length);
                writer.write(option2Bytes);

                // Write option3
                byte[] option3Bytes = option3.getBytes("UTF-8");
                writer.writeInt(option3Bytes.length);
                writer.write(option3Bytes);

                // Write option4
                byte[] option4Bytes = option4.getBytes("UTF-8");
                writer.writeInt(option4Bytes.length);
                writer.write(option4Bytes);

                // Write correctAnswer
                writer.writeInt(correctAnswer);
            }

            // Close streams
            reader.close();
            writer.close();

            System.out.println("Conversion and appending completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void appendData(String category, String question, String option1, String option2, String option3, String option4, int correctAnswer) {
		DataOutputStream writer = null;
		File outputFile = new File("quizData.dat");
		try {
			// Open the binary file in append mode
			writer = new DataOutputStream(new FileOutputStream(outputFile, true));
	
			// Write category
			byte[] categoryBytes = category.getBytes("UTF-8");
			writer.writeInt(categoryBytes.length);
			writer.write(categoryBytes);
	
			// Write question
			byte[] questionBytes = question.getBytes("UTF-8");
			writer.writeInt(questionBytes.length);
			writer.write(questionBytes);
	
			// Write option1
			byte[] option1Bytes = option1.getBytes("UTF-8");
			writer.writeInt(option1Bytes.length);
			writer.write(option1Bytes);
	
			// Write option2
			byte[] option2Bytes = option2.getBytes("UTF-8");
			writer.writeInt(option2Bytes.length);
			writer.write(option2Bytes);
	
			// Write option3
			byte[] option3Bytes = option3.getBytes("UTF-8");
			writer.writeInt(option3Bytes.length);
			writer.write(option3Bytes);
	
			// Write option4
			byte[] option4Bytes = option4.getBytes("UTF-8");
			writer.writeInt(option4Bytes.length);
			writer.write(option4Bytes);
	
			// Write correctAnswer
			writer.writeInt(correctAnswer);
			
			cleanScreen();
			System.out.println("Your data stored successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}



	public ArrayList<Quiz> userSelectedCategory(String name) {
		List<Quiz> data = readDataFromFile();
		ArrayList<Quiz> selected_category = new ArrayList<Quiz>();
			for(Quiz category: data) {
				if(category.getCategory().equals(name)) {
					selected_category.add(category);
				}
			}
		return selected_category;
	}

	public String lastMessage(int score) {

		if (score == 10) return "Damn you are one perfect living being";
		if(score == 9) return "You almost got it, Well done bro!!!";
		if(score == 8) return "You are pretty good at this!!";
		if(score == 7) return "Yeah you are good, Try again...";
		if(score == 6) return "Try again bro. I know you can do this...";
		if(score == 5) return "Stop the cap bro, stop the cap. You know you are not good right.";
		if(score == 4) return "You serious right now Bro. Do some studying man.";
		if(score == 3) return "You serious right now Bro. Do some studying man.";
		if(score == 2) return "You serious right now Bro. Do some studying man.";
		if(score == 1) return "You serious right now Bro. Do some studying man.";
		return "Yo! I found the biggest fool on the Universe...";
		
	}

}

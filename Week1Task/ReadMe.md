# Command Line Quiz Application Documentation

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [System Requirements](#system-requirements)
4. [Installation](#installation)
5. [Usage](#usage)
   - [Running the Application](#running-the-application)
   - [Welcome Screen](#welcome-screen)
   - [Category Selection](#category-selection)
   - [Taking a Quiz](#taking-a-quiz)
   - [Creating a Custom Quiz](#creating-a-custom-quiz)
   - [End Screen](#end-screen)
6. [File Structure](#file-structure)
7. [Planned Updates](#planned-updates)
8. [FAQ](#faq)
9. [License](#license)

## Introduction
The Command Line Quiz Application is a Java-based program designed to provide an interactive quiz experience directly from your terminal. It includes a variety of quiz categories, supports custom quiz creation, and features ASCII art for an engaging user experience.

## Features
- **Multiple Quiz Categories:** Choose from 10 different categories.
- **Interactive Quiz Sessions:** Answer questions interactively via the command line.
- **Custom Quiz Creation:** Create and play your own quizzes.
- **ASCII Art Integration:** Enjoy visually appealing ASCII art during your quiz experience.
- **Data Persistence:** Store quiz data in a binary file format.

## System Requirements
- **Java Development Kit (JDK):** Version 8 or higher. To check whether java is installed or not.
  ```sh
  java --version
- **Operating System:** Windows or Linux.

## Installation
1. **Download the Source Code:** Clone or download the source code from the repository.
   ```sh
   https://github.com/balamurali0701/Techplement.git
2. **Compile the Java Files:** Navigate to the project directory and compile the Java files.
   ```sh
   javac Main.java Service.java Quiz.java Userchoice.java
3. **Prepare the Data File:** Ensure the `quizData.dat` file is in the same directory as the compiled Java files.

# Usage

## Running the Application

1. **Open your terminal.**
2. **Navigate to the project directory.**
   ```sh
   cd path/to/your/project/directory
3. **Run the Main class.**
   ```sh
   java Main

# Welcome Screen

Upon launching the application, you will be presented with the Welcome screen. You need to press enter to continue.

# Category Selection

After the Welcome screen you will be prompted to select a category from the following options:

1. Science
2. History
3. Geography
4. Sports
5. Literature
6. Music
7. Movies
8. Technology
9. General Knowledge
10. User Designed

Enter the number corresponding to your desired category.

# Taking a Quiz

- **Question Format:** Each question will be displayed with multiple-choice options.
- **Answering Questions:** Enter the number corresponding to your answer choice and press Enter.
- **Scoring:** Your score will be updated until the end of the quiz.

# Creating a Custom Quiz

- **Add Questions:** Enter the question text, answer options one by one, and correct answer for each question.
- **Save Quiz:** The custom quiz will be saved and accessible from the category selection menu as user defined.

# End Screen

- **Quiz Results:** At the end of the quiz you will be prompted to the end screen.
- **Result Message:** A message will be displayed on the end screen according to your score. Each message is different from one another.
- **Continue or Quit:** At the end screen you will be prompted to continue the game or quit the game. Pressing N or n will end the program.

# File Structure

This is the directory structure of the `quiz-app` project. It includes the following Java source files:
- `Main.java`
- `Services.java`
- `Quiz.java`
- `quizData.dat`
- `Userchoice.java`

# Planned Updates

- **Adding New Categories:** Modify the `Services.java` file to include new categories and questions.
- **Share User Created Quiz:** Update the application for sharing user created quizes.
- **Inter Shuffling:** Modify the `Main.java` file to include inter shuffling function on user defined category.
- **Enhancing ASCII Art:** Update the ASCII art in the `Main.java` file for a more engaging user experience.
- **Extending Functionality:** Add new features or improve existing ones by modifying the respective Java files.
- **Enhancing Input Handling:** Update the application for a more engaging user experience.

# FAQ

**How do I reset my quiz progress?**
Delete or modify the `quizData.dat` file to reset your quiz progress.

**Can I share my custom quizzes with others?**
No, currently sharing the quizzes is not available, will update in the future enabling quiz sharing with others to allow them to play your custom quizzes.

**How do I report a bug or suggest a feature?**
Open an issue on the project's GitHub repository.

# License

This project is licensed under the MIT License. See the LICENSE file for more details.

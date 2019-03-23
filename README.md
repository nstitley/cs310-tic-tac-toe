# Tic-Tac-Toe

In this program, the computer will generate a Tic-Tac-Toe game board depending on the size specified. The two players are then able to click on one of the squares to create either a 'O' or a 'X'. The players will continue picking squares until one of them wins by getting three in a row, or by filling the entire board, which means a tie has occured.

## Getting Started

When you are on the project page [Tic-Tac-Toe](https://github.com/nstitley/cs310-tic-tac-toe), you can press the 'Download ZIP' button which is located under the "Clone or Download" drop down box. This will allow you to download the most recent version of the code as a zip archive. If you are not able to see the drop down box, it could because you are not on correct page. Look for a button on the left-most tab that you are allowed to click, which is labeled "<> Code".

## Prerequisites

For running a Java program, you will first need to download JDK software. You will then need to install the software program called Java SE Development Kit (SE refers to Standard Edition). To put it simply, a JDK contains: JRE (Java Runtime Environment), which allows users to run Java programs on their PC and is considered the core of the Java platform. The JRE includes the JVM (Java Virtual Machine) that runs Java programs by translating from bytecode to platform-dependent code and executes them.

The javac.exe file is a Java compiler that will translate and then convert the programs written Java code into bytecode form.
The java.exe file is the Java Virtual Machine (JVM) that executes bytecode.

Here is the link for the latest version of the JDK program:
https://www.oracle.com/technetwork/java/javase/downloads/index.html

You need to make sure you check the option “Accept License Agreement” and choose the correct version for your computer.

You can run this code from the command line, but you will need to set up environment varibles. I prefer to use NetBeans, which is an integrated development environment for Java. This way, you can edit and run this Java program without having to use the command line.
Here is the link to download NetBeans: https://netbeans.org/downloads/8.0.2/

## Running the program

When you want to run and/or test the program, you will have to first extract the files within the archive to a new folder. You will want to make sure that all files are within the same folder. Now you want to open NetBeans and click on the "File" tab, then "New project," then select "Java" from the categories section and select "Java Project with Exsiting Sources" from the projects section. You will then fill out the "Name and Location" step. Finally you will arrive at the place where you will add the existing sources, which will be the folder you created that has all the extracted files. Once the project is added into NetBeans, you can simply run it by clicking "Run," which is located near the top-center.

## Program Discussion (Logic)

When the players click on the buttons, the Controller (as the event handler) should add the marks to the Model using its makeMark() method.  The Controller should invoke the View's updateButtons() method, which will update the View to reflect the new contents of the game board, using "X" or "O" to indicate the players' marks. Since the View does not have direct access to the Model, it must request the necessary data from the Controller.  The controller will also provide methods to return a reference to the View to the main class (so it can be shown in the GUI), and to implement the ActionListener interface for handling button clicks.

In the JPanel, the squares of the board are implemented as a two-dimensional array of JButton objects whose names are set to "SquareXY" (replacing X with the row and Y with the column). In addition, to display the winning player at the end of the game, a JLabel named "ResultLabel" is added to the bottom of the window. After a winner is determined, the Controller will disable the buttons so that no further moves can be entered.  Display output messages (such as the result at the end of the game) in ResultLabel: this result should be shown in the label as the Result enumeration value, all by itself, converted to uppercase.

## Contributing

If you want to contribute to this repository, please inform me about the change or changes you want to make. If you prefer, you can email me (nstitley@stu.jsu.edu) or use another other contacting method to contact me. I simply want to be informed about what changes are being made to the code. That way, I have no suprises when I want to use/make changes to it. Thanks! 

## Authors

* **Jay Snellen** - [jsnellen](https://github.com/jsnellen)
* **Nolan Stitley** - [nstitley](https://github.com/nstitley)

# Tic-Tac-Toe

In this program, the computer will generate a Tic-Tac-Toe game board depending on the size specified. The two players are then able to click on one of the squares to create either a 'O' or a 'X'. The players will continue picking squares until one of them wins by getting three in a row, or by filling the entire board, which means a tie has occured.

## Getting Started

When you are on the project page [Tic-Tac-Toe](https://github.com/nstitley), you can press the 'Download ZIP' button which is located under the "Clone or Download" drop down box. This will allow you to download the most recent version of the code as a zip archive.
If you are not able to see the drop down box, it could because you are not on correct page. Look for a button on the left-most tab that you are allowed to click, which is labeled "<> Code".

## Prerequisites

For running a Java program, you will first need to download and install JDK software. You need to install a software program called Java SE Development Kit (SE refers to Standard Edition). To put it simply, a JDK contains: JRE(Java Runtime Environment), which allows users to run Java programs on their  is the core of the Java platform that enables running Java programs on your computer. The JRE includes JVM(Java Virtual Machine) that runs Java programs by translating from bytecode to platform-dependent code and executes them (Java programs are compiled into an intermediate form called bytecode), and other core libraries such as collections, File I/O, networking, etc.
Tools and libraries that support Java development.
The JDK ships with two powerful tools which every Java developer should be familiar with:
javac.exe: is Java compiler that translates programs written in Java code into bytecode form.
java.exe: is the Java Virtual Machine launcher that executes bytecode.
Click on the following link to download the latest version of JDK installer program:
http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
Check the option “Accept License Agreement”, and choose an appropriate version for your computer from the list.

## Running the program

When you want run and/or test the program, you will have to first extract the files within the archive to a new folder. You will want to make sure that both files are within the same folder. Now you will be able to open the HTML file within the browser that you are using. The program should begin running within your browser. You can also utilize the web console to see certain outputs for testing cases.

## Program Discussion

In response to each of the player's guesses, the computer provides clues which can help the player to crack the code through a process of deduction. The computer checks the digits guessed by the player, compares each of the digits to every one of the digits in the secret code, and determines whether each digit in the player's guess is of the correct identity and in the correct place (these are the "correct" digits), or whether each digit is of the correct identity but is not in the correct place (these are the "misplaced" digits).

With each guess, it counts the number of "correct" and "misplaced" digits, and displays these totals in the web page, alongside the player's guess, in ordered columns.  The player can use this information to determine which digits need to be exchanged or replaced, until the player's guess exactly matches the secret code.  The computer then prints a message of congratulations, along with the total number of guesses it took the player to crack the code.

## Contributing

If you want to contribute to this repository, please inform me about the change or changes you want to make. If you prefer, you can email me (nstitley@stu.jsu.edu) or use another other contacting method to contact me. I simply want to be informed about what changes are being made to the code. That way, I have no suprises when I want to use/make changes to it. Thanks! 

## Authors

* **Nolan Stitley** - [nstitley](https://github.com/nstitley)

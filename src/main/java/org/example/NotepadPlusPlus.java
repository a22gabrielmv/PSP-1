package org.example;
import java.io.IOException;


/**
 * The first number in the input indicates how many test cases are to be processed.
 * It is followed by a line for each test case, with two numbers between 1 and 1,000,000.
 * The first one indicates the number of steps and the second one indicates how many steps
 * can be climbed at a time.
 */

public class NotepadPlusPlus {
    public static void main(String[] args) throws IOException {
        Runtime runtime=Runtime.getRuntime();
        String[] command={"C:/Program Files/Notepad++/notepad++.exe"};
        Process process= runtime.exec(command);
    }
}
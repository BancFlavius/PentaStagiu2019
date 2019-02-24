/*
 Created by Banc Flavius-Alexandru
 Date : 24.02.2019
 */
public class Main {

    public static void main(String[] args) {
        //Create new Object of ReadContent
        ReadContent rc = new ReadContent();
        //Declare a String variable and set the value of the string as the file's path
        String fileName = "Pentalog.txt";

        rc.fileReader(fileName);
    }
}

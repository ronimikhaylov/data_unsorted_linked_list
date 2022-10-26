import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * proj1App.java
 * @description: This program will reads in a CSV file of  NYC School Displinary Data based on 
 * the students demographics and place each school object in a Singly linked list. 
 * The program will then prompt the user to enter an attribute they
 * would like to use to search through the data. Then the user inputs a value for that attribute
 * and the program will return the first instance of the school object that matches the attribute.
 * Note: some school names have quotes in them, so for those schools, 
 * when the user searches the schools name, they must include the quotes on some schools.
 * 
 * @author 	Roni Mikhaylov
 * @version 	1.0
 * @since 	2022-09-26
 */
 

public class Proj1App {
    public static void main(String[] args) throws FileNotFoundException {
    // prompt the user to select an attribute they want to seach through the list for
    // when the user selects an attribute, display the data in the console
    // prompt the user to select an attribute they want to seach through the list for
    // when the user selects an attribute, display the data in the console


    // open the file
    // find the pathname
    
    // prompt the user for the filename
    String [] pathname = {"2015_2016_Student_Discipline_Annual_Report_-_RACE.csv", "Search Manually",   "Quit"};
   // prompt the click the pathname 
   
   String user_file = (String) JOptionPane.showInputDialog(null, "Select a pathname", "Attribute", JOptionPane.QUESTION_MESSAGE, null, pathname, pathname[0]);
    
   
    if (user_file == null) {
        System.exit(0);
    }
    if (user_file.equals("Quit") || user_file.equals("quit")) {
        System.exit(0);
    }
    if (user_file.equals("Search Manually") || user_file.equals("search manually")) {
        // prompt the user to enter the file name
        String user_file_name = JOptionPane.showInputDialog("Enter the path name");
        if (user_file_name == null) {
            System.exit(0);
        }
        if (user_file_name.equals("Quit") || user_file_name.equals("quit")) {
            System.exit(0);
        }
        // check if its a valid path
        
        user_file = user_file_name;


    }

    File file = new File(user_file);
    // iterate through the file and gather all the collumns and pass it into the school object
    Scanner sc = new Scanner(file);
    LinkedList <School> schools = new LinkedList<>();
    // iterate through the file and gather all the collumns and pass it into the school object
    String line = sc.nextLine();
    //line = sc.nextLine();
    String[] columns = line.split(",");
    //access only the last line in the file

    while (sc.hasNextLine()) {
        line = sc.nextLine();
        columns = line.split(",");
        // create a school object and pass the array into the constructor
        School s = new School(columns);
        //System.out.println(s);
        schools.add(s);
    }
     // close the scanner
     sc.close();

   // prompt the user to select an attribute they want to seach through the list for
    // when the user selects an attribute, display first piece of data that matches the attribute and the value in the linked list onto the console

    String[] attributes  = {"Quit", "District Borough Number", "School Name", "School Category", "Administrative District", "American Indian/Alaskan Native REMOVALS", 
    "American Indian/Alaskan Native PRINCIPAL", "American Indian/Alaskan Native SUPERINTENDENT", "American Indian/Alaskan Native EXPULSIONS",
    "Asian REMOVALS", "Asian PRINCIPAL", "Asian SUPERINTENDENT", "Asian EXPULSIONS", "Black REMOVALS", "Black PRINCIPAL", "Black SUPERINTENDENT", "Black EXPULSIONS",
    "Hispanic REMOVALS", "Hispanic PRINCIPAL", "Hispanic SUPERINTENDENT", "Hispanic EXPULSIONS", "White REMOVALS", "White PRINCIPAL", "White SUPERINTENDENT", "White EXPULSIONS",
    "Unknown REMOVALS", "Unknown PRINCIPAL", "Unknown SUPERINTENDENT", "Unknown EXPULSIONS"};
    boolean repeat = true;
    while(repeat){

        String attribute = (String) JOptionPane.showInputDialog(null, "Select an attribute to search and search through", "Attribute", JOptionPane.QUESTION_MESSAGE, null, attributes, attributes[0]);
        if (attribute == null) {
            repeat = false;
            System.exit(0);
        }
        if (attribute.equals("Quit") || attribute.equals("quit")) {
            repeat = false;
            System.exit(0);

        }


    
        String value = JOptionPane.showInputDialog("Enter a value for " + attribute);
        
        // if the user hits cancel, quit the program
        if (value == null) {
            System.exit(0);
        }
        // check if the value is an integer or a string
            Integer val = null;
            for (int i = 0; i < schools.size(); i++) {
                if (i == schools.size() - 1) {
                    // in a pop up window, display an error message
                    JOptionPane.showMessageDialog(null, "The value you entered is not in the data for that attribute", "Please try again with a different value.", JOptionPane.ERROR_MESSAGE);
                    // prompt the user to restart
                    String restart = JOptionPane.showInputDialog("Would you like to restart? (y/n)");
                    // if the user hits cancel, exit the program
                    if (restart == null) {
                        System.exit(0);
                    }
                    // if the user enters y, restart the program
                    if (restart.equals("y")) {
                        break;
                    }
                
                }
                if ( value.matches("[0-9]+")) {
                    val = Integer.parseInt(value);
                    // if the value is an integer, convert it to an integer
                    School v = schools.get(i);
                    //System.out.println(v.toString());
                    if (v.get(attribute) != null && schools.get(i).get(attribute).equals(val)) {
                        JOptionPane.showMessageDialog(null, schools.get(i).toString(), "School", JOptionPane.INFORMATION_MESSAGE);

                        // System.out.println(schools.get(i));
                        break;
                    }
                    
                
                }else{ // if the value is a stirng
                    School v = schools.get(i);
                    //System.out.println(v.toString());
                    if (v.get(attribute) != null && schools.get(i).get(attribute).equals(value)) {
                        // show the output in a joption pop up
                        JOptionPane.showMessageDialog(null, schools.get(i).toString(), "School", JOptionPane.INFORMATION_MESSAGE);

                        //System.out.println(schools.get(i));
                        break;
                    }
                    
                }
            }

    }
   

    
    } 

    

    }
  
    


 
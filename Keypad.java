
package ATMCaseStudy;

import java.util.*;

public class Keypad
 {
 private Scanner input; 
 
 public Keypad()
 {
 input = new Scanner( System.in );
 } 
 
 public int getInput()
 {
    return input.nextInt(); 
 }
 }
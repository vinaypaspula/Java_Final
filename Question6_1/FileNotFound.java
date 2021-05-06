/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6_1;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class FileNotFound {

    public static void main(String args[]) {
        System.out.println("Vinay Kumar Paspula - Question 6 Example 1\n");
        try{File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
        }
        catch()
    }
}

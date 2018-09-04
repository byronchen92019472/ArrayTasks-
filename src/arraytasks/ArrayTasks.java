/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

/**
 *
 * @author 92019472
 */
public class ArrayTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] grades = new char[5];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'D';
        grades[3] = 'F';
        
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
        
        char[] newGrades = new char[5];
        System.arraycopy(grades, 0, newGrades, 0, 2);
        newGrades[2] = 'C';
        System.arraycopy(grades, 2, newGrades, 3, 2);
        
        for (int i = 0; i < grades.length; i++) {
            System.out.println(newGrades[i]);
        }
    }
    
}

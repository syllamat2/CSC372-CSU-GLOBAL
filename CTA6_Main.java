/*----------------------------------------------------------------
# Author: Makhtar Sylla
# Date: 06/02/2024
# Class: CSC372
----------------------------------------------------------------
# Program Name:  Storing an ArrayList: Main
# Program Inputs: NA
# Program Outputs: NA
-----------------------------------------------------------------*/

import java.util.ArrayList;

public class CTA6_Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding 10 student objects to the list
        students.add(new Student(10, "Makhtar Sylla", "15 Daisy St"));
        students.add(new Student(2, "Douglas Muje", "456 Elm St"));
        students.add(new Student(3, "Brain Salch", "789 Merry Hill RD"));
        students.add(new Student(8, "Abdou Hakim", "321 Pine St"));
        students.add(new Student(5, "Brandon Mart", "654 Maple RD"));
        students.add(new Student(1, "Nehmiah Hegn", "987 Fuller Pl"));
        students.add(new Student(7, "Caleb Lust", "852 Spruce St"));
        students.add(new Student(6, "Aiden Onea", "951 Washington Pl"));
        students.add(new Student(9, "Coyne Charl", "75 S French RD"));
        students.add(new Student(4, "Muhammad Rahman", "159 Chestnut St"));

        // Sorting the list by roll number
        MergeSort.mergeSort(students, new StudentRollNoComparator());

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

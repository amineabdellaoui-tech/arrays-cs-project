package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        if (students==null || students.length==0) { //Checking the case of the absence of the array or an empty array
            return null;
        }
        Student oldestStud = null;
        int maxOld=-1;
        for(Student s : students){ //We do a loop on the array students to search for the oldest student
            if(maxOld<s.getAge()){
                maxOld=s.getAge();
                oldestStud=s;
            }
        }
        return oldestStud; //We return the oldest one
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        if (students==null || students.length==0) { //Checking the case of the absence of the array or an empty array
            return 0;
        }
        int countAdult = 0; //we initialize a counter
        for(Student s : students){ //We loop on the array to check every students
            if(s.getAge()>=18){ //Case of student with an age of 18 or more
                countAdult++;
            }
        }
        return countAdult; // we return the counter

    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        if(students==null || students.length==0){ //Checking the case of the absence of the array or an empty array
            return 0.0;
        }

        int sum =0;  //We loop on the array to get the sum of the grade of the all the students
        for(Student s: students){
            sum+=s.getGrade();
        }
        return (double) sum/students.length;   //Wa need to use the cast so we cannot have wrong values
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        if(students==null || students.length==0){ //Checking the case of the absence of the array or an empty array
            return null;
        }
        Student student1 = null;
        for (Student s : students){ //Loop on the array
            if(s.getName().equals(name)){ //we verify if name is desired if the name of the student we are in in the loop
                student1=s;
            }
        }
        return student1;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        if(students==null || students.length==0){ //Checking the case of the absence of the array or an empty array
            return;
        }
        for(int i=0;i<students.length-1;i++){ //We use a bubble sort to sort by grade descending
            for(int j=0;j<students.length-1-i;j++){
                if(students[j].getGrade()<students[j+1].getGrade()){
                    Student studi=students[j];
                    students[j]=students[j+1];
                    students[j+1]=studi;
                }
            }
        }

    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        if(students==null || students.length==0){ //Checking the case of the absence of the array or an empty array
            return;
        }
        System.out.println("Students with a grade greater or equal to 15 : ");
        for(Student s : students){ //We loop to find students with a grade higher or equal to 15 and we print their names
            if(s.getGrade()>=15){
                System.out.println("- "+s.getName());
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        if(students==null || students.length==0){ //Checking the case of the absence of the array or an empty array
            return false;
        }
        for(Student s :students){ //We loop to find the id
            if(s.getId()==id){ //if we find the id
                s.setGrade(newGrade); //we update the grade
                return true; //we return true to say that we found the id in the array
            }
        }
        return false; //in case we didn't find the id in the array
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        if(students==null || students.length==0){ //Checking the case of the absence of the array or an empty array
            return false;
        }
        for(int i=0;i<students.length-1;i++){
            String name1 = students[i].getName();
            for(int j=i+1;j<students.length;j++){
                if(name1.equals(students[j].getName())){
                    System.out.println("Duplicates found");
                    return true;
                }
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        if (students == null) { //if no students array
            Student[] newArrayStudents = new Student[1];
            newArrayStudents[0]=newStudent;
            return newArrayStudents;
        }
        Student[] newArrayStudents = new Student[students.length+1]; //creating new array
        for(int i=0;i<students.length;i++){ //copying elements
            newArrayStudents[i]=students[i];
        }
        newArrayStudents[students.length]=newStudent; //adding the new element
        return newArrayStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] StudentArray = new Student[5]; //We create StudentArray
        StudentArray[0]= new Student(1,"Ali");
        StudentArray[1] = new Student(2,"Ahmed",19);
        StudentArray[2] = new Student(3,"Hamza",20,14);
        StudentArray[3] = new Student(4,"Adam");
        StudentArray[4] = new Student(5,"Dina",21);


        // Print all
        System.out.println("== All Students ==");
        for (Student s : StudentArray) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("The oldest student : ");
        Student oldestStudent = findOldest(StudentArray);
        System.out.println(oldestStudent);

        // 3) Count adults
        System.out.println("The count of adult students = "+countAdults(StudentArray));

        // 4) Average grade
        System.out.println("The average grade = "+averageGrade(StudentArray));

        // 5) Find by name
        System.out.println("We search for the student Adam : "+findStudentByName(StudentArray,"Adam"));

        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        sortByGradeDesc(StudentArray);
        for (Student s : StudentArray) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(StudentArray);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updateGrade(StudentArray,4,19));
        System.out.println(findStudentByName(StudentArray, "Dina"));

        // 9) Duplicate names
        hasDuplicateNames(StudentArray);

        // 10) Append new student
        Student newStudent1 = new Student(9,"Salim",23,14);
        StudentArray = appendStudent(StudentArray,newStudent1);
        System.out.println("\nArray after appending Salim : ");
        for (Student s : StudentArray) System.out.println(s);


    }
}


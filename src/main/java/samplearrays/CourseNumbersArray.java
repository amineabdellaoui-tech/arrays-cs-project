package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        //initializing the integer array registeredCourses
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

        //adding the newCourse by creating an array of the length of the previous array+1
        //and copying the previous element into this new array with adding the newElement
        int newCourse = 2727;
        int[] updatedCourses = new int[registeredCourses.length + 1];
        for(int i=0;i<registeredCourses.length;i++){
            updatedCourses[i]=registeredCourses[i];
        }
        updatedCourses[registeredCourses.length]=newCourse;

        //Printing the contents of updatedCourses
        System.out.println("elements of updatedCourses : ");
        for(int j=0;j<updatedCourses.length;j++){
            System.out.println(updatedCourses[j]+ "    ");
        }

        //Cheking the presence of a Course (CourseId) using a loop
        int CourseId = 2726;
        boolean flag=false;
        for(int h=0;h<updatedCourses.length;h++){
            if(updatedCourses[h]==CourseId){
                flag=true;
            }
        }
        System.out.println("Is the Course 2726 in the updatedCourse : "+flag);
    }
}

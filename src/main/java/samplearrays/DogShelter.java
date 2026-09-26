package samplearrays;

public class DogShelter {

    // initialize an array of 3
    static int[] dogCounts = new int[3]; //we use static so it can be used in the main method



    public static void main(String[] args) {

        // Adding counts for three types of dogs
        dogCounts[0] = 15;
        dogCounts[1] = 30;
        dogCounts[2] = 20;

        // Display initial dog counts
        System.out.println("Initial Dog Counts:");
        displayDogs();

        // Increase count for second breed of dog
        addBreed(1, 5);

        // Remove the third breed (set to 0, since arrays can't shrink)
        deleteBreed(2);

        // Display updated dog counts
        System.out.println("\nUpdated Dog Counts:");
        displayDogs();
    }

    // Add count to a given index
    public static void addBreed(int index, int count) {
        // add you code here
        if(index<dogCounts.length && index>=0){  //we check if the value of index is valid
            dogCounts[index]+=count; // we add the count for the particular breed at it's position
        }
    }

    // Remove a breed by setting its count to 0
    public static void deleteBreed(int index) {
        // add your code here
        if(index<dogCounts.length && index>=0){ //we check if the value of index is valid
            dogCounts[index]=0; //we put 0 in the index correspending to the breed
        }
    }

    // Display all dog counts
    public static void displayDogs() {
        // add your code
          //  System.out.println("Breed " + i + " has " + dogCounts[i] + " dogs.");
        for(int i=0;i<dogCounts.length;i++){
            System.out.println("Breed " + i + " has " + dogCounts[i] + " dogs.");
        }
    }
}


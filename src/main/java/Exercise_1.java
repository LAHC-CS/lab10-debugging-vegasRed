class Exercise_1 {

    //number of elements we want to check for
    public static int numElements = 100;

    public static void main(String[] args) {

        // Check if given a single argument
        if(args.length > 1) {//semantic error
            System.out.println("./Exercise_1 value");
            return;
        }

        int n = Integer.parseInt(args[0]); // syntax error

        //create new array of numElements long
        int[] arr = new int[numElements+1];// syntax error

        //populate array from 0 to numElements
        for(int i = 0; i <= numElements; i++) {//sematic/logic error
            arr[i] = i;
        }
        
        //return; //logical error

        //find Divisable by n
        findDivisableBy(arr, n); //syntax error
        return;
    }

    public static void findDivisableBy(int arr[], int n) {

        // for every element of the array
        for(int i = 0; i <= numElements; i=i+1) {//logical/syntax error

            // check if element is divisible by n
            if((arr[i] % n) == 0) {//syntax error
                //print if divisibile
                System.out.print (arr[i] + ",");//syntax error
            }
        }
        System.out.println("");//Syntax error
    }
}

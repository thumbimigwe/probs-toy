// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be world because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)

System.out.print("How many numbers do you want to input?");

    int totalNumbers = console.nextInt();

    int minMax = 0;
    
    for(int i = 1; i <= totalNumbers; i++){
        System.out.print("Number " + i + ": ");
        int inputNumbers = console.nextInt();
    }
    System.out.println();

    int smallest = Math.min(minMax);
    System.out.println("Smallest = " + smallest);
    int largest = Math.max(minMax); 
    System.out.println("Largest = " + largest);
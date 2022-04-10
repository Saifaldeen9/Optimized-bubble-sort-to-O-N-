package bubble_sort;
/*
  In the Name of Allah, the Merciful, the Beneficent
  Optimized Bubble sort algorithm with time complexity
   best O(N), average O(N) and Worst O(N)
   space complexity O(n)
  By : Software developer: Saifaldeen Al
   Licence GPLv3
 */
public class Main {

    public static void main(String[] args) {

        /* Short arrays for cases testing and debuting
          To use one of these test cases uncomment
         one and comment the array object bellow and the for loop
        */

        //int[] aItems = {-2};
        //int[] aItems = {0};
        //int[] aItems = {12};
        //int[] aItems = {11,1}
        //int[] aItems = {2,3};
        //int[] aItems = {1,2,3,4,5};
         //int[] aItems = {3,2,1,0,4};
        

        //  Testing big array
        int[] aItems = new int[30000];
      
        // array length
        int len = aItems.length;

        //  Fill the array with random numbers so that to get unsorted array
        for (int i = 1; i < len; i++)
        {
            int x = 1 + (int) (Math.random() * len);
            aItems[i] = x;
        // System.out.print(aItems[i]);
        }

        System.out.println("Start sorting");

        //  boolean swapped = true; // optional

        int idx = 0;  // Array index
        int temp = 0; // temp variable to hold the value for swapping
       
        int swapping = 0; // counting swapping time at each iteration too

        do
        {
            //Do loop termination, when there is no swapping and (idx + 1) variable reaching the end
            if((idx + 1) == len && swapping == 0)
                break;

            // index reset when reach the end of array at each iteration, to start from beginning
            if((idx+1) == len)
            {
                idx = 0;

                swapping = 0 ;
            }

            //Testing condition that tests element and swap them
            if(aItems[idx] > aItems[idx+1])
            {
                temp = aItems[idx];
                aItems[idx] = aItems[idx+1];
                aItems[idx+1] = temp;
                swapping++;
            }

            //System.out.printf("%d", aItems[idx]);

            //Increasing the index to move next
            idx ++;


        } while(true);

        System.out.println("Finish sorting");

        // for each loop to display the result
        for(int v : aItems) {
            System.out.println(v);
        }

        System.out.println("Done");

    }
}


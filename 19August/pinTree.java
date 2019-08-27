public class pinTree {

    public static void main(String [] arg) {
        int height = 6;
        int i;
        int n;

        System.out.println('I');              // it will print the head of the tree before entering the loop FOR

for (n=1;n<height-1;n++){                    //the first FOR Loop with the variable n  which will start from 1 to less than  the (height -1) , to print only Four lines .

    for ( i = 0; i <= n; i++) {              //the second FOR Loop with the variable i  which start from 0 to be equal to "n", the wiedth of letters must be maximum 5 that is why we start i from 0.

        if (i%2==0) {                        // it will print X if the rest of "i" is 0   , when  we have n=1 then i ={0,1}   when n={1,2} then i ={0,1,2} which means XYX because the rest is {0,1,0}
            System.out.print('X');
        }else {
            System.out.print('Y');          // it will print Y if the rest of "i" is 1.
        }
    }
    System.out.println();                  // it will take a new line and return again to "n" after increasing it .
}

        System.out.println('M');            // it will print the tail of the tree After exiting  the loop FOR
    }
   // test comment
}

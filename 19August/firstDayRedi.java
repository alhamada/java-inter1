public class firstDayRedi {


        public static void main(String[] arg) {
            //Recall squre Method
            System.out.println("Exercise 1");

            squre(1, 3);
            System.out.println();
            squre(5, 6);
            System.out.println();
            System.out.println("Exercise 2");
            System.out.println();
            isFeminineNoun("Katze");
            System.out.println();
            System.out.println();
            System.out.println("Exercise 3");
            System.out.println();
            payInsurance(5000);
            System.out.println();
            payInsurance(1000);
            System.out.println();
            payInsurance(-500);



        }
    /*Exercise 1
Write the method squares that for X and Y given by arguments prints the square of each number between X and Y.*/

        public static void squre(int x, int y) {

            System.out.format("square(%d,%d)%n", x ,y );
            for (int i = x; i <= y; i++) {
                int squre = i * i;

                System.out.println(i + " - " + squre);

            }


        }
    /*Exercise 2
 In german, nouns ending with e are almost always feminine. Write a method isFeminineNoun that checks if the provided word ends with e or not.*/

        public static void isFeminineNoun(String suffix) {

         System.out.format("isFeminineNoun  \"%s\"  %n" + suffix.endsWith("e")  +"   ----->    Because it ends with \"e\"" , suffix);
        // System.out.format("isFeminineNoun because it ends with \"ung\" \"%s\"  %n" + suffix.endsWith("e"), suffix);



        }
/*Exercise 3
Let’s assume a freelancer has to pay insurance and income tax. Let’s assume insurance is fixed at 300€,
while income tax is 9% for incomes of less than 1000€ (after insurance payment), and 21% otherwise.*/

        public static void payInsurance (int incomesValue)
        {
            if (!(incomesValue==0) && !(incomesValue<0))
                {
                    int var0=incomesValue-300;
                    if (incomesValue <= 1000 )
                        {
                              double var1= var0 * 0.91;
                              System.out.format("case1 (%d€) in his Pocket:%n%.0f ",incomesValue, var1);
                              System.out.println("  \"Because incomes is less than of 1000€\"");
                        }
                    else
                        {
                              double var2= var0 * 0.79;
                              System.out.format("case2 (%d€) in his Pocket:%n%.0f",incomesValue,var2);
                              System.out.println("  \"Because incomes is more than of 1000€\"");
                        }
                }
            else
                {
                   System.out.format("case3 (%d€) \"You insert a value equal to zero or less than zero ,Please insert a valid value\"",incomesValue);
                }
        }
}




/* This class holds functionality for the recursive method
   used to find the product of an array of numbers, which
   has been purposely decentralized from the runner Main class
   to display functional modularity.
*/
public class RecursionProduct {

    public int productProcess(int[] numberList, int counter) {
        if (counter == 0) {
            return 1;
        }
        return numberList[counter - 1] * productProcess(numberList, counter - 1);
    }
}

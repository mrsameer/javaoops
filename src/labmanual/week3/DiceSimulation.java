/*
Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed by
10000 ms ] and count number Successful attempts. successful attempt : If the pair of Dice results
in same values.
 */
package labmanual.week3;

import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) throws InterruptedException {
        final int num = 10; // dice are rolled 10 times

        Random generator = new Random();
        
        int die1Value;  // number of spots in the first die
        int die2Value;  // number of spots in the second die
        int count = 0;  // number of times the dice are rolled
        int ones = 0;  // number of times double one is rolled
        int twos = 0;  // number of times double two is rolled
        int threes = 0;  // number of times double three is rolled
        int fours = 0;  // number of times double four is rolled
        int fives = 0;  // number of times double five is rolled
        int sixes = 0;  // number of times double six is rolled

        while (count < num) {
            die1Value = generator.nextInt(6) + 1;
            Thread.sleep(10000);  // attempt is delayed by 10000ms
            die2Value = generator.nextInt(6) + 1;
            if (die1Value == die2Value) {
                if (die1Value == 1)
                    ones++;
                else if (die1Value == 2)
                    twos++;
                else if (die1Value == 3)
                    threes++;
                else if (die1Value == 4)
                    fours++;
                else if (die1Value == 5)
                    fives++;
                else
                    sixes++;
            }
            count++;
        }
        System.out.println("You rolled ones " + ones + " out of " + count + " rolls");
        System.out.println("You rolled twos " + twos + " out of " + count + " rolls");
        System.out.println("You rolled threes " + threes + " out of " + count + " rolls");
        System.out.println("You rolled fours " + fours + " out of " + count + " rolls");
        System.out.println("You rolled fives " + fives + " out of " + count + " rolls");
        System.out.println("You rolled sixes " + sixes + " out of " + count + " rolls");
    }
}

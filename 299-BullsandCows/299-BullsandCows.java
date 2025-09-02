// Last updated: 9/2/2025, 10:33:59 PM
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        int[] secretCounts = new int[10];
        int[] guessCounts = new int[10]; 

        for (int i = 0; i < secret.length(); i++) {
            char secretChar = secret.charAt(i);
            char guessChar = guess.charAt(i);

            if (secretChar == guessChar) {
                bulls++;  
            } else {
                
                secretCounts[secretChar - '0']++; 
                guessCounts[guessChar - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            cows += Math.min(secretCounts[i], guessCounts[i]);
        }

        return bulls + "A" + cows + "B";
    }
}
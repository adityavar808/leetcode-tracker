// Last updated: 11/8/2025, 2:07:00 AM
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
package HashMap;

public class PairsDivisibleByK {
    public boolean canArrange(int[] arr, int k) {
         int[] freq = new int[k];

         if(freq[0] % 2 != 0){
            return false;
        }
         for(int nums: arr){
            int rem = nums%k;
            if(rem < 0){
                rem += k ;
            }
            freq[rem]++;
         }
         for(int i = 1;i <= k / 2;i++){
            if(freq[i] != freq[k-i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         
    }
}


// Approach
// Initialize Frequency Array:
// Create an array freq of size k to store the frequency of each remainder when elements of arr are divided by k.

// Calculate Remainders:
// For each element num in arr, compute the remainder rem = num % k.
// If the remainder is negative, adjust it by adding k to make it positive.

// Update Frequency Array:
// Increment the value at index rem in the frequency array freq.

// Check for Remainder 0 Pairs:
// Ensure the frequency of numbers that are divisible by k (i.e., remainder 0) is even.
// If freq[0] is odd, return false since they can't form valid pairs.

// Check for Complementary Remainders:
// For each remainder i from 1 to k/2, check if freq[i] == freq[k-i].
// If not, return false since numbers with remainder i need an equal number of numbers with remainder k-i to form pairs.

// Return Result:
// If all checks pass, return true, indicating that valid pairs can be formed; otherwise, return false.


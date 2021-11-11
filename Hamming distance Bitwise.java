//###################### Hamming distance ######################
/*
The Hamming distance between two integers is the number
of positions at which the corresponding bits are different.
given 2 integers x and y, calculate the Hamming distance.

Input:  
    x=1 , y=4
Output = 2

Explanation:
1 (0001)
4 (0100)

It's a good chance to use XOR Bitwise.
if the 2 bits are different, return 1. else, return false.
*/

public class Solution{
    public int hammingDistance(int x, int y){
        int result;
        while(x>0 || y>0){
            //XOR the two LSB digits. if they're different it'll return 1.
            result += ((x%2)^(y%2)); //if a number is even, its last digit in binary is 0, else its 1.
            x >>=1; //shifting x once which is dividing x by 2.
            y >>=1; //shifting y.
        }
        return result;
    } //END hammingDistance
} //END Solution
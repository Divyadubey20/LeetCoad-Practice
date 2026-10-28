
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int t5 = 0;
        int t10 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                t5++;
            } 
            else if (bills[i] == 10) {
                if (t5 == 0) {
                    return false;
                }
                t5--;
                t10++;
            } 
            else if (bills[i] == 20) {
                if (t5 > 0 && t10 > 0) {
                    t5--;
                    t10--;
                } 
                else if (t5 >= 3) {
                    t5 -= 3;
                } 
                else {
                    return false;
                }
            }
        }

        return true;
    }
}

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
         int distance = 0, d=0;
    while (mainTank >=5) {
        d+=5;
        
        mainTank =(mainTank-5);

        if (additionalTank > 0) {
            mainTank += 1;
            additionalTank -= 1;
        }
    }
        d+=mainTank;

    return d*10;
        
    }
}
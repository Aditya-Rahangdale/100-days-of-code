class Solution {
    public List<String> fizzBuzz(int n) {
        String[] l=new String [n];
        while(n>0){
            if(n%15==0) l[n-1]="FizzBuzz";
            else if(n%3==0) l[n-1]="Fizz";
            else if(n%5==0) l[n-1]="Buzz";
            else l[n-1]=""+n;
            n--;
        }
        return Arrays.asList(l);
    }
}
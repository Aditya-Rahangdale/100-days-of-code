public class Dsaj6 {
    public static void main(String[] args) {
        int n=34567;
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}

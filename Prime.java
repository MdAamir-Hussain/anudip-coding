public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(19));  //t
        System.out.println(isPrime(49));  //f


    }

    public static boolean isPrime(int n){

        if(n ==0 || n ==1){
            return false;
        }

        if(n==2 ){
            return true;
        }


        for(int i=2; i*i <=n; i++){

            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}

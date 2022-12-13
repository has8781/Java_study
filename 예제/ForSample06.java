public class ForSample06{
    public static void main(String[] args){
        int i, sum=0;
        for(i=0; i<=10; i++){
            sum += i;
            System.out.print(i);
            if(i<=9)
            System.out.print("+");
            else{
                System.out.print("+");
                System.out.print(sum);
            }
        }
    }
}
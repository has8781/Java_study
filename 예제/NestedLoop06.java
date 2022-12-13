public class NestedLoop06 {
    public static void main(String[] args){
        int dan = 2;
        for(int i=2; i<9; i=i+3){
            for (int j=1; j<10; j++){
                dan = i;
                System.out.print(dan + " * " + j + " = " + dan*j + "\t");
                System.out.print((dan+1) + " * " + j + " = " + (dan+1)*j + "\t");                
                if(dan > 7){
                    System.out.println();
                }
                else{
                    System.out.print((dan+2) + " * " + j + " = " + (dan+2)*j + "\t");
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
public class Forloop{
    public static void main (String[] args){
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("i="+i+"   j="+j+" ");
            }
            System.out.println();
        }
        System.out.println("Out of for");
        
    }
}
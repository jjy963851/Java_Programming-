
public class Clac{
    final static int Second = 1000;
    public static void main(String[] args){
        
        Calc2 MIU = new Calc2() ;
        
        MIU.Change(100,200);
        MIU.Change2("I love you","What about you");
        System.out.println("is this your result?");
        for (char i = 'a'; i <= 'z'; i++)
        System.out.print(i + " ");
        
        int Minute = Second / 60;
        int second = Second % 60;
        System.out.println(Minute +"now is 0clock" + second + "now is minute");
        
        int Max(int x, int y){
            int result = x > y ? x : y;
            return result;
            
        
            
        }
    }
}
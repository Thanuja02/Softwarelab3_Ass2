import java.util.*;  

class ExceptionHandling {

    static {
        System.loadLibrary("ExceptionHandling");
    }

    public native void divideby0();

    public native void nullPtr(String k);

    public void division() {
        int k = 10/0;
    }

    public int stringLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        ExceptionHandling test = new ExceptionHandling();
        
        Scanner sc=new Scanner(System.in);
        
        int end=1;
        while(end!=0){
            System.out.println("Enter\n 1 to do Division by 0\n 2 for Null Pointer Exception\n 3 to exit : ");
            int key = sc.nextInt();
            if(key==1) {
                try {
                    test.divideby0();
                }
                catch(ArithmeticException e) {
                    System.out.println(e+"\n");
                }
            }
            if(key==2) {
                try {
                    String s = null;
                    test.nullPtr(s);
                }
                catch (NullPointerException e) {
                    System.out.println(e+"\n");
                }
            }
            if(key==3) {
                end=0;
            }
        }
    }
}

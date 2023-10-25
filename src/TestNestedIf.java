public class TestNestedIf {

    public static void main(String args[]) {
        int x = 30;
        int y = 10;
        int z = 20;

        if( x == 10 ) {
            if( y == 10 || z==10 ) {
                System.out.print("X = 30 and Y = 10");
            }
        }
    }
}

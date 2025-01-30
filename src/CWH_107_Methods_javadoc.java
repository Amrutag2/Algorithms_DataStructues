public class CWH_107_Methods_javadoc {
    /**
     * This is method_javadoc
     */
    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    /**
     * This is a method for addition
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return sum of two numbers as an integer
     * @throws Exception if a is zero
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int a, int b ) throws Exception{
        if(a==0){
            throw new Exception();
        }
        int c;
        c = a+b;
        return c;
    }
}

public class typeCasting {
    public static void main(String[] args) {
        // example 1
        int num = (int)(67.68f);
        System.out.println(num);
        //automatic type promotion in expressions
        int a = 300;
        byte b = (byte)(a);
        System.out.println("example1:\t"+b);

        //example 2
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 30;
        int c = b1*b2/b3; // automatically converted to integer
        System.out.println("example2:\t"+c);

        //example 3
        int n = 'a';
        System.out.println("example3:\t"+n); // automatically converted to integer

        //example 4
        byte by = 42;
        char ch ='v';
        short s = 1000;
        int it = 5000;
        double db = 0.1234;
        double result = (by*by)+(it/ch)-(db*s);
        System.out.println("example4:\t"+result);
    }
}

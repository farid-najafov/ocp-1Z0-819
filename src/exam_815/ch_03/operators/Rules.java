package exam_815.ch_03.operators;

public class Rules {
    public static void main(String[] args) {

        /**
         * if the type of the value can fit into the type of the variable
         * then no special treatment is required
         */
        byte b = 10;
        char c = 'x';
        short s = 300;


        // implicit widening conversion
        int i;
        long l;
        float f;
        double d;
        i = b;
        i = s;
        l = i;
        f = i;
        d = f;
        // target types are larger than source types: no special treatment required;
//  ====================================================================================================================

        // implicit narrowing conversion (applies only byte, short, char, int)
        /**
         * compiler doesn't execute any code, therefore, it cannot determine the
         * actual value held by the source variable unless that variable is a
         * compile time constant
         */
        byte b1 = 10; // compiles: 10 is an int literal but can fit into a byte;
//        byte b2 = 128; // doesn't compile: 128 is to large to be held by a byte

        int i1 = 10;
//        byte b3 = i1; // doesn't compile: i1 is not compile time constant

        final int i2 = 10;
        byte b4 = i2; // compiles: i2 is compile time constant;

        final int i3 = 128;
//        byte b5 = i1; // doesn't compile:  even though i3 is a compile time constant, its value can't fit into a byte

        // Note: compiler does this only for assignments not for method calls.
//  ====================================================================================================================

        // casting (explicit narrowing)
        /**
         * Since the compiler cannot determine the value held by variable which is not compile time constant,
         * it forces the programmer to make a promise (cast) that the value will fit into the target variable.
         * Boolean value cannot be casted to other type or vice versa
         *
         * When the actual value still does not fit to the target type after casting, overflow occurs, and
         * exception is not thrown (not necessary to know for the exam to determine the return value).
         */

        /**
         * Java allows implicit widening of int and long to float and double respectively, although
         * float and double lose precision.
         * The reverse is not allowed even though they are of same size (however their range is different).
         */
//  ====================================================================================================================

        // compound operators
        /**
         * Apart from being a shorthand for assignment operators, they save us form having explicitly cast a value.
         */
        long goat = 10;
        int sheep = 5;
//        sheep = sheep * goat; // does not compile
        sheep *= goat;
        /**
         * The compound operator will first cast sheep to a long, apply the
         * multiplication of two long values, and then cast the result to an int.
         */
    }
}

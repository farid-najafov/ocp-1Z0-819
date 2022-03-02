package exam_815.ch_02.java_building_blocks;

/**
 * inference type
 */
public class Var {
//    var trick = "Hello"; // doesn't compile. Only can be used as local variable
    // cannot be used with constructor or method parameters either.

    // var is not a reserved word and allowed to be used as an identifier, however
    // it's reserved type name: cannot be used to define a class, interface or enum.

    // type of var cannot change in runtime
    public void reassignment() {
        var num = 0;
        num = 1;
//        num = "1"; does not compile

//        var i; // won't compile. Must be assigned a value at the line of declaration
//        var a = 1, b = 2; // java doesn't allow var in multiple variable declaration
//        var s = null; // cannot be initialized to null without a type

        var s = "abs";
        s = null; // can be assigned null after it is declared
    }
}

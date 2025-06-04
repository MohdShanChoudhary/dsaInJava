
// Wrapper classes in Java are used to wrap primitive data types into objects. Each primitive type has a 
// corresponding wrapper class in the java.lang package. These classes are helpful when you need to use primitives in contexts that 
// require objects, such as with collections (like ArrayList) or generics.

// ✅ Primitive Types and Their Wrapper Classes
// Primitive Type	Wrapper Class
// byte	Byte
// short	Short
// int	Integer
// long	Long
// float	Float
// double	Double
// char	Character
// boolean	Boolean


public class WrapperClasses4 {

    public static void main(String[] args) {
        String[] names = {"Shan", "Amit", "Rahul", "Neha"};

        // Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}




///////////////////////////////////////////////////////////////////////////////////////////////////
// /// public class WrapperClassDemo {
//     public static void main(String[] args) {

//         // Primitive data types
//         int primitiveInt = 100;
//         char primitiveChar = 'A';
//         double primitiveDouble = 10.5;

//         // Boxing: Converting primitive to wrapper object
//         Integer boxedInt = Integer.valueOf(primitiveInt);
//         Character boxedChar = Character.valueOf(primitiveChar);
//         Double boxedDouble = Double.valueOf(primitiveDouble);

//         // Auto-boxing: Automatically converts primitive to object
//         Integer autoBoxedInt = primitiveInt;

//         // Unboxing: Converting wrapper object back to primitive
//         int unboxedInt = boxedInt.intValue();
//         char unboxedChar = boxedChar.charValue();
//         double unboxedDouble = boxedDouble.doubleValue();

//         // Auto-unboxing
//         int autoUnboxedInt = autoBoxedInt;

//         // Output
//         System.out.println("Boxed Integer: " + boxedInt);
//         System.out.println("Unboxed Integer: " + unboxedInt);
//         System.out.println("Boxed Character: " + boxedChar);
//         System.out.println("Unboxed Character: " + unboxedChar);
//         System.out.println("Boxed Double: " + boxedDouble);
//         System.out.println("Unboxed Double: " + unboxedDouble);
//         System.out.println("Auto-unboxed Integer: " + autoUnboxedInt);
//     }
// }



// In Java, a Wrapper Class is a class that wraps a primitive data type into an object. Java provides wrapper classes for each of the eight primitive data types so that they can be used where objects are required (like in collections such as ArrayList, HashMap, etc.).

// ✅ Primitive types and their Wrapper classes:
// Primitive Type	Wrapper Class
// byte	Byte
// short	Short
// int	Integer
// long	Long
// float	Float
// double	Double
// char	Character
// boolean	Boolean

// 📌 Why use Wrapper Classes?
// Collections (like ArrayList) only work with objects, not primitives.

// To convert primitive to object (Boxing) and object to primitive (Unboxing).

// Wrapper classes have useful methods, like parseInt(), compareTo(), etc.

// Required for serialization, multithreading, and Java Beans.


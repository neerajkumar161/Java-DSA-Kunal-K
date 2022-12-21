
public class Primitives {
  public static void main(String[] args) {
    /*
     * int num = 48;
     * long largeInteger = 39838847423939393l;
     * 
     * float marks = 455.34f;
     * double largeNum = 23334094944.4455;
     * 
     * char letterA = 'a';
     * boolean bool = true | false;
     */

    /*
     * We can create Primitives Data Types using Classes as well, there first letter
     * will be capital as below
     */
    Integer classInt = 89;
    String strValue = classInt.toString();

    // String is not Primitive
    /* String personName = "Neeraj Kumar"; */

    // System.out.println(num + " " + personName);
    /*
     * num.toString() -- not available, we need instance of Class for that as
     * classInt variable
     */
    System.out.println(classInt + 1); // 90
    System.out.println(strValue + 1); // 891
  }
}

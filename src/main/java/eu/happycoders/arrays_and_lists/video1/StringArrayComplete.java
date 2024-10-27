void main() {
  // "apple", "banana", "cherry"
  String[] fruits = {"apple", "banana", "cherry"};

  String[] fruits2 = new String[3];
  System.out.println("fruits2 = " + Arrays.toString(fruits2));
  fruits2[0] = "apple";
  System.out.println("fruits2 = " + Arrays.toString(fruits2));
  fruits2[1] = "banana";
  System.out.println("fruits2 = " + Arrays.toString(fruits2));
  fruits2[2] = "cherry";
  System.out.println("fruits2 = " + Arrays.toString(fruits2));

  String fruit = fruits2[0];
  int length = fruits2.length;

}
void main() {
  List<String> list = List.of("apple", "banana", "cherry", "date");

  Object[] objects = list.toArray();
  String[] strings0 = list.toArray(new String[0]);
  String[] strings4 = list.toArray(new String[4]);
  String[] strings6 = list.toArray(new String[6]);
  String[] strings1 = list.toArray(new String[1]);
  Object[] strings = list.toArray(String[]::new);

  System.out.println("objects = " + Arrays.toString(objects));
  System.out.println("strings0 = " + Arrays.toString(strings0));
  System.out.println("strings4 = " + Arrays.toString(strings4));
  System.out.println("strings6 = " + Arrays.toString(strings6));
  System.out.println("strings1 = " + Arrays.toString(strings1));
  System.out.println("strings = " + Arrays.toString(strings));

}
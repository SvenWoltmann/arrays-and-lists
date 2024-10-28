void main() {
  String[] array = {"apple", "banana", "cherry", "date"};
  List<String> list = new ArrayList<>(Arrays.asList(array));

  System.out.println("array = " + Arrays.toString(array));
  System.out.println("list = " + list);

  list.set(2, "cantaloupe");
  System.out.println("array = " + Arrays.toString(array));
  System.out.println("list = " + list);

  array[1] = "blackberry";
  System.out.println("array = " + Arrays.toString(array));
  System.out.println("list = " + list);

  list.add("egg plant");
  list.removeFirst();
  System.out.println("array = " + Arrays.toString(array));
  System.out.println("list = " + list);

}
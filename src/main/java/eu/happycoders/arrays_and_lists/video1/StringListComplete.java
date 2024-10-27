void main() {
  // "apple", "banana", "cherry"
  List<String> fruits = new ArrayList<>();
  fruits.add("apple");
  fruits.add("banana");
  fruits.add("cherry");
  System.out.println("fruits = " + fruits);

  fruits.add("date");
  fruits.addFirst("ananas");
  fruits.add(3, "cantaloupe");
  System.out.println("fruits = " + fruits);

  fruits.removeFirst();
  fruits.removeLast();
  fruits.remove(1);
  fruits.set(0, "avocado");
  System.out.println("fruits = " + fruits);

  System.out.println("fruits.getFirst() = " + fruits.getFirst());
  System.out.println("fruits.getLast() = " + fruits.getLast());
  System.out.println("fruits.get(1) = " + fruits.get(1));
  System.out.println("fruits.size() = " + fruits.size());

  List<String> fruits2 =
      new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

  List<String> fruits3 = Arrays.asList("apple", "banana", "cherry");

  List<String> fruits4 = List.of("apple", "banana", "cherry");

}
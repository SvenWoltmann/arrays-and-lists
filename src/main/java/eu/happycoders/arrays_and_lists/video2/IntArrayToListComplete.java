import com.google.common.primitives.Ints;
import org.apache.commons.lang3.ArrayUtils;

void main() {
  int[] array = {1, 43, 31, 8, 19, 41};

  // These don't work, they will create Lists of int arrays:
  // List<int[]> list = Arrays.asList(array);
  // List<int[]> list = List.of(array);

  // Option 1 - iteration:
  List<Integer> list1 = new ArrayList<>();
  for (int i : array) {
    list1.add(i);
  }
  System.out.println("list1 = " + list1);

  // Option 2 - stream:
  List<Integer> list2 = Arrays.stream(array).boxed().toList();
  System.out.println("list2 = " + list2);

  // Option 3 - Guava:
  List<Integer> list3 = Ints.asList(array);
  System.out.println("list3 = " + list3);

  // Option 4 - Apache Commons Lang:
  Integer[] integers = ArrayUtils.toObject(array);
  List<Integer> list4 = Arrays.asList(integers);
  System.out.println("list4 = " + list4);

}
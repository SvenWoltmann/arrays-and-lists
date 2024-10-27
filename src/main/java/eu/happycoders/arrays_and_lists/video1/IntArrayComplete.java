void main() {
  // 1, 43, 31, 8, 19, 41
  int[] numbers = {1, 43, 31, 8, 19, 41};
  System.out.println("numbers = " + Arrays.toString(numbers));

  int[] temp = new int[7];
  System.arraycopy(numbers, 0, temp, 0, 6);
  temp[6] = 3;
  numbers = temp;
  System.out.println("numbers = " + Arrays.toString(numbers));

  int[] numbers2 = new int[6];
  System.out.println("numbers2 = " + Arrays.toString(numbers2));
  numbers2[0] = 1;
  System.out.println("numbers2 = " + Arrays.toString(numbers2));
  numbers2[1] = 43;
  System.out.println("numbers2 = " + Arrays.toString(numbers2));
  numbers2[2] = 31;
  System.out.println("numbers2 = " + Arrays.toString(numbers2));
  numbers2[3] = 8;
  System.out.println("numbers2 = " + Arrays.toString(numbers2));
  numbers2[4] = 19;
  System.out.println("numbers2 = " + Arrays.toString(numbers2));
  numbers2[5] = 41;
  System.out.println("numbers2 = " + Arrays.toString(numbers2));

  System.out.println("numbers2[2] = " + numbers2[2]);
  System.out.println("numbers2.length = " + numbers2.length);

}
public class BubbleSort{
  private void printArray(int[] array){
    for(int i = 0 ; i < array.length; i++){
      System.out.print(array[i]+"  ");
    }
    System.out.println();
  }

  private void swapArrayElements(int[] array, int indexa, int indexb){
    int tmp = array[indexa];
    array[indexa] = array[indexb];
    array[indexb] = tmp;
  }

  public void bubbleSort(int[] arrayToSort){
      for(int i = 0; i < arrayToSort.length; i++){
        for(int j = 0; j< arrayToSort.length; j++){
          if(arrayToSort[i] > arrayToSort[j]){
            swapArrayElements(arrayToSort,i,j);
          }
        }
        System.out.println("Sorting : Pass "+i);
        printArray(arrayToSort);
      }
  }

  public static void main(String[] args){
    BubbleSort bubbleSort = new BubbleSort();

    int[] array = new int[]{};
    System.out.println("Array before sorting");
    bubbleSort.printArray(array);
    bubbleSort.bubbleSort(array);
    System.out.println("Array after sorting");
    bubbleSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{1,2,3,4,5};
    System.out.println("Array before sorting");
    bubbleSort.printArray(array);
    bubbleSort.bubbleSort(array);
    System.out.println("Array after sorting");
    bubbleSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{5,4,3,2,1};
    System.out.println("Array before sorting");
    bubbleSort.printArray(array);
    bubbleSort.bubbleSort(array);
    System.out.println("Array after sorting");
    bubbleSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{0,0,0,0,0,0};
    System.out.println("Array before sorting");
    bubbleSort.printArray(array);
    bubbleSort.bubbleSort(array);
    System.out.println("Array after sorting");
    bubbleSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{3,2,4,5,1,6,8,7};
    System.out.println("Array before sorting");
    bubbleSort.printArray(array);
    bubbleSort.bubbleSort(array);
    System.out.println("Array after sorting");
    bubbleSort.printArray(array);
    System.out.println("----------------------\n\n\n");
  }

}

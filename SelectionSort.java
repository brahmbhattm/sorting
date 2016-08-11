public class SelectionSort{
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

  public void selectionSort(int[] arrayToSort){
    int indexMinJ;
    for(int i = 0; i < arrayToSort.length - 1; i++){
      indexMinJ = i;
      for(int j = i+1; j< arrayToSort.length; j++){
        if(arrayToSort[j] < arrayToSort[indexMinJ]){
          indexMinJ = j;
        }
      }
      if(indexMinJ!= i) {
        swapArrayElements(arrayToSort,i,indexMinJ);
      }
      
      System.out.println("Sorting : Pass "+i);
      printArray(arrayToSort);
    }
  }

  public static void main(String[] args){
    SelectionSort selectionSort = new SelectionSort();

    int[] array = new int[]{};
    System.out.println("Array before sorting");
    selectionSort.printArray(array);
    selectionSort.selectionSort(array);
    System.out.println("Array after sorting");
    selectionSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{1,2,3,4,5};
    System.out.println("Array before sorting");
    selectionSort.printArray(array);
    selectionSort.selectionSort(array);
    System.out.println("Array after sorting");
    selectionSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{5,4,3,2,1};
    System.out.println("Array before sorting");
    selectionSort.printArray(array);
    selectionSort.selectionSort(array);
    System.out.println("Array after sorting");
    selectionSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{0,0,0,0,0,0};
    System.out.println("Array before sorting");
    selectionSort.printArray(array);
    selectionSort.selectionSort(array);
    System.out.println("Array after sorting");
    selectionSort.printArray(array);
    System.out.println("----------------------\n\n\n");

    array = new int[]{3,2,4,5,1,6,8,7};
    System.out.println("Array before sorting");
    selectionSort.printArray(array);
    selectionSort.selectionSort(array);
    System.out.println("Array after sorting");
    selectionSort.printArray(array);
    System.out.println("----------------------\n\n\n");
  }

}

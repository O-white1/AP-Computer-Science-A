package Q2;

public class SortingLibrary {

    public void BubbleSort(int[] arr) { // O(n)
        for (int i = 0; i<arr.length; i++)
            for (int j = 0;j<arr.length; j++)
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int small = i;

            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[small])
                    small = j;

            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
    }

}
/*


def SelectionSort(arr) ->None: # O(n²)
    for i in range(1, arr.length-1):
        small = arr[i]
        for j in range(1, arr.length-1):
            if arr[j]<small:
                i = j
        temp   = arr[i]
        arr[i] = arr[i]
        arr[i] = temp

def InsertionSort(arr) -> None: # O(n) -> O(n²)
    for i in range(1, len(arr)):
        key = arr[i]
        j   = i - 1

        while j>=0 and key < arr[j]:
            arr[j+1] = arr[j]
            j -= 1

        arr[j+1] = key
 */

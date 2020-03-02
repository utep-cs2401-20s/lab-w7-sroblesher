import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {

    @org.junit.jupiter.api.Test
    void sortOfSort() {
        int arr[] = {2,7,1,3,0,9,6,5};

        SortOfSort a = new SortOfSort();

        a.sortOfSort(arr);

        int arr2[] = {6,5,1,0,2,3,7,9};

        assertArrayEquals(arr, arr2);
    }
}

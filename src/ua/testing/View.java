package ua.testing;

/**
 * <h1>Arrays MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-06
 */
public class View {
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String INPUT_COUNT_ARR = "Input count of array elements: ";
    public static final String INPUT_MIN_BOUNDARY = "Input min value of boundary of random array elements: ";
    public static final String INPUT_MAX_BOUNDARY = "Input max value of boundary of random array elements: ";

    public static final String SUM_ELEM = "Sum of array elements: ";
    public static final String MAX_VAL = "Max value: ";
    public static final String MAX_INDEX = "; max index: ";
    public static final String MIN_VAL = "Min value: ";
    public static final String MIN_INDEX = "; min index: ";
    public static final String AVER = "Average: ";
    public static final String COUNT = "Count: ";

    public static final String COUNT_EQUAL_ZERO = "Count of array elements equal zero: ";
    public static final String SUM_MORE_ZERO = "Sum of array elements more than zero: ";

    public static final String POSITIVE_NOT_FOUND = "Positive elements not found.";
    public static final String NEGATIVE_NOT_FOUND = "Negative elements not found.";
    public static final String VAL_NOT_FOUND = "Value not found in the array.";

    public static final String FIRST_POSITIVE_ELEM = "First positive array element: ";
    public static final String LAST_NEGATIVE_ELEM = "Last negative array element: ";

    public static final String ARR_SORT_ASC = "Array is sorted by ascending.";
    public static final String ARR_NOT_SORT_ASC = "Array is not sorted by ascending.";
    public static final String ARR_SORT_DESC = "Array is sorted by descending.";
    public static final String ARR_NOT_SORT_DESC = "Array is not sorted by descending.";

    public static final String AVER_ELEM = "Average of array elements: ";
    public static final String COUNT_ELEM = ". Count of array elements more than average: ";

    public static final String COUNT_EQUAL_FIRST_ELEM = "Count of array elements equal to the first element: ";
    public static final String EMPTY_STRING = "";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String message) {
        System.err.println(message);
    }
}

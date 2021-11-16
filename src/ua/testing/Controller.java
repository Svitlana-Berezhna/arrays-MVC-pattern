package ua.testing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Arrays MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-06
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        arrayInitializationWithScanner(model, sc);
        model.getArrayToString(model.getNumberArray());

        view.printMessage(view.SUM_ELEM + model.getSumArrayElements());

        view.printMessage(view.MAX_VAL + model.getMaxArrayElement().get(0) + view.MAX_INDEX +
                model.getMaxArrayElement().get(1));

        view.printMessage(view.MIN_VAL + model.getMinArrayElement().get(0) + view.MIN_INDEX +
                model.getMinArrayElement().get(1));

        view.printMessage(view.AVER + model.getAverageArrayElements());

        view.printMessage(view.COUNT + model.getCountOfArrayElementsEqualToValue(inputIntValueWithScanner(sc)));

//        Count the number of elements equal to zero.
        view.printMessage(view.COUNT_EQUAL_ZERO + model.getCountOfArrayElementsEqualToValue(0));

        view.printMessage(view.SUM_MORE_ZERO + model.getCountOfArrayElementsMoreThanZero());

        model.multiplyArrayElementsByNumber(inputIntValueWithScanner(sc));
        model.getArrayToString(model.getNumberArray());

        model.addIndexToArrayElements();
        model.getArrayToString(model.getNumberArray());

        model.setZeroToEvenInValueArrayElements();
        model.getArrayToString(model.getNumberArray());

        model.setZeroToOddIndexArrayElements();
        model.getArrayToString(model.getNumberArray());

        if (model.getFirstPositiveArrayElement() < 0) {
            view.printMessage(view.POSITIVE_NOT_FOUND);
        } else {
            view.printMessage(view.FIRST_POSITIVE_ELEM + model.getFirstPositiveArrayElement());
        }

        if (model.getLastNegativeArrayElement() > 0) {
            view.printMessage(view.NEGATIVE_NOT_FOUND);
        } else {
            view.printMessage(view.LAST_NEGATIVE_ELEM + model.getLastNegativeArrayElement());
        }

        int value = inputIntValueWithScanner(sc);
        model.getIndexesOfOccurrenceOfElementInArray(value);
        if (model.getIndexesOfOccurrenceOfElementInArray(value).size() == 0) {
            view.printMessage(view.VAL_NOT_FOUND);
        } else {
            for (int index : model.getIndexesOfOccurrenceOfElementInArray(value)) {
                view.printMessage(view.EMPTY_STRING + index);
            }
        }

        if (model.checkArrayForSortAscOrder(model.getNumberArray())) {
            view.printMessage(view.ARR_SORT_ASC);
        } else {
            view.printMessage(view.ARR_NOT_SORT_ASC);
        }

        if (model.checkArrayForSortDescOrder()) {
            view.printMessage(view.ARR_SORT_DESC);
        } else {
            view.printMessage(view.ARR_NOT_SORT_DESC);
        }

        model.cyclicShiftOfArrayElementsToTheRight(inputIntValueWithScanner(sc));
        model.getArrayToString(model.getNumberArray());

        ArrayList<Integer> duplicates = model.getDuplicateArrayElements();
        for (Integer duplicate : duplicates) {
            view.printMessage(view.EMPTY_STRING + duplicate);
        }

        view.printMessage(View.AVER_ELEM + model.getAverageArrayElements() + View.COUNT_ELEM +
                model.getCountOfArrayElementsMoreThanAverage());

        ArrayList<Integer> uniqueElements = model.getUniqueArrayElements();
        view.printMessage(view.EMPTY_STRING + uniqueElements);

        Model model2 = new Model();
        arrayInitializationWithScanner(model2, sc);
        model2.getArrayToString(model2.getNumberArray());

        ArrayList<Integer> uniqueElements1 = model.getUniqueArrayElementsComparedToTheSecondArray(model2.getNumberArray());
        view.printMessage(view.EMPTY_STRING + uniqueElements1);

        view.printMessage(view.COUNT_EQUAL_FIRST_ELEM + model.getCountArrayElementsEqualToTheFirstElement());

        int[] resultArray = model.getSortedArrayByConcatTwoSortedArrays(model2.getNumberArray());
        model.getArrayToString(resultArray);

        model.SwapPositiveArrayElements();
        model.getArrayToString(model.getNumberArray());
    }

    private int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printErrorMessage(View.WRONG_INPUT_INT_DATA);
            view.printMessage(View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    private void arrayInitializationWithScanner(Model model, Scanner sc) {
        view.printMessage(View.INPUT_COUNT_ARR);
        model.setLengthArray(inputIntValueWithScanner(sc));

        view.printMessage(View.INPUT_MIN_BOUNDARY);
        model.setMinBoundary(inputIntValueWithScanner(sc));

        view.printMessage(View.INPUT_MAX_BOUNDARY);
        model.setMaxBoundary(inputIntValueWithScanner(sc));

        model.setArrayElements();
    }
}

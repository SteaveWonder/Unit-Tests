package Main.hw6;

import java.util.List;

public class ListCompare {
    public double average(List<Integer> request) {
        return request.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
    public String compareAverage(List<Integer> list1, List<Integer> list2) {
        double resultList1 = average(list1);
        double resultList2 = average(list2);

        if (resultList2 > resultList1) {
            return "Second list has a higher average value";
        } else if (resultList2 < resultList1) {
            return "First list has a higher average value";
        } else {
            return "The average values are equal";
        }
    }
}

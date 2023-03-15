package onboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();
        //sort를 이용하여 정렬
        Collections.sort(numbers);
        int avg = (numbers.get(0)+numbers.get(1)+numbers.get(2)+numbers.get(3)+numbers.get(4))/5;
        int mid = numbers.get(2);
        answer.add(avg);
        answer.add(mid);
        return answer;
    }
}

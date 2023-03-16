package onboard;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer =0;

        ArrayList<Integer> ans = new ArrayList<>();
        //각자릿수를 arraylist에 입력
        while(number>0){
            ans.add(number%10);
            number/=10;
        }
        //오름차순으로 sort
        ans.sort(Comparator.naturalOrder());
        //10씩 곱하면서 더하기
        for(int i=0;i<ans.size();i++){
            answer+=(int)(ans.get(i)*Math.pow(10,i));
        }
        return answer;
    }
}

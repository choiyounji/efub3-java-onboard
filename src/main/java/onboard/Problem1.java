package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();
        //45분 이상인 경우 그냥 45분만 빼주면 됨
        if(minute>=45){
            minute-=45;

        }
        //45분 미만이었을 경우 시간은 -1, 분은 60분을 더해주고 45분을 뺴면 됨
        else{
            minute=minute+60-45;
            //0시였을 경우에는 23시가 되므로 따로 처리
            if(hour==0){
                hour=23;
            }
            else{
                hour--;}
        }
        answer.add(hour);
        answer.add(minute);
        return answer;
    }
}

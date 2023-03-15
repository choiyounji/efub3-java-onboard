package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {};
        Integer[] cardlist ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<10;i++){
            //카드가 1부터 시작하므로 인덱싱 처리
            int start=flipCards[i][0]-1;
            int end=flipCards[i][1]-1;
            //카드 개수가 홀수개라 가운데 카드는 그대로 둬도 됨
            if((end-start)%2==0){
                for(int j=0;j<(end-start)/2;j++){
                    int temp=cardlist[end-j];
                    cardlist[end-j]=cardlist[j+start];
                    cardlist[j+start]=temp;
                }
            }
            //카드 개수가 짝수개라 반복을 끝까지 해댜 됨
            else{
                for(int j=0;j<=(end-start)/2;j++){
                    int temp=cardlist[end-j];
                    cardlist[end-j]=cardlist[j+start];
                    cardlist[j+start]=temp;
                }
            }
        }
        answer=cardlist;
        return answer;
    }
}

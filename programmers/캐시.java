import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList c = new ArrayList(cacheSize);
        
        if(cacheSize == 0) return cities.length*5; 
        for(int i=0;i<cities.length;i++) {
            //캐시에 있는 지 판단
            if(c.contains(cities[i].toLowerCase())) {
                answer+=1;
                c.remove(cities[i].toLowerCase());
                c.add(cities[i].toLowerCase());
            } else {
                answer+=5;
                if(c.size()==cacheSize)
                    c.remove(0);
                c.add(cities[i].toLowerCase());
            }
        }
        return answer;
    }
}

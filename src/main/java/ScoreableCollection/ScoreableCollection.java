package ScoreableCollection;

import java.util.*;

/*
    Scoreable 객체의 컬렉션 평균 반환
    Scoreable 객체는 점수를 갖는다.
 */

public class ScoreableCollection
{
    private List<Scoreable> scores = new ArrayList<>();
    
    public void add(Scoreable scoreable)
    {
        scores.add(scoreable);
    }

    public int arithmeticMean()
    {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();

        return total / scores.size();
    }
}

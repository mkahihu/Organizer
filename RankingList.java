/* Name: Cristopher Alvarado and Miller Kahihu
 * Date: 05/24/16
 * CS 406 Final Project - Ranking List Method
 */ 

public class RankingList implements Comparable<RankingList> {
    private final String ranking;
    private final int score;

    public RankingList(String ranking, int score) {
        this.ranking = ranking;
        this.score = score;
    }

    public String ranking() {
        return ranking;
    }

    public int score() {
        return score;
    }

    public boolean equals(Object o) {
        if (!(o instanceof RankingList))
            return false;
        RankingList rankingList = (RankingList) o;
        return rankingList.ranking.equals(ranking) && rankingList.score == score;
    }

    // public int hashCode() {
    //    return your hash;
    // }

    public String toString(){
        return "Rank: " + ranking +", points = " + score ;
    }

    public int compareTo(RankingList rankingList) {
        return score > rankingList.score ? 1 : score < rankingList.score ? -1 : 0;
    }
}
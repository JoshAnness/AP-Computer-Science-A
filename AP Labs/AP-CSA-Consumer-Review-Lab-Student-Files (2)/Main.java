
class Main {
  public static void main(String[] args) {
    //System.out.print(Review.sentimentVal("josh"));
    System.out.println("Total Sentiment: " + Review.totalSentiment("simpleReview.txt")); //-2.9
    System.out.println("Total Sentiment: " + Review.totalSentiment("26WestReview.txt"));
    System.out.println("Total Sentiment: " + Review.totalSentiment("sampleReview.txt"));
    System.out.println("Star Rating: " + Review.starRating("simpleReview.txt"));
    System.out.println("Star Rating: " + Review.starRating("26WestReview.txt"));
    System.out.println("Star Rating: " + Review.starRating("sampleReview.txt"));
    //Review.print("sampleReview.txt");
  }
}
import util.crawler.RTQCrawler;

public class Test {

	public static void main(String[] args) {
		RTQCrawler crawler = new RTQCrawler();
		String rank[] = crawler.crawlRank();
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
	}

}

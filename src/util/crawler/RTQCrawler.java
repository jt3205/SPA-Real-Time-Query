package util.crawler;

import org.jsoup.select.Elements;;

public class RTQCrawler {
	Crawler crawler;
	Elements elements;
	
	String rank[] = new String[20];
	
	public String[] crawlRank(){
		crawler = new Crawler("https://www.naver.com/");
		elements = crawler.getElements(".ah_l > .ah_item > .ah_a > .ah_k");
		for (int i = 0; i < 20; i++) {
			rank[i] = elements.get(i).text();
		}
		return rank;
	}
}

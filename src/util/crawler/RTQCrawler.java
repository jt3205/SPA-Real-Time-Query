package util.crawler;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;;

public class RTQCrawler {
	Crawler crawler;
	Elements elements;
	Element element;
	
	String rank[] = new String[20];
	
	public String[] crawlRank(){
		crawler = new Crawler("https://www.naver.com/");
		elements = crawler.getElements(".ah_l > .ah_item > .ah_a > .ah_k");
		for (int i = 0; i < 20; i++) {
			rank[i] = elements.get(i+1).text();
		}
		return rank;
	}
}

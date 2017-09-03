
package util.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawler {
	private String url;
	
	public Crawler(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	
	public Elements getElements(String form) {
		if(url != "" && url != null){
			try {
				Document doc = Jsoup.connect(url).get();
				Elements menu = doc.select(form);
				return menu;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
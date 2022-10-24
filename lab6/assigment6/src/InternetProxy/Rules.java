package InternetProxy;
import java.util.ArrayList;



public class Rules {
	ArrayList<String> blacklist = new ArrayList<>();
	public boolean filter(String url)
	{
		for (String link : blacklist) {
			if(url.contains(link))
			{
				return false;
			}
		}
		return true;
	}

}

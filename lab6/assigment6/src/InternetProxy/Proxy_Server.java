package InternetProxy;


public class Proxy_Server {
	Internet internet = new Internet();

	public String request(Rules r,String url)
	{

		//TODO something with rules
		
		if(r.filter(url))
			return internet.request(url);
		return url+" is blocked!";
	}
}

import InternetProxy.Boss_rules;
import InternetProxy.Employe_rules;
import InternetProxy.Managger_rules;
import InternetProxy.Proxy_Server;
import InternetProxy.Rules;




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

		Proxy_Server server = new Proxy_Server();

		String respons;

		Rules boss = new Boss_rules();
		Rules managger = new Managger_rules();
		Rules employe = new Employe_rules();




		respons = server.request(boss, "doughnutkitten.com");
		System.out.println(respons);

		respons = server.request(managger, "facebook.com");
		System.out.println(respons);
		
		respons = server.request(employe, "youtube.com");
		System.out.println(respons);



    }
}

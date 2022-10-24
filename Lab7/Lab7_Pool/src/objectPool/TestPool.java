package objectPool;

public class TestPool {

	public static void main(String[] args) {
		//In practice these queries would be spread throughout your application, not in a single code block
		
		//Open a new connection
		DBConnection c1 = new DBConnection("some_db::far_away");
		//Let's query something
		System.out.println(c1.query("SELECT * FROM people"));
		//We are done, close the connection
		c1.close();
		
		//Open a new connection
		DBConnection c2 = new DBConnection("some_db::far_away");
		//Let's query something
		System.out.println(c2.query("SELECT * FROM people WHERE age > 10"));
		//We are done, close the connection
		c2.close();
	}

}

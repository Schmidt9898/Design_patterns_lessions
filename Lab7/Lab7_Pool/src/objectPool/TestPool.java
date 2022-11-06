package objectPool;

import java.util.LinkedList;
import java.util.Queue;

public class TestPool {

	public static void main(String[] args) {
		//In practice these queries would be spread throughout your application, not in a single code block

		Connection_Pool dbpool = Connection_Pool.get_instance(); 


		
		//Open a new connection
		DBConnection c1 = dbpool.getdb();		//new DBConnection("some_db::far_away");
		//Let's query something
		System.out.println(c1.query("SELECT * FROM people"));
		//We are done, close the connection
		dbpool.givback(c1);
		
		//Open a new connection
		DBConnection c2 = dbpool.getdb();		//new DBConnection("some_db::far_away");
		//Let's query something
		System.out.println(c2.query("SELECT * FROM people WHERE age > 10"));
		//We are done, close the connection
		dbpool.givback(c2);
	}

}

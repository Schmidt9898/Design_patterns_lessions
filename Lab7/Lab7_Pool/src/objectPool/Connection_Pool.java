package objectPool;

import java.util.LinkedList;
import java.util.Queue;

public class Connection_Pool {


	static Connection_Pool Single = null;

	static Connection_Pool get_instance()
	{
		if (Single == null)
			Single = new Connection_Pool();
		return Single;
	}


	Queue<DBConnection> free = new LinkedList<>();
	Queue<DBConnection> used = new LinkedList<>();



	Connection_Pool()
	{
	//	free.add(new DBConnection("some_db::far_away"));
	}
	public DBConnection getdb()
	{
		if(free.isEmpty())
		{
			free.add(new DBConnection("some_db::far_away"));
		}
		DBConnection t = free.remove();
		used.add(t);
		return t;
	}
	public void givback(DBConnection db)
	{
		if(used.contains(db))
		{
			used.remove(db);
		}
		free.add(db);
	}




}

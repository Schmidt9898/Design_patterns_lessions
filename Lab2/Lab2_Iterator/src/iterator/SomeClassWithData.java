package iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SomeClassWithData implements Collection
{
    private TreeSet < Integer > m_data = new TreeSet < Integer > ();

    public void add(int in)
    {
        m_data.add(in);
    }
    
	
/*	
	public Collection get_data()
    {
        return m_data;
    }
*/
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}


}
package singleton;

public class GlobalClass
{
    protected int m_value;
  
    public static GlobalClass global_ptr = null;
    
    private GlobalClass() {
    		m_value = 0;
    }
    private GlobalClass(int v)
    {
        m_value = v;
    }
	public static GlobalClass get_instance()
	{
		if(global_ptr == null)
			global_ptr = new GlobalClass();
		return global_ptr;
	} 

    public int get_value()
    {
        return m_value;
    }
    public void set_value(int v)
    {
        m_value = v;
    }
};
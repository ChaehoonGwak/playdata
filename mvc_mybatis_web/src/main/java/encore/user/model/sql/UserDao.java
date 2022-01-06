package encore.user.model.sql;

import java.util.List;

public interface UserDao {
	public Object loginRow(Object obj);
	public int registerRow(Object obj);
	public List<Object> bbsListRow();

}

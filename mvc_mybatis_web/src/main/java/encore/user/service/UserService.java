package encore.user.service;

import java.util.List;

import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;

public interface UserService {
	public Object loginService(Object obj);
	public int registerService(Object obj);
	public List<Object> listService();

}

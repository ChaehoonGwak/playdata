package encore.user.service;

import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;

public interface UserService {
	public UserVO loginService(UserDTO obj);

}

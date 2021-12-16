package encore.user.service;

import encore.user.model.sql.UserDao;
import encore.user.model.sql.UserDaoImpl;
import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;

public class UserServiceImpl implements UserService{
	private UserDao dao;
	
	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}
	
	@Override
	public Object loginService(UserDTO obj) {
		System.out.println(">>> user service login");
		return dao.loginRow(obj);
	}

}

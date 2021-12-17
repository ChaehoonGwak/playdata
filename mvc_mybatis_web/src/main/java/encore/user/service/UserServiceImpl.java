package encore.user.service;

import java.util.List;

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
	public Object loginService(Object obj) {
		System.out.println(">>> user service login");
		return dao.loginRow(obj);
	}

	@Override
	public int registerService(Object obj) {
		System.out.println(">>> user service register");
		return dao.registerRow(obj);
	}

	@Override
	public List<Object> listService() {
		System.out.println(">>> user service bbs");
		return dao.bbsListRow();
	}

}
package woowahan.baemin_waiting.team_six.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Override
	public void insertUser(UserVO pvo) throws Exception {
		userDAO.insertUser(pvo);
	}
	
	
}

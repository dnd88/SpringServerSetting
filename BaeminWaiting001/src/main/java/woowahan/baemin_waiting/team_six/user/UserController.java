package woowahan.baemin_waiting.team_six.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="User_insertUser.do")
	public void insertUser(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
		System.out.println("insertUser 컨트롤러 돌기시작");
		UserVO pvo = new UserVO(); 
		
		pvo.setUserId(request.getParameter("id"));
		pvo.setUserPassword(request.getParameter("password"));
		pvo.setUserName(request.getParameter("name"));
		pvo.setUserNumber(Integer.parseInt(request.getParameter("number")));
		
		userService.insertUser(pvo);
		System.out.println("user insert done");
	}
}

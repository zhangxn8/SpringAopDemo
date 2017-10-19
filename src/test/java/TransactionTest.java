import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import com.aop.model.User;
import com.aop.service.UserService;


public class TransactionTest {

	@Test
	public void test1(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationContext.xml");
		UserService userService=applicationContext.getBean(UserService.class);
		User user=new User();
		user.setId(Long.parseLong("666"));
		user.setPassWord("123");
		user.setUserName("puer");
		
	    userService.addUser(user);
	    userService.deleteUser("puer");
	}
	
}

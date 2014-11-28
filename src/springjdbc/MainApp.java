package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) throws ClassNotFoundException {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"springjdbc/simpledbconnectivity/jdbcContext.xml");
	IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
	//int userId = generateId();
	User user = new User(1001, "apurav", "12345", false);
	dao.insertUser(user);
	System.out.println("User inserted with id= " + 1001);
//	dao.deleteUser(984);
}
}
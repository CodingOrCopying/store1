package jayce.store.mapper;


import jayce.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {
    @Autowired
    public UserMapper mapper;

    @Test
    public  void insert(){
        User user = new User();
        user.setUsername("JAYCE");
        user.setPassword("huang");
         Integer rows = mapper.insert(user);//实现抽象类
        System.out.println(rows);

    }
}

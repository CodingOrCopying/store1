package jayce.store.mapper;

import jayce.store.entity.User;


/**
 * 接口，映射 mybatis的mapper
 * 处理用户数据的持久层接口
 */
public interface UserMapper {
    /**
     * 插入数据
     * @param user 用户数据
     * @return 受影响的行数
     */
    Integer insert(User user);

}

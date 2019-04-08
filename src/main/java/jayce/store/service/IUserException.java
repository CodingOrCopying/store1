package jayce.store.service;

import jayce.store.entity.User;
import jayce.store.service.ex.InsertException;
import jayce.store.service.ex.UsernameDuplicateException;

/**
 * 业务异常的基类
 */
public interface IUserException  {
    /**
     * 用户注册
     * @param user 用户即将要注册的数据
     * @throws UsernameDuplicateException
     * @throws InsertException
     */
    void reg(User user)throws UsernameDuplicateException, InsertException;
}

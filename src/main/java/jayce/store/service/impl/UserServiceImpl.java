package jayce.store.service.impl;

import jayce.store.entity.User;
import jayce.store.mapper.UserMapper;
import jayce.store.service.IUserException;
import jayce.store.service.ex.InsertException;
import jayce.store.service.ex.UsernameDuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserException {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void reg(User user) throws UsernameDuplicateException, InsertException {

    }
}

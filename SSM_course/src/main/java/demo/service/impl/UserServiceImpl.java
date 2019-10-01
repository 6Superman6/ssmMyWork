package demo.service.impl;

import demo.service.UserService;
import demo.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
//public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
public class UserServiceImpl extends BaseServiceImpl implements UserService {
    @Override
    public String insert(Object o) {
        return null;
    }

    @Override
    public String delete(Integer id) {
        return null;
    }

    @Override
    public String update(Object o) {
        return null;
    }

    @Override
    public Object select(Integer id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public int getCountById(Integer id) {
        return 0;
    }

    @Override
    public Object selectByUsername(String username) {
        return null;
    }
}

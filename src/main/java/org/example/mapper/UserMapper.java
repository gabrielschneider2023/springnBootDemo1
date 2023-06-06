package org.example.mapper;
import org.example.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insertUser(User user);

    User getByUserNameAndPassword(User user);
}

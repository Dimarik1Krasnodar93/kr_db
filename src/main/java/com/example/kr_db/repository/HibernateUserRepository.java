package com.example.kr_db.repository;

import com.example.kr_db.model.User;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class HibernateUserRepository implements UserRepository {
    private final SessionFactory sessionFactory;
    private final CrudRepository crudRepository;

    public static final String FIND_ALL = "SELECT * FROM User";

    @Override
    public List<User> findAll() {
        return crudRepository.query(FIND_ALL, User.class, new HashMap<>());
    }
}

package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by zach on 12/10/15.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}

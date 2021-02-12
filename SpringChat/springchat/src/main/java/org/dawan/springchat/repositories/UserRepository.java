package org.dawan.springchat.repositories;

import java.util.List;

import org.dawan.springchat.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "FROM User u WHERE u.name = :name")
    List<User> findByName(@Param("name") String searchedName);
	
	@Query(value = "FROM User u WHERE u.id = :id")
    User findUserById(@Param("id") long id);
	
	@Query(value = "FROM User u WHERE u.email = :email")
    User findUserByEmail(@Param("email") String email);
	
	@Query(value = "FROM User u JOIN FETCH u.themes t WHERE t.name = :themeName")
	List<User> findByTheme(@Param("themeName") String theme);

	@Query(value = "FROM User u WHERE u.departement = :place")
	List<User> findByPlace(@Param("place") String place);
	
	@Query(value = "FROM User u WHERE u.name = :name")
    User getUserByUsername(@Param("name") String name);
}
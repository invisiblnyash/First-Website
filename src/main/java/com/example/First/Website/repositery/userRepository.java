package com.example.First.Website.repositery;


import com.example.First.Website.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface userRepository extends JpaRepository<user,Long> {
  /*  @Query("select a from user a where a.email = :email and a.password = :password")
    public Optional<user> login(String email, String password);

    @Query("UPDATE user u SET u.realEstateCount = u.realEstateCount + 1 WHERE u.id = ?1")
    public void addReal(Long userId);

*/
}
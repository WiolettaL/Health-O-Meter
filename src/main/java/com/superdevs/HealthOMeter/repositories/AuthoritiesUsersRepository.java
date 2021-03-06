package com.superdevs.HealthOMeter.repositories;

import com.superdevs.HealthOMeter.entity.AuthoritiesUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface AuthoritiesUsersRepository extends JpaRepository<AuthoritiesUsers, Long> {
}

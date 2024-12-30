package com.shikhar.bittrade.repository;

import com.shikhar.bittrade.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

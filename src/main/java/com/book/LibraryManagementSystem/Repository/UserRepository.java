package com.book.LibraryManagementSystem.Repository;

import com.book.LibraryManagementSystem.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
}

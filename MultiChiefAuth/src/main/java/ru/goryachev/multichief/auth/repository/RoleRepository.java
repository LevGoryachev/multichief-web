package ru.goryachev.multichief.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.goryachev.multichief.auth.entity.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository <Role, Long> {
}

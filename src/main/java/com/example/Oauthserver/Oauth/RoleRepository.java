package com.example.Oauthserver.Oauth;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Oauthserver.Oauth.ERole;
import com.example.Oauthserver.Oauth.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
package io.github.jhipster.application.lunchmeetings.repository;

import io.github.jhipster.application.lunchmeetings.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

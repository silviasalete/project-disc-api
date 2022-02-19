package com.disc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.disc.model.Opcao;
@Repository
public interface OpcaoRepository extends JpaRepositoryImplementation<Opcao, Long> {

	@Query("SELECT o FROM Opcao o WHERE o.question = :question")
	List<Opcao> findAllByQuestion(Integer question);

}

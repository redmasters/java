package io.leo.academia.repository;

import io.leo.academia.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query(value = "SELECT * FROM ALUNO "+, nativeQuery = true);
    List<Aluno> findAlunoByNomeContaining(String nome);

}

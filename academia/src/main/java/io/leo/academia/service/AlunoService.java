package io.leo.academia.service;

import io.leo.academia.models.Aluno;
import io.leo.academia.repository.AlunoRepository;
import io.leo.academia.requests.AlunoPostRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();

    }
    public Aluno buscarPorAluno(long id){
        return alunoRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Aluno criarAluno(AlunoPostRequest request){
        Aluno novoAluno = new Aluno();
        novoAluno.setId(request.id());
        novoAluno.setNome(request.nome());
        return alunoRepository.save(novoAluno);
    }

    public Aluno deletarAluno(long id){
        return alunoRepository.deleteAlunoById(id);
    }

}

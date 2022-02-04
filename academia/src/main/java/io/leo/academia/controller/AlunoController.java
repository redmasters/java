package io.leo.academia.controller;

import io.leo.academia.models.Aluno;
import io.leo.academia.requests.AlunoPostRequest;
import io.leo.academia.service.AlunoService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("v1/aluno/")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping()
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

    @GetMapping("{id}")
    public Aluno buscarPorAluno(@PathVariable long id) {
        return alunoService.buscarPorAluno(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Aluno criarAluno(@RequestBody AlunoPostRequest request) {
        return alunoService.criarAluno(request);
    }

    @DeleteMapping
    public Aluno deletarAluno(@PathVariable long id) {
        return alunoService.deletarAluno(id);
    }


}

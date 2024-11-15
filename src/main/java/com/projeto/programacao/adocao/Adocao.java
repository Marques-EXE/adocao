package com.projeto.programacao.adocao;

import com.projeto.programacao.adotante.Adotante;
import com.projeto.programacao.animal.Animal;
import com.projeto.programacao.funcionario.Funcionario;

import java.time.LocalDateTime;

public class Adocao {
    private Animal animal;
    private Adotante adotante;
    private Funcionario funcionario;
    private LocalDateTime dataAdocao;

    public Adocao(Animal animal, Adotante adotante, Funcionario funcionario) {
        this.animal = animal;
        this.adotante = adotante;
        this.funcionario = funcionario;
    }

    public Adocao(Animal animal, Adotante adotante, Funcionario funcionario, LocalDateTime dataAdocao) {
        this(animal, adotante, funcionario);
        this.dataAdocao = dataAdocao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDateTime getDataAdocao() {
        return dataAdocao;
    }

    @Override
    public String toString() {
        return "Animal: " + animal.getNome() + ", Adotante: " + adotante.getNome() + ", Funcionário responsável: " + funcionario.getNome();
    }
}

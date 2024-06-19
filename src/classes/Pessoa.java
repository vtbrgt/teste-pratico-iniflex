package src.classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String getDataNascimentoFormatada() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return this.dataNascimento.format(formatador);
    }
}

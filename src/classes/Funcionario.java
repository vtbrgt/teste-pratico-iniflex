package src.classes;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(
            String nome, LocalDate dataNascimento,
            BigDecimal salario, String funcao
    ) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public String getSalarioFormatado() {
        DecimalFormat formatador = new DecimalFormat("###,###.#####");

        return formatador.format(this.salario);
    }

    public String getFuncao() {
        return this.funcao;
    }

    public String getInfoFuncionario() {
        return "Nome: " + this.getNome() + " / Data de nascimento: " + this.getDataNascimentoFormatada() + " / Salário: " + this.getSalarioFormatado() + " / Função: " + this.getFuncao();
    }
}

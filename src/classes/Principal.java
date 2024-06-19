package src.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private List<Funcionario> funcionariosList = new ArrayList<>();
    private Map<String, List<Funcionario>> funcionariosPorFuncao = Collections.emptyMap();

    public void inserirFuncionario(Funcionario funcionario) {
        funcionariosList.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionariosList.remove(funcionario);
    }

    public void imprimirFuncionarios() {
        funcionariosList.forEach(funcionario -> System.out.println(funcionario.getInfoFuncionario()));
    }

    public void aplicarAumento() {
        funcionariosList.forEach(funcionario -> {
            BigDecimal aumentoDezPorCento = new BigDecimal("1.10");
            BigDecimal novoSalario = funcionario.getSalario().multiply(aumentoDezPorCento);
            funcionario.setSalario(novoSalario);
        });
    }

    public void agruparFuncionarios() {
        funcionariosPorFuncao = funcionariosList.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));
    }

    public void imprimirPorFuncao() {
        funcionariosPorFuncao.forEach((funcao, funcionarios) -> {
            System.out.println(funcao);
            funcionarios.forEach(funcionario -> System.out.println(funcionario.getInfoFuncionario()));
        });
    }

    public void imprimirPorAniversario() {
        funcionariosList.forEach(funcionario -> {
            int mesAniversario = funcionario.getDataNascimento().getMonthValue();
            if (mesAniversario == 10 || mesAniversario == 12) {
                System.out.println(funcionario.getInfoFuncionario());
            }
        });
    }

    public void imprimirFuncionarioMaisVelho() {
        Funcionario funcionarioMaisVelho = funcionariosList.stream()
                .max(Comparator.comparingInt(Funcionario::getIdade))
                .get();

        String funcionarioMaisVelhoString = "Nome: " + funcionarioMaisVelho.getNome() + " / Idade: " + funcionarioMaisVelho.getIdade();
        System.out.println(funcionarioMaisVelhoString);
    }

    public void imprimirFuncionariosOrdenados() {
        List<Funcionario> funcionariosOrdenados = funcionariosList.stream()
                .sorted(Comparator.comparing(Funcionario::getNome, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());

        funcionariosOrdenados.forEach(funcionario -> System.out.println(funcionario.getInfoFuncionario()));
    }

    public void imprimirTotalSalarios() {
        Optional<BigDecimal> totalSalarios = funcionariosList.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal::add);

        String totalSalariosString = "Total salários: " + totalSalarios;
        System.out.println(totalSalariosString);
    }

    public void imprimirSalarioMinimoPorFuncionario() {
        BigDecimal salarioMinimo = new BigDecimal("1212.00");

        funcionariosList.forEach(funcionario -> {
            BigDecimal salariosMinimos = funcionario.getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP);

            String salarioMinimoPorFuncionario = funcionario.getNome() + " recebe " + salariosMinimos + " salários mínimos.";
            System.out.println(salarioMinimoPorFuncionario);
        });
    }
}

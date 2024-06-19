package src;

import src.classes.Funcionario;
import src.classes.Principal;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();
        Funcionario maria = new Funcionario("Maria", LocalDate.of(2000, 10, 18), BigDecimal.valueOf(2009.44), "Operador");
        Funcionario joao = new Funcionario("João", LocalDate.of(1990, 5, 12), BigDecimal.valueOf(2284.38), "Operador");
        Funcionario caio = new Funcionario("Caio", LocalDate.of(1961, 5, 2), BigDecimal.valueOf(9836.14), "Coordenador");
        Funcionario miguel = new Funcionario("Miguel", LocalDate.of(1988, 10, 14), BigDecimal.valueOf(19119.88), "Diretor");
        Funcionario alice = new Funcionario("Alice", LocalDate.of(1995, 1, 5), BigDecimal.valueOf(2234.68), "Recepcionista");
        Funcionario heitor = new Funcionario("Heitor", LocalDate.of(1999, 11, 19), BigDecimal.valueOf(1582.72), "Operador");
        Funcionario arthur = new Funcionario("Arthur", LocalDate.of(1993, 3, 31), BigDecimal.valueOf(4071.84), "Contador");
        Funcionario laura = new Funcionario("Laura", LocalDate.of(1994, 7, 8), BigDecimal.valueOf(3017.45), "Gerente");
        Funcionario heloisa = new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), BigDecimal.valueOf(1606.85), "Eletricista");
        Funcionario helena = new Funcionario("Helena", LocalDate.of(1993, 9, 2), BigDecimal.valueOf(2799.93), "Gerente");

        principal.inserirFuncionario(maria);
        principal.inserirFuncionario(joao);
        principal.inserirFuncionario(caio);
        principal.inserirFuncionario(miguel);
        principal.inserirFuncionario(alice);
        principal.inserirFuncionario(heitor);
        principal.inserirFuncionario(arthur);
        principal.inserirFuncionario(laura);
        principal.inserirFuncionario(heloisa);
        principal.inserirFuncionario(helena);
        principal.removerFuncionario(joao);
        principal.imprimirFuncionarios();
        principal.aplicarAumento();
        principal.agruparFuncionarios();
        principal.imprimirPorFuncao();
        principal.imprimirPorAniversario();
        principal.imprimirFuncionarioMaisVelho();
        principal.imprimirFuncionariosOrdenados();
        principal.imprimirTotalSalarios();
        principal.imprimirSalarioMinimoPorFuncionario();
    }
}
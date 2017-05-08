package br.edu.unifacisa.map.strategyenum;

public enum GratificacaoTipoEnum implements Gratificacao{
		DBA {
		    public double calcularGratificacao(Funcionario umFuncionario) {
		          if (umFuncionario.getNivel() >= 2) {
		              return umFuncionario.getSalarioBase() * 1.30;
		          }
		          return umFuncionario.getSalarioBase() * 1.20;
		    }
		},
		
		DESENVOLVEDOR {
		    public double calcularGratificacao(Funcionario umFuncionario) {
		          if (umFuncionario.getNivel() >= 2) {
		              return umFuncionario.getSalarioBase() * 1.25;
		          }
		          return umFuncionario.getSalarioBase() * 1.15;
		    }
		},
		
		GERENTE {
		    public double calcularGratificacao(Funcionario umFuncionario) {
		          if (umFuncionario.getNivel() >= 2) {
		              return umFuncionario.getSalarioBase() * 1.45;
		          }
		          return umFuncionario.getSalarioBase() * 1.30;
		    }
		},
		
		LIDER {
		    public double calcularGratificacao(Funcionario umFuncionario) {
		          if (umFuncionario.getNivel() >= 2) {
		              return umFuncionario.getSalarioBase() * 1.35;
		          }
		          return umFuncionario.getSalarioBase() * 1.25;
		    }
		};
		
}

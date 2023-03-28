package ExerciciosGen;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica pf = new PessoaFisica("Rafael Galvão",28,"Programador Dev Junior",35000.0f,
				"rafael@mmail.com.br","24545654551","65.889.934-4");
		PessoaJuridica pj = new PessoaJuridica("Gabrieli",24,"Marketing digital",20000.0f,
				"gabi2023@gmail.com.br","12.731.227/0001-00");
		
		pf.visualizar();
		pj.visualizar();

	
	}

}

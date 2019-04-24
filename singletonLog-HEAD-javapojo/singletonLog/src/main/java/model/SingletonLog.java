package model;


public class SingletonLog
{
	
	
	public SingletonLog instanciaLog;
		
	public String usuario;
	
	public String dataHoraAcesso;
	
	public TelaLogin telaPrincipal;
	
	public CadastroCliente cadastroCliente;

	
	protected SingletonLog() {
		super();
	}

	
	public SingletonLog getInstancia() {
		return null;
	}

	
	
	public void setUsuario(String pUsuario) {
	}

	
	public String getUsuario(Usuario uss) {
		
		return "";
	}

	
	public void setDataHoraAcesso(String pDataHoraAcessi) {
	
	}

	public String getDataHoraAcesso() {
		// TODO implement me
		return "";
	}

}


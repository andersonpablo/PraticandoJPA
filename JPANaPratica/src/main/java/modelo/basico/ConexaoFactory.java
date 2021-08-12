package modelo.basico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String URL = "jdbc:mysql://localhost/pessoa";

	public static Connection conectar() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Connection conexao = ConexaoFactory.conectar();
			System.out.println("OPAAAAAAAAAAAAAAAAAAAA - CONEXÃO OK :D");
		} catch (SQLException ex) {
			System.out.println("não deu");
		}
	}
}
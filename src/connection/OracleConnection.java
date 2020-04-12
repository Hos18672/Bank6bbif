package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.BankAccountException;

public class OracleConnection {

	private Connection connection; 
	public OracleConnection() throws BankAccountException
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
		
			throw new BankAccountException("Could not find DB driver");
		}
	}
	public void open() throws BankAccountException
	{
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:ORCL", "SYSTEM","oracle");
		} catch (SQLException e) {
			throw new BankAccountException("Could not open DB ");
		}
	}
	public void close() throws BankAccountException
	{
		try {
			connection.close();
		} catch (SQLException e) {
			throw new BankAccountException("Could not close DB ");
		}
	}
	public Connection getConnection() {
		return connection;
	}
	
}

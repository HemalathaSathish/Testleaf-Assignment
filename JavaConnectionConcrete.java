package week3.day2;

public class JavaConnectionConcrete extends AbstractSample implements DatabaseConnectionInterface {

	@Override
	public void connect() {
		System.out.println("Server Connected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update the Server");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Server DisConnected");
	}

	

		public static void main(String[] args) {
			JavaConnectionConcrete javaconnect = new JavaConnectionConcrete();
			javaconnect.connect();
			javaconnect.executeUpdate();
			javaconnect.disconnect();
			AbstractSample.OrcleDatabase();
		}
	}
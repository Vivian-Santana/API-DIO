package model;

public class Usuario {

	private String login;
    private String password;

    public Usuario() {
    }

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Object getId() {
		return login;
	}
	
	@Override
	public String toString() {
		return "Usuário [login=" + login + ", password=" + password + "]";
	}

}

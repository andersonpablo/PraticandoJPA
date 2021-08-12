package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPANaPratica");
		EntityManager em = emf.createEntityManager();

		Usuario novoUsuario = new Usuario("anderson", "anderson@hotmail.com");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();

		System.out.println("O nome inserido é: " + novoUsuario.getNome() + " o ID do novo usuário é: " + novoUsuario.getId() );
		
		em.close();
		emf.close();
	}
}

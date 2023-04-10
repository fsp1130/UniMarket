package co.edu.uniquindio.uniMarket.repositorios;

import co.edu.uniquindio.uniMarket.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

    //JPQL ----> lenguaje de consultas para JPA
    @Query("select u from Usuario u where u.email = :correo")
    Usuario buscarUsuario(String correo);

    @Query("select u from Usuario u where u.email = :correo and u.codigo <> :codigo")
    Usuario buscarUsuario(String correo, int codigo);

    Optional<Usuario> findByEmail(String email);

    Usuario findByEmailAndPassword(String email, String password);

}

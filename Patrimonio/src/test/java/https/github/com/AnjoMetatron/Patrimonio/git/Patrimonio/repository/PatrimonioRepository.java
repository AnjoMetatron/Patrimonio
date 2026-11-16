package https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.repository;

import https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatrimonioRepository extends JpaRepository<Patrimonio,Long> {
}

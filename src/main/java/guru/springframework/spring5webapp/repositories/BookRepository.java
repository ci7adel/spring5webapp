package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.LockModeType;

public interface BookRepository extends CrudRepository<Book, Long> {

//    @Lock(LockModeType.PESSIMISTIC_WRITE)
//    @Query("select b from Books b where b.id = :id")
//    public Book findBookForWrite(@Param("id") Long id);

}

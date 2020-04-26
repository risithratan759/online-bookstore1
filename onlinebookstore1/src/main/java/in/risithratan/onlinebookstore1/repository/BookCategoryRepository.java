package in.risithratan.onlinebookstore1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.risithratan.onlinebookstore1.entity.BookCategory;
@RepositoryRestResource(collectionResourceRel="bookCategory",path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}

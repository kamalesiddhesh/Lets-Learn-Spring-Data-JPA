package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

// ================= findBy Methods ==================================
	
	/*
	 * // Select * from Book where bookPrice > :bookPrice public List<Book>
	 * findByBookPriceGreaterThan(Double bookPrice);
	 * 
	 * // Select * from Book where bookPrice < :bookPrice public List<Book>
	 * findByBookPriceLessThan(Double bookPrice);
	 */
	  
	  // Select * from Book where bookName == :name 
		public List<Book> findByBookName(String bookName);
	 
	
// =================== Custom Query =====================================
	
// ------------------- SQL Queries----------------------------------	
	
	@Query(value="select * from book", nativeQuery = true) 
	public List<Book> getAllBooks();
	 
	
// -------------------- HQL Queries -------------------------------------
		
	@Query(value = "from Book", nativeQuery = false)
	public List<Book> getBooks();
	
	
	
}

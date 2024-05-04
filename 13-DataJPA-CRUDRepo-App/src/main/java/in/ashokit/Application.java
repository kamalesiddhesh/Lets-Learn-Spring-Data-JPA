package in.ashokit;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt= SpringApplication.run(Application.class, args);
		
		BookRepository repo= ctxt.getBean(BookRepository.class);
		System.out.println(repo.getClass().getName());
//===================== To Add Single record or To update Single Record=========== 	
//		Book b = new Book();
//		b.setBookId(102);
//		b.setBookName("MicroServices");
//		b.setBookPrice(200.00);
		
//		Adding Single Data in Database
//		repo.save(b);
		
//===================== To Add Multiple Records in table=================
//		Book b1 = new Book();
//		b1.setBookId(103);
//		b1.setBookName("Angular");
//		b1.setBookPrice(300.00);
//		
//		Book b2 = new Book();
//		b2.setBookId(104);
//		b2.setBookName("React JS");
//		b2.setBookPrice(400.00);
		
		// Traditional way.......
//		List<Book> booksList = new ArrayList<>();
//		booksList.add(b1);
//		booksList.add(b2);
		
		
//		Another way to add multiple records in database
//		repo.saveAll(Arrays.asList(b1,b2));
		

//		System.out.println("Record Inserted.........");
//		
//		
//		Optional<Book> findById =  repo.findById(102);
//		System.out.println("Result is : "+findById.get());
		
		
		
// ====================== To check record Exist or Not================================================
		/*
		 * boolean status = repo.existsById(105); System.out.println("Record present : "
		 * +status);
		 */
// ====================== To get records count in a Table======================================
//		System.out.println("Records Count:: "+ repo.count());
// ====================== To get record based on the primary key ==============================		
//		Optional<Book> findById = repo.findById(102);
//		if(findById.isPresent()) {
//			System.out.println("Record " + findById.get());
//		}		
// ======================= To get records for multiple primary keys ==============================================
		/*
		 * Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,102,105));
		 * 
		 * for(Book b : findAllById) { System.out.println(b); }
		 */
// ======================= To get All records from Table ==========================================
		/*
		 * Iterable<Book> findAll = repo.findAll(); for(Book b:findAll) {
		 * System.out.println(b); }
		 */
// ======================== To delete records from Table =========================================
		
		/*
		 * if(repo.existsById(205)) repo.deleteById(205); else {
		 * System.out.println("No Record Found..."); }
		 */
// ###################################################################################################
		
// ======================= findBy Method implementation ======================================
		
		
		
		
		  List<Book> b = repo.findByBookName("Spring"); 
//		  for(Book book : b) {
			  System.out.println(b.get(0).getBookPrice()); 
//		  }
		 
		 
// ======================= Custom Queries ========================
		
		
//		List<Book> book1 = repo.getAllBooks();
//		for(Book b : book1) {
//			System.out.println(b);
//		}
//		System.out.println("======================================================================================");
//		List<Book> book2 = repo.getBooks();
//		for(Book b : book2) {
//			System.out.println(b);
//		}

	}
}

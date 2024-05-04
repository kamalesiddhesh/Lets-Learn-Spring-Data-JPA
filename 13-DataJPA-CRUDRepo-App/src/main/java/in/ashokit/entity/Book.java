package in.ashokit.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Lombok Annotations for Setters and Getters
@Entity // @Entity shows that Table Book is represented/mapped to Book Object
public class Book {
	
	@Id // To create primary key in Table Book
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
}

package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		AccountRepo bean = ctxt.getBean(AccountRepo.class);
		
//++++++++++++++++++++++ Inserting Data using composite primary key +++++++++++++++++++++++++++++
		
		// setting composite key values
		AccountPK pk = new AccountPK();
		pk.setAccNum((long)1253461891);
		pk.setAccType("Savings");
		
		//setting entity data
		Account acc = new Account();
		acc.setHolderName("Siddhesh");
		acc.setBranch("Airoli");
		acc.setAccountPk(pk); //  setting pk obj
		
		bean.save(acc); // saving the entity obj 
		System.out.println("Record Saved................");
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//================================= To Retrieve Record =======================================================
		
		/*
		 * AccountPK find_pk = new AccountPK(); find_pk.setAccNum((long)1253461891);
		 * find_pk.setAccType("Savings"); Optional<Account> findById =
		 * bean.findById(find_pk);
		 * 
		 * if(findById.isPresent()) { System.out.println(findById.get()); }
		 */	
		
	}

}

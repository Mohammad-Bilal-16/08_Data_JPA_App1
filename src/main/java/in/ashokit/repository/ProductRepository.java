package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

//	@Query(value="call getABC()", nativeQuery=true)
//	public List<Product> getAllProducts();

}

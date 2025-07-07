/*Repository Interface to automatically implement the DAO Layer*/
package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import in.spring.document.AsideItem;

public interface AsideItemRepository extends MongoRepository<AsideItem, String> {
	
}

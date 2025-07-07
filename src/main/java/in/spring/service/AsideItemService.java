/*Service interface will define all the Business logic methods*/
package in.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import in.spring.document.AsideItem;

@Service
public interface AsideItemService {
	/*Method to retrieve the aside Items List of objects*/
	List<AsideItem> retrieveAllAsideItems();

	/*Method to Insert a New AsideItem object to the MongoDB 
	 * This method will take the AsideItem obj that is needed to be inserted
	 * It will return the newly Inserted object returned by the DB
	*/
	AsideItem insertNewAsideItem(AsideItem asI);
}



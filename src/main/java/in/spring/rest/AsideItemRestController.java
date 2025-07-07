/*Rest Controller class, this will have all the API methods and will talk to Service layer*/
package in.spring.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.spring.document.AsideItem;
import in.spring.service.AsideItemService;

@RestController
public class AsideItemRestController {
	//Inject the service layer reference to call service methods
	@Autowired
	private AsideItemService asideService;
	
	/*A GET mode method to retrieve all the Aside Items List*/
	@GetMapping("/getAllAsideItems")
	public List<AsideItem> getAllAsideItems() {
		//call the service layer method to retrieve the list of asideItems
		return asideService.retrieveAllAsideItems();
	}
	
	/*A POST Mode method to accept AsideItem JSON as request body
	 * and insert that AsideItem objec to MongoDB via Service method
	*/	
	@PostMapping("/addAsideItem")
	public ResponseEntity<String> addAsideItem(@RequestBody AsideItem asI){
		//Call the service layer insert method, and get the inserted object
		AsideItem insertedItem = asideService.insertNewAsideItem(asI);
		
		//Now check if the insertedItem successfully inserted or not via _id
		if(insertedItem.get_id()!=null) {
			//If _id is not null, then it is inserted in MongoDB so give a Success message as res
			return new ResponseEntity<>("Inserted Successfully.",HttpStatus.CREATED);
		}else {
			//The Data is not inserted Properly so give Error message with error code
			return new ResponseEntity<>("Insertion Failure!!!", HttpStatus.NOT_FOUND);
		}		
	}
}

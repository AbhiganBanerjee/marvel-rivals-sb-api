/*Service impl will implement all the methods of Service interface, and will talk to DAO layer*/
package in.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.spring.document.AsideItem;
import in.spring.repo.AsideItemRepository;

@Service		//Service will be needed, if not used then it can not be injected via @Autowired
public class AsideItemServiceImpl implements AsideItemService {
	//Inject the Repository layer reference for calling repo methods
	@Autowired
	private AsideItemRepository asideRepo;
	
	@Override
	public List<AsideItem> retrieveAllAsideItems() {
		//Call the Repository Layer findAll method to get all the List of items from DB
		return asideRepo.findAll();
	}
	
	@Override
	public AsideItem insertNewAsideItem(AsideItem asI) {
		/*Call the DAO layer or repo Layer save method to insert the asI object
		and save method will return the inserted object from the DB return it */
		return asideRepo.save(asI);
	}
}

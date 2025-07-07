/*This class will represent each and every AsideItem objects*/
package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "rivals_home_page_aside_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsideItem {
	@Id
	private String _id;

	private String socialMediaPlatformName;
	private String path;
}

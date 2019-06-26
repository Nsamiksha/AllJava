package commercial;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface Stock_Interface {

	public void addNew() throws JsonGenerationException, IOException;

	public void addNewUser();

	public void displayTranscationDetails() throws JsonParseException, JsonMappingException, IOException;

	public void transcationDetails(String id, String symbol1, int total);

	public void removeData();

	public void buyShares(String symbol, int total);

	public void removeUserData();

	public void displayInformation() throws JsonParseException, JsonMappingException, IOException;

	public void displayUserInformation() throws JsonParseException, JsonMappingException, IOException;

	public void saveFile(Commercial_Company_Elements com);

	public void saveUserFile(Commercial_User_Elements user1);

}

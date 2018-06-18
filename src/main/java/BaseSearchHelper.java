import java.util.List;

public abstract class BaseSearchHelper {
    abstract String getSearchURL(String searchString);

    abstract List<String> getTopSearchResults(String searchURL);

    public void crawlAndStoreResults(String query){
        String URL = getSearchURL(query);

        getTopSearchResults(URL);



    }

}

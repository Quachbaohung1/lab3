package uit.labp3_18520809.Service;

public class APIService {
    private static final String base_url = "https://newsapi.org";

    public static DataService getService() {
        return APIRetrofitClient.getClient(base_url).create(DataService.class);
    }
}

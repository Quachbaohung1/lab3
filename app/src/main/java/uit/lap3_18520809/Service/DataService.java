package uit.labp3_18520809.Service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import uit.labp3_18520809.Model.Article;
import uit.labp3_18520809.Model.News;

public interface DataService {

    @GET("/v2/everything?q=tesla&from=2022-04-10&sortBy=publishedAt&apiKey=ebea7bae738444d897fe95db8ff13c23")
    Call<News> GetDataNews();

}

package foundation.e.blisslauncher.core.network.duckduckgo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DuckDuckGoSuggestionService {
    @GET("/ac/")
    Observable<List<DuckDuckGoResult>> query(@Query("q") String query);
}

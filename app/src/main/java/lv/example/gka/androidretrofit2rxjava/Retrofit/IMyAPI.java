package lv.example.gka.androidretrofit2rxjava.Retrofit;

import java.util.List;

import io.reactivex.Observable;
import lv.example.gka.androidretrofit2rxjava.Model.Post;
import retrofit2.http.GET;

public interface IMyAPI {

    @GET("posts")
    Observable<List<Post>> getPosts();

}

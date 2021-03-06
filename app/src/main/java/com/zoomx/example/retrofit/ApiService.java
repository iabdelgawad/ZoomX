package com.zoomx.example.retrofit;

import com.zoomx.example.model.User;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Ahmed Fathallah on 11/20/2017.
 */

public interface ApiService {

    @GET("/users")
    @Headers({
            "X-Foo: Bar",
            "X-Ping: Pong",
            "Test: Eslam 1",
            "Test: Eslam 2",
            "Test: Eslam 3",
            "Test: Eslam 4",
            "Final: Ibrahim"
    })
    public io.reactivex.Observable<List<User>> getUsers(
            @Query("per_page") int per_page,
            @Query("page") int page);


}

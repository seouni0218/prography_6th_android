package com.example.viewpager;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;

public class FragChats extends Fragment {
    private View view;
    private Button btn_get;

    private Retrofit mRetrofit;
    private RetrofitAPI mRetrofitAPI;

    private Call<String> mCallMovieList;

    private Gson mGson;

    public static FragChats newInstance(){
        FragChats fragChats = new FragChats();

        return fragChats;
    }
 
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view=inflater.inflate(R.layout.frag_chats, container, false);
        btn_get=(Button) view.findViewById(R.id.btn_get);
        btn_get.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                setRetrofitInit();
                callMovieList();
            }
        });
        return view;
    }

    private void setRetrofitInit(){
        mRetrofit=new Retrofit.Builder()
                .baseUrl("https://ghibliapi.herokuapp.com")
        .addConverterFactory(GsonConverterFactory.create())
                .build();
        mRetrofitAPI = mRetrofit.create(RetrofitAPI.class);
    }
    private void callMovieList() {

        mCallMovieList = mRetrofitAPI.getMovieList();
        mCallMovieList.enqueue(mRetrofitCallback);
    }

    //이게 아예 호출이 안되는듯
    private Callback<String> mRetrofitCallback = new Callback<String>() {

        @Override
        public void onResponse(Call<String> call, Response<String> response) {
            String result = response.body();
            Log.d(TAG, result);
            MovieListVO mMovieListVO = (MovieListVO) mGson.fromJson(result, MovieListVO.class);
        }

        @Override
        public void onFailure(Call<String> call, Throwable t) {
            t.printStackTrace();
        }
    };

}

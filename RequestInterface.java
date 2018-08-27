package com.learn2crack.recyclerjsonparsing;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RequestInterface {

    @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST("api/SeatBooking/getUserCurrentBookingDetails")
    Call<JSONResponse> getJSON(@Field("ADID") String ADID);
}

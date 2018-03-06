package ru.blizzed.timetablespbulib;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.blizzed.timetablespbulib.model.ApiError;

import java.io.IOException;

public final class ApiCaller<ResultType> {

    private Call<ResultType> call;

    public ApiCaller(Call<ResultType> call) {
        this.call = call;
    }

    public ResultType execute() throws ApiCallException, ApiErrorException {
        try {
            Response<ResultType> response = call.execute();
            if (response.isSuccessful())
                return response.body();
            else throw new ApiErrorException(parseError(response));
        } catch (IOException e) {
            throw new ApiCallException(e);
        }
    }

    public void execute(Listener<ResultType> listener) {
        call.enqueue(new Callback<ResultType>() {
            @Override
            public void onResponse(Call<ResultType> call, Response<ResultType> response) {
                if (response.isSuccessful()) listener.onComplete(response.body(), ApiCaller.this);
                else {
                    try {
                        listener.onError(parseError(response), ApiCaller.this);
                    } catch (IOException e) {
                        listener.onFailure(new ApiCallException(e), ApiCaller.this);
                    }
                }
            }

            @Override
            public void onFailure(Call<ResultType> call, Throwable throwable) {
                listener.onFailure(new ApiCallException(throwable), ApiCaller.this);
            }
        });
    }

    public void cancel() {
        if (!call.isCanceled() & !call.isExecuted())
            call.cancel();
    }

    private ApiError parseError(Response response) throws IOException {
        return TimeTableApi.getInstance().parseApiError(response.errorBody());
    }

    public interface Listener<ResultType> {
        default void onComplete(ResultType result, ApiCaller<ResultType> apiCaller) {
        }

        default void onError(ApiError error, ApiCaller<ResultType> apiCaller) {
        }

        default void onFailure(ApiCallException e, ApiCaller<ResultType> apiCaller) {
        }
    }

}

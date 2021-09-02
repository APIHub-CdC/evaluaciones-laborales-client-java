package io.EvaluacionesLaborales.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.EvaluacionesLaborales.client.ApiCallback;
import io.EvaluacionesLaborales.client.ApiClient;
import io.EvaluacionesLaborales.client.ApiException;
import io.EvaluacionesLaborales.client.ApiResponse;
import io.EvaluacionesLaborales.client.Configuration;
import io.EvaluacionesLaborales.client.Pair;
import io.EvaluacionesLaborales.client.ProgressRequestBody;
import io.EvaluacionesLaborales.client.ProgressResponseBody;
import io.EvaluacionesLaborales.client.model.Consulta;
import io.EvaluacionesLaborales.client.model.RespuestaConsulta;
import io.EvaluacionesLaborales.client.model.RespuestaContesta;
import io.EvaluacionesLaborales.client.model.SolicitudEnvio;

public class EvaluacionApi {
    private ApiClient apiClient;

    public EvaluacionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EvaluacionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public okhttp3.Call contestaCall(String xApiKey, String username, String password, SolicitudEnvio body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/contesta";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
            localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
            localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
            localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private okhttp3.Call contestaValidateBeforeCall(String xApiKey, String username, String password,
            SolicitudEnvio body, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling contesta(Async)");
        }
    
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling contesta(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling contesta(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling contesta(Async)");
        }

        okhttp3.Call call = contestaCall(xApiKey, username, password, body, progressListener,
                progressRequestListener);
        return call;
    }

    public RespuestaContesta contesta(String xApiKey,  String username, String password,
            SolicitudEnvio body) throws ApiException {
        ApiResponse<RespuestaContesta> resp = contestaWithHttpInfo(xApiKey,  username, password, body);
        return resp.getData();
    }

    public ApiResponse<RespuestaContesta> contestaWithHttpInfo(String xApiKey,  String username,
            String password, SolicitudEnvio body) throws ApiException {
        okhttp3.Call call = contestaValidateBeforeCall(xApiKey,  username, password, body, null, null);
        Type localVarReturnType = new TypeToken<RespuestaContesta>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    public okhttp3.Call contestaAsync(String xApiKey,  String username, String password,
            SolicitudEnvio body, final ApiCallback<RespuestaContesta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = contestaValidateBeforeCall(xApiKey,  username, password, body, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<RespuestaContesta>() {
        }.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }

    public okhttp3.Call finByCandidatoCall(String claveEvaluacion, String xApiKey,  String cveEmpresa,
            String username, String password, Consulta body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/{claveEvaluacion}".replaceAll("\\{" + "claveEvaluacion" + "\\}",
                apiClient.escapeString(claveEvaluacion.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
            localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (cveEmpresa != null)
            localVarHeaderParams.put("cveEmpresa", apiClient.parameterToString(cveEmpresa));
        if (username != null)
            localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
            localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private okhttp3.Call finByCandidatoValidateBeforeCall(String claveEvaluacion, String xApiKey, 
            String cveEmpresa, String username, String password, Consulta body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (claveEvaluacion == null) {
            throw new ApiException(
                    "Missing the required parameter 'claveEvaluacion' when calling finByCandidato(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling finByCandidato(Async)");
        }

        if (cveEmpresa == null) {
            throw new ApiException("Missing the required parameter 'cveEmpresa' when calling finByCandidato(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling finByCandidato(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling finByCandidato(Async)");
        }

        okhttp3.Call call = finByCandidatoCall(claveEvaluacion, xApiKey,  cveEmpresa, username, password,
                body, progressListener, progressRequestListener);
        return call;
    }

    public RespuestaConsulta finByCandidato(String claveEvaluacion, String xApiKey, 
            String cveEmpresa, String username, String password, Consulta body) throws ApiException {
        ApiResponse<RespuestaConsulta> resp = finByCandidatoWithHttpInfo(claveEvaluacion, xApiKey, 
                cveEmpresa, username, password, body);
        return resp.getData();
    }

    public ApiResponse<RespuestaConsulta> finByCandidatoWithHttpInfo(String claveEvaluacion, String xApiKey,
             String cveEmpresa, String username, String password, Consulta body) throws ApiException {
        okhttp3.Call call = finByCandidatoValidateBeforeCall(claveEvaluacion, xApiKey,  cveEmpresa, username,
                password, body, null, null);
        Type localVarReturnType = new TypeToken<RespuestaConsulta>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    public okhttp3.Call finByCandidatoAsync(String claveEvaluacion, String xApiKey,
            String cveEmpresa, String username, String password, Consulta body,
            final ApiCallback<RespuestaConsulta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = finByCandidatoValidateBeforeCall(claveEvaluacion, xApiKey,  cveEmpresa, username,
                password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RespuestaConsulta>() {
        }.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}

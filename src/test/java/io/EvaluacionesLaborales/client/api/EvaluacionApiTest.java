package io.EvaluacionesLaborales.client.api;

import java.util.concurrent.TimeUnit;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.EvaluacionesLaborales.client.ApiClient;
import io.EvaluacionesLaborales.client.ApiException;
import io.EvaluacionesLaborales.client.ApiResponse;
import io.EvaluacionesLaborales.client.model.Candidato;
import io.EvaluacionesLaborales.client.model.Candidato.SexoEnum;
import io.EvaluacionesLaborales.client.model.CatalogoTipoEvaluacion;
import io.EvaluacionesLaborales.client.model.Consulta;
import io.EvaluacionesLaborales.client.model.Domicilio;
import io.EvaluacionesLaborales.client.model.EnvioClaves;
import io.EvaluacionesLaborales.client.model.RespuestaConsulta;
import io.EvaluacionesLaborales.client.model.RespuestaContesta;
import io.EvaluacionesLaborales.client.model.SolicitudEnvio;
import okhttp3.OkHttpClient;

public class EvaluacionApiTest {
    private final EvaluacionApi api = new EvaluacionApi();

    private Logger logger = LoggerFactory.getLogger(EvaluacionApiTest.class.getName());

    private ApiClient apiClient;

    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";

    private String username = "your_username_otrorgante";
    private String password = "your_password_otorgante";

    private String url = "the_url";
    private String xApiKey = "X_Api_Key";
    private String cveEmpresa = "cve_empresa";

    private SignerInterceptor interceptor;

    @Before()
    public void setUp() {
        interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor).build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void contestaTest() throws ApiException {

        SolicitudEnvio body = new SolicitudEnvio();
        Domicilio domicilio = new Domicilio();
        Candidato candidato = new Candidato();
        EnvioClaves envioClaves = new EnvioClaves();

        Integer estatusOK = 200;
        Integer estatusNoContent = 204;

        try {

            envioClaves.setCveEmpresa(200691);
            envioClaves.setIdEvaluacion(3460);
            envioClaves.setIdPerfil(2423);
            body.setEnvioClaves(envioClaves);

            candidato.setNombres("NOM");
            candidato.setApellidoPaterno("AP");
            candidato.setApellidoMaterno("AM");
            candidato.setFechaNacimiento("1979-01-01");
            candidato.setSexo(SexoEnum.F);
            candidato.setCurp("XEXX010101HNEXXXA4");
            candidato.setRfc("XEXX010101000");
            candidato.setEscolaridad(4);
            candidato.setFolioEmpresa("12316");
            candidato.setCorreoElectronico("accounts@domain.com");
            body.setCandidato(candidato);

            domicilio.setDomicilio("conocido 3451");
            domicilio.setColonia("la ciudad modular");
            domicilio.setCodigoPostal("01560");
            body.setDomicilio(domicilio);

            ApiResponse<?> response = api.contestaWithHttpInfo(xApiKey, username, password, body);

            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));

            if (estatusOK.equals(response.getStatusCode())) {
                RespuestaContesta responseOK = (RespuestaContesta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if (!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }
    }

    @Test
    public void finByCandidatoTestIgh() throws ApiException {
        String claveEvaluacion = CatalogoTipoEvaluacion.IGH.getValue().toLowerCase();

        Consulta body = new Consulta();

        Integer estatusOK = 200;
        Integer estatusNoContent = 204;

        try {

            body.setCorreoElectronico("accounts@domain.com");
            body.setFolioEmpresa("DE0893");

            ApiResponse<?> response = api.finByCandidatoWithHttpInfo(claveEvaluacion, xApiKey, cveEmpresa, username,
                    password, body);

            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));

            if (estatusOK.equals(response.getStatusCode())) {
                RespuestaConsulta responseOK = (RespuestaConsulta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if (!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }
    }

    @Test
    public void finByCandidatoTestDro() throws ApiException {
        String claveEvaluacion = CatalogoTipoEvaluacion.DRO.getValue().toLowerCase();

        Consulta body = new Consulta();

        Integer estatusOK = 200;
        Integer estatusNoContent = 204;

        try {

            body.setCorreoElectronico("accounts@domain.com");
            body.setFolioEmpresa("DE0893");

            ApiResponse<?> response = api.finByCandidatoWithHttpInfo(claveEvaluacion, xApiKey, cveEmpresa, username,
                    password, body);

            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));

            if (estatusOK.equals(response.getStatusCode())) {
                RespuestaConsulta responseOK = (RespuestaConsulta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if (!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }
    }

    @Test
    public void finByCandidatoTestIdea() throws ApiException {
        String claveEvaluacion = CatalogoTipoEvaluacion.IDEA.getValue().toLowerCase();

        Consulta body = new Consulta();

        Integer estatusOK = 200;
        Integer estatusNoContent = 204;

        try {

            body.setCorreoElectronico("accounts@domain.com");
            body.setFolioEmpresa("DE0893");

            ApiResponse<?> response = api.finByCandidatoWithHttpInfo(claveEvaluacion, xApiKey, cveEmpresa, username,
                    password, body);

            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));

            if (estatusOK.equals(response.getStatusCode())) {
                RespuestaConsulta responseOK = (RespuestaConsulta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if (!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }
    }
}

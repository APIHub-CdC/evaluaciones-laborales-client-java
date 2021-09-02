package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class SolicitudEnvio {
  @SerializedName("envioClaves")
  private EnvioClaves envioClaves = null;
  @SerializedName("candidato")
  private Candidato candidato = null;
  @SerializedName("domicilio")
  private Domicilio domicilio = null;

  public SolicitudEnvio envioClaves(EnvioClaves envioClaves) {
    this.envioClaves = envioClaves;
    return this;
  }

  public EnvioClaves getEnvioClaves() {
    return envioClaves;
  }

  public void setEnvioClaves(EnvioClaves envioClaves) {
    this.envioClaves = envioClaves;
  }

  public SolicitudEnvio candidato(Candidato candidato) {
    this.candidato = candidato;
    return this;
  }

  public Candidato getCandidato() {
    return candidato;
  }

  public void setCandidato(Candidato candidato) {
    this.candidato = candidato;
  }

  public SolicitudEnvio domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }

  public Domicilio getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudEnvio solicitudEnvio = (SolicitudEnvio) o;
    return Objects.equals(this.envioClaves, solicitudEnvio.envioClaves)
        && Objects.equals(this.candidato, solicitudEnvio.candidato)
        && Objects.equals(this.domicilio, solicitudEnvio.domicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envioClaves, candidato, domicilio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudEnvio {\n");

    sb.append("    envioClaves: ").append(toIndentedString(envioClaves)).append("\n");
    sb.append("    candidato: ").append(toIndentedString(candidato)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

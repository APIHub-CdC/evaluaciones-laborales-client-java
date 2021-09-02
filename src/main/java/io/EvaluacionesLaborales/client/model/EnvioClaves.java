package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class EnvioClaves {
  @SerializedName("cveEmpresa")
  private Integer cveEmpresa = null;
  @SerializedName("idEvaluacion")
  private Integer idEvaluacion = null;
  @SerializedName("idPerfil")
  private Integer idPerfil = null;

  public EnvioClaves cveEmpresa(Integer cveEmpresa) {
    this.cveEmpresa = cveEmpresa;
    return this;
  }

  public Integer getCveEmpresa() {
    return cveEmpresa;
  }

  public void setCveEmpresa(Integer cveEmpresa) {
    this.cveEmpresa = cveEmpresa;
  }

  public EnvioClaves idEvaluacion(Integer idEvaluacion) {
    this.idEvaluacion = idEvaluacion;
    return this;
  }

  public Integer getIdEvaluacion() {
    return idEvaluacion;
  }

  public void setIdEvaluacion(Integer idEvaluacion) {
    this.idEvaluacion = idEvaluacion;
  }

  public EnvioClaves idPerfil(Integer idPerfil) {
    this.idPerfil = idPerfil;
    return this;
  }

  public Integer getIdPerfil() {
    return idPerfil;
  }

  public void setIdPerfil(Integer idPerfil) {
    this.idPerfil = idPerfil;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvioClaves envioClaves = (EnvioClaves) o;
    return Objects.equals(this.cveEmpresa, envioClaves.cveEmpresa)
        && Objects.equals(this.idEvaluacion, envioClaves.idEvaluacion)
        && Objects.equals(this.idPerfil, envioClaves.idPerfil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cveEmpresa, idEvaluacion, idPerfil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvioClaves {\n");

    sb.append("    cveEmpresa: ").append(toIndentedString(cveEmpresa)).append("\n");
    sb.append("    idEvaluacion: ").append(toIndentedString(idEvaluacion)).append("\n");
    sb.append("    idPerfil: ").append(toIndentedString(idPerfil)).append("\n");
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

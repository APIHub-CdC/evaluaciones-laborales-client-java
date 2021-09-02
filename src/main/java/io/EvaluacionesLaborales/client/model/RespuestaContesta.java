package io.EvaluacionesLaborales.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class RespuestaContesta {
  @SerializedName("estatus")
  private Boolean estatus = null;
  @SerializedName("folioIdentificador")
  private String folioIdentificador = null;
  @SerializedName("errores")
  private List<Error> errores = null;

  public RespuestaContesta estatus(Boolean estatus) {
    this.estatus = estatus;
    return this;
  }

  public Boolean isEstatus() {
    return estatus;
  }

  public void setEstatus(Boolean estatus) {
    this.estatus = estatus;
  }

  public RespuestaContesta folioIdentificador(String folioIdentificador) {
    this.folioIdentificador = folioIdentificador;
    return this;
  }

  public String getFolioIdentificador() {
    return folioIdentificador;
  }

  public void setFolioIdentificador(String folioIdentificador) {
    this.folioIdentificador = folioIdentificador;
  }

  public RespuestaContesta errores(List<Error> errores) {
    this.errores = errores;
    return this;
  }

  public RespuestaContesta addErroresItem(Error erroresItem) {
    if (this.errores == null) {
      this.errores = new ArrayList<Error>();
    }
    this.errores.add(erroresItem);
    return this;
  }

  public List<Error> getErrores() {
    return errores;
  }

  public void setErrores(List<Error> errores) {
    this.errores = errores;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespuestaContesta respuestaContesta = (RespuestaContesta) o;
    return Objects.equals(this.estatus, respuestaContesta.estatus)
        && Objects.equals(this.folioIdentificador, respuestaContesta.folioIdentificador)
        && Objects.equals(this.errores, respuestaContesta.errores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estatus, folioIdentificador, errores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespuestaContesta {\n");

    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    folioIdentificador: ").append(toIndentedString(folioIdentificador)).append("\n");
    sb.append("    errores: ").append(toIndentedString(errores)).append("\n");
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

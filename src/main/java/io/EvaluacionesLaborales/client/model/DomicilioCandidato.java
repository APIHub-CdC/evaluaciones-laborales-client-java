package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class DomicilioCandidato {
  @SerializedName("calle")
  private String calle = null;
  @SerializedName("colonia")
  private String colonia = null;
  @SerializedName("codigoPostal")
  private String codigoPostal = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("delegacion")
  private String delegacion = null;
  @SerializedName("estado")
  private String estado = null;

  public DomicilioCandidato calle(String calle) {
    this.calle = calle;
    return this;
  }

  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public DomicilioCandidato colonia(String colonia) {
    this.colonia = colonia;
    return this;
  }

  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  public DomicilioCandidato codigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
    return this;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public DomicilioCandidato ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public DomicilioCandidato delegacion(String delegacion) {
    this.delegacion = delegacion;
    return this;
  }

  public String getDelegacion() {
    return delegacion;
  }

  public void setDelegacion(String delegacion) {
    this.delegacion = delegacion;
  }

  public DomicilioCandidato estado(String estado) {
    this.estado = estado;
    return this;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomicilioCandidato domicilioCandidato = (DomicilioCandidato) o;
    return Objects.equals(this.calle, domicilioCandidato.calle)
        && Objects.equals(this.colonia, domicilioCandidato.colonia)
        && Objects.equals(this.codigoPostal, domicilioCandidato.codigoPostal)
        && Objects.equals(this.ciudad, domicilioCandidato.ciudad)
        && Objects.equals(this.delegacion, domicilioCandidato.delegacion)
        && Objects.equals(this.estado, domicilioCandidato.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calle, colonia, codigoPostal, ciudad, delegacion, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomicilioCandidato {\n");

    sb.append("    calle: ").append(toIndentedString(calle)).append("\n");
    sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
    sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    delegacion: ").append(toIndentedString(delegacion)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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

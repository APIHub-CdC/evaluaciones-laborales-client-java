package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Domicilio {
  @SerializedName("domicilio")
  private String domicilio = null;
  @SerializedName("codigoPostal")
  private String codigoPostal = null;
  @SerializedName("colonia")
  private String colonia = null;

  public Domicilio domicilio(String domicilio) {
    this.domicilio = domicilio;
    return this;
  }

  public String getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }

  public Domicilio codigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
    return this;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public Domicilio colonia(String colonia) {
    this.colonia = colonia;
    return this;
  }

  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return Objects.equals(this.domicilio, domicilio.domicilio)
        && Objects.equals(this.codigoPostal, domicilio.codigoPostal) && Objects.equals(this.colonia, domicilio.colonia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domicilio, codigoPostal, colonia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilio {\n");

    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
    sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
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

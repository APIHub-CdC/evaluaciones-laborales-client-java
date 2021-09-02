package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Consulta {
  @SerializedName("correoElectronico")
  private String correoElectronico = null;
  @SerializedName("folioEmpresa")
  private String folioEmpresa = null;

  public Consulta correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public Consulta folioEmpresa(String folioEmpresa) {
    this.folioEmpresa = folioEmpresa;
    return this;
  }

  public String getFolioEmpresa() {
    return folioEmpresa;
  }

  public void setFolioEmpresa(String folioEmpresa) {
    this.folioEmpresa = folioEmpresa;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consulta consulta = (Consulta) o;
    return Objects.equals(this.correoElectronico, consulta.correoElectronico)
        && Objects.equals(this.folioEmpresa, consulta.folioEmpresa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correoElectronico, folioEmpresa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consulta {\n");

    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
    sb.append("    folioEmpresa: ").append(toIndentedString(folioEmpresa)).append("\n");
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

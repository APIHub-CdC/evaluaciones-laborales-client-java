package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class EvaluacionPerfil {
  @SerializedName("nombre")
  private String nombre = null;
  @SerializedName("porcentajeTotal")
  private String porcentajeTotal = null;

  public EvaluacionPerfil nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public EvaluacionPerfil porcentajeTotal(String porcentajeTotal) {
    this.porcentajeTotal = porcentajeTotal;
    return this;
  }

  public String getPorcentajeTotal() {
    return porcentajeTotal;
  }

  public void setPorcentajeTotal(String porcentajeTotal) {
    this.porcentajeTotal = porcentajeTotal;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluacionPerfil evaluacionPerfil = (EvaluacionPerfil) o;
    return Objects.equals(this.nombre, evaluacionPerfil.nombre)
        && Objects.equals(this.porcentajeTotal, evaluacionPerfil.porcentajeTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, porcentajeTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluacionPerfil {\n");

    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    porcentajeTotal: ").append(toIndentedString(porcentajeTotal)).append("\n");
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

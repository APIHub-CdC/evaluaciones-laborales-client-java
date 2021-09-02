package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class RespuestaConsulta {
  @SerializedName("evaluacion")
  private Evaluacion evaluacion = null;

  public RespuestaConsulta evaluacion(Evaluacion evaluacion) {
    this.evaluacion = evaluacion;
    return this;
  }

  public Evaluacion getEvaluacion() {
    return evaluacion;
  }

  public void setEvaluacion(Evaluacion evaluacion) {
    this.evaluacion = evaluacion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespuestaConsulta respuestaConsulta = (RespuestaConsulta) o;
    return Objects.equals(this.evaluacion, respuestaConsulta.evaluacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespuestaConsulta {\n");

    sb.append("    evaluacion: ").append(toIndentedString(evaluacion)).append("\n");
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

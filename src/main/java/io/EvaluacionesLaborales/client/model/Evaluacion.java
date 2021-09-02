package io.EvaluacionesLaborales.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;


public class Evaluacion {
  @SerializedName("nombreEvaluacion")
  private CatalogoTipoEvaluacion nombreEvaluacion = null;
  @SerializedName("fechaAplicacion")
  private String fechaAplicacion = null;
  @SerializedName("folioAplicacion")
  private String folioAplicacion = null;
  @SerializedName("tiempoRespuesta")
  private String tiempoRespuesta = null;
  @SerializedName("datosCandidato")
  private DatosCandidato datosCandidato = null;
  @SerializedName("perfil")
  private EvaluacionPerfil perfil = null;
  @SerializedName("variablesGlobales")
  private EvaluacionVariablesGlobales variablesGlobales = null;
  @SerializedName("variablesLocales")
  private List<Variable> variablesLocales = null;

  public Evaluacion nombreEvaluacion(CatalogoTipoEvaluacion nombreEvaluacion) {
    this.nombreEvaluacion = nombreEvaluacion;
    return this;
  }

  public CatalogoTipoEvaluacion getNombreEvaluacion() {
    return nombreEvaluacion;
  }

  public void setNombreEvaluacion(CatalogoTipoEvaluacion nombreEvaluacion) {
    this.nombreEvaluacion = nombreEvaluacion;
  }

  public Evaluacion fechaAplicacion(String fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
    return this;
  }

  public String getFechaAplicacion() {
    return fechaAplicacion;
  }

  public void setFechaAplicacion(String fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
  }

  public Evaluacion folioAplicacion(String folioAplicacion) {
    this.folioAplicacion = folioAplicacion;
    return this;
  }

  public String getFolioAplicacion() {
    return folioAplicacion;
  }

  public void setFolioAplicacion(String folioAplicacion) {
    this.folioAplicacion = folioAplicacion;
  }


  public Evaluacion tiempoRespuesta(String tiempoRespuesta) {
    this.tiempoRespuesta = tiempoRespuesta;
    return this;
  }

  public String getTiempoRespuesta() {
    return tiempoRespuesta;
  }

  public void setTiempoRespuesta(String tiempoRespuesta) {
    this.tiempoRespuesta = tiempoRespuesta;
  }

  public Evaluacion datosCandidato(DatosCandidato datosCandidato) {
    this.datosCandidato = datosCandidato;
    return this;
  }

  public DatosCandidato getDatosCandidato() {
    return datosCandidato;
  }

  public void setDatosCandidato(DatosCandidato datosCandidato) {
    this.datosCandidato = datosCandidato;
  }

  public Evaluacion perfil(EvaluacionPerfil perfil) {
    this.perfil = perfil;
    return this;
  }

  public EvaluacionPerfil getPerfil() {
    return perfil;
  }

  public void setPerfil(EvaluacionPerfil perfil) {
    this.perfil = perfil;
  }

  public Evaluacion variablesGlobales(EvaluacionVariablesGlobales variablesGlobales) {
    this.variablesGlobales = variablesGlobales;
    return this;
  }

  public EvaluacionVariablesGlobales getVariablesGlobales() {
    return variablesGlobales;
  }

  public void setVariablesGlobales(EvaluacionVariablesGlobales variablesGlobales) {
    this.variablesGlobales = variablesGlobales;
  }

  public Evaluacion variablesLocales(List<Variable> variablesLocales) {
    this.variablesLocales = variablesLocales;
    return this;
  }

  public Evaluacion addVariablesLocalesItem(Variable variablesLocalesItem) {
    if (this.variablesLocales == null) {
      this.variablesLocales = new ArrayList<Variable>();
    }
    this.variablesLocales.add(variablesLocalesItem);
    return this;
  }

  public List<Variable> getVariablesLocales() {
    return variablesLocales;
  }

  public void setVariablesLocales(List<Variable> variablesLocales) {
    this.variablesLocales = variablesLocales;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluacion evaluacion = (Evaluacion) o;
    return Objects.equals(this.nombreEvaluacion, evaluacion.nombreEvaluacion)
        && Objects.equals(this.fechaAplicacion, evaluacion.fechaAplicacion)
        && Objects.equals(this.folioAplicacion, evaluacion.folioAplicacion)
   
        && Objects.equals(this.tiempoRespuesta, evaluacion.tiempoRespuesta)
        && Objects.equals(this.datosCandidato, evaluacion.datosCandidato)
        && Objects.equals(this.perfil, evaluacion.perfil)
        && Objects.equals(this.variablesGlobales, evaluacion.variablesGlobales)
        && Objects.equals(this.variablesLocales, evaluacion.variablesLocales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreEvaluacion, fechaAplicacion, folioAplicacion, tiempoRespuesta,
        datosCandidato, perfil, variablesGlobales, variablesLocales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluacion {\n");

    sb.append("    nombreEvaluacion: ").append(toIndentedString(nombreEvaluacion)).append("\n");
    sb.append("    fechaAplicacion: ").append(toIndentedString(fechaAplicacion)).append("\n");
    sb.append("    folioAplicacion: ").append(toIndentedString(folioAplicacion)).append("\n");
    sb.append("    tiempoRespuesta: ").append(toIndentedString(tiempoRespuesta)).append("\n");
    sb.append("    datosCandidato: ").append(toIndentedString(datosCandidato)).append("\n");
    sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
    sb.append("    variablesGlobales: ").append(toIndentedString(variablesGlobales)).append("\n");
    sb.append("    variablesLocales: ").append(toIndentedString(variablesLocales)).append("\n");
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

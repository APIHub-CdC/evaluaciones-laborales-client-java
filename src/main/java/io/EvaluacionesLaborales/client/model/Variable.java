package io.EvaluacionesLaborales.client.model;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


public class Variable {
  @SerializedName("indicador")
  private String indicador = null;
  @SerializedName("porcentajeObtenido")
  private Integer porcentajeObtenido = null;
  
  @JsonAdapter(SemaforizacionEnum.Adapter.class)
  public enum SemaforizacionEnum {
    VERDE("Verde"),
    
    AMARILLO("Amarillo"),
    
    NARANJA("Naranja"),
    
    ROJO("Rojo"),
    
    GRIS("Gris");
    private String value;
    SemaforizacionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SemaforizacionEnum fromValue(String text) {
      for (SemaforizacionEnum b : SemaforizacionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SemaforizacionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SemaforizacionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public SemaforizacionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SemaforizacionEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("semaforizacion")
  private SemaforizacionEnum semaforizacion = null;
  @SerializedName("textoInterpretacion")
  private String textoInterpretacion = null;
  public Variable indicador(String indicador) {
    this.indicador = indicador;
    return this;
  }
   
  
  public String getIndicador() {
    return indicador;
  }
  public void setIndicador(String indicador) {
    this.indicador = indicador;
  }
  public Variable porcentajeObtenido(Integer porcentajeObtenido) {
    this.porcentajeObtenido = porcentajeObtenido;
    return this;
  }
   
  
  public Integer getPorcentajeObtenido() {
    return porcentajeObtenido;
  }
  public void setPorcentajeObtenido(Integer porcentajeObtenido) {
    this.porcentajeObtenido = porcentajeObtenido;
  }
  public Variable semaforizacion(SemaforizacionEnum semaforizacion) {
    this.semaforizacion = semaforizacion;
    return this;
  }
   
  
  public SemaforizacionEnum getSemaforizacion() {
    return semaforizacion;
  }
  public void setSemaforizacion(SemaforizacionEnum semaforizacion) {
    this.semaforizacion = semaforizacion;
  }
  public Variable textoInterpretacion(String textoInterpretacion) {
    this.textoInterpretacion = textoInterpretacion;
    return this;
  }
   
  
  public String getTextoInterpretacion() {
    return textoInterpretacion;
  }
  public void setTextoInterpretacion(String textoInterpretacion) {
    this.textoInterpretacion = textoInterpretacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variable variable = (Variable) o;
    return Objects.equals(this.indicador, variable.indicador) &&
        Objects.equals(this.porcentajeObtenido, variable.porcentajeObtenido) &&
        Objects.equals(this.semaforizacion, variable.semaforizacion) &&
        Objects.equals(this.textoInterpretacion, variable.textoInterpretacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(indicador, porcentajeObtenido, semaforizacion, textoInterpretacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    indicador: ").append(toIndentedString(indicador)).append("\n");
    sb.append("    porcentajeObtenido: ").append(toIndentedString(porcentajeObtenido)).append("\n");
    sb.append("    semaforizacion: ").append(toIndentedString(semaforizacion)).append("\n");
    sb.append("    textoInterpretacion: ").append(toIndentedString(textoInterpretacion)).append("\n");
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

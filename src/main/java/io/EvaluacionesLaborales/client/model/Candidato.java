package io.EvaluacionesLaborales.client.model;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class Candidato {
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;

  @JsonAdapter(SexoEnum.Adapter.class)
  public enum SexoEnum {
    F("F"),

    M("M");

    private String value;

    SexoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SexoEnum fromValue(String text) {
      for (SexoEnum b : SexoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SexoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SexoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SexoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SexoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sexo")
  private SexoEnum sexo = null;
  @SerializedName("curp")
  private String curp = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("escolaridad")
  private Integer escolaridad = null;
  @SerializedName("folioEmpresa")
  private String folioEmpresa = null;
  @SerializedName("correoElectronico")
  private String correoElectronico = null;

  public Candidato nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public Candidato apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public Candidato apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public Candidato fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Candidato sexo(SexoEnum sexo) {
    this.sexo = sexo;
    return this;
  }

  public SexoEnum getSexo() {
    return sexo;
  }

  public void setSexo(SexoEnum sexo) {
    this.sexo = sexo;
  }

  public Candidato curp(String curp) {
    this.curp = curp;
    return this;
  }

  public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  public Candidato rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public Candidato escolaridad(Integer escolaridad) {
    this.escolaridad = escolaridad;
    return this;
  }

  public Integer getEscolaridad() {
    return escolaridad;
  }

  public void setEscolaridad(Integer escolaridad) {
    this.escolaridad = escolaridad;
  }

  public Candidato folioEmpresa(String folioEmpresa) {
    this.folioEmpresa = folioEmpresa;
    return this;
  }

  public String getFolioEmpresa() {
    return folioEmpresa;
  }

  public void setFolioEmpresa(String folioEmpresa) {
    this.folioEmpresa = folioEmpresa;
  }

  public Candidato correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candidato candidato = (Candidato) o;
    return Objects.equals(this.nombres, candidato.nombres)
        && Objects.equals(this.apellidoPaterno, candidato.apellidoPaterno)
        && Objects.equals(this.apellidoMaterno, candidato.apellidoMaterno)
        && Objects.equals(this.fechaNacimiento, candidato.fechaNacimiento) && Objects.equals(this.sexo, candidato.sexo)
        && Objects.equals(this.curp, candidato.curp) && Objects.equals(this.rfc, candidato.rfc)
        && Objects.equals(this.escolaridad, candidato.escolaridad)
        && Objects.equals(this.folioEmpresa, candidato.folioEmpresa)
        && Objects.equals(this.correoElectronico, candidato.correoElectronico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo, curp, rfc, escolaridad,
        folioEmpresa, correoElectronico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candidato {\n");

    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    escolaridad: ").append(toIndentedString(escolaridad)).append("\n");
    sb.append("    folioEmpresa: ").append(toIndentedString(folioEmpresa)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
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

package io.EvaluacionesLaborales.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class DatosCandidato {
  @SerializedName("nombreCompleto")
  private String nombreCompleto = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("correoElectronico")
  private String correoElectronico = null;
  @SerializedName("domicilio")
  private DomicilioCandidato domicilio = null;

  public DatosCandidato nombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
    return this;
  }

  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }

  public DatosCandidato sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public DatosCandidato fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public DatosCandidato correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public DatosCandidato domicilio(DomicilioCandidato domicilio) {
    this.domicilio = domicilio;
    return this;
  }

  public DomicilioCandidato getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(DomicilioCandidato domicilio) {
    this.domicilio = domicilio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosCandidato datosCandidato = (DatosCandidato) o;
    return Objects.equals(this.nombreCompleto, datosCandidato.nombreCompleto)
        && Objects.equals(this.sexo, datosCandidato.sexo)
        && Objects.equals(this.fechaNacimiento, datosCandidato.fechaNacimiento)
        && Objects.equals(this.correoElectronico, datosCandidato.correoElectronico)
        && Objects.equals(this.domicilio, datosCandidato.domicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreCompleto, sexo, fechaNacimiento, correoElectronico, domicilio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosCandidato {\n");

    sb.append("    nombreCompleto: ").append(toIndentedString(nombreCompleto)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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

package io.EvaluacionesLaborales.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class EvaluacionVariablesGlobales {
  @SerializedName("personalizadas")
  private List<Variable> personalizadas = null;
  @SerializedName("noPersonalizadas")
  private List<Variable> noPersonalizadas = null;

  public EvaluacionVariablesGlobales personalizadas(List<Variable> personalizadas) {
    this.personalizadas = personalizadas;
    return this;
  }

  public EvaluacionVariablesGlobales addPersonalizadasItem(Variable personalizadasItem) {
    if (this.personalizadas == null) {
      this.personalizadas = new ArrayList<Variable>();
    }
    this.personalizadas.add(personalizadasItem);
    return this;
  }

  public List<Variable> getPersonalizadas() {
    return personalizadas;
  }

  public void setPersonalizadas(List<Variable> personalizadas) {
    this.personalizadas = personalizadas;
  }

  public EvaluacionVariablesGlobales noPersonalizadas(List<Variable> noPersonalizadas) {
    this.noPersonalizadas = noPersonalizadas;
    return this;
  }

  public EvaluacionVariablesGlobales addNoPersonalizadasItem(Variable noPersonalizadasItem) {
    if (this.noPersonalizadas == null) {
      this.noPersonalizadas = new ArrayList<Variable>();
    }
    this.noPersonalizadas.add(noPersonalizadasItem);
    return this;
  }

  public List<Variable> getNoPersonalizadas() {
    return noPersonalizadas;
  }

  public void setNoPersonalizadas(List<Variable> noPersonalizadas) {
    this.noPersonalizadas = noPersonalizadas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluacionVariablesGlobales evaluacionVariablesGlobales = (EvaluacionVariablesGlobales) o;
    return Objects.equals(this.personalizadas, evaluacionVariablesGlobales.personalizadas)
        && Objects.equals(this.noPersonalizadas, evaluacionVariablesGlobales.noPersonalizadas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalizadas, noPersonalizadas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluacionVariablesGlobales {\n");

    sb.append("    personalizadas: ").append(toIndentedString(personalizadas)).append("\n");
    sb.append("    noPersonalizadas: ").append(toIndentedString(noPersonalizadas)).append("\n");
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

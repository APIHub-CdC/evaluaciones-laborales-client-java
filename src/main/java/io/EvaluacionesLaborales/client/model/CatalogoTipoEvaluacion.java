package io.EvaluacionesLaborales.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoTipoEvaluacion.Adapter.class)
public enum CatalogoTipoEvaluacion {

  IGH("IGH"),

  DRO("DRO"),

  IDEA("IDEA");

  private String value;

  CatalogoTipoEvaluacion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogoTipoEvaluacion fromValue(String text) {
    for (CatalogoTipoEvaluacion b : CatalogoTipoEvaluacion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogoTipoEvaluacion> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoEvaluacion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogoTipoEvaluacion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoEvaluacion.fromValue(String.valueOf(value));
    }
  }
}

package com.uniron.applimitador.Models;

import java.sql.Time;
import java.util.Calendar;

public class Relatorio {

 private Integer id;
  private Calendar data;
  private Double tempoUtilizado;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Calendar getData() {
    return data;
  }

  public void setData(Calendar data) {
    this.data = data;
  }

  public Double getTempoUtilizado() {
    return tempoUtilizado;
  }

  public void setTempoUtilizado(Double tempoUtilizado) {
    this.tempoUtilizado = tempoUtilizado;
  }
}

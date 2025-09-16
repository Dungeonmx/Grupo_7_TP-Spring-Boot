package ar.edu.unlpam.tp.SpringBootEj8.model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversorZonaHoraria {
  public String getFechaDestino(String fecha, String origen, String destino) {
    // 1. Parsear la fecha y hora a LocalDateTime
    LocalDateTime fechaOrigen = LocalDateTime.parse(fecha);

    // 2. Crear ZonedDateTime en la zona de origen
    ZoneId zoneOrigen = ZoneId.of(origen);
    ZonedDateTime fechaEnZonaOrigen = fechaOrigen.atZone(zoneOrigen);

    // 3. Convertir a la zona destino
    ZoneId zoneDestino = ZoneId.of(destino);
    ZonedDateTime fechaEnZonaDestino = fechaEnZonaOrigen.withZoneSameInstant(zoneDestino);

    // 4. Obtener la fecha y hora en la zona destino
    LocalDateTime fechaDestino = fechaEnZonaDestino.toLocalDateTime();

    return fechaDestino.toString();
  }
}

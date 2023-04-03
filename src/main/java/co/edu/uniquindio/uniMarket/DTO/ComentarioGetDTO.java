package co.edu.uniquindio.uniMarket.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class ComentarioGetDTO {

    private Integer codigo;

    private String mensaje;

    private Integer codigoProducto;

    private Integer codigoUsuario;

    private LocalDateTime fechaCreacion;

}

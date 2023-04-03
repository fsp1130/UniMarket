package co.edu.uniquindio.uniMarket.DTO;

import co.edu.uniquindio.uniMarket.entidades.Activo;
import co.edu.uniquindio.uniMarket.entidades.Categoria;
import co.edu.uniquindio.uniMarket.entidades.Estado;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class ProductoGetDTO {

    @NotNull
    private Integer codigo;

    @NotNull
    private Activo estado;

    @NotNull
    private LocalDateTime fechaLimite;

    @NotNull
    private String nombre;

    @NotNull
    private String descripcion;

    @NotNull
    private Integer unidades;

    @NotNull
    private float precio;

    @NotNull
    private Integer codigoVendedor;

    @NotNull
    private Map<String, String> imagenes;

    @NotNull
    private List<Categoria> categorias;
}

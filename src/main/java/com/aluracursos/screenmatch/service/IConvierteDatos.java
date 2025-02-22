package com.aluracursos.screenmatch.service;
//CREADA EN EL VIDEO 1.4
public interface IConvierteDatos {
      
    /**
     * Convierte un JSON en un objeto del tipo especificado.
     *
     * @param <T>    Indica que el método es genérico y puede trabajar con cualquier tipo T.
     * @param json   Una cadena JSON de la que queremos extraer datos.
     * @param clase  La clase en la que queremos convertir el JSON (ejemplo: Usuario.class), 
                     tambien significa que puede ingresar cualquier clase por eso es Class<T> (generica).
     * @return       Un objeto del tipo T, que se decide al momento de la llamada.
     * @throws IllegalArgumentException Si el JSON no se puede convertir al tipo T.
     */
    <T> T obtenerDatos(String json, Class<T> clase);
}

# Transporte de viajeros
Se van a leer las coordenadas de una lista de poblaciones y se van a graficar en un gráfico de dispersión o XY (Scatter Chart).

Los datos provienen de la hoja [lista de municipios](https://www.businessintelligence.info/assets/listado-longitud-latitud-municipios-espana.html)

Se van a obtener con WebScraping mediante la función leerPoblaciones() del [fichero JavaScript](../geocoordenadas/leerPoblaciones.js)
Para ello abrir la consola (F12) de la lista de municipios y pegar la definición de la función. Ejecutar a continuación la función y copiar el resultado (la consola de Google Chrome, inserta un botón Copy al final del listado de datos).

Los datos obtenidos se guardan como JSON en un fichero de nombre [jasonprueba.js](../geocoordenadas/jasonprueba.js). Para poder usar directamente el array en una variable, añadir por delante de dicho array el texto: "obj="

Para visualizar los datos, se utiliza la librería de [Google Chart](https://developers.google.com/chart/) y el tipo de gráfico [Scatter Chart](https://developers.google.com/chart/interactive/docs/gallery/scatterchart).
El resultado es el que se muestra en la página [pobDataGoogle.html](../geocoordenadas/visualizacion.html)


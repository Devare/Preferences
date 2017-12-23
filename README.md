# Preferences
Las preferencias no son más que datos que se guardan para ser compartidos con otros métodos y/o actividades.
En Android hay distintas maneras de almacenar datos:

1.- A través de una base de datos local y/o remota
2.- A través de las Shared Preferences
3.- Combinar ambas formas

La gestión de estas preferencias se centraliza en la clase SharedPreferences, que representa una colección de preferencias. A la hora 
de instanciarlas, estas tienen un identificador, que es la clave o nombre y un modo de acceso.


Para obtener una referencia a una colección determinada debes utilizar el método getSharedPrefences() al que se pasa el identificador 
de la colección y un modo de acceso. El modo de acceso indicará qué aplicaciones tendrán acceso a la colección de preferencias y qué 
operaciones tendrán permitido realizar sobre ellas. Así, se tendrá tres posibilidades principales:

1.- MODE_PRIVATE. Sólo tu aplicación tiene acceso a estas preferencias.
2.- MODE_WORLD_READABLE. Todas las aplicaciones pueden leer estas prefe-rencias, pero sólo la app que estés desarrollando puede modificarlas.
3.- MODE_WORLD_WRITABLE. Todas las aplicaciones pueden leer y modificar estas preferencias.

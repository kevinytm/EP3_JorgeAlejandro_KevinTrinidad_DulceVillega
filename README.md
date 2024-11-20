<h1>Descripción</h1>
<p>Realizar la implementación de los siguientes autómatas para la validación de los siguientes tipos de cadenas:
1. Autómata para realizar la validación de numero telefónico con los siguientes formatos: <br>
  1. ### ### ####<br>
    1. 777 100 1223<br>
    2. 555 678 9009<br>
  2. ###-###-####<br>
    1. 777-100-1223<br>
    2. 555-678-9009<br>
  3. Reglas de construcción:<br>
    1. Solo pueden contener dígitos del 0-9, guión (-) o espacio.<br>
    2. El formato siempre debe contener las siguiente composición:<br>
      1. Lada (3 dígitos).<br>
      2. Numero parte 1 (3 dígitos).<br>
      3. numero parte 2 (4 dígitos).<br>

2. Autómata para realizar la validación de correo electrónico con los siguientes formatos: <br>
  1. nombreUsuario@dominio<br>
    1. cminauro@upemor.edu.mx<br>
    2. rrosales@upemor.edu.mx<br>
    3. 1234567890@upemor.edu.mx<br>
  2. nombreUsuario@subdominio.dominio<br>
    1. usuario@tlaloc.imta.mx<br>
    2. usuario@server01.company.com<br>
  3. las reglas de construcción del dominio son:<br>
    1. No pueden contener caracteres especiales.<br>
    2. Solo pueden contener caracteres a-z, A-Z, 0-9, punto(.), guión (-) y guión bajo (_).<br>
    3. Las extensiones de dominio pueden ser:<br>
      1. .com<br>
      2. .com.mx<br>
      3. .net<br>
      4. .net.mx<br>
 </p>

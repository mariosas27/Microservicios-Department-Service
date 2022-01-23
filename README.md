# DEPARTMENT-SERVICE
## Requisitos
El funcionamiento de este proyecto va de la mano de service-registry, cloud-gateway y user-service
## Funcionamiento
### Petición POST
Department-service realiza inserciones de departamento a través de una peticón POST, el cuerpo de la petición debe de ser en formato JSON.
#### Ejemplo
```json
{
  "departmentName":"SISTEMAS",
  "departmentAddress":"EDIFICIO G, PISO 2",
  "departmentCode":"SCI-01"
}
```


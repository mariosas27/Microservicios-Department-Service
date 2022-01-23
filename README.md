# DEPARTMENT-SERVICE
## Requisitos
El funcionamiento de este proyecto va de la mano de service-registry, cloud-gateway y user-service
## Funcionamiento
### Petición POST
Department-service realiza inserciones de departamento a través de una peticón POST, el cuerpo de la petición debe de ser en formato JSON. Los elementos que debe de tener son los siguientes:
```json
{
  "departmentName":"IT",
    "departmentAddress":"3rd Cross, First Street",
    "departmentCode":"IT-006"
}
```

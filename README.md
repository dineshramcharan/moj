# Spring Boot application for MOJ Task

# Command to create self signed SSL Certificate JKS
`keytool -keystore keystore.jks -alias moj -storepass moj123  -deststoretype jks  -genkey -keyalg RSA -validity 1000 -keysize 2048  -dname "CN=moj,O=Ministry Of justice - ksa,OU=MOJ,L=Riyadh,ST=Riyadh,C=SA" -ext "SAN=IP:IP:127.0.0.1"`

# Swagger url 
`https://127.0.0.1:8443/swagger-ui.html` - returns 'swagger UI'



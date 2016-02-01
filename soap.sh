#!/bin/sh

curl -H "Content-Type: text/xml;charset=UTF-8" -H "SOAPAction: sayHello" \
--data @call.xml 'http://localhost:8080/servidor/ExamenWs'

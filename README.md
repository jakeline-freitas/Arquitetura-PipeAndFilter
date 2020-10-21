# Arquitetura_PipeAndFilter
## Índice
* [Informações gerais](#informaçõesgerais)
* [Tecnologias](#Tecnologiass)
* [Características](#Características)

## Informações gerais
Este é um projeto simples para exemplificar o estilo arquitetural Pipe-and-Filter, tem como funcionalidades criar, preencher um arquivo e mostra-lo no console em letras maiúsculas.
	
## Tecnologias
O projeto é criado com:
* Java
	
## Características

 As classes  FileWriter e FileReader usadas no projeto para escrever e ler dados de arquivos de texto são os componentes(filter) que leem ou transformam o fluxo de entrada e
 produzem resultados como fluxo de saída. O fluxo de saída é conduzido para o fluxo
de entrada de outro filter através de conectores(pipes).

![pipe_filter1](https://user-images.githubusercontent.com/56088381/96668461-93448a80-1331-11eb-85f4-e392993b6573.png)


# SpringDemo
Demo of Spring capabilities

# WebSocket Implementation
## WebSocket
WebSocket обеспечивает двустороннюю связь между клиентом и сервером, используя одно TCP соединение.

WebSocket разработан для воплощения в веб-браузерах и веб-серверах,
но он может быть использован для любого клиентского или серверного приложения.
Протокол WebSocket — это независимый протокол, основанный на протоколе TCP.
Он делает возможным более тесное взаимодействие между браузером и веб-сайтом,
способствуя распространению интерактивного содержимого и созданию приложений реального времени.

## STOMP
Simple/Streaming Text-Oriented Messaging Protocol (STOMP)
STOMP — протокол обмена сообщениями, созданный предельно простым.
Основан на фреймах по образцу HTTP. Фрейм состоит из команды, необязательных заголовков и необязательного тела.

> \>>>SUBSCRIBE\
 id:sub-0\
 destination:/topic/pit
 
>\>>> SEND\
 destination:/app/inpoint\
 content-length:18\
 \
 {"content":"test"}

>\<<< MESSAGE\
destination:/topic/pit\
content-type:application/json\
subscription:sub-0\
message-id:0qatgrox-14\
content-length:29\
\
{"content":"0qatgrox > test"}


## SockJS
SockJs — это JavaScript библиотека, которая обеспечивает двусторонний междоменный канал связи между клиентом и сервером.
Другими словами SockJs имитирует WebSocket API.
Под капотом SockJS сначала пытается использовать нативную реализацию WebSocket API.
Если это не удается, используются различные транспортные протоколы, специфичные для браузера,
и представляет их через абстракции, подобные WebSocket. 
# speaker
A minimal java application with a json-rpc interface

## Build the json-rpc server
From the project directory run 

`mvn package`

to generate a single jar with all the dependencies bundled-in for the json-rpc server. The jar
will be generated at `target/speaker-0.0.1-SNAPSHOT-jar-with-dependencies.jar`

## Run the json-rpc server

Start the json-rpc server using the command

`java -jar target/speaker-0.0.1-SNAPSHOT-jar-with-dependencies.jar`

The rpc server will be available at `http://localhost:8080/`

## Test the json-rpc server

Send a json-rpc request to the Hello service using the command 

`curl -d ' {"jsonrpc": "2.0", "method": "greeting", "params": ["Robinson", "Crusoe"], "id": 1}' -H "Content-Type: application/json" -X POST http://localhost:8080/`

You should see the response as below:

`{"jsonrpc":"2.0","id":1,"result":"Hello Robinson Crusoe"}`







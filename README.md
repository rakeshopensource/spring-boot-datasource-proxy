# spring-boot-datasource-proxy



```
2018-04-02 23:09:44.664  INFO 5685 --- [  restartedMain] n.t.d.l.l.SLF4JQueryLoggingListener      : {"name":"Query Execution", "connection":8, "time":4, "success":true, "type":"Prepared", "batch":false, "querySize":1, "batchSize":0, "query":["select next_val as id_val from hibernate_sequence for update"], "params":[[]]}
2018-04-02 23:09:44.667  INFO 5685 --- [  restartedMain] n.t.d.l.l.SLF4JQueryLoggingListener      : {"name":"Query Execution", "connection":8, "time":1, "success":true, "type":"Prepared", "batch":false, "querySize":1, "batchSize":0, "query":["update hibernate_sequence set next_val= ? where next_val=?"], "params":[["2","1"]]}
2018-04-02 23:09:44.697  INFO 5685 --- [  restartedMain] n.t.d.l.l.SLF4JQueryLoggingListener      : {"name":"Query Execution", "connection":7, "time":1, "success":true, "type":"Prepared", "batch":false, "querySize":1, "batchSize":0, "query":["insert into user (age, name, id) values (?, ?, ?)"], "params":[["3","Dhariya","1"]]}
```


```
{
  "name": "Query Execution",
  "connection": 7,
  "time": 1,
  "success": true,
  "type": "Prepared",
  "batch": false,
  "querySize": 1,
  "batchSize": 0,
  "query": [
    "insert into user (age, name, id) values (?, ?, ?)"
  ],
  "params": [
    [
      "3",
      "Dhariya",
      "1"
    ]
  ]
}
```

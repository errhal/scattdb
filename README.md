# ScattDB - distributed database on top of Scala/JVM ecosystem.

Actual supported database is key value store with optional persistence.

## Getting started

Properties needed to set before running application node:
```    
scattdb.port
```
Describes port number, what you like to run node on.

```
scattdb.dir
```
Directory for storing db files (needed if data is persisted).

```
scattdb.persistKeyValue
```
True if you want to persist data, false otherwise.

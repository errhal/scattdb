# ScattDB - distributed database on top of Scala/JVM ecosystem.

Actual supported database is key value store with optional persistence.

## Getting started

Properties needed to set before running application node:
```    
scattdb.default.port
```
Describes port number, what you like to run node on.

```
scattdb.db.files
```
Directory for storing db files (needed if data is persisted).

```
scattdb.persistKeyValue
```
True if you want to persist data, false otherwise.

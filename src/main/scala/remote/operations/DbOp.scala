package remote.operations

trait DbOp

final case class SelectKeyValue(dataset: String, key: String) extends DbOp

final case class InsertKeyValue(dataset: String, key: String, value: String) extends DbOp

final case class SelectEntry(dataset: String) extends DbOp

trait DbResult

final case class SelectResult(result: String) extends DbResult

final case class InsertResult(result: Boolean) extends DbResult

package remote.operations

trait DbOp

final case class SelectKeyValue(dataset: String, key: String) extends DbOp

final case class InsertKeyValue(dataset: String, key: String, value: String) extends DbOp

final case class DeleteKeyValue(dataset: String, key: String) extends DbOp

final case class SelectEntry(dataset: String) extends DbOp

final case class InsertEntry(uuid: String, dataset: String, entry: String) extends DbOp

trait DbResult

final case class SelectKeyResult(result: String) extends DbResult

final case class InsertKeyResult(result: String) extends DbResult

final case class DeleteKeyResult(result: String) extends DbResult

final case class SelectEntryResult(result: String) extends DbResult

final case class InsertEntryResult(result: Boolean) extends DbResult

final case class DeleteEntryResult(result: String) extends DbResult

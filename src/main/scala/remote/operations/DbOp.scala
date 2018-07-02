package remote.operations

trait DbOp

final case class DeleteEntry(dataset: String) extends DbOp

final case class MessageQueryWrapper(query: Map[String, String])

trait DbResult

final case class SelectKeyResult(result: String) extends DbResult

final case class InsertKeyResult(result: String) extends DbResult

final case class DeleteKeyResult(result: String) extends DbResult

final case class SelectEntryResult(result: String) extends DbResult

final case class InsertEntryResult(result: String) extends DbResult

final case class DeleteEntryResult(result: String) extends DbResult

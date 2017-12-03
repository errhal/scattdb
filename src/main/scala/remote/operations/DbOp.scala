package remote.operations

import java.util.concurrent.ConcurrentHashMap

trait DbOp

final case class Select(dataset: String, key: String) extends DbOp

trait DbResult

final case class SelectResult(result: ConcurrentHashMap[String, AnyRef]) extends DbResult

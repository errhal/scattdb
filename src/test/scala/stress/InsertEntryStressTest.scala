package stress

object InsertEntryStressTest extends AbstractStressTest {
  override def getQueryPattern(index: Integer): String = {
    "insert entry({\"basic\":\"example" + index + "\"}) into db1"
  }
}

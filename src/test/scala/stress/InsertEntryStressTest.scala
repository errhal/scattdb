package stress

object InsertEntryStressTest extends AbstractStressTest {
  override def getQueryPattern(index: Integer): String = {
    "query[insert entry({\"basic\":\"example\"}) into db1]"
  }
}

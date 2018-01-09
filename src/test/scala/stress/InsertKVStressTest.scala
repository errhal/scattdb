package stress

object InsertKVStressTest extends AbstractStressTest {
  override def getQueryPattern(index: Integer): String = {
    "query[insert key(key" + index + ") into db1 data({\"data\":\"example1\"})]"
  }
}

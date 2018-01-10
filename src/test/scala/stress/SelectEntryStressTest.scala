package stress

object SelectEntryStressTest extends AbstractStressTest {
  override def getQueryPattern(index: Integer): String = {
    "query[select entry(key1) from db1]"
  }
}

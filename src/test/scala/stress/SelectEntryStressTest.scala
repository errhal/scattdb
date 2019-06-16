package stress

object SelectEntryStressTest extends AbstractStressTest {
  override def getQueryPattern(index: Integer): String = {
    "select entry(key1) from db1 where basic=\"example2\""
  }
}

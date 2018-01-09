package stress

object SelectKVStressTest extends AbstractStressTest {
  override def getQueryPattern(index: Integer): String = {
    "query[select key(key" + index + ") from db1]"
  }
}

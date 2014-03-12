import scalaj.http.Http

object Main {
  val URL = "http://www.google.com/trends/hottrends/atom/feed?pn=p1"

  def main(args: Array[String]) = {
    val res = Http.get(URL).asXml

    println(res \ "channel")
  }
}

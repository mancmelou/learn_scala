import uk.co.bigbeeconsultants.http.HttpClient
import uk.co.bigbeeconsultants.http.response.Response
import java.net.URL

import scala.xml._
import java.net._
import scala.io.Source

object Main {
  def main(args: Array[String]) = {
    val xml = GoogleTrendsFeed("http://www.google.com/trends/hottrends/atom/feed?pn=p1")
    val rss = XML.loadString(xml)

    println((rss \\ "channel" \\ "item"))
  }
}

object GoogleTrendsFeed {
  def apply(feed_url: String): String = {
    val client = new HttpClient
    val url    = new URL(feed_url)

    client.get(url).body.asString
  }
}
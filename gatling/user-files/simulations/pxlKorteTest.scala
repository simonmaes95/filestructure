
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class pxlKorteTest extends Simulation {

	val httpProtocol = http
		.baseURL("http://www.pxl.be")
		.inferHtmlResources()

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "nl-NL,nl;q=0.9,en-US;q=0.8,en;q=0.7",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_1 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "nl-NL,nl;q=0.9,en-US;q=0.8,en;q=0.7",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_3 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_19 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_20 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "nl-NL,nl;q=0.9,en-US;q=0.8,en;q=0.7",
		"cookie" -> "CONSENT=YES+BE.nl+V9; NID=125=qt7Sy-h6MkJb8pUC-ZibRGahf35aNg0YORgQdfhEEXdITu9tjVxwNATDEzgjFfhf5Th3VwC6RBDTI5GDsJjB0vF89XDtiWelUlE7_yfSJrYmq--q3CyC5pCeR3JzMLS9YXDxkHh9AjZi; 1P_JAR=2018-3-12-8",
		"referer" -> "http://www.pxl.be/Pub/Congress/Congress-PXL-Congress/Congress-PXL-Congress-Campusplan.html",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36",
		"x-client-data" -> "CJK2yQEIpbbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_22 = Map(
		"Origin" -> "https://platform.twitter.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_25 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "nl-NL,nl;q=0.9,en-US;q=0.8,en;q=0.7",
		"cookie" -> "GAPS=1:rHR2uBG4qZW1u5VTvqyafNGwLu57jg:bsjVuMBZl7a27Ih5; CONSENT=YES+BE.nl+V9; NID=125=qt7Sy-h6MkJb8pUC-ZibRGahf35aNg0YORgQdfhEEXdITu9tjVxwNATDEzgjFfhf5Th3VwC6RBDTI5GDsJjB0vF89XDtiWelUlE7_yfSJrYmq--q3CyC5pCeR3JzMLS9YXDxkHh9AjZi; 1P_JAR=2018-3-12-8",
		"referer" -> "http://www.pxl.be/Pub/Congress/Congress-PXL-Congress/Congress-PXL-Congress-Campusplan.html",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36",
		"x-client-data" -> "CJK2yQEIpbbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_29 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "nl-NL,nl;q=0.9,en-US;q=0.8,en;q=0.7",
		"cookie" -> "datr=eJmfWvr_9gsyitmKKqs1Zzf_; sb=eJmfWo6MW-rVPNuDye9yvNVD; c_user=1657590868; xs=123%3AwxP3_i0DQBP4Ug%3A2%3A1520408963%3A3133%3A4975; pl=n; wd=1745x885; ; fr=0bVxtZ4OSH0trXTD6.AWX4x4Pe3I8weAsSl4xVTvmpdHo.Ban5mD.N6.Fqf.0.0.Bapk7w.AWUDoqMi",
		"referer" -> "http://www.pxl.be/Pub/Congress/Congress-PXL-Congress/Congress-PXL-Congress-Campusplan.html",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_32 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "nl-NL,nl;q=0.9,en-US;q=0.8,en;q=0.7",
		"cookie" -> "datr=eJmfWvr_9gsyitmKKqs1Zzf_; sb=eJmfWo6MW-rVPNuDye9yvNVD; c_user=1657590868; xs=123%3AwxP3_i0DQBP4Ug%3A2%3A1520408963%3A3133%3A4975; pl=n; wd=1745x885; ; fr=0bVxtZ4OSH0trXTD6.AWX4x4Pe3I8weAsSl4xVTvmpdHo.Ban5mD.N6.Fqf.0.0.Bapk7w.AWUDoqMi",
		"referer" -> "http://www.pxl.be/Pub/Congress/Congress-PXL-Congress/Congress-PXL-Congress-Campusplan.html",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_36 = Map(
		"Origin" -> "https://www.facebook.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_39 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "nl-NL,nl;q=0.9,en-US;q=0.8,en;q=0.7",
		"cache-control" -> "max-age=0",
		"content-length" -> "1176",
		"cookie" -> """personalization_id="v1_FMNDtJfeW8ITJSZ2u7PuOg=="; guest_id=v1%3A152041137493506460""",
		"origin" -> "null",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

    val uri01 = "connect.facebook.net"
    val uri02 = "staticxx.facebook.com"
    val uri03 = "https://accounts.google.com/o/oauth2/postmessageRelay"
    val uri04 = "www.google-analytics.com"
    val uri05 = "https://www.facebook.com"
    val uri06 = "https://static.xx.fbcdn.net/rsrc.php"
    val uri07 = "https://cdnjs.cloudflare.com/ajax/libs/flickity/1.0.2"
    val uri08 = "https://syndication.twitter.com"
    val uri09 = "https://www.flexmail.eu/tracking.js"
    val uri11 = "https://apis.google.com"
    val uri12 = "http://cdn.flxml.eu/dyn/app/fast-requests/automation/hasCookie.php"
    val uri13 = "platform.twitter.com"
    val uri14 = "https://ssl.gstatic.com/accounts/o/137477057-postmessagerelay.js"

	val scn = scenario("pxlKorteTest")
		.exec(http("request_0")
			.get("/Pub/Congress/Congress-PXL-Congress/Congress-PXL-Congress-Campusplan.html")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/Assets/website/congress_werkveld/afbeeldingen/Bereikbaarheid%20campussen.png")
			.headers(headers_1),
            http("request_2")
			.get("/webfonts/neue-helvetica-bold-extended.woff2"),
            http("request_3")
			.get(uri11 + "/_/scs/apps-static/_/js/k=oz.gapi.nl.q4YpTkaHPe8.O/m=plusone/rt=j/sv=1/d=1/ed=1/am=AQE/rs=AGLTcCNQwGVBDLgOryJwxLa4LVCEnj68mQ/cb=gapi.loaded_0")
			.headers(headers_3),
            http("request_4")
			.get("http://" + uri13 + "/widgets.js")
			.headers(headers_3),
            http("request_5")
			.get("/img/search.png"),
            http("request_6")
			.get("/assets/afbeeldingen_algemeen/1314_congress_1920x465.jpg?hid=img;q=90")
			.headers(headers_1),
            http("request_7")
			.get("/img/white_80_transparent.png"),
            http("request_8")
			.get("/img/arrow_small_right.png")
			.headers(headers_3),
            http("request_9")
			.get("/img/arrow_mini_green_right.png")
			.headers(headers_3),
            http("request_10")
			.get("http://" + uri01 + "/en_US/all.js")
			.headers(headers_3),
            http("request_11")
			.get("http://" + uri04 + "/ga.js")
			.headers(headers_3),
            http("request_12")
			.get(uri12 + "?nc1520848953931&au=35317f508ad87b866aa5f57529763ccf")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_13")
			.get(uri11 + "/_/scs/apps-static/_/js/k=oz.gapi.nl.q4YpTkaHPe8.O/m=auth/exm=plusone/rt=j/sv=1/d=1/ed=1/am=AQE/rs=AGLTcCNQwGVBDLgOryJwxLa4LVCEnj68mQ/cb=gapi.loaded_1")
			.headers(headers_3),
            http("request_14")
			.get("/img/search-icon.png"),
            http("request_15")
			.get("/img/responsive-dropdown-menu.png")
			.headers(headers_3),
            http("request_16")
			.get("https://" + uri01 + "/en_US/all.js")
			.headers(headers_3),
            http("request_17")
			.get("https://" + uri04 + "/ga.js")
			.headers(headers_3),
            http("request_18")
			.get("https://" + uri13 + "/js/button.5f64a1a5864e1229f84c8defd65341b4.js")
			.headers(headers_3),
            http("request_19")
			.get("https://" + uri13 + "/widgets/widget_iframe.2e798283373a8137c24e277b9b9620d6.html?origin=http%3A%2F%2Fwww.pxl.be")
			.headers(headers_19),
            http("request_20")
			.get(uri11 + "/se/0/_/+1/fastbutton?usegapi=1&size=medium&origin=http%3A%2F%2Fwww.pxl.be&url=http%3A%2F%2Fwww.pxl.be%2FPub%2FCongress%2FCongress-PXL-Congress%2FCongress-PXL-Congress-Campusplan.html&gsrc=3p&ic=1&jsh=m%3B%2F_%2Fscs%2Fapps-static%2F_%2Fjs%2Fk%3Doz.gapi.nl.q4YpTkaHPe8.O%2Fm%3D__features__%2Fam%3DAQE%2Frt%3Dj%2Fd%3D1%2Frs%3DAGLTcCNQwGVBDLgOryJwxLa4LVCEnj68mQ")
			.headers(headers_20),
            http("request_21")
			.get("http://" + uri04 + "/__utm.gif?utmwv=5.7.1&utms=8&utmn=97802815&utmhn=www.pxl.be&utmcs=UTF-8&utmsr=1920x1080&utmvp=1348x925&utmsc=24-bit&utmul=nl&utmje=0&utmfl=-&utmdt=Campusplan&utmhid=400858082&utmr=0&utmp=%2FPub%2FCongress%2FCongress-PXL-Congress%2FCongress-PXL-Congress-Campusplan.html&utmht=1520848954050&utmac=UA-38234583-1&utmcc=__utma%3D144741621.626046546.1520408094.1520840112.1520848622.9%3B%2B__utmz%3D144741621.1520408094.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B&utmjid=&utmu=qBAAAAAAAAAAAAAAAAAAAAAE~")
			.headers(headers_3),
            http("request_22")
			.get(uri08 + "/settings")
			.headers(headers_22),
            http("request_23")
			.get(uri11 + "/_/scs/apps-static/_/js/k=oz.gapi.nl.q4YpTkaHPe8.O/m=googleapis_client,gapi_iframes_style_common,gapi_iframes_iframer/am=AQE/rt=j/d=1/rs=AGLTcCNQwGVBDLgOryJwxLa4LVCEnj68mQ")
			.headers(headers_3),
            http("request_24")
			.get("https://" + uri13 + "/widgets/tweet_button.2e798283373a8137c24e277b9b9620d6.en.html")
			.headers(headers_19),
            http("request_25")
			.get(uri03 + "?parent=http%3A%2F%2Fwww.pxl.be&jsh=m%3B%2F_%2Fscs%2Fapps-static%2F_%2Fjs%2Fk%3Doz.gapi.nl.q4YpTkaHPe8.O%2Fm%3D__features__%2Fam%3DAQE%2Frt%3Dj%2Fd%3D1%2Frs%3DAGLTcCNQwGVBDLgOryJwxLa4LVCEnj68mQ")
			.headers(headers_25),
            http("request_26")
			.get(uri14 + ""),
            http("request_27")
			.get(uri11 + "/js/rpc:shindig_random.js?onload=init"),
            http("request_28")
			.get(uri11 + "/_/scs/apps-static/_/js/k=oz.gapi.nl.q4YpTkaHPe8.O/m=rpc,shindig_random/rt=j/sv=1/d=1/ed=1/am=AQE/rs=AGLTcCNQwGVBDLgOryJwxLa4LVCEnj68mQ/cb=gapi.loaded_0"),
            http("request_29")
			.get(uri05 + "/impression.php/fa7be87573f27/?lid=115&payload=%7B%22source%22%3A%22jssdk%22%7D")
			.headers(headers_29),
            http("request_30")
			.get("http://" + uri02 + "/connect/xd_arbiter/r/Ms1VZf1Vg1J.js?version=42")
			.headers(headers_19),
            http("request_31")
			.get("https://" + uri02 + "/connect/xd_arbiter/r/Ms1VZf1Vg1J.js?version=42")
			.headers(headers_3),
            http("request_32")
			.get(uri05 + "/plugins/share_button.php?app_id=&channel=http%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2FMs1VZf1Vg1J.js%3Fversion%3D42%23cb%3Df298b231953338%26domain%3Dwww.pxl.be%26origin%3Dhttp%253A%252F%252Fwww.pxl.be%252Ff14d9a3fae89a88%26relation%3Dparent.parent&container_width=100&href=http%3A%2F%2Fwww.pxl.be%2FPub%2FCongress%2FCongress-PXL-Congress%2FCongress-PXL-Congress-Campusplan.html&locale=en_US&sdk=joey&type=button&width=100")
			.headers(headers_32),
            http("request_33")
			.get(uri06 + "/v3ijLc4/yy/l/en_US/O6KmNBh3g2X.js")
			.headers(headers_3),
            http("request_34")
			.get(uri06 + "/v3/yy/r/uPlIYLfynqH.png")
			.headers(headers_3),
            http("request_35")
			.get(uri05 + "/plugins/like.php?app_id=&channel=http%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2FMs1VZf1Vg1J.js%3Fversion%3D42%23cb%3Df30faf8b651535%26domain%3Dwww.pxl.be%26origin%3Dhttp%253A%252F%252Fwww.pxl.be%252Ff14d9a3fae89a88%26relation%3Dparent.parent&container_width=100&href=http%3A%2F%2Fwww.pxl.be%2FPub%2FCongress%2FCongress-PXL-Congress%2FCongress-PXL-Congress-Campusplan.html&layout=button_count&locale=en_US&sdk=joey&send=false&show_faces=false&width=100")
			.headers(headers_32),
            http("request_36")
			.get(uri06 + "/v3ijLc4/yy/l/en_US/O6KmNBh3g2X.js")
			.headers(headers_36),
            http("request_37")
			.get(uri06 + "/v3/yn/r/lH1ibRl5GKq.png")
			.headers(headers_3),
            http("request_38")
			.get(uri06 + "/v3/yy/r/cDyyloiRSzM.png")
			.headers(headers_3),
            http("request_39")
			.post(uri08 + "/i/jot")
			.headers(headers_39)
			.formParam("dnt", "0")
			.formParam("tfw_redirect", "https://platform.twitter.com/jot.html")
			.formParam("l", """{"widget_origin":"http://www.pxl.be/Pub/Congress/Congress-PXL-Congress/Congress-PXL-Congress-Campusplan.html","widget_frame":false,"language":"en","message":"m:nocount:","_category_":"tfw_client_event","triggered_on":1520848954391,"dnt":false,"client_version":"ddac2a0:1519885330543","format_version":1,"event_namespace":{"client":"tfw","page":"button","section":"share","action":"impression"}}""")
			.formParam("l", """{"widget_origin":"http://www.pxl.be/Pub/Congress/Congress-PXL-Congress/Congress-PXL-Congress-Campusplan.html","widget_frame":null,"duration_ms":237.2000003233552,"_category_":"tfw_client_event","triggered_on":1520848954391,"dnt":false,"client_version":"ddac2a0:1519885330543","format_version":1,"event_namespace":{"client":"tfw","action":"render","page":"page","component":"performance"}}""")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
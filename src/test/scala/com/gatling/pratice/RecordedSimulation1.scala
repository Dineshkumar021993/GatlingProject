package com.gatling.pratice

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation1 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://z.clarity.ms")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Mobile Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "application/x-clarity-gzip",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Origin" -> "https://finsights.biz",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_1 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"access-control-request-headers" -> "content-type,x-tawk-token",
		"access-control-request-method" -> "POST",
		"origin" -> "https://finsights.biz",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_2 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_3 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json; charset=utf-8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"x-tawk-token" -> "eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InZpc2l0b3ItYXBwbGljYXRpb24tc2VydmVyLTIwMjEwMjIifQ.eyJwaWQiOiI2MGUzZTg4YjY0OWUwYTBhNWNjYWI4NTUiLCJ2aWQiOiI2MGUzZTg4YjY0OWUwYTBhNWNjYWI4NTUtRmFGdUo3VUljQ2hDQTBJMGFFNUpSIiwic2lkIjoiNjRjNGYxMTZlZTc3MTYyM2EyMmY5MjYwIiwiaWF0IjoxNjkwNjI4Mzc0LCJleHAiOjE2OTA2MzAxNzQsImp0aSI6ImlITUtTYnNVaExoS3R6Q0V2MTlqRSJ9.yVUv3kUeZn4L16eJiTISD3eDz2TPFT-ZDcZhR-GsIEMCv7_3WUiwGYPI3sGKP9TrLZSzrXf70hbMpSFbn0HKDg")

	val headers_4 = Map(
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_51 = Map(
		"Origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_57 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "none",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_63 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_64 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_65 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CIS2yQEIorbJAQipncoBCPf9ygEIlKHLAQiFoM0BGIynzQE=")

	val headers_66 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_76 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CIS2yQEIorbJAQipncoBCPf9ygEIlKHLAQiFoM0BGIynzQE=")

	val headers_80 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_85 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "iframe",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"upgrade-insecure-requests" -> "1")

	val headers_89 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_95 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_101 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json; charset=utf-8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"x-tawk-token" -> "eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InZpc2l0b3ItYXBwbGljYXRpb24tc2VydmVyLTIwMjEwMjIifQ.eyJwaWQiOiI2MGUzZTg4YjY0OWUwYTBhNWNjYWI4NTUiLCJ2aWQiOiI2MGUzZTg4YjY0OWUwYTBhNWNjYWI4NTUtRmFGdUo3VUljQ2hDQTBJMGFFNUpSIiwic2lkIjoiNjRjNTFiZjhlZTc3MTYyM2EyNzkyOWZlIiwiaWF0IjoxNjkwNjM5MzUyLCJleHAiOjE2OTA2NDExNTIsImp0aSI6IjFhWlhjbF9iUlB5aFVaalhOMmllaiJ9.on19FUIyYiandOQDOgh8xqrfIi_p235n4P_13NJA_NofWRoryDq_j1UNDmKO8kdeDVxFDirmqnAVqhhbOz0xCQ")

	val headers_104 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CIS2yQEIorbJAQipncoBCPf9ygEIlKHLAQiFoM0BGIynzQE=")

	val headers_120 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"purpose" -> "prefetch",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_122 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://finsights.biz",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_125 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_126 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json; charset=utf-8",
		"origin" -> "https://finsights.biz",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val uri01 = "https://connect.facebook.net/signals/config/534060991554483"
	val uri02 = "https://finsights.biz"
	val uri03 = "https://www.facebook.com/tr"
	val uri04 = "https://pixel.wp.com"
	val uri05 = "https://fonts-api.wp.com/css"
	val uri06 = "https://analytics.google.com/g/collect"
	val uri07 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/10877119487"
	val uri08 = "https://eu8.heatmap.it/log"
	val uri10 = "https://www.google-analytics.com"
	val uri11 = "https://embed.tawk.to"
	val uri12 = "https://www.clarity.ms/tag"
	val uri13 = "https://www.googletagmanager.com"
	val uri14 = "https://www.google.com/pagead/1p-user-list/10877119487"
	val uri15 = "https://www.google.co.in/pagead/1p-user-list/10877119487"
	val uri16 = "https://s0.wp.com/wp-content/js/bilmur.min.js"
	val uri17 = "https://va.tawk.to"

	val scn = scenario("RecordedSimulation1")
		.exec(http("request_0")
			.post("/collect")
			.headers(headers_0)
			.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0000_request.bin"))
			.resources(http("request_1")
				.options(uri17 + "/v1/session/start")
				.headers(headers_1),
				http("request_2")
					.get(uri17 + "/v1/widget-settings?propertyId=60e3e88b649e0a0a5ccab855&widgetId=1f9t48og7&sv=undefined")
					.headers(headers_2),
				http("request_3")
					.post(uri17 + "/v1/session/start")
					.headers(headers_3)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0003_request.json"))))
		.pause(1)
		.exec(http("request_4")
			.get(uri02 + "/wp-content/plugins/jetpack/jetpack_vendor/automattic/jetpack-videopress/build/block-editor/blocks/video/view.css?minify=false&")
			.headers(headers_4)
			.resources(http("request_5")
				.get(uri02 + "/wp-content/themes/generatepress/assets/css/main.min.css?ver=3.1.1")
				.headers(headers_4),
				http("request_6")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/eicons/css/elementor-icons.min.css?ver=5.20.0")
					.headers(headers_4),
				http("request_7")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/swiper/css/swiper.min.css?ver=5.3.6")
					.headers(headers_4),
				http("request_8")
					.get(uri02 + "/wp-content/plugins/jetpack/modules/likes/style.css?ver=12.4-a.4")
					.headers(headers_4),
				http("request_9")
					.get(uri02 + "/wp-content/uploads/elementor/css/post-35.css?ver=1683917082")
					.headers(headers_4),
				http("request_10")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/font-awesome/css/all.min.css?ver=3.13.2")
					.headers(headers_4),
				http("request_11")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/font-awesome/css/v4-shims.min.css?ver=3.13.2")
					.headers(headers_4),
				http("request_12")
					.get(uri02 + "/wp-content/uploads/elementor/css/post-14591.css?ver=1683923896")
					.headers(headers_4),
				http("request_13")
					.get(uri02 + "/wp-content/plugins/pixelyoursite/dist/scripts/jquery.bind-first-0.2.3.min.js?ver=6.2.2")
					.headers(headers_4),
				http("request_14")
					.get(uri02 + "/wp-content/plugins/pixelyoursite/dist/scripts/js.cookie-2.1.3.min.js?ver=2.1.3")
					.headers(headers_4),
				http("request_15")
					.get(uri02 + "/wp-content/plugins/essential-addons-for-elementor-lite/assets/front-end/css/view/general.min.css?ver=5.7.2")
					.headers(headers_4),
				http("request_16")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/font-awesome/js/v4-shims.min.js?ver=3.13.2")
					.headers(headers_4),
				http("request_17")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/plugins/jetpack/jetpack_vendor/automattic/jetpack-videopress/build/block-editor/blocks/video/view.css?ver=1688557661")
					.headers(headers_4),
				http("request_18")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/mediaelement/mediaelementplayer-legacy.min.css?ver=1688557661")
					.headers(headers_4),
				http("request_19")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/mediaelement/wp-mediaelement.min.css?ver=1688557661")
					.headers(headers_4),
				http("request_20")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/css/classic-themes.min.css?ver=1688557661")
					.headers(headers_4),
				http("request_21")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/plugins/elementor/assets/lib/eicons/css/elementor-icons.min.css?ver=1688557661")
					.headers(headers_4),
				http("request_22")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/uploads/elementor/css/post-35.css?ver=1688557661")
					.headers(headers_4),
				http("request_23")
					.get(uri02 + "/wp-content/plugins/elementor/assets/css/frontend.min.css?ver=3.13.2")
					.headers(headers_4),
				http("request_24")
					.get(uri02 + "/wp-content/plugins/jetpack/css/jetpack.css?ver=12.4-a.4")
					.headers(headers_4),
				http("request_25")
					.get(uri02 + "/wp-content/plugins/pixelyoursite/dist/scripts/public.js?ver=9.4.0.1")
					.headers(headers_4),
				http("request_26")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/css/dist/block-library/style.min.css?ver=1688557661")
					.headers(headers_4),
				http("request_27")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/plugins/elementor/assets/lib/font-awesome/css/all.min.css?ver=1688557661")
					.headers(headers_4),
				http("request_28")
					.get(uri02 + "/wp-content/plugins/elementor-pro/assets/css/frontend.min.css?ver=3.14.1")
					.headers(headers_4),
				http("request_29")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/uploads/elementor/css/post-14591.css?ver=1688558052")
					.headers(headers_4),
				http("request_30")
					.get(uri05 + "?family=Montserrat%3A100%2C100italic%2C200%2C200italic%2C300%2C300italic%2C400%2C400italic%2C500%2C500italic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic%2C900%2C900italic%7CRoboto+Slab%3A100%2C100italic%2C200%2C200italic%2C300%2C300italic%2C400%2C400italic%2C500%2C500italic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic%2C900%2C900italic%7CRoboto%3A100%2C100italic%2C200%2C200italic%2C300%2C300italic%2C400%2C400italic%2C500%2C500italic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic%2C900%2C900italic&display=auto&ver=6.2.2")
					.headers(headers_4),
				http("request_31")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/plugins/jetpack/css/jetpack.css?ver=1688557661")
					.headers(headers_4),
				http("request_32")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/jquery/jquery-migrate.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_33")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/plugins/pixelyoursite/dist/scripts/public.js?ver=1688557661")
					.headers(headers_4),
				http("request_34")
					.get(uri02 + "/wp-content/cache/min/1/wp-content/plugins/jetpack/modules/likes/style.css?ver=1688557661")
					.headers(headers_4),
				http("request_35")
					.get(uri02 + "/wp-content/themes/generatepress/assets/js/menu.min.js?ver=3.1.1")
					.headers(headers_4),
				http("request_36")
					.get(uri02 + "/wp-content/plugins/essential-addons-for-elementor-lite/assets/front-end/js/view/general.min.js?ver=5.7.2")
					.headers(headers_4),
				http("request_37")
					.get(uri02 + "/wp-content/plugins/elementor-pro/assets/js/webpack-pro.runtime.min.js?ver=3.14.1")
					.headers(headers_4),
				http("request_38")
					.get(uri02 + "/wp-content/plugins/elementor/assets/js/webpack.runtime.min.js?ver=3.13.2")
					.headers(headers_4),
				http("request_39")
					.get(uri02 + "/wp-content/plugins/elementor/assets/js/frontend-modules.min.js?ver=3.13.2")
					.headers(headers_4),
				http("request_40")
					.get(uri02 + "/wp-content/plugins/jetpack/_inc/build/carousel/jetpack-carousel.min.js?ver=12.4-a.4")
					.headers(headers_4),
				http("request_41")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/dist/vendor/wp-polyfill-inert.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_42")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/dist/vendor/regenerator-runtime.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_43")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/dist/vendor/wp-polyfill.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_44")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/dist/hooks.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_45")
					.get(uri02 + "/wp-content/plugins/elementor-pro/assets/js/frontend.min.js?ver=3.14.1")
					.headers(headers_4),
				http("request_46")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/waypoints/waypoints.min.js?ver=4.0.2")
					.headers(headers_4),
				http("request_47")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/jquery/ui/core.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_48")
					.get(uri16 + "?m=202329")
					.headers(headers_4),
				http("request_49")
					.get(uri13 + "/gtag/js?id=G-TFTMBRD0LB")
					.headers(headers_4),
				http("request_50")
					.get(uri13 + "/gtm.js?id=GTM-KF3MHS3")
					.headers(headers_4),
				http("request_51")
					.get(uri11 + "/60e3e88b649e0a0a5ccab855/1f9t48og7")
					.headers(headers_51),
				http("request_52")
					.get(uri13 + "/gtag/js?id=AW-10877119487")
					.headers(headers_4),
				http("request_53")
					.get(uri13 + "/gtag/js?id=UA-258461876-1")
					.headers(headers_4),
				http("request_54")
					.get(uri13 + "/gtag/js?id=G-TFTMBRD0LB&l=dataLayer&cx=c")
					.headers(headers_4),
				http("request_55")
					.get(uri01 + "?v=2.9.119&r=stable")
					.headers(headers_4),
				http("request_56")
					.get(uri13 + "/gtag/js?id=G-3D13VW906Y&l=dataLayer&cx=c")
					.headers(headers_4),
				http("request_57")
					.get(uri02 + "/")
					.headers(headers_57),
				http("request_58")
					.get(uri02 + "/wp-content/plugins/elementor/assets/js/frontend.min.js?ver=3.13.2")
					.headers(headers_4),
				http("request_59")
					.get(uri02 + "/wp-content/plugins/elementor-pro/assets/js/elements-handlers.min.js?ver=3.14.1")
					.headers(headers_4),
				http("request_60")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/underscore.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_61")
					.get(uri02 + "/wp-content/cache/min/1/c/6.2.2/wp-includes/js/wp-util.min.js?ver=1688557661")
					.headers(headers_4),
				http("request_62")
					.get(uri02 + "/wp-content/plugins/wpforms-lite/assets/js/integrations/elementor/frontend.min.js?ver=1.8.2.3")
					.headers(headers_4),
				http("request_63")
					.get(uri03 + "/?id=534060991554483&ev=PageView&dl=https%3A%2F%2Ffinsights.biz%2F&rl=&if=false&ts=1690639354366&sw=1077&sh=268&v=2.9.119&r=stable&ec=0&o=30&fbp=fb.1.1689757174888.7502426613&cs_est=true&it=1690639354245&coo=false&exp=a0&rqm=GET")
					.headers(headers_63),
				http("request_64")
					.post(uri10 + "/g/collect?v=2&tid=G-TFTMBRD0LB&gtm=45je37q0&_p=1603028586&cid=1135477678.1687859169&ul=en-gb&sr=1077x268&uaa=&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&_s=1&sid=1690639343&sct=23&seg=1&dl=https%3A%2F%2Ffinsights.biz%2F&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&en=page_view")
					.headers(headers_64),
				http("request_65")
					.get(uri07 + "/?random=1690639354274&cv=11&fst=1690639354274&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&hn=www.googleadservices.com&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&auid=56915900.1687859169&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&data=event%3Dgtag.config&rfmt=3&fmt=4")
					.headers(headers_65),
				http("request_66")
					.get(uri13 + "/gtag/js?id=UA-202717449-1&l=dataLayer&cx=c")
					.headers(headers_66),
				http("request_67")
					.get(uri10 + "/collect?v=1&_v=j101&a=1603028586&t=pageview&_s=1&dl=https%3A%2F%2Ffinsights.biz%2F&ul=en-gb&de=UTF-8&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&sd=24-bit&sr=1077x268&vp=1077x268&je=0&_u=QACAAUABAAAAAAAAI~&jid=&gjid=&cid=1135477678.1687859169&tid=UA-258461876-1&_gid=1454867651.1690628370&gtm=457e37q0&jsscut=1&z=2037647324")
					.headers(headers_63),
				http("request_68")
					.get(uri04 + "/g.gif?v=ext&blog=191175160&post=14591&tz=5.5&srv=finsights.biz&hp=atomic&ac=2&amp=0&j=1%3A12.4-a.4&host=finsights.biz&ref=&fcp=437&rand=0.13883803878614276")
					.headers(headers_63),
				http("request_69")
					.get(uri02 + "/wp-content/uploads/2022/04/Free-Tally-Mobile-App-1-1.svg")
					.headers(headers_4),
				http("request_70")
					.get(uri02 + "/wp-content/uploads/2022/04/Tally-from-anywhere-1.svg")
					.headers(headers_4),
				http("request_71")
					.get(uri02 + "/wp-content/uploads/2022/04/gst-invoice-1.svg")
					.headers(headers_4),
				http("request_72")
					.get(uri02 + "/wp-content/uploads/2022/04/Web-app-with-audit-platform.svg")
					.headers(headers_4),
				http("request_73")
					.get(uri12 + "/79a7uxjato")
					.headers(headers_66),
				http("request_74")
					.get(uri12 + "/ba0sc2wxoo?ref=gtm2")
					.headers(headers_66),
				http("request_75")
					.get(uri13 + "/gtag/js?id=G-X1EXN8H0MS&l=dataLayer&cx=c")
					.headers(headers_4),
				http("request_76")
					.get(uri14 + "/?random=1690639354274&cv=11&fst=1690639200000&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&data=event%3Dgtag.config&fmt=3&is_vtc=1&random=3643754413&rmt_tld=0&ipr=y")
					.headers(headers_76),
				http("request_77")
					.get(uri15 + "/?random=1690639354274&cv=11&fst=1690639200000&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&data=event%3Dgtag.config&fmt=3&is_vtc=1&random=3643754413&rmt_tld=1&ipr=y")
					.headers(headers_76),
				http("request_78")
					.get(uri13 + "/gtag/js?id=G-270361143&l=dataLayer&cx=c")
					.headers(headers_4),
				http("request_79")
					.get(uri10 + "/collect?v=1&_v=j101&aip=1&a=1603028586&t=pageview&_s=1&dl=https%3A%2F%2Ffinsights.biz%2F&ul=en-gb&de=UTF-8&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&sd=24-bit&sr=1077x268&vp=1077x268&je=0&_u=SACAAUABAAAAAAAAI~&jid=&gjid=&cid=1135477678.1687859169&tid=UA-202717449-1&_gid=1454867651.1690628370&gtm=457e37q0&jsscut=1&z=313702769")
					.headers(headers_63),
				http("request_80")
					.post(uri10 + "/g/collect?v=2&tid=G-TFTMBRD0LB&gtm=45je37q0&_p=1603028586&cid=1135477678.1687859169&ul=en-gb&sr=1077x268&uaa=&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&_eu=AAAC&sid=1690639343&sct=23&seg=1&dl=https%3A%2F%2Ffinsights.biz%2F&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&_s=2")
					.headers(headers_80)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0080_request.txt")),
				http("request_81")
					.get(uri10 + "/collect?v=1&_v=j101&a=1603028586&t=event&_s=2&dl=https%3A%2F%2Ffinsights.biz%2F&ul=en-gb&de=UTF-8&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&sd=24-bit&sr=1077x268&vp=1077x268&je=0&ec=general&ea=Clarity&_u=SACAAUABAAAAAAAAI~&jid=&gjid=&cid=1135477678.1687859169&tid=UA-258461876-1&_gid=1454867651.1690628370&gtm=457e37q0&jsscut=1&z=1982147423")
					.headers(headers_63),
				http("request_82")
					.get(uri07 + "/?random=1690639354865&cv=11&fst=1690639354865&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&hn=www.googleadservices.com&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&auid=56915900.1687859169&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&data=event%3DClarity%3BeventCategory%3DClarity%3BeventAction%3Dpdnuct%3BnonInteraction%3Dtrue%3Bfinsights%3Dhttps%3A%2F%2Fclarity.microsoft.com%2Fga%2F79a7uxjato%2F1xacjpc%2Fpdnuct&rfmt=3&fmt=4")
					.headers(headers_65),
				http("request_83")
					.get(uri07 + "/?random=1690639354894&cv=11&fst=1690639354894&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&hn=www.googleadservices.com&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&auid=56915900.1687859169&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&data=event%3DClarity%3BeventCategory%3DClarity%3BeventAction%3Dpdnuct%3BnonInteraction%3Dtrue%3Bclaritydimension%3Dhttps%3A%2F%2Fclarity.microsoft.com%2Fga%2F79a7uxjato%2F1xacjpc%2Fpdnuct&rfmt=3&fmt=4")
					.headers(headers_65),
				http("request_84")
					.post("/collect")
					.headers(headers_0)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0084_request.bin")),
				http("request_85")
					.post(uri03 + "/")
					.headers(headers_85)
					.formParam("id", "534060991554483")
					.formParam("ev", "Microdata")
					.formParam("dl", "https://finsights.biz/")
					.formParam("rl", "")
					.formParam("if", "false")
					.formParam("ts", "1690639354918")
					.formParam("cd[DataLayer]", "[]")
					.formParam("cd[Meta]", """{"title":"Finsights - Tally on Mobile App & GST Reconciliation Software","meta:description":"Finsights is one of the best Tally on Mobile and GST Reconciliation Software. Now automate reconciliation 5X faster for your GSTR 2A & GSTR 2B."}""")
					.formParam("cd[OpenGraph]", """{"og:locale":"en_US","og:type":"website","og:title":"Finsights - Tally on Mobile App & GST Reconciliation Software","og:description":"Finsights is one of the best Tally on Mobile and GST Reconciliation Software. Now automate reconciliation 5X faster for your GSTR 2A & GSTR 2B.","og:url":"https://finsights.biz/","og:site_name":"TALLY ON THE GO","og:updated_time":"2023-03-20T17:38:57+05:30","og:image":"https://finsights.biz/wp-content/uploads/2021/09/screenshot-android.png2_-1024x768.png","og:image:secure_url":"https://finsights.biz/wp-content/uploads/2021/09/screenshot-android.png2_-1024x768.png","og:image:width":"1024","og:image:height":"768","og:image:alt":"Finsights webapp and mobile app for Tally","og:image:type":"image/png","article:published_time":"2022-04-08T00:06:36+05:30","article:modified_time":"2023-03-20T17:38:57+05:30"}""")
					.formParam("cd[Schema.org]", """[{"dimensions":{"h":0,"w":0},"properties":{},"subscopes":[],"type":"https://schema.org/ImageGallery"}]""")
					.formParam("cd[JSON-LD]", """[{"@context":"https://schema.org","@graph":[{"@type":"Place","@id":"https://finsights.biz/#place","address":{"@type":"PostalAddress","streetAddress":"308, Rupa Solitaire","addressLocality":"Millennium Business Park","addressRegion":"Navi Mumbai","postalCode":"400701","addressCountry":"India"}},{"@type":["FinancialService","Organization"],"@id":"https://finsights.biz/#organization","name":"Finsights","url":"https://finsights.biz","sameAs":["https://www.facebook.com/finsightsapp","https://twitter.com/twitter:FinsightsApp"],"email":"enquiries@finsights.biz","address":{"@type":"PostalAddress","streetAddress":"308, Rupa Solitaire","addressLocality":"Millennium Business Park","addressRegion":"Navi Mumbai","postalCode":"400701","addressCountry":"India"},"logo":{"@type":"ImageObject","@id":"https://finsights.biz/#logo","url":"https://finsights.biz/wp-content/uploads/2021/04/FINSIGHTS_LOGO_200X60.png","contentUrl":"https://finsights.biz/wp-content/uploads/2021/04/FINSIGHTS_LOGO_200X60.png","caption":"Finsights","inLanguage":"en-US","width":"200","height":"26"},"openingHours":["Monday,Tuesday,Wednesday,Thursday,Friday 09:00-17:00"],"location":{"@id":"https://finsights.biz/#place"},"image":{"@id":"https://finsights.biz/#logo"},"telephone":"+91 9391776920"},{"@type":"WebSite","@id":"https://finsights.biz/#website","url":"https://finsights.biz","name":"Finsights","publisher":{"@id":"https://finsights.biz/#organization"},"inLanguage":"en-US","potentialAction":{"@type":"SearchAction","target":"https://finsights.biz/?s={search_term_string}","query-input":"required name=search_term_string"}},{"@type":"ImageObject","@id":"https://finsights.biz/wp-content/uploads/2022/04/Tally-on-The-Go.png","url":"https://finsights.biz/wp-content/uploads/2022/04/Tally-on-The-Go.png","width":"200","height":"200","inLanguage":"en-US"},{"@type":"WebPage","@id":"https://finsights.biz/#webpage","url":"https://finsights.biz/","name":"Finsights - Tally on Mobile App &amp; GST Reconciliation Software","datePublished":"2022-04-08T00:06:36+05:30","dateModified":"2023-03-20T17:38:57+05:30","about":{"@id":"https://finsights.biz/#organization"},"isPartOf":{"@id":"https://finsights.biz/#website"},"primaryImageOfPage":{"@id":"https://finsights.biz/wp-content/uploads/2022/04/Tally-on-The-Go.png"},"inLanguage":"en-US"},{"@type":"Person","@id":"https://finsights.biz/author/lotusinsights/","name":"Finsights","url":"https://finsights.biz/author/lotusinsights/","image":{"@type":"ImageObject","@id":"https://secure.gravatar.com/avatar/8b0b37a7047fb77499a1782088831f2e?s=96&amp;d=identicon&amp;r=g","url":"https://secure.gravatar.com/avatar/8b0b37a7047fb77499a1782088831f2e?s=96&amp;d=identicon&amp;r=g","caption":"Finsights","inLanguage":"en-US"},"sameAs":["http://tallyinsidercom.wordpress.com"],"worksFor":{"@id":"https://finsights.biz/#organization"}},{"headline":"Finsights - Tally on Mobile &amp; GST Reconciliation Software","description":"Finsights is one of the best Tally on Mobile and GST Reconciliation Software. Now automate reconciliation 5X faster for your GSTR 2A &amp; GSTR 2B.","keywords":"finsights","@type":"Article","author":{"@id":"https://finsights.biz/author/lotusinsights/","name":"Finsights"},"datePublished":"2022-04-08T00:06:36+05:30","dateModified":"2023-03-20T17:38:57+05:30","copyrightYear":"2023","name":"Finsights - Tally on Mobile &amp; GST Reconciliation Software","@id":"https://finsights.biz/#schema-162427","isPartOf":{"@id":"https://finsights.biz/#webpage"},"publisher":{"@id":"https://finsights.biz/#organization"},"image":{"@id":"https://finsights.biz/wp-content/uploads/2022/04/Tally-on-The-Go.png"},"inLanguage":"en-US","mainEntityOfPage":{"@id":"https://finsights.biz/#webpage"}},{"@type":"Organization","name":"Finsights","url":"https://finsights.biz/","logo":"https://finsights.biz/wp-content/uploads/2021/04/FINSIGHTS_LOGO_200X60.png","description":"Finsights is one of the best Tally on Mobile and GST Reconciliation Software. Now automate reconciliation 5X faster for your GSTR 2A &amp; GSTR 2B","address":{"@type":"PostalAddress","streetAddress":"308, Rupa Solitaire, Millennium Business Park","addressLocality":"Navi Mumbai","addressRegion":"Maharashtra","postalCode":"400701","addressCountry":"India"},"contactPoint":{"@type":"ContactPoint","telephone":"+91-6303800858","contactType":"Support"}},{"@type":"Corporation","name":"Finsights","alternateName":"Tally on Mobile App","url":"https://finsights.biz/","logo":"https://finsights.biz/wp-content/uploads/2021/04/FINSIGHTS_LOGO_200X60.png","contactPoint":{"@type":"ContactPoint","telephone":"+91-6303800858","contactType":"customer service","areaServed":["India"]},"sameAs":["https://www.facebook.com/finsightstallyapp","https://www.linkedin.com/company/finsightsapp/","https://www.instagram.com/finsights.biz/","https://twitter.com/FinsightsApp"]},{"@type":"WebSite","name":"Finsights","alternateName":"Tally on Mobile App","url":"https://finsights.biz/"}]}]""")
					.formParam("sw", "1077")
					.formParam("sh", "268")
					.formParam("v", "2.9.119")
					.formParam("r", "stable")
					.formParam("ec", "1")
					.formParam("o", "30")
					.formParam("fbp", "fb.1.1689757174888.7502426613")
					.formParam("it", "1690639354245")
					.formParam("coo", "false")
					.formParam("es", "automatic")
					.formParam("tm", "3")
					.formParam("exp", "a0")
					.formParam("rqm", "formPOST"),
				http("request_86")
					.get(uri10 + "/collect?v=1&_v=j101&aip=1&a=1603028586&t=event&_s=2&dl=https%3A%2F%2Ffinsights.biz%2F&ul=en-gb&de=UTF-8&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&sd=24-bit&sr=1077x268&vp=1077x268&je=0&ec=general&ea=Clarity&_u=SACAAUABAAAAAAAAI~&jid=&gjid=&cid=1135477678.1687859169&tid=UA-202717449-1&_gid=1454867651.1690628370&gtm=457e37q0&jsscut=1&z=694216923")
					.headers(headers_63),
				http("request_87")
					.get(uri10 + "/collect?v=1&_v=j101&a=1603028586&t=event&_s=3&dl=https%3A%2F%2Ffinsights.biz%2F&ul=en-gb&de=UTF-8&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&sd=24-bit&sr=1077x268&vp=1077x268&je=0&ec=general&ea=Clarity&_u=SACAAUABAAAAAAAAI~&jid=&gjid=&cid=1135477678.1687859169&tid=UA-258461876-1&_gid=1454867651.1690628370&gtm=457e37q0&jsscut=1&z=1926627230")
					.headers(headers_63),
				http("request_88")
					.get(uri10 + "/collect?v=1&_v=j101&aip=1&a=1603028586&t=event&_s=3&dl=https%3A%2F%2Ffinsights.biz%2F&ul=en-gb&de=UTF-8&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&sd=24-bit&sr=1077x268&vp=1077x268&je=0&ec=general&ea=Clarity&_u=SACAAUABAAAAAAAAI~&jid=&gjid=&cid=1135477678.1687859169&tid=UA-202717449-1&_gid=1454867651.1690628370&gtm=457e37q0&jsscut=1&z=128574992")
					.headers(headers_63),
				http("request_89")
					.get(uri02 + "/?local_ga_js=64c3a1a7f28f7bd09c444d01644c5f48")
					.headers(headers_89),
				http("request_90")
					.get(uri14 + "/?random=1690639354865&cv=11&fst=1690639200000&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&data=event%3DClarity%3BeventCategory%3DClarity%3BeventAction%3Dpdnuct%3BnonInteraction%3Dtrue%3Bfinsights%3Dhttps%3A%2F%2Fclarity.microsoft.com%2Fga%2F79a7uxjato%2F1xacjpc%2Fpdnuct&fmt=3&is_vtc=1&random=3255620584&rmt_tld=0&ipr=y")
					.headers(headers_76),
				http("request_91")
					.get(uri15 + "/?random=1690639354865&cv=11&fst=1690639200000&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&data=event%3DClarity%3BeventCategory%3DClarity%3BeventAction%3Dpdnuct%3BnonInteraction%3Dtrue%3Bfinsights%3Dhttps%3A%2F%2Fclarity.microsoft.com%2Fga%2F79a7uxjato%2F1xacjpc%2Fpdnuct&fmt=3&is_vtc=1&random=3255620584&rmt_tld=1&ipr=y")
					.headers(headers_76),
				http("request_92")
					.post("/collect")
					.headers(headers_0)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0092_request.bin")),
				http("request_93")
					.get(uri14 + "/?random=1690639354894&cv=11&fst=1690639200000&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&data=event%3DClarity%3BeventCategory%3DClarity%3BeventAction%3Dpdnuct%3BnonInteraction%3Dtrue%3Bclaritydimension%3Dhttps%3A%2F%2Fclarity.microsoft.com%2Fga%2F79a7uxjato%2F1xacjpc%2Fpdnuct&fmt=3&is_vtc=1&random=313541844&rmt_tld=0&ipr=y")
					.headers(headers_76),
				http("request_94")
					.get(uri15 + "/?random=1690639354894&cv=11&fst=1690639200000&bg=ffffff&guid=ON&async=1&gtm=45be37q0&u_w=1077&u_h=268&url=https%3A%2F%2Ffinsights.biz%2F&frm=0&tiba=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&data=event%3DClarity%3BeventCategory%3DClarity%3BeventAction%3Dpdnuct%3BnonInteraction%3Dtrue%3Bclaritydimension%3Dhttps%3A%2F%2Fclarity.microsoft.com%2Fga%2F79a7uxjato%2F1xacjpc%2Fpdnuct&fmt=3&is_vtc=1&random=313541844&rmt_tld=1&ipr=y")
					.headers(headers_76),
				http("request_95")
					.get(uri08 + "/pv?pid=113528&u=https%3A%2F%2Ffinsights.biz%2F&tpl=.&pt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&t=986604")
					.headers(headers_95),
				http("request_96")
					.get(uri17 + "/v1/widget-settings?propertyId=60e3e88b649e0a0a5ccab855&widgetId=1f9t48og7&sv=undefined")
					.headers(headers_4),
				http("request_97")
					.get(uri02 + "/wp-content/uploads/2021/03/Favicon-150x150.png?crop=1")
					.headers(headers_4),
				http("request_98")
					.get(uri08 + "/clk?pid=113528&u=https%3A%2F%2Ffinsights.biz%2F&dt=0&dr=0&do=0&du=0&mx=-124&my=-127&mn=1&mt=0&t=276109")
					.headers(headers_95),
				http("request_99")
					.options(uri17 + "/v1/session/start")
					.headers(headers_1),
				http("request_100")
					.post("/collect")
					.headers(headers_0)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0100_request.bin")),
				http("request_101")
					.post(uri17 + "/v1/session/start")
					.headers(headers_101)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0101_request.json"))))
		.pause(1)
		.exec(http("request_102")
			.post(uri10 + "/g/collect?v=2&tid=G-3D13VW906Y&gtm=45je37q0&_p=1603028586&cid=1135477678.1687859169&ul=en-gb&sr=1077x268&ir=1&uaa=&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&_eu=EAAI&sid=1690639346&sct=23&seg=1&dl=https%3A%2F%2Ffinsights.biz%2F&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&_s=1")
			.headers(headers_80)
			.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0102_request.txt"))
			.resources(http("request_103")
				.post(uri10 + "/g/collect?v=2&tid=G-TFTMBRD0LB&gtm=45je37q0&_p=1603028586&cid=1135477678.1687859169&ul=en-gb&sr=1077x268&uaa=&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&sid=1690639343&sct=23&seg=1&dl=https%3A%2F%2Ffinsights.biz%2F&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&_s=3")
				.headers(headers_80)
				.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0103_request.txt")),
				http("request_104")
					.post(uri06 + "?v=2&tid=G-X1EXN8H0MS&gtm=45je37q0&_p=1603028586&cid=1135477678.1687859169&ul=en-gb&sr=1077x268&uaa=&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&_eu=AAAI&sid=1690639343&sct=23&seg=1&dl=https%3A%2F%2Ffinsights.biz%2F&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&_s=1")
					.headers(headers_104)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0104_request.txt")),
				http("request_105")
					.post(uri10 + "/g/collect?v=2&tid=G-270361143&gtm=45je37q0&_p=1603028586&cid=1135477678.1687859169&ul=en-gb&sr=1077x268&uaa=&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&sid=1690639343&sct=24&seg=0&dl=https%3A%2F%2Ffinsights.biz%2F&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&_s=1")
					.headers(headers_80)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0105_request.txt"))))
		.pause(1)
		.exec(http("request_106")
			.get(uri11 + "/_s/v4/assets/audio/chat_sound.mp3")
			.headers(headers_4)
			.resources(http("request_107")
				.get(uri02 + "/wp-content/plugins/jetpack/modules/likes/style.css?ver=12.4-beta")
				.headers(headers_4),
				http("request_108")
					.get(uri02 + "/wp-content/themes/generatepress/assets/css/main.min.css?ver=3.1.1")
					.headers(headers_4),
				http("request_109")
					.get(uri02 + "/wp-content/plugins/essential-addons-for-elementor-lite/assets/front-end/css/view/general.min.css?ver=5.8.3")
					.headers(headers_4),
				http("request_110")
					.get(uri02 + "/wp-content/plugins/elementor/assets/css/frontend.min.css?ver=3.13.2")
					.headers(headers_4),
				http("request_111")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/swiper/css/swiper.min.css?ver=5.3.6")
					.headers(headers_4),
				http("request_112")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/font-awesome/css/v4-shims.min.css?ver=3.13.2")
					.headers(headers_4),
				http("request_113")
					.get(uri02 + "/wp-content/uploads/elementor/css/post-13387.css?ver=1683917082")
					.headers(headers_4),
				http("request_114")
					.get(uri02 + "/wp-content/uploads/elementor/css/post-1114.css?ver=1683917082")
					.headers(headers_4),
				http("request_115")
					.get(uri02 + "/wp-content/uploads/elementor/css/post-320.css?ver=1688557605")
					.headers(headers_4),
				http("request_116")
					.get(uri02 + "/wp-content/plugins/elementor-pro/assets/css/frontend.min.css?ver=3.14.1")
					.headers(headers_4),
				http("request_117")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/font-awesome/css/fontawesome.min.css?ver=5.15.3")
					.headers(headers_4),
				http("request_118")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/font-awesome/css/solid.min.css?ver=5.15.3")
					.headers(headers_4),
				http("request_119")
					.get(uri02 + "/wp-content/plugins/elementor/assets/lib/font-awesome/css/brands.min.css?ver=5.15.3")
					.headers(headers_4),
				http("request_120")
					.get(uri02 + "/tally-on-mobile/")
					.headers(headers_120),
				http("request_121")
					.get(uri02 + "/wp-content/plugins/jetpack/css/jetpack.css?ver=12.4-beta")
					.headers(headers_4),
				http("request_122")
					.options(uri17 + "/log-performance/v3")
					.headers(headers_122),
				http("request_123")
					.get(uri08 + "/clk?pid=113528&u=https%3A%2F%2Ffinsights.biz%2F&dpath=d%7Cdddddda&durl=http%3A%2F%2Ffinsights.biz%2Ftally-on-mobile%2F&dt=a&dr=-454458050&do=0&du=1725939730&mx=100086&my=33&mn=2&mt=1&t=407065")
					.headers(headers_95),
				http("request_124")
					.get(uri03 + "/?id=534060991554483&ev=SubscribedButtonClick&dl=https%3A%2F%2Ffinsights.biz%2F&rl=&if=false&ts=1690639361027&cd[buttonFeatures]=%7B%22classList%22%3A%22elementor-button-link%20elementor-button%20elementor-size-sm%22%2C%22destination%22%3A%22https%3A%2F%2Ffinsights.biz%2Ftally-on-mobile%2F%22%2C%22id%22%3A%22%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22Explore%22%2C%22numChildButtons%22%3A2%2C%22tag%22%3A%22a%22%2C%22type%22%3Anull%2C%22name%22%3A%22%22%7D&cd[buttonText]=Explore&cd[formFeatures]=%5B%5D&cd[pageFeatures]=%7B%22title%22%3A%22Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software%22%7D&sw=1077&sh=268&v=2.9.119&r=stable&ec=2&o=30&fbp=fb.1.1689757174888.7502426613&cs_est=true&it=1690639354245&coo=false&es=automatic&tm=3&exp=a0&rqm=GET")
					.headers(headers_63),
				http("request_125")
					.get(uri02 + "/wp-content/uploads/essential-addons-elementor/eael-320.css?ver=1688577850")
					.headers(headers_125),
				http("request_126")
					.post(uri17 + "/log-performance/v3")
					.headers(headers_126)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0126_request.json")),
				http("request_127")
					.get(uri04 + "/boom.gif?bilmur=1&cumulative_layout_shift=0.011&largest_contentful_paint=554&batcache_hit=0&provider=wordpress.com&service=atomic&custom_properties=%7B%22devicepx%22%3A%220%22%7D&effective_connection_type=3g&rtt=500&downlink=1550&host_name=finsights.biz&url_path=%2F&nt_unloadEventStart=190&nt_unloadEventEnd=190&nt_fetchStart=2&nt_domainLookupStart=3&nt_domainLookupEnd=3&nt_connectStart=3&nt_connectEnd=3&nt_secureConnectionStart=3&nt_requestStart=4&nt_responseStart=172&nt_responseEnd=861&nt_domLoading=195&nt_domInteractive=932&nt_domContentLoadedEventStart=933&nt_domContentLoadedEventEnd=934&nt_domComplete=3611&nt_loadEventStart=3612&nt_loadEventEnd=3614&nt_redirectCount=0&nt_nextHopProtocol=h3&nt_api_level=2&start_render=437&first_contentful_paint=437&resource_size=1950687&resource_transferred=0&js_size=457202&js_transferred=0&resource_cache_percent=100&js_cache_percent=100")
					.headers(headers_63),
				http("request_128")
					.post("/collect")
					.headers(headers_0)
					.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0128_request.bin"))))
		.pause(2)
		.exec(http("request_129")
			.post(uri10 + "/g/collect?v=2&tid=G-TFTMBRD0LB&gtm=45je37q0&_p=1603028586&cid=1135477678.1687859169&ul=en-gb&sr=1077x268&uaa=&uab=64&uafvl=Not%252FA)Brand%3B99.0.0.0%7CGoogle%2520Chrome%3B115.0.5790.110%7CChromium%3B115.0.5790.110&uamb=1&uam=Nexus%205&uap=Android&uapv=6.0&uaw=0&_eu=AEA&_s=4&sid=1690639343&sct=23&seg=1&dl=https%3A%2F%2Ffinsights.biz%2F&dt=Finsights%20-%20Tally%20on%20Mobile%20App%20%26%20GST%20Reconciliation%20Software&en=scroll&epn.percent_scrolled=90&_et=4764")
			.headers(headers_64))
		.pause(2)
		.exec(http("request_130")
			.post("/collect")
			.headers(headers_0)
			.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0130_request.bin")))
		.pause(8)
		.exec(http("request_131")
			.post("/collect")
			.headers(headers_0)
			.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0131_request.bin")))
		.pause(6)
		.exec(http("request_132")
			.post("/collect")
			.headers(headers_0)
			.body(RawFileBody("com/gatling/pratice/recordedsimulation1/0132_request.bin")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
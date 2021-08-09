package br.com.cedugenio.clienthttp;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ClientHttp {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request  = HttpRequest.newBuilder()
                .GET()
                //.uri(URI.create("https://xkcd.com/info.0.json"))
                //.uri(URI.create("https://apichallenges.herokuapp.com/todos"))
                .uri(URI.create("https://getpostman.com"))
                .headers("Accept", "application/xml")
                .timeout(Duration.ofSeconds(3))
                .build();
        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(3))
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
        /*HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.statusCode());
        System.out.println(response.headers());
        System.out.println(response.version());
*/
        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println);
        System.out.println("ASYNC");
        TimeUnit.SECONDS.sleep(2);

    }
}

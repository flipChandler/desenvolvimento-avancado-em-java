package br.com.felipesantos.java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

public class HttpClientExemplo {
	
	/*
	 *  HttpClient > HttpUrlConnection
	 *  Suporta HTTP / 1.1 (uma requisição por vez)  e HTTP / 2 (várias requisições de forma concorrente)
	 *  O servidor tmb tem que suportar HTTP / 2 se não, não dá certo
	 */
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//connectAndPrintURLJavaOracle();
		connectAndPrintURLJavaOracleHttpClient();
	}
	
	public static void connectAndPrintURLJavaOracle() throws IOException {
		var url = new URL("https://docs.oracle.com/en/java/javase/11/docs/api/index.html");
		var urlConnection = url.openConnection(); // abre uma conexão da url

		try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
			System.out.println(bufferedReader.lines()
					.collect(Collectors.joining()).replaceAll(">", ">\n")); // para quebrar a linha
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void connectAndPrintURLJavaOracleHttpClient() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder() // o que está sendo requisitado ao servidor
				.GET().uri(URI.create("https://docs.oracle.com/en/java/javase/11/docs/api/index.html"))
				.build();
		
		HttpClient httpClient = HttpClient.newHttpClient(); // criar um HttpClient
		
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Headers response: " + response.headers());
		System.out.println(response.body());
		
	}
}

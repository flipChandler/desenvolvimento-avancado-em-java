package br.com.felipesantos.java11;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class MaisExemploHttpClient {
	
	/*
	 * criar no máximo 6 threads
	 */
	static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
		@Override
		public Thread newThread(Runnable runnable) {
			Thread thread = new Thread(runnable);
			String msg = "Nova thread criada :: " + (thread.isDaemon() ? "daemon" : "") + " Thread Group :: " + thread.getThreadGroup();
			System.out.println(msg);
			return thread;
		}		
	});
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//connectAndPrintURLJavaOracleHttpClient();
		connectAkamaiHttp1Client();

	}
	
	
	private static void connectAkamaiHttp1Client() {
		System.out.println("Running HTTP/1.1 example ...");
		
		try {
			HttpClient httpClient = HttpClient.newBuilder()
					.version(HttpClient.Version.HTTP_1_1)
					.proxy(ProxySelector.getDefault())
					.build();
			
			long start = System.currentTimeMillis();
			
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
					.build();
			
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("Status code: " + response.statusCode());
			System.out.println("Response Header: " + response.headers());
			String responseBody = response.body();
			System.out.println(responseBody);
			
			List<Future<?>> listFuture = new ArrayList<>();
			
			responseBody.lines()
				.filter(line -> line.trim().startsWith("<img height"))
				.map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
				.forEach(image -> {
					Future<?> imgFuture = executor.submit(() -> {
						HttpRequest imgRequest = HttpRequest.newBuilder()
								.uri(URI.create("https://http2.akamai.com" + image))
								.build();
						
						try {
							HttpResponse<String> imgResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
							System.out.println("Imagem carregada :: " + image + ", status code: " + imgResponse.statusCode());
						} catch (IOException | InterruptedException e) {
							e.printStackTrace();
						}
					});
					listFuture.add(imgFuture);
					System.out.println("Submetido um futuro para imagem :: " + image);					
				});
			
			listFuture.forEach(f -> {
				try {
					f.get();
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			});
			
			long end = System.currentTimeMillis();
			System.out.println("Tempo de carregamento total :: " + (end - start) + " ms");
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void connectAndPrintURLJavaOracleHttpClient() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder() 
				.GET().uri(URI.create("https://docs.oracle.com/en/java/javase/11/docs/api/index.html"))
				.build();
		
		HttpClient httpClient = HttpClient.newHttpClient(); 
		
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Headers response: " + response.headers());
		System.out.println(response.body());
		
	}

}

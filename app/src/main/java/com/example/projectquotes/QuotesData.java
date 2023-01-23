package com.example.projectquotes;

import android.os.AsyncTask;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.channels.AsynchronousChannelGroup;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class QuotesData{
    public static List<QuotesList> getAgeQuotes() throws InterruptedException {
        final List<QuotesList> ageQuotesList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.api-ninjas.com/v1/quotes?category=age&limit=5")
                .addHeader("x-api-key", "cuOd9JyGupR9dXXJvFwwkg==qrZW3eC1iP17JsYU")
                .get()
                .build();
        Thread thread = new Thread(() -> {
            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }
                String jsonData = response.body().string();
                JsonArray jsonArray = JsonParser.parseString(jsonData).getAsJsonArray();
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    String quote = jsonObject.get("quote").getAsString();
                    String author = jsonObject.get("author").getAsString();
                    QuotesList ageQuote = new QuotesList(quote, author);
                    ageQuotesList.add(ageQuote);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();
        return ageQuotesList;
    }
    public static List<QuotesList> getAloneQuotes() throws InterruptedException {
        final List<QuotesList> ageQuotesList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.api-ninjas.com/v1/quotes?category=alone&limit=5")
                .addHeader("x-api-key", "cuOd9JyGupR9dXXJvFwwkg==qrZW3eC1iP17JsYU")
                .get()
                .build();
        Thread thread = new Thread(() -> {
            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }
                String jsonData = response.body().string();
                JsonArray jsonArray = JsonParser.parseString(jsonData).getAsJsonArray();
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    String quote = jsonObject.get("quote").getAsString();
                    String author = jsonObject.get("author").getAsString();
                    QuotesList ageQuote = new QuotesList(quote, author);
                    ageQuotesList.add(ageQuote);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();
        return ageQuotesList;
    }
}

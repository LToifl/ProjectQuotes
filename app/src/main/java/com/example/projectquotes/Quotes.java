package com.example.projectquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {

    private TextView quoteText, writerName;
    private final List<QuotesList> quotesListList = new ArrayList<>();

    private int currentQuotePosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView categoryName = findViewById(R.id.categoryName);
        quoteText = findViewById(R.id.quoteText);
        writerName = findViewById(R.id.quoteAuthor);

        final Button prevButton = findViewById(R.id.prevButton);
        final Button nextButton = findViewById(R.id.nextButton);
        final ImageView copyButton = findViewById(R.id.copyButton);

        final String getName = getIntent().getStringExtra("name");

        categoryName.setText(getName);

        if(getName.equals("Age")){
            try {
                quotesListList.addAll(QuotesData.getAgeQuotes());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(getName.equals("Alone")){
            try {
                quotesListList.addAll((QuotesData.getAloneQuotes()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        setQuoteToTextView();

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentQuotePosition--;

                if(currentQuotePosition < 0){
                    currentQuotePosition = quotesListList.size()-1;
                }

                setQuoteToTextView();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentQuotePosition++;

                if(currentQuotePosition >= quotesListList.size()){
                    currentQuotePosition = 0;
                }

                setQuoteToTextView();
            }
        });

        copyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("quote",quotesListList.get(currentQuotePosition).getQuote()+"\nby "+quotesListList.get(currentQuotePosition).getAuthor());
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(Quotes.this, "Copied to clipboard",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void setQuoteToTextView(){
        quoteText.setText(quotesListList.get(currentQuotePosition).getQuote());
        writerName.setText(quotesListList.get(currentQuotePosition).getAuthor());

    }
}
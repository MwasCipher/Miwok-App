package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;


    public WordAdapter(@NonNull Context context, int colorResourceId, @NonNull ArrayList<Word> words) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word currentWord = getItem(position);
        View listViewItem = convertView;
        if (listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        View wordContainer = listViewItem.findViewById(R.id.word_container);
        wordContainer.setBackgroundColor(color);

        TextView defaultWord = listViewItem.findViewById(R.id.english_word_text_view);
        TextView miwokWord = listViewItem.findViewById(R.id.miwok_word_text_view);
        ImageView imageView = listViewItem.findViewById(R.id.word_image);

        defaultWord.setText(currentWord.getEnglishWord());
        miwokWord.setText(currentWord.getMiwokWord());

        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
        }else {
            imageView.setVisibility(View.GONE);
        }


        return listViewItem;
    }
}

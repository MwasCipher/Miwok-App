package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word currentWord = getItem(position);
        View listViewItem = convertView;
        if (listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView defaultWord = listViewItem.findViewById(R.id.english_word_text_view);
        TextView miwokWord = listViewItem.findViewById(R.id.miwok_word_text_view);

        defaultWord.setText(currentWord.getEnglishWord());
        miwokWord.setText(currentWord.getMiwokWord());

        return listViewItem;
    }
}

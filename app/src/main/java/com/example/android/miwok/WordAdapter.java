package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gusbru on 4/12/17.
 *
 */

public class WordAdapter extends ArrayAdapter<Word> {

    // constructor
    public WordAdapter(Activity context, ArrayList<Word> word) {
        super(context, 0, word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Create a word object with the current position
        Word currentWord = getItem(position);

        // Put on the screen the word in english
        TextView english_word = (TextView) listItemView.findViewById(R.id.english_text_numbers);
        english_word.setText(currentWord.getEnglish());

        // Put on the screen the word in miwok
        TextView miwok_word = (TextView) listItemView.findViewById(R.id.miwok_text_numbers);
        miwok_word.setText(currentWord.getMiwok());

        // put on the screen the image related with the word
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.numbers_image_view);
        imageView.setImageResource(currentWord.getImageResourceId());


        return listItemView;
    }
}

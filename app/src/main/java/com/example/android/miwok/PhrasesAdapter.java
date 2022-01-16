package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesAdapter extends ArrayAdapter<Phrase> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public PhrasesAdapter(Activity context, ArrayList<Phrase> phrases) {
        super(context, 0, phrases);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Phrase currentPhrase = getItem(position);

        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokWord.setText(currentPhrase.getmMiwokTranslation());

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_translation);
        defaultTranslation.setText(currentPhrase.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentPhrase.getmImageResourceId());

        return listItemView;
    }
}

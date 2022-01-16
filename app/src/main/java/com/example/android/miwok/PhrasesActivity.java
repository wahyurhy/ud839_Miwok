/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Phrase> phrases = new ArrayList<>();

        phrases.add(new Phrase("Where are you going?", "minto wuksus"));
        phrases.add(new Phrase("What is your name?", "tinnә oyaase'nә"));
        phrases.add(new Phrase("My name is...", "oyaaset..."));
        phrases.add(new Phrase("How are you feeling?", "michәksәs?"));
        phrases.add(new Phrase("I’m feeling good.", "kuchi achit"));
        phrases.add(new Phrase("Are you coming?", "әәnәs'aa?"));
        phrases.add(new Phrase("Yes, I’m coming.", "hәә’ әәnәm"));
        phrases.add(new Phrase("I’m coming.", "әәnәm"));
        phrases.add(new Phrase("Let’s go.", "yoowutis"));
        phrases.add(new Phrase("Come here.", "әnni'nem"));

        PhrasesAdapter adapter = new PhrasesAdapter(this, phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

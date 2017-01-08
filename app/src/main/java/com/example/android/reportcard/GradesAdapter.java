package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 *
 */

public class GradesAdapter extends ArrayAdapter<Grades> {
    private static final String LOG_TAG = GradesAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param grades   A List of AndroidFlavor objects to display in a list
     */
    public GradesAdapter(Activity context, ArrayList<Grades> grades) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, grades);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Grades} object located at this position in the list
        Grades currentGrade = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID topic
        TextView topicTextView = (TextView) listItemView.findViewById(R.id.topic_text_view);
        // Get the topic name from the current Grades object and
        // set this text on the name TextView
        topicTextView.setText(currentGrade.getTopic());


        // Find the TextView in the list_item.xml layout with the ID yourGrade
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);
        double yourGrade = currentGrade.getYourGrade();
        gradeTextView.setText(""+ yourGrade);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView minTextView = (TextView) listItemView.findViewById(R.id.min_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        double gradeMin = currentGrade.getGradeMin();
        minTextView.setText(""+ gradeMin);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView aveTextView = (TextView) listItemView.findViewById(R.id.ave_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        double gradeAve = currentGrade.getGradeAve();
        aveTextView.setText(""+ gradeAve);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView maxTextView = (TextView) listItemView.findViewById(R.id.max_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        double gradeMax = currentGrade.getGradeMax();
        maxTextView.setText(""+ gradeMax);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


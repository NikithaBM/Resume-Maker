package com.mosam.resumemaker.adapters;

import android.support.annotation.NonNull;

import com.mosam.resumemaker.datamodel.School;

import java.util.List;



public class SchoolsAdapter extends ResumeEventAdapter<School> {

    public SchoolsAdapter(@NonNull List<School> list,
                          ResumeEventOnClickListener resumeEventOnClickListener) {
        super(list, resumeEventOnClickListener);
    }
}
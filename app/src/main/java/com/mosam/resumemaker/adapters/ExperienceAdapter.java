package com.mosam.resumemaker.adapters;

import android.support.annotation.NonNull;

import com.mosam.resumemaker.datamodel.Experience;

import java.util.List;



public class ExperienceAdapter extends ResumeEventAdapter<Experience> {

    public ExperienceAdapter(@NonNull List<Experience> list,
                             ResumeEventOnClickListener resumeEventOnClickListener) {
        super(list, resumeEventOnClickListener);
    }
}

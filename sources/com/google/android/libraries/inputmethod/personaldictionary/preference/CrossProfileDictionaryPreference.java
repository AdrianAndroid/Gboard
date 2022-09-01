package com.google.android.libraries.inputmethod.personaldictionary.preference;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CrossProfileDictionaryPreference extends PersonalDictionaryPreference {
    public CrossProfileDictionaryPreference(Context context) {
        super(context, (AttributeSet) null);
    }

    @Override // com.google.android.libraries.inputmethod.personaldictionary.preference.PersonalDictionaryPreference
    protected final void k(ArrayList arrayList) {
        Activity activity = (Activity) this.j;
        int intExtra = activity.getIntent().getIntExtra("entry", 0);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ARG_KEY_LANGUAGE_TAG_LIST", arrayList);
        ins insVar = new ins(intExtra);
        insVar.putExtra(":android:show_fragment_title", this.q);
        insVar.d(ikz.class.getName(), bundle);
        jez.j(activity, insVar.setClassName(activity, activity.getClass().getName()), activity);
    }
}

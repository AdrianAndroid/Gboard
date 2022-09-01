package com.google.android.libraries.inputmethod.personaldictionary.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PersonalDictionaryPreference extends Preference {
    private final ieh a;

    public PersonalDictionaryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ieh.j();
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        this.a.e(ikp.a, new Object[0]);
        llp b = hqr.b();
        ArrayList arrayList = new ArrayList(b.size());
        int size = b.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((hqt) b.get(i)).i());
        }
        k(arrayList);
    }

    protected void k(ArrayList arrayList) {
        this.v = ikz.class.getName();
        r().putParcelableArrayList("ARG_KEY_LANGUAGE_TAG_LIST", arrayList);
    }

    PersonalDictionaryPreference(Context context, ieh iehVar) {
        super(context);
        this.a = iehVar;
    }
}

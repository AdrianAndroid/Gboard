package defpackage;

import android.support.v7.widget.SearchView;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* renamed from: nd  reason: default package */
/* loaded from: classes2.dex */
public final class nd {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView.SearchAutoComplete searchAutoComplete, int i) {
        searchAutoComplete.setInputMethodMode(i);
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }
}

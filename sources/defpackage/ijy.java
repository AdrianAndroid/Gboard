package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: ijy  reason: default package */
/* loaded from: classes.dex */
public final class ijy extends ijx {
    public ijy(Cursor cursor) {
        super(cursor);
    }

    @Override // defpackage.ijx
    protected final long a() {
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ijx
    public final jav c() {
        String d = lfd.d(getString(getColumnIndexOrThrow("locale")));
        jav a = ikb.a(d);
        if (a == null) {
            ((luc) ((luc) ijz.a.d()).k("com/google/android/libraries/inputmethod/personaldictionary/AndroidUserDictionaryQueries$AndroidWordsCursor", "getLanguageTag", 192, "AndroidUserDictionaryQueries.java")).w("Unknown locale string %s", d);
            return jav.d;
        }
        return a;
    }

    @Override // defpackage.ijx
    public final String d() {
        return lfd.d(getString(getColumnIndexOrThrow("shortcut")));
    }

    @Override // defpackage.ijx
    public final String e() {
        return lfd.d(getString(getColumnIndexOrThrow("word")));
    }
}

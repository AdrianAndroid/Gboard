package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: ikf  reason: default package */
/* loaded from: classes.dex */
public final class ikf extends ijx {
    public ikf(Cursor cursor) {
        super(cursor);
    }

    @Override // defpackage.ijx
    protected final long a() {
        return getLong(getColumnIndexOrThrow("_id"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ijx
    public final jav c() {
        return jav.f(lfd.d(getString(getColumnIndexOrThrow("locale"))));
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

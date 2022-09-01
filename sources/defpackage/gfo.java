package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* renamed from: gfo  reason: default package */
/* loaded from: classes.dex */
final class gfo extends ContentObserver {
    public gfo() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        gfp.e.set(true);
    }
}

package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: gye  reason: default package */
/* loaded from: classes.dex */
final class gye extends ContentObserver {
    final /* synthetic */ gyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gye(gyj gyjVar, Handler handler) {
        super(handler);
        this.a = gyjVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.j();
    }
}

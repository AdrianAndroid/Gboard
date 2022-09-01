package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: gjw  reason: default package */
/* loaded from: classes.dex */
final class gjw extends ContentObserver {
    final /* synthetic */ gjx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjw(gjx gjxVar, Handler handler) {
        super(handler);
        this.a = gjxVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b();
    }
}

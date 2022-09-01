package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: hvc  reason: default package */
/* loaded from: classes.dex */
final class hvc extends ContentObserver {
    final /* synthetic */ hvd a;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvc(hvd hvdVar, Handler handler, String str) {
        super(handler);
        this.a = hvdVar;
        this.b = str;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        hvd hvdVar = this.a;
        hvdVar.e(hvdVar.a.getContentResolver(), this.b);
    }
}

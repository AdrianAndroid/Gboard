package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: cvf  reason: default package */
/* loaded from: classes.dex */
final class cvf extends ContentObserver {
    private final Runnable a;

    public cvf(Runnable runnable) {
        super(new Handler(Looper.getMainLooper()));
        this.a = runnable;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.a.run();
    }
}

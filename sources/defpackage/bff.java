package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: bff  reason: default package */
/* loaded from: classes.dex */
public final class bff extends bfa {
    private static final Handler b = new Handler(Looper.getMainLooper(), new bfe(0));
    public final atw a;

    public bff(atw atwVar) {
        this.a = atwVar;
    }

    @Override // defpackage.bfh
    public final void c(Object obj, bfp bfpVar) {
        bep bepVar = this.c;
        if (bepVar == null || !bepVar.l()) {
            return;
        }
        b.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.bfh
    public final void fg(Drawable drawable) {
    }
}

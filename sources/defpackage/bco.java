package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: bco  reason: default package */
/* loaded from: classes.dex */
public final class bco extends bfa {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public bco(Handler handler, int i, long j) {
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.bfh
    public final /* bridge */ /* synthetic */ void c(Object obj, bfp bfpVar) {
        this.b = (Bitmap) obj;
        this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.e);
    }

    @Override // defpackage.bfh
    public final void fg(Drawable drawable) {
        this.b = null;
    }
}

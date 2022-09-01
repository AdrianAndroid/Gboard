package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: fpf  reason: default package */
/* loaded from: classes.dex */
final class fpf implements fos {
    final /* synthetic */ fpj a;

    public fpf(fpj fpjVar) {
        this.a = fpjVar;
    }

    @Override // defpackage.fos
    public final void a(boolean z) {
        Handler handler = this.a.m;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}

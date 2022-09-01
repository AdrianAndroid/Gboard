package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lzg  reason: default package */
/* loaded from: classes.dex */
public final class lzg implements Runnable {
    final /* synthetic */ mld a;
    final /* synthetic */ lzi b;

    public lzg(lzi lziVar, mld mldVar) {
        this.b = lziVar;
        this.a = mldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.a.isCancelled()) {
                if (kcu.S(this.a) == lzi.a) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.p(this.a);
    }
}

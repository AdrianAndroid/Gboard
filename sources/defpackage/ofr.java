package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ofr  reason: default package */
/* loaded from: classes2.dex */
public abstract class ofr implements Runnable {
    final /* synthetic */ ofs b;

    public ofr(ofs ofsVar) {
        this.b = ofsVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.b.f == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e) {
            this.b.c.a(e);
        }
    }
}

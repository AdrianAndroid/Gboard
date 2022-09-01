package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: osj  reason: default package */
/* loaded from: classes2.dex */
final class osj extends ouw {
    boolean a = false;
    long b = 0;
    final /* synthetic */ osk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osj(osk oskVar, ovp ovpVar) {
        super(ovpVar);
        this.c = oskVar;
    }

    private final void c(IOException iOException) {
        if (this.a) {
            return;
        }
        this.a = true;
        osk oskVar = this.c;
        oskVar.a.g(false, oskVar, iOException);
    }

    @Override // defpackage.ouw, defpackage.ovp
    public final long b(our ourVar, long j) {
        try {
            long b = this.d.b(ourVar, 8192L);
            if (b > 0) {
                this.b += b;
            }
            return b;
        } catch (IOException e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.ouw, defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        c(null);
    }
}

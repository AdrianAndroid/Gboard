package defpackage;

import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osy  reason: default package */
/* loaded from: classes2.dex */
public final class osy extends oqq {
    final otb a;
    final /* synthetic */ osz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osy(osz oszVar, otb otbVar) {
        super("OkHttp %s", oszVar.e);
        this.c = oszVar;
        this.a = otbVar;
    }

    public final void a(otj otjVar) {
        try {
            osz oszVar = this.c;
            oszVar.i.execute(new osx(this, new Object[]{oszVar.e}, otjVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // defpackage.oqq
    protected final void b() {
        try {
        } catch (IOException unused) {
            this.c.k(2, 2);
        } catch (Throwable th) {
            try {
                this.c.k(3, 3);
            } catch (IOException unused2) {
            }
            oqs.r(this.a);
            throw th;
        }
        if (this.a.c(true, this)) {
            do {
            } while (this.a.c(false, this));
            this.c.k(1, 9);
            oqs.r(this.a);
            return;
        }
        throw osi.a("Required SETTINGS preface not received", new Object[0]);
    }

    public final void c(boolean z, int i, int i2) {
        if (z) {
            synchronized (this.c) {
                this.c.notifyAll();
            }
            return;
        }
        try {
            osz oszVar = this.c;
            oszVar.i.execute(new osu(oszVar, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }
}

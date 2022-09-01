package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqp  reason: default package */
/* loaded from: classes.dex */
public final class kqp implements kqs {
    public final String a;
    public final mko b;
    public final Executor c;
    public final kqb d;
    public final kcq g;
    private final kqx h;
    public final Object e = new Object();
    private final ndi i = ndi.c();
    public mko f = null;

    public kqp(String str, mko mkoVar, kqx kqxVar, Executor executor, kcq kcqVar, kqb kqbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = str;
        this.b = kcu.L(mkoVar);
        this.h = kqxVar;
        this.c = kcu.E(executor);
        this.g = kcqVar;
        this.d = kqbVar;
    }

    public final mko a() {
        mko mkoVar;
        synchronized (this.e) {
            mko mkoVar2 = this.f;
            if (mkoVar2 != null && mkoVar2.isDone()) {
                try {
                    kcu.S(this.f);
                } catch (ExecutionException unused) {
                    this.f = null;
                }
            }
            if (this.f == null) {
                this.f = kcu.L(this.i.b(ldd.b(new clc(this, 11)), this.c));
            }
            mkoVar = this.f;
        }
        return mkoVar;
    }

    public final Object b(Uri uri) {
        try {
            try {
                String str = this.a;
                lcq l = jco.l("Read " + str, ldi.a);
                try {
                    InputStream inputStream = (InputStream) this.g.q(uri, kpo.b());
                    kqx kqxVar = this.h;
                    Object g = kqxVar.a.I().g(inputStream, kqxVar.b);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    l.close();
                    return g;
                } catch (Throwable th) {
                    try {
                        l.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (!this.g.v(uri)) {
                    return this.h.a;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw kvj.i(this.g, uri, e2);
        }
    }

    public final void c(Uri uri, Object obj) {
        Uri g = kvj.g(uri, ".tmp");
        try {
            String str = this.a;
            lcq l = jco.l("Write " + str, ldi.a);
            nrw nrwVar = new nrw();
            try {
                kcq kcqVar = this.g;
                kps b = kps.b();
                b.a = new nrw[]{nrwVar};
                OutputStream outputStream = (OutputStream) kcqVar.q(g, b);
                try {
                    ((ngz) obj).p(outputStream);
                    nrwVar.g();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    l.close();
                    this.g.u(g, uri);
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw kvj.i(this.g, uri, e);
            }
        } catch (IOException e2) {
            if (this.g.v(g)) {
                try {
                    this.g.t(g);
                } catch (IOException e3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e2, e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.kqs
    public final mko d(miy miyVar, Executor executor) {
        return this.i.b(ldd.b(new iiq(this, a(), miyVar, executor, 6)), mjl.a);
    }
}

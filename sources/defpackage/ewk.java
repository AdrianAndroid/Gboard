package defpackage;

import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ewk  reason: default package */
/* loaded from: classes.dex */
public final class ewk implements fwh {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/examplestoreservice/EkhoExampleStoreIterator");
    public final EkhoMaterializerImpl c;
    private final Executor d;
    public final Queue b = new ConcurrentLinkedQueue();
    private mko e = mkk.a;

    public ewk(EkhoMaterializerImpl ekhoMaterializerImpl, Executor executor) {
        this.c = ekhoMaterializerImpl;
        this.d = executor;
    }

    public static void d(fwg fwgVar, ewj ewjVar) {
        if (ewjVar == null) {
            fwgVar.a(13, "unexpected: materializer result or error is null");
            return;
        }
        Object obj = ewjVar.b;
        if (obj != null) {
            fwgVar.a(13, (String) obj);
            return;
        }
        Object obj2 = ewjVar.a;
        if (obj2 == null) {
            fwgVar.a(13, "unexpected: materializer result is null");
            return;
        }
        EkhoMaterializerResult ekhoMaterializerResult = (EkhoMaterializerResult) obj2;
        fwgVar.b(ekhoMaterializerResult.exampleBytes, ekhoMaterializerResult.resumptionToken);
    }

    public final void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                EkhoMaterializerImpl ekhoMaterializerImpl = this.c;
                boolean z = true;
                jdg.G(ekhoMaterializerImpl.b != 1, "Not started yet.");
                jdg.G(ekhoMaterializerImpl.b != 3, "Already closed.");
                byte[][] bArr = new byte[3];
                ekhoMaterializerImpl.nativeNext(ekhoMaterializerImpl.a, bArr);
                EkhoMaterializerResult ekhoMaterializerResult = new EkhoMaterializerResult();
                ekhoMaterializerResult.resumptionToken = bArr[0];
                byte[] bArr2 = bArr[1];
                if (bArr2 == null || bArr2.length <= 0 || bArr2[0] == 0) {
                    z = false;
                }
                ekhoMaterializerResult.isTfExample = z;
                ekhoMaterializerResult.exampleBytes = bArr[2];
                this.b.add(new ewj(ekhoMaterializerResult));
            } catch (IOException e) {
                this.b.add(new ewj(e.getMessage()));
                return;
            }
        }
    }

    @Override // defpackage.fwh
    public final void b(fwg fwgVar) {
        ewj ewjVar = (ewj) this.b.poll();
        if (ewjVar != null) {
            d(fwgVar, ewjVar);
            return;
        }
        synchronized (this) {
            this.e = mio.g(this.e, new fyn(this, fwgVar, 1), this.d);
        }
    }

    @Override // defpackage.fwh
    public final void c(int i) {
        synchronized (this) {
            this.e = mio.g(this.e, new ego(this, i, 5), this.d);
        }
    }

    @Override // defpackage.fwh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            mko g = mhu.g(this.e, Throwable.class, eki.f, this.d);
            this.e = g;
            this.e = mio.g(g, new ebi(this, 11), this.d);
        }
    }
}

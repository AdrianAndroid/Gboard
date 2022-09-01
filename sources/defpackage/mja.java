package defpackage;

import java.io.Closeable;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: mja  reason: default package */
/* loaded from: classes.dex */
public final class mja implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mja(lcx lcxVar, Callable callable, int i) {
        this.c = i;
        this.b = lcxVar;
        this.a = callable;
    }

    public mja(mjf mjfVar, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.a = mjfVar;
        this.b = opuVar;
    }

    public final String toString() {
        if (this.c != 0) {
            String valueOf = String.valueOf(this.a);
            return "propagating=[" + valueOf + "]";
        }
        return ((opu) this.b).toString();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [lcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.c != 0) {
            lcx lcxVar = this.b;
            try {
                return this.a.call();
            } finally {
            }
        } else {
            Object obj = this.b;
            kdg kdgVar = ((mjf) this.a).b.a;
            Object obj2 = ((opu) obj).a;
            for (int i = 0; i <= 0; i++) {
                kdgVar.d(((Closeable[]) obj2)[i], mjl.a);
            }
            return null;
        }
    }
}

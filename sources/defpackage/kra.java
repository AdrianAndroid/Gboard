package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kra  reason: default package */
/* loaded from: classes.dex */
public final class kra implements Callable {
    volatile boolean a;
    final /* synthetic */ krb b;
    final /* synthetic */ jma c;
    final /* synthetic */ opu d;

    public kra(krb krbVar, opu opuVar, jma jmaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = krbVar;
        this.d = opuVar;
        this.c = jmaVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, krr] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        jdg.G(!this.b.a.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        this.b.a.beginTransactionWithListener(new kqz(this));
        try {
            this.a = true;
            opu opuVar = this.d;
            opuVar.a.a(this.c);
            jma.c();
            this.b.a.setTransactionSuccessful();
            this.a = false;
            this.b.a.endTransaction();
            return null;
        } catch (Throwable th) {
            this.b.a.endTransaction();
            throw th;
        }
    }
}

package defpackage;

import android.database.sqlite.SQLiteDatabase;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kqy implements mjc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqy(jma jmaVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = i;
        this.a = jmaVar;
    }

    public /* synthetic */ kqy(krj krjVar, int i) {
        this.b = i;
        this.a = krjVar;
    }

    public /* synthetic */ kqy(krr krrVar, int i) {
        this.b = i;
        this.a = krrVar;
    }

    public /* synthetic */ kqy(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, krr] */
    @Override // defpackage.mjc
    public final mjf a(kdg kdgVar, Object obj) {
        krb krbVar;
        int i = this.b;
        if (i == 0) {
            krb krbVar2 = (krb) obj;
            opu opuVar = new opu((krr) this.a);
            krbVar2.a();
            jma jmaVar = new jma(krbVar2.a);
            lcq a = ldh.a("Transaction");
            try {
                mkp a2 = mkp.a(ldd.g(new kra(krbVar2, opuVar, jmaVar, null, null, null, null)));
                krbVar2.c.execute(a2);
                a2.d(new kht(a2, jmaVar, 8, (byte[]) null, (byte[]) null, (byte[]) null), mjl.a);
                a.a(a2);
                a.close();
                return mjf.b(a2);
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } else if (i == 1) {
            krb krbVar3 = (krb) obj;
            jma jmaVar2 = (jma) this.a;
            Object obj2 = jmaVar2.b;
            Object obj3 = jmaVar2.a;
            krbVar3.a();
            mop mopVar = new mop(krbVar3, (Object[]) obj3, (String) obj2);
            int i2 = krl.a;
            krk krkVar = new krk(mopVar, null);
            krbVar3.b.execute(ldd.f(krkVar));
            return mjf.a(krkVar, mjl.a);
        } else if (i == 2) {
            Void r15 = (Void) obj;
            return mjf.b(this.a);
        } else {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            krj krjVar = (krj) this.a;
            Executor executor = krjVar.j;
            if (!sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                krbVar = new krb(sQLiteDatabase, executor, executor, krjVar.p, null, null, null, null);
            } else {
                krbVar = new krb(sQLiteDatabase, krjVar.c, executor, krjVar.p, null, null, null, null);
            }
            mko K = kcu.K(krbVar);
            Objects.requireNonNull(krbVar);
            return krj.b(K, new kre(krbVar, 0));
        }
    }
}

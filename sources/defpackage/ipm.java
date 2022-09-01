package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: PG */
/* renamed from: ipm  reason: default package */
/* loaded from: classes.dex */
public final class ipm implements ipk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/protoxdb/ProtoXDB");
    public static final lmz b = lmz.r("android_metadata");
    public final llw c;
    public final ipa d;
    public final SQLiteDatabase e;
    public final File f;

    public ipm(ipa ipaVar, gjz gjzVar, SQLiteDatabase sQLiteDatabase, byte[] bArr) {
        lls h = llw.h();
        llp llpVar = ipaVar.b;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ipq ipqVar = (ipq) llpVar.get(i2);
            h.a(ipqVar.a.d(), new ipr(ipqVar, gjzVar, sQLiteDatabase, ipaVar.c, ipaVar.d, ipqVar.c, null));
        }
        this.c = h.l();
        this.e = sQLiteDatabase;
        this.d = ipaVar;
        this.f = new File(sQLiteDatabase.getPath());
    }

    @Override // defpackage.ipk
    public final iph a(String str, ipz ipzVar) {
        throw null;
    }

    @Override // defpackage.ipk
    public final llw b(String str) {
        throw null;
    }

    @Override // defpackage.ipk, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }
}

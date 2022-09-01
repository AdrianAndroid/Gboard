package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: kpr  reason: default package */
/* loaded from: classes.dex */
public final class kpr implements koo {
    public nrw[] a;
    private final ngz b;

    public kpr(ngz ngzVar) {
        this.b = ngzVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kpt] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kpt] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kpt] */
    @Override // defpackage.koo
    public final /* synthetic */ Object a(kon konVar) {
        Uri a = kpq.a((Uri) konVar.e);
        List a2 = konVar.a(konVar.a.r(a));
        nrw[] nrwVarArr = this.a;
        if (nrwVarArr != null) {
            nrwVarArr[0].f(a2);
        }
        try {
            OutputStream outputStream = (OutputStream) a2.get(0);
            this.b.p(outputStream);
            nrw[] nrwVarArr2 = this.a;
            if (nrwVarArr2 != null) {
                nrwVarArr2[0].g();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            konVar.a.l(a, (Uri) konVar.e);
            return null;
        } catch (Exception e) {
            try {
                konVar.a.k(a);
            } catch (FileNotFoundException unused) {
            }
            if (!(e instanceof IOException)) {
                throw new IOException(e);
            }
            throw ((IOException) e);
        }
    }
}

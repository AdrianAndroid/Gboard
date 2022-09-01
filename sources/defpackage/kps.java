package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: kps  reason: default package */
/* loaded from: classes.dex */
public final class kps implements koo {
    public nrw[] a;

    private kps() {
    }

    public static kps b() {
        return new kps();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kpt] */
    @Override // defpackage.koo
    public final /* bridge */ /* synthetic */ Object a(kon konVar) {
        List a = konVar.a(konVar.a.r((Uri) konVar.e));
        nrw[] nrwVarArr = this.a;
        if (nrwVarArr != null) {
            nrwVarArr[0].f(a);
        }
        return (OutputStream) a.get(0);
    }
}

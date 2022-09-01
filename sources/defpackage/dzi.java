package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: dzi  reason: default package */
/* loaded from: classes.dex */
public final class dzi {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentFetcher");
    private final ckm e;
    private final dxs f;
    private final mkr c = gxo.a(5);
    private final ScheduledExecutorService d = gxo.c(5);
    private final idk b = ieh.j();

    public dzi(dxs dxsVar, ckm ckmVar, byte[] bArr, byte[] bArr2) {
        this.f = dxsVar;
        this.e = ckmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dzi a(Context context) {
        return new dzi(dxs.u(), ffb.k(context), null, null);
    }

    public final hiz b(String str, llp llpVar) {
        hiz hizVar;
        llp c = c(str);
        if (!c.isEmpty()) {
            hizVar = hiz.n(c);
        } else {
            dxs dxsVar = this.f;
            cyh i = cyi.i();
            i.f(str);
            i.d((String) dzn.d.c());
            i.e();
            i.c(((Long) dzn.h.c()).longValue());
            ((cxs) i).b = 5;
            hiz x = hiz.k(hjg.b(dxsVar.k(i.a()))).x(dzn.g, TimeUnit.MILLISECONDS, this.d).o().u(new dar(9), this.c).a(iht.class, dar.j, this.c).x(dzn.f, TimeUnit.MILLISECONDS, this.d);
            EditorInfo b = hsu.b();
            idk idkVar = this.b;
            csw cswVar = csw.RICH_CONTENT_SUGGESTION_REQUEST;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = b != null ? ham.m(b) : null;
            idkVar.e(cswVar, objArr);
            hizVar = x;
        }
        return hizVar.u(new cus(llpVar, 16), mjl.a);
    }

    public final llp c(String str) {
        llp c = this.e.c(str);
        c.size();
        return c;
    }
}

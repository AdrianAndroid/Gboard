package defpackage;

import android.net.Uri;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hdd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hdd implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ hdd(cvx cvxVar, String str, Locale locale, boolean z, int i, int i2) {
        this.f = i2;
        this.d = cvxVar;
        this.e = str;
        this.c = locale;
        this.a = z;
        this.b = i;
    }

    public /* synthetic */ hdd(hiz hizVar, hbe hbeVar, hdl hdlVar, boolean z, int i, int i2) {
        this.f = i2;
        this.c = hizVar;
        this.d = hbeVar;
        this.e = hdlVar;
        this.a = z;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, hbe] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.f == 0) {
            Object obj = this.c;
            ?? r1 = this.d;
            Object obj2 = this.e;
            return hyq.q(r1, (llp) ((hiz) obj).A(llp.q()), 0, (hdl) obj2, false, this.a, this.b);
        }
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        boolean z = this.a;
        int i = this.b;
        Uri.Builder appendQueryParameter = cvo.a().appendPath("search").appendQueryParameter("query", (String) obj4).appendQueryParameter("include_animated", "false");
        if (z) {
            appendQueryParameter.appendQueryParameter("context", "proactive");
        }
        if (obj5 != null) {
            appendQueryParameter.appendQueryParameter("locale", cvo.e((Locale) obj5));
        }
        return ((cvx) obj3).l(appendQueryParameter.build(), i);
    }
}

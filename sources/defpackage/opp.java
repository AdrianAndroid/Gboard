package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: PG */
/* renamed from: opp  reason: default package */
/* loaded from: classes2.dex */
public final class opp implements opq {
    private final /* synthetic */ int b;

    public opp(int i) {
        this.b = i;
    }

    static /* synthetic */ ino c() {
        return ino.K(guw.a(), "_GifCookiePreference");
    }

    @Override // defpackage.opq
    public final void b(List list) {
        if (this.b != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                opo opoVar = (opo) it.next();
                if ("NID".equals(opoVar.a) && "google.com".equals(opoVar.c)) {
                    c().j("cookie", opoVar.b);
                }
            }
        }
    }

    @Override // defpackage.opq
    public final List a(opz opzVar) {
        String d;
        if (this.b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if ("google.com".equals(oqs.x(opzVar.b) ? null : PublicSuffixDatabase.a.a(opzVar.b)) && (d = c().d("cookie", null)) != null) {
            opn opnVar = new opn();
            String h = oqs.h("google.com");
            if (h != null) {
                opnVar.d = h;
                opnVar.b = "NID";
                if (!d.trim().equals(d)) {
                    throw new IllegalArgumentException("value is not trimmed");
                }
                opnVar.c = d;
                opnVar.a = true;
                arrayList.add(new opo(opnVar));
            } else {
                throw new IllegalArgumentException("unexpected domain: google.com");
            }
        }
        return arrayList;
    }
}

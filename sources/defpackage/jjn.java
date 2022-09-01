package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jjn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jjn implements rl {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ jjn(fws fwsVar, iif iifVar, jpv jpvVar, iih iihVar, Executor executor, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = i;
        this.c = fwsVar;
        this.b = iifVar;
        this.e = jpvVar;
        this.a = iihVar;
        this.d = executor;
    }

    public /* synthetic */ jjn(jjo jjoVar, jjj jjjVar, File file, String str, kaz kazVar, int i) {
        this.f = i;
        this.a = jjoVar;
        this.b = jjjVar;
        this.c = file;
        this.d = str;
        this.e = kazVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kaz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.rl
    public final Object a(rj rjVar) {
        opz o;
        int i = 0;
        if (this.f != 0) {
            Object obj = this.c;
            Object obj2 = this.b;
            Object obj3 = this.e;
            Object obj4 = this.a;
            ?? r6 = this.d;
            iif iifVar = (iif) obj2;
            iir iirVar = new iir(rjVar, iifVar, (jpv) obj3, null);
            iih iihVar = (iih) obj4;
            UrlRequest.Builder mo92newUrlRequestBuilder = ((CronetEngine) ((fws) obj).c).mo92newUrlRequestBuilder(iihVar.d.toString(), iirVar, r6);
            int i2 = iihVar.f;
            String g = iin.g(i2);
            if (i2 != 0) {
                UrlRequest.Builder mo97setHttpMethod = mo92newUrlRequestBuilder.mo97setHttpMethod(g);
                int i3 = iihVar.g;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    UrlRequest.Builder mo98setPriority = mo97setHttpMethod.mo98setPriority(i4);
                    lsz it = iihVar.c.p().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        mo98setPriority.mo93addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                    opq opqVar = iifVar.a;
                    if (opqVar != null && (o = opz.o(iihVar.d.toString())) != null) {
                        List a = opqVar.a(o);
                        if (!a.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            while (i < a.size()) {
                                if (i > 0) {
                                    sb.append("; ");
                                }
                                sb.append(((opo) a.get(i)).a);
                                sb.append("=");
                                sb.append(((opo) a.get(i)).b);
                                i++;
                            }
                            mo98setPriority.mo93addHeader("Cookie", sb.toString());
                        }
                    }
                    if (!iihVar.c.containsKey("Cache-Control")) {
                        mo98setPriority.mo93addHeader("Cache-Control", iih.b(iifVar.b));
                    }
                    UrlRequest mo95build = mo98setPriority.mo95build();
                    Objects.requireNonNull(mo95build);
                    rjVar.a(new ihi(mo95build, 4), mjl.a);
                    mo95build.start();
                    return iirVar;
                }
                throw null;
            }
            throw null;
        }
        Object obj5 = this.a;
        Object obj6 = this.b;
        Object obj7 = this.c;
        jjo jjoVar = (jjo) obj5;
        jjj jjjVar = (jjj) obj6;
        String str = (String) this.d;
        File file = (File) obj7;
        kaq a2 = jjoVar.a.a(jjjVar.b, file, str, new jjm(rjVar), this.e);
        a2.j = null;
        if (jjh.c == jjjVar.c) {
            a2.h(kap.WIFI_OR_CELLULAR);
        } else {
            a2.h(kap.WIFI_ONLY);
        }
        int i5 = jjjVar.d;
        if (i5 > 0) {
            a2.k = i5;
        }
        llp llpVar = jjjVar.e;
        int i6 = ((lrl) llpVar).c;
        while (i < i6) {
            Pair pair = (Pair) llpVar.get(i);
            a2.f.v((String) pair.first, (String) pair.second);
            i++;
        }
        rjVar.a(new epv(jjoVar, file, str, 16), mjl.a);
        boolean e = a2.e();
        int i7 = jmk.a;
        if (!e) {
            rjVar.d(new IllegalStateException("Duplicate request for: ".concat(String.valueOf(jjjVar.b))));
        }
        return "Data download scheduled for file ".concat(String.valueOf(jjjVar.b));
    }
}

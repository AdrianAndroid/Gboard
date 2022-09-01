package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iiu  reason: default package */
/* loaded from: classes.dex */
public final class iiu implements iid {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/net/okhttp3/OkHttp3Client");
    public final iix b;
    private final iif c;
    private final idk d = ieh.j();
    private final gjz e = gvs.a;

    public iiu(iif iifVar) {
        this.b = new iix(iifVar);
        this.c = iifVar;
    }

    public static nuf a(String str, List list) {
        ogb ogbVar = new ogb(oao.j(str));
        ocj ocjVar = ogbVar.c;
        ocjVar.h = (String) iih.b.a();
        ocjVar.b(list);
        ogbVar.c.b(Arrays.asList(new iib()));
        ocj ocjVar2 = ogbVar.c;
        ocjVar2.m = true;
        return ocjVar2.c();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.iid
    public final mko c(iih iihVar) {
        jpv b = jpv.b(this.d, iihVar);
        osr osrVar = new osr((byte[]) null);
        osrVar.g(iihVar.d.toString());
        int i = iihVar.f;
        String g = iin.g(i);
        if (i != 0) {
            osrVar.e(g, null);
            String str = iihVar.e.u;
            if (osrVar.a.isEmpty()) {
                osrVar.a = new LinkedHashMap();
            }
            osrVar.a.put(Object.class, Object.class.cast(str));
            lsz it = iihVar.c.p().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                osrVar.b((String) entry.getKey(), (String) entry.getValue());
            }
            if (!iihVar.c.containsKey("Cache-Control")) {
                osrVar.b("Cache-Control", iih.b(this.c.b));
            }
            return hiz.j(new iis(this, b, osrVar.a(), 0, null));
        }
        throw null;
    }

    @Override // defpackage.iid
    public final nuf d(String str, List list) {
        return a(str, list);
    }
}

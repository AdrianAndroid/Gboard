package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqi  reason: default package */
/* loaded from: classes.dex */
public final class kqi {
    private final Executor c;
    private final Map e;
    private final kqw f;
    private final kcq g;
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final miy d = jlf.f;

    public kqi(Executor executor, kcq kcqVar, kqw kqwVar, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        jdg.u(executor);
        this.c = executor;
        jdg.u(kcqVar);
        this.g = kcqVar;
        this.f = kqwVar;
        this.e = map;
        jdg.v(!map.isEmpty());
    }

    public final synchronized kqr a(kqh kqhVar) {
        kqr kqrVar;
        Uri uri = kqhVar.a;
        kqrVar = (kqr) this.a.get(uri);
        boolean z = true;
        if (kqrVar == null) {
            Uri uri2 = kqhVar.a;
            jdg.A(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String d = lfd.d(uri2.getLastPathSegment());
            int lastIndexOf = d.lastIndexOf(46);
            jdg.A((lastIndexOf == -1 ? "" : d.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
            jdg.w(kqhVar.b != null, "Proto schema cannot be null");
            jdg.w(kqhVar.c != null, "Handler cannot be null");
            kqt kqtVar = (kqt) this.e.get("singleproc");
            if (kqtVar == null) {
                z = false;
            }
            jdg.A(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String d2 = lfd.d(kqhVar.a.getLastPathSegment());
            int lastIndexOf2 = d2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                d2 = d2.substring(0, lastIndexOf2);
            }
            kqr kqrVar2 = new kqr(kqtVar.a(kqhVar, d2, this.c, this.g, kqc.a), mio.h(kcu.K(kqhVar.a), this.d, mjl.a));
            llp llpVar = kqhVar.d;
            if (!llpVar.isEmpty()) {
                kqrVar2.d(new kqf(llpVar, this.c));
            }
            this.a.put(uri, kqrVar2);
            this.b.put(uri, kqhVar);
            kqrVar = kqrVar2;
        } else {
            kqh kqhVar2 = (kqh) this.b.get(uri);
            if (!kqhVar.equals(kqhVar2)) {
                String p = jdg.p("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", kqhVar.b.getClass().getSimpleName(), kqhVar.a);
                jdg.A(kqhVar.a.equals(kqhVar2.a), p, "uri");
                jdg.A(kqhVar.b.equals(kqhVar2.b), p, "schema");
                jdg.A(kqhVar.c.equals(kqhVar2.c), p, "handler");
                jdg.A(lre.I(kqhVar.d, kqhVar2.d), p, "migrations");
                jdg.A(kqhVar.f.equals(kqhVar2.f), p, "variantConfig");
                jdg.A(kqhVar.e == kqhVar2.e, p, "useGeneratedExtensionRegistry");
                jdg.A(true, p, "enableTracing");
                throw new IllegalArgumentException(jdg.p(p, "unknown"));
            }
        }
        return kqrVar;
    }
}

package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* renamed from: kdw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kdw implements leq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdw(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ kdw(jnf jnfVar, int i) {
        this.b = i;
        this.a = jnfVar;
    }

    public /* synthetic */ kdw(kcq kcqVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = i;
        this.a = kcqVar;
    }

    public /* synthetic */ kdw(kdx kdxVar, int i) {
        this.b = i;
        this.a = kdxVar;
    }

    public /* synthetic */ kdw(knn knnVar, int i) {
        this.b = i;
        this.a = knnVar;
    }

    public /* synthetic */ kdw(kof kofVar, int i) {
        this.b = i;
        this.a = kofVar;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [jnf, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((kdx) this.a).c = true;
                    return null;
                }
            case 1:
                int i = jph.c;
                this.a.a((jtr) obj);
                return Boolean.TRUE;
            case 2:
                Object obj2 = this.a;
                kjv kjvVar = kko.a;
                kke kkeVar = kke.d;
                ngu nguVar = ((kkg) obj).a;
                if (nguVar.containsKey(obj2)) {
                    kkeVar = (kke) nguVar.get(obj2);
                }
                return kkeVar.b;
            case 3:
                Object obj3 = this.a;
                kjv kjvVar2 = kko.a;
                kke kkeVar2 = kke.d;
                obj3.getClass();
                ngu nguVar2 = ((kkg) obj).a;
                if (nguVar2.containsKey(obj3)) {
                    kkeVar2 = (kke) nguVar2.get(obj3);
                }
                return kkeVar2.c;
            case 4:
                Object obj4 = this.a;
                kjv kjvVar3 = kko.a;
                nfh t = kkg.b.t();
                for (Map.Entry entry : Collections.unmodifiableMap(((kkg) obj).a).entrySet()) {
                    kke kkeVar3 = (kke) entry.getValue();
                    nfh t2 = kke.d.t();
                    if (!kkeVar3.c.equals(obj4)) {
                        String str = kkeVar3.c;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        kke kkeVar4 = (kke) t2.b;
                        str.getClass();
                        kkeVar4.a |= 1;
                        kkeVar4.c = str;
                    }
                    for (String str2 : kkeVar3.b) {
                        if (!str2.equals(obj4)) {
                            t2.de(str2);
                        }
                    }
                    t.df((String) entry.getKey(), (kke) t2.cz());
                }
                return (kkg) t.cz();
            case 5:
                Object obj5 = this.a;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                ArrayList arrayList = new ArrayList();
                for (String str3 : ((knn) obj5).g.a()) {
                    if (linkedHashMap.containsKey(str3)) {
                        arrayList.add((ncy) linkedHashMap.get(str3));
                    }
                }
                return arrayList;
            case 6:
                Object obj6 = this.a;
                ncs ncsVar = (ncs) obj;
                kof kofVar = (kof) obj6;
                File b = kofVar.b();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(b), 32768);
                    ncsVar.p(gZIPOutputStream);
                    gZIPOutputStream.close();
                    ((kof) obj6).a.c().edit().putString("last_cached_metadata_version", ((kof) obj6).c).apply();
                } catch (IOException e) {
                    Log.w("MetadataFetcher", "Failed to cache ".concat(String.valueOf(b.getName())), e);
                    ((knn) kofVar.a).e.d(46);
                }
                return ncsVar;
            default:
                String str4 = (String) obj;
                return String.format("protocol: %1$s, class: %2$s", str4, ((kpt) ((kcq) this.a).b.get(str4)).getClass().getSimpleName());
        }
    }
}

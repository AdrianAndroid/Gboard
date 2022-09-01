package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gjg  reason: default package */
/* loaded from: classes.dex */
public final class gjg {
    private static final int c = ndb.t("DEFAULT");
    public final LruCache a;
    public pcg b;
    private final LruCache d;
    private final Context e;
    private final Integer f;

    public gjg(Context context, int i, LruCache lruCache, LruCache lruCache2) {
        this.e = context;
        this.f = Integer.valueOf(i);
        this.d = lruCache;
        this.a = lruCache2;
    }

    private static Map e(List list, llp llpVar) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() >= llpVar.size()) {
                throw new gjf(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", num, Integer.valueOf(llpVar.size())));
            }
            pca pcaVar = (pca) llpVar.get(num.intValue());
            Integer valueOf = Integer.valueOf((pcaVar.a & 2) != 0 ? pcaVar.c : c);
            nfh nfhVar = (nfh) pcaVar.N(5);
            nfhVar.cG(pcaVar);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            pca pcaVar2 = (pca) nfhVar.b;
            pcaVar2.a &= -3;
            pcaVar2.c = 0;
            hashMap.put(valueOf, (pca) nfhVar.cz());
        }
        return hashMap;
    }

    public final pcd a(int i) {
        LruCache lruCache = this.d;
        Integer valueOf = Integer.valueOf(i);
        pcd pcdVar = (pcd) lruCache.get(valueOf);
        if (pcdVar == null) {
            if (this.b == null) {
                this.b = c();
            }
            pcdVar = (pcd) Collections.unmodifiableMap(this.b.a).get(valueOf);
            if (pcdVar != null) {
                this.d.put(valueOf, pcdVar);
            }
        }
        return pcdVar;
    }

    public final pcd b(int i) {
        pcd a = a(i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException();
    }

    public final pcg c() {
        pbz pbzVar;
        Context context = this.e;
        if (context != null) {
            try {
                InputStream openRawResource = context.getResources().openRawResource(this.f.intValue());
                ner H = ner.H(openRawResource);
                nfh t = pcg.f.t();
                t.ct(H, nfb.a());
                pcg pcgVar = (pcg) t.cz();
                nga ngaVar = pcgVar.c;
                nfs nfsVar = pcgVar.d;
                if (ngaVar.size() != nfsVar.size()) {
                    throw new gjf(String.format("ProtoHashNamesList[%d] and MessagesList[%d] must have same size", Integer.valueOf(nfsVar.size()), Integer.valueOf(ngaVar.size())));
                }
                HashMap hashMap = new HashMap();
                llp o = llp.o(pcgVar.e);
                Iterator it = nfsVar.iterator();
                Iterator it2 = ngaVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Integer num = (Integer) it.next();
                    pcd pcdVar = (pcd) it2.next();
                    Map e = e(pcdVar.e, o);
                    nfs nfsVar2 = pcdVar.f;
                    nfv nfvVar = pcdVar.g;
                    if (nfsVar2.size() != nfvVar.size()) {
                        throw new gjf(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(nfvVar.size()), Integer.valueOf(nfsVar2.size())));
                    }
                    HashMap hashMap2 = new HashMap();
                    Iterator it3 = nfsVar2.iterator();
                    Iterator it4 = nfvVar.iterator();
                    while (it4.hasNext() && it3.hasNext()) {
                        Map e2 = e(llp.r((Integer) it3.next()), o);
                        nfh t2 = pbz.e.t();
                        t2.eT(e2);
                        hashMap2.put((Long) it4.next(), (pbz) t2.cz());
                    }
                    nga ngaVar2 = pcdVar.c;
                    nfv nfvVar2 = pcdVar.d;
                    if (ngaVar2.size() != nfvVar2.size()) {
                        throw new gjf(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(nfvVar2.size()), Integer.valueOf(ngaVar2.size())));
                    }
                    Iterator it5 = nfvVar2.iterator();
                    Iterator it6 = ngaVar2.iterator();
                    while (it5.hasNext() && it6.hasNext()) {
                        Long l = (Long) it5.next();
                        pbz pbzVar2 = (pbz) it6.next();
                        Map e3 = e(pbzVar2.d, o);
                        if (!hashMap2.containsKey(l)) {
                            nfh nfhVar = (nfh) pbzVar2.N(5);
                            nfhVar.cG(pbzVar2);
                            nfhVar.eT(e3);
                            if (nfhVar.c) {
                                nfhVar.cD();
                                nfhVar.c = false;
                            }
                            ((pbz) nfhVar.b).d = pbz.C();
                            pbzVar = (pbz) nfhVar.cz();
                        } else {
                            nfh nfhVar2 = (nfh) pbzVar2.N(5);
                            nfhVar2.cG(pbzVar2);
                            nfhVar2.cG((pbz) hashMap2.get(l));
                            pbzVar = (pbz) nfhVar2.cz();
                        }
                        hashMap2.put(l, pbzVar);
                    }
                    nfh nfhVar3 = (nfh) pcdVar.N(5);
                    nfhVar3.cG(pcdVar);
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    pcd pcdVar2 = (pcd) nfhVar3.b;
                    ngu nguVar = pcdVar2.a;
                    if (!nguVar.b) {
                        pcdVar2.a = nguVar.a();
                    }
                    pcdVar2.a.putAll(e);
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    ((pcd) nfhVar3.b).e = pcd.C();
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    pcd pcdVar3 = (pcd) nfhVar3.b;
                    ngu nguVar2 = pcdVar3.b;
                    if (!nguVar2.b) {
                        pcdVar3.b = nguVar2.a();
                    }
                    pcdVar3.b.putAll(hashMap2);
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    ((pcd) nfhVar3.b).d = pcd.E();
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    ((pcd) nfhVar3.b).c = pcd.G();
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    ((pcd) nfhVar3.b).f = pcd.C();
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    ((pcd) nfhVar3.b).g = pcd.E();
                    hashMap.put(num, (pcd) nfhVar3.cz());
                }
                nfh t3 = pcg.f.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                pcg pcgVar2 = (pcg) t3.b;
                ngu nguVar3 = pcgVar2.a;
                if (!nguVar3.b) {
                    pcgVar2.a = nguVar3.a();
                }
                pcgVar2.a.putAll(hashMap);
                Map unmodifiableMap = Collections.unmodifiableMap(pcgVar.b);
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                pcg pcgVar3 = (pcg) t3.b;
                ngu nguVar4 = pcgVar3.b;
                if (!nguVar4.b) {
                    pcgVar3.b = nguVar4.a();
                }
                pcgVar3.b.putAll(unmodifiableMap);
                pcg pcgVar4 = (pcg) t3.cz();
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return pcgVar4;
            } catch (Resources.NotFoundException e4) {
                throw new IOException(e4);
            }
        }
        throw new IOException("No context to load resource from");
    }

    public final boolean d(int i) {
        return a(i) != null;
    }
}

package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Process;
import android.provider.Settings;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: idx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class idx implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ idx(idz idzVar, String str, int i) {
        this.c = i;
        this.a = idzVar;
        this.b = str;
    }

    public /* synthetic */ idx(ieh iehVar, iee ieeVar, int i) {
        this.c = i;
        this.b = iehVar;
        this.a = ieeVar;
    }

    public /* synthetic */ idx(ieh iehVar, Collection collection, int i) {
        this.c = i;
        this.a = iehVar;
        this.b = collection;
    }

    public /* synthetic */ idx(ieh iehVar, List list, int i) {
        this.c = i;
        this.a = iehVar;
        this.b = list;
    }

    public /* synthetic */ idx(ils ilsVar, View view, int i) {
        this.c = i;
        this.b = ilsVar;
        this.a = view;
    }

    public /* synthetic */ idx(inq inqVar, Runnable runnable, int i) {
        this.c = i;
        this.a = inqVar;
        this.b = runnable;
    }

    public /* synthetic */ idx(iod iodVar, View view, int i) {
        this.c = i;
        this.b = iodVar;
        this.a = view;
    }

    public /* synthetic */ idx(irz irzVar, ContentResolver contentResolver, int i) {
        this.c = i;
        this.b = irzVar;
        this.a = contentResolver;
    }

    public /* synthetic */ idx(irz irzVar, Context context, int i) {
        this.c = i;
        this.b = irzVar;
        this.a = context;
    }

    public /* synthetic */ idx(iur iurVar, Context context, int i) {
        this.c = i;
        this.b = iurVar;
        this.a = context;
    }

    public /* synthetic */ idx(ixs ixsVar, iiy iiyVar, int i) {
        this.c = i;
        this.b = ixsVar;
        this.a = iiyVar;
    }

    public /* synthetic */ idx(Map.Entry entry, ijj ijjVar, int i) {
        this.c = i;
        this.b = entry;
        this.a = ijjVar;
    }

    public /* synthetic */ idx(jls jlsVar, ijj ijjVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = i;
        this.b = jlsVar;
        this.a = ijjVar;
    }

    public /* synthetic */ idx(jmi jmiVar, Uri uri, int i) {
        this.c = i;
        this.b = jmiVar;
        this.a = uri;
    }

    public /* synthetic */ idx(jnf jnfVar, Object obj, int i) {
        this.c = i;
        this.a = jnfVar;
        this.b = obj;
    }

    public /* synthetic */ idx(jok jokVar, jog jogVar, int i) {
        this.c = i;
        this.b = jokVar;
        this.a = jogVar;
    }

    public /* synthetic */ idx(jov jovVar, byte[] bArr, int i) {
        this.c = i;
        this.a = jovVar;
        this.b = bArr;
    }

    public /* synthetic */ idx(kbs kbsVar, Runnable runnable, int i) {
        this.c = i;
        this.a = kbsVar;
        this.b = runnable;
    }

    public /* synthetic */ idx(kft kftVar, String str, int i) {
        this.c = i;
        this.a = kftVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [idl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [guf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [jnf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [ijj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v24, types: [ijg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.Collection, java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        flu fluVar;
        int length;
        idm idmVar;
        ido[] t;
        int length2;
        ijk ijkVar;
        switch (this.c) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                fma fmaVar = ((idz) obj).e;
                fmaVar.g.writeLock().lock();
                try {
                    flq flqVar = (flq) fmaVar.k.get(obj2);
                    if (flqVar == null) {
                        fmaVar.g.writeLock().lock();
                        fluVar = new flu(fmaVar, (String) obj2);
                        fmaVar.k.put(obj2, fluVar);
                        fmaVar.g.writeLock().unlock();
                    } else {
                        try {
                            flu fluVar2 = (flu) flqVar;
                            fmaVar.g.writeLock().unlock();
                            fluVar = fluVar2;
                        } catch (ClassCastException e) {
                            throw new IllegalArgumentException("another type of counter exists with name: " + ((String) obj2), e);
                        }
                    }
                    fluVar.a(0L, fma.d);
                    return;
                } finally {
                    fmaVar.g.writeLock().unlock();
                }
            case 1:
                idz idzVar = (idz) this.a;
                idzVar.i(new idx(idzVar, (String) this.b, 0));
                return;
            case 2:
                Object obj3 = this.a;
                for (Object obj4 : this.b) {
                    if (obj4 instanceof iee) {
                        ((ieh) obj3).l((iee) obj4);
                    } else if (obj4 instanceof ieg) {
                        ieg iegVar = (ieg) obj4;
                        ((ieh) obj3).o(iegVar.a, iegVar.b);
                    } else {
                        ((ltd) ieh.a.a(hip.a).k("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "lambda$maybeStopCaching$4", 452, "MetricsManager.java")).w("Unsupported cached message: %s", obj4);
                    }
                }
                return;
            case 3:
                ((ieh) this.b).l((iee) this.a);
                return;
            case 4:
                Object obj5 = this.a;
                for (Class cls : this.b) {
                    ieh iehVar = (ieh) obj5;
                    idj idjVar = (idj) iehVar.e.remove(cls);
                    if (idjVar != null) {
                        if ((idjVar instanceof idm) && (t = (idmVar = (idm) idjVar).t()) != null) {
                            for (ido idoVar : t) {
                                idm[] idmVarArr = (idm[]) iehVar.f.get(idoVar);
                                idm[] idmVarArr2 = (idmVarArr == null || (length2 = idmVarArr.length) <= 0) ? null : (idm[]) ieh.t(idmVarArr, idmVar, new idm[length2 - 1]);
                                if (idmVarArr2 == null) {
                                    iehVar.f.remove(idoVar);
                                } else {
                                    iehVar.f.put(idoVar, idmVarArr2);
                                }
                            }
                        }
                        if (idjVar instanceof idr) {
                            idr idrVar = (idr) idjVar;
                            lsz it = idrVar.a().iterator();
                            while (it.hasNext()) {
                                ids idsVar = (ids) it.next();
                                idr[] idrVarArr = (idr[]) iehVar.g.get(idsVar);
                                idr[] idrVarArr2 = (idrVarArr == null || (length = idrVarArr.length) <= 0) ? null : (idr[]) ieh.t(idrVarArr, idrVar, new idr[length - 1]);
                                if (idrVarArr2 == null) {
                                    iehVar.g.remove(idsVar);
                                } else {
                                    iehVar.g.put(idsVar, idrVarArr2);
                                }
                            }
                        }
                        idjVar.f();
                        cls.getName();
                    }
                }
                ((ieh) obj5).h.decrementAndGet();
                return;
            case 5:
                ?? r0 = this.a;
                for (idj idjVar2 : this.b) {
                    Class<?> cls2 = idjVar2.getClass();
                    ieh iehVar2 = (ieh) r0;
                    if (iehVar2.e.putIfAbsent(cls2, idjVar2) != null) {
                        ((ltd) ((ltd) ieh.a.d()).k("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "addProcessorImpl", 606, "MetricsManager.java")).w("Processor %s already exists.", idjVar2);
                    } else {
                        if (idjVar2 instanceof idm) {
                            idm idmVar2 = (idm) idjVar2;
                            ido[] t2 = idmVar2.t();
                            if (t2 != null) {
                                for (ido idoVar2 : t2) {
                                    idm[] idmVarArr3 = (idm[]) iehVar2.f.get(idoVar2);
                                    if (idmVarArr3 == null) {
                                        iehVar2.f.put(idoVar2, new idm[]{idmVar2});
                                    } else {
                                        iehVar2.f.put(idoVar2, (idm[]) lre.d(idmVarArr3, idmVar2));
                                    }
                                }
                            }
                            idmVar2.r(r0);
                        }
                        if (idjVar2 instanceof idr) {
                            idr idrVar2 = (idr) idjVar2;
                            lsz it2 = idrVar2.a().iterator();
                            while (it2.hasNext()) {
                                ids idsVar2 = (ids) it2.next();
                                idr[] idrVarArr3 = (idr[]) iehVar2.g.get(idsVar2);
                                if (idrVarArr3 == null) {
                                    iehVar2.g.put(idsVar2, new idr[]{idrVar2});
                                } else {
                                    iehVar2.g.put(idsVar2, (idr[]) lre.d(idrVarArr3, idrVar2));
                                }
                            }
                        }
                        try {
                            idjVar2.e();
                        } catch (RuntimeException e2) {
                            iehVar2.e(idd.METRICS_PROCESSOR_CRASH_ON_ATTACHED, e2);
                        }
                        cls2.getName();
                    }
                }
                ((ieh) r0).h.decrementAndGet();
                return;
            case 6:
                ?? r02 = this.b;
                Object obj6 = this.a;
                jyw jywVar = (jyw) r02.getKey();
                Object obj7 = jywVar.a;
                ?? r03 = jywVar.b;
                gug gugVar = (gug) obj7;
                if (!((guh) obj6).g(gugVar.b) || !gugVar.f()) {
                    return;
                }
                r03.hN();
                return;
            case 7:
                Object obj8 = this.b;
                ?? r1 = this.a;
                synchronized (((jls) obj8).b) {
                    ijkVar = (ijk) ((ArrayDeque) ((jls) obj8).b).pollFirst();
                }
                if (ijkVar == null) {
                    return;
                }
                ?? r2 = ijkVar.a;
                if (r2 == ijl.a) {
                    r1.fe((Class) ijkVar.b);
                    return;
                } else {
                    r1.fd(r2);
                    return;
                }
            case 8:
                ((ils) this.b).b.j((View) this.a);
                return;
            case 9:
                Object obj9 = this.a;
                ?? r12 = this.b;
                ((inq) obj9).d = null;
                r12.run();
                return;
            case 10:
                Object obj10 = this.b;
                Object obj11 = this.a;
                iod iodVar = (iod) obj10;
                iodVar.e = -1;
                iodVar.e((View) obj11, true);
                return;
            case 11:
                ((irz) this.b).b((ContentResolver) this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj12 = this.b;
                ContentResolver contentResolver = ((Context) this.a).getContentResolver();
                irz irzVar = (irz) obj12;
                if (irzVar.b(contentResolver)) {
                    return;
                }
                contentResolver.registerContentObserver(Settings.Secure.getUriFor("user_setup_complete"), false, (ContentObserver) obj12);
                irzVar.e = true;
                irzVar.b(contentResolver);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj13 = this.b;
                kdr kdrVar = ((hrx) hrx.y((Context) this.a)).P;
                if (kdrVar != null) {
                    lls h = llw.h();
                    lsz it3 = ((llw) kdrVar.c).entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        h.a((String) entry.getValue(), (String) entry.getKey());
                    }
                    ((iur) obj13).e = h.f();
                }
                llw llwVar = ((iur) obj13).e;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj14 = this.b;
                Object obj15 = this.a;
                synchronized (obj14) {
                    Set<String> b = ((ixs) obj14).g.b(obj15);
                    if (b.isEmpty()) {
                        return;
                    }
                    for (String str : b) {
                        ixn ixnVar = (ixn) ((ixs) obj14).d.get(str);
                        if (ixnVar != null) {
                            ((ixs) obj14).h(ixnVar);
                        }
                    }
                    llb llbVar = ((ixs) obj14).g;
                    Collection collection = (Collection) ((ljc) llbVar).a.remove(obj15);
                    if (collection == null) {
                        Collections.emptySet();
                    } else {
                        ?? a = llbVar.a();
                        a.addAll(collection);
                        ((ljc) llbVar).b -= collection.size();
                        collection.clear();
                        Collections.unmodifiableSet(a);
                    }
                    return;
                }
            case 15:
                ((HashMap) ((jmi) this.b).i).remove(this.a);
                return;
            case 16:
                Object obj16 = this.b;
                Object obj17 = this.a;
                synchronized (((jok) obj16).c.b) {
                    if (((jok) obj16).c.c.remove(obj17)) {
                        ((jok) obj16).a.close();
                    }
                }
                return;
            case 17:
                Object obj18 = this.a;
                try {
                    mgm mgmVar = (mgm) nfm.z(mgm.l, (byte[]) this.b, nfb.b());
                    nfh nfhVar = (nfh) mgmVar.N(5);
                    nfhVar.cG(mgmVar);
                    long j = ((jov) obj18).m;
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    mgm mgmVar2 = (mgm) nfhVar.b;
                    mgmVar2.a |= 16;
                    mgmVar2.d = j;
                    synchronized (((jov) obj18).q) {
                        mgm mgmVar3 = ((jov) obj18).r.c;
                        if (mgmVar3 == null) {
                            mgmVar3 = mgm.l;
                        }
                        if (!mgmVar3.i.equals(((mgm) nfhVar.b).i)) {
                            mfx mfxVar = ((jov) obj18).r;
                            nfh nfhVar2 = (nfh) mfxVar.N(5);
                            nfhVar2.cG(mfxVar);
                            mgm mgmVar4 = ((jov) obj18).r.c;
                            if (mgmVar4 == null) {
                                mgmVar4 = mgm.l;
                            }
                            nfh nfhVar3 = (nfh) mgmVar4.N(5);
                            nfhVar3.cG(mgmVar4);
                            String str2 = ((mgm) nfhVar.b).i;
                            if (nfhVar3.c) {
                                nfhVar3.cD();
                                nfhVar3.c = false;
                            }
                            mgm mgmVar5 = (mgm) nfhVar3.b;
                            str2.getClass();
                            mgmVar5.a |= 4096;
                            mgmVar5.i = str2;
                            if (nfhVar2.c) {
                                nfhVar2.cD();
                                nfhVar2.c = false;
                            }
                            mfx mfxVar2 = (mfx) nfhVar2.b;
                            mgm mgmVar6 = (mgm) nfhVar3.cz();
                            mgmVar6.getClass();
                            mfxVar2.c = mgmVar6;
                            mfxVar2.a |= 4;
                            ((jov) obj18).r = (mfx) nfhVar2.cz();
                        }
                        ((jov) obj18).h.a(nfhVar, ((jov) obj18).l, ((jov) obj18).r);
                    }
                    nfh t3 = mfx.h.t();
                    nfh t4 = mfy.c.t();
                    String str3 = ((jov) obj18).c;
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    mfy mfyVar = (mfy) t4.b;
                    str3.getClass();
                    mfyVar.a |= 1;
                    mfyVar.b = str3;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mfx mfxVar3 = (mfx) t3.b;
                    mfy mfyVar2 = (mfy) t4.cz();
                    mfyVar2.getClass();
                    mfxVar3.b = mfyVar2;
                    mfxVar3.a |= 1;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mfx mfxVar4 = (mfx) t3.b;
                    mgm mgmVar7 = (mgm) nfhVar.cz();
                    mgmVar7.getClass();
                    mfxVar4.c = mgmVar7;
                    mfxVar4.a |= 4;
                    ((jov) obj18).f.h((mfx) t3.cz());
                    return;
                } catch (ngd e3) {
                    throw new IllegalArgumentException(e3);
                }
            case 18:
                this.a.a(this.b);
                return;
            case 19:
                Object obj19 = this.a;
                ?? r13 = this.b;
                int i = ((kbs) obj19).a;
                if (i != 0) {
                    Process.setThreadPriority(i);
                }
                r13.run();
                return;
            default:
                ((kft) this.a).b.a.a(5, (String) this.b);
                return;
        }
    }
}

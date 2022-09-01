package defpackage;

import android.content.Context;
import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hzb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hzb implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hzb(MaintenanceTaskRunner maintenanceTaskRunner, jls jlsVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.a = maintenanceTaskRunner;
        this.b = jlsVar;
    }

    public /* synthetic */ hzb(hyy hyyVar, jia jiaVar, int i) {
        this.c = i;
        this.b = hyyVar;
        this.a = jiaVar;
    }

    public /* synthetic */ hzb(hze hzeVar, hzd hzdVar, int i) {
        this.c = i;
        this.a = hzeVar;
        this.b = hzdVar;
    }

    public /* synthetic */ hzb(ixk ixkVar, Map map, int i) {
        this.c = i;
        this.b = ixkVar;
        this.a = map;
    }

    public /* synthetic */ hzb(jiq jiqVar, jig jigVar, int i) {
        this.c = i;
        this.a = jiqVar;
        this.b = jigVar;
    }

    public /* synthetic */ hzb(jiq jiqVar, jnd jndVar, int i) {
        this.c = i;
        this.b = jiqVar;
        this.a = jndVar;
    }

    public /* synthetic */ hzb(jjb jjbVar, jiq jiqVar, int i) {
        this.c = i;
        this.a = jjbVar;
        this.b = jiqVar;
    }

    public /* synthetic */ hzb(jjb jjbVar, jlq jlqVar, int i) {
        this.c = i;
        this.b = jjbVar;
        this.a = jlqVar;
    }

    public /* synthetic */ hzb(jkk jkkVar, PrintWriter printWriter, int i) {
        this.c = i;
        this.b = jkkVar;
        this.a = printWriter;
    }

    public /* synthetic */ hzb(jkk jkkVar, jig jigVar, int i) {
        this.c = i;
        this.a = jkkVar;
        this.b = jigVar;
    }

    public /* synthetic */ hzb(jkk jkkVar, jiq jiqVar, int i) {
        this.c = i;
        this.a = jkkVar;
        this.b = jiqVar;
    }

    public /* synthetic */ hzb(jls jlsVar, jls jlsVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.a = jlsVar;
        this.b = jlsVar2;
    }

    public /* synthetic */ hzb(jmi jmiVar, List list, int i, byte[] bArr) {
        this.c = i;
        this.b = jmiVar;
        this.a = list;
    }

    public /* synthetic */ hzb(jmi jmiVar, Set set, int i, byte[] bArr) {
        this.c = i;
        this.b = jmiVar;
        this.a = set;
    }

    public /* synthetic */ hzb(miy miyVar, jiq jiqVar, int i) {
        this.c = i;
        this.a = miyVar;
        this.b = jiqVar;
    }

    public /* synthetic */ hzb(nfh nfhVar, jhv jhvVar, int i) {
        this.c = i;
        this.a = nfhVar;
        this.b = jhvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, jkl] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, jkl] */
    /* JADX WARN: Type inference failed for: r9v9, types: [jlk, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        llp g;
        long a;
        Object obj2 = null;
        switch (this.c) {
            case 0:
                Object obj3 = this.a;
                Object obj4 = this.b;
                hyz hyzVar = ((jho) obj) != null ? ((hzd) obj4).d : ((hzd) obj4).c;
                hzd hzdVar = (hzd) obj4;
                ngz j = hzdVar.b.j();
                if ((j instanceof jhs) && hzdVar.f == null) {
                    obj2 = (jhs) j;
                } else {
                    leq leqVar = hzdVar.f;
                    if (leqVar != null) {
                        obj2 = leqVar.a(j);
                    }
                }
                if (obj2 == null) {
                    return kcu.J(new RuntimeException(String.format("cannot start download %s because there's no DataFileGroup in flags", hzdVar.a)));
                }
                return ((hze) obj3).c.b((jhs) obj2, hyzVar);
            case 1:
                Boolean bool = (Boolean) obj;
                return ((hyy) this.b).d.b((jia) this.a);
            case 2:
                Object obj5 = this.a;
                Object obj6 = this.b;
                Void r3 = (Void) obj;
                MaintenanceTaskRunner maintenanceTaskRunner = (MaintenanceTaskRunner) obj5;
                if (!((Boolean) maintenanceTaskRunner.d.get()).booleanValue()) {
                    return mkk.a;
                }
                jls jlsVar = maintenanceTaskRunner.f;
                final long currentTimeMillis = System.currentTimeMillis();
                final mko b = iwy.a.b();
                return kcu.X(b, mio.h(b, new hzb(jlsVar, (jls) obj6, 3, (byte[]) null, (byte[]) null, (byte[]) null), jlsVar.b)).a(new Callable() { // from class: iwa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        mko mkoVar = mko.this;
                        long j2 = currentTimeMillis;
                        gvt.a((ixe) kcu.S(mkoVar));
                        ieh.j().g(iwe.PERIODIC_TASK_DURATION, System.currentTimeMillis() - j2);
                        return null;
                    }
                }, jlsVar.b);
            case 3:
                Object obj7 = this.a;
                Object obj8 = this.b;
                ixe ixeVar = (ixe) obj;
                ifv ifvVar = (ifv) ijl.b().a(ifv.class);
                if (ifvVar == null) {
                    g = llp.q();
                } else {
                    llk e = llp.e();
                    for (Class cls : ifvVar.e(iwb.class)) {
                        ifw b2 = igr.d((Context) ((jls) obj7).a).b(cls);
                        iwb iwbVar = b2 instanceof iwb ? (iwb) b2 : null;
                        if (iwbVar != null) {
                            e.h(iwbVar.c(ixeVar));
                        }
                    }
                    g = e.g();
                }
                ArrayList arrayList = new ArrayList();
                int i = ((lrl) g).c;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(((isc) g.get(i2)).b((jls) obj8));
                }
                return kcu.G(arrayList);
            case 4:
                Object obj9 = this.b;
                ?? r2 = this.a;
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : r2.entrySet()) {
                    fwl a2 = fwm.a();
                    a2.e((String) entry.getKey());
                    a2.c((String) entry.getValue());
                    a2.a = ((String) entry.getKey()).hashCode();
                    fwm a3 = a2.a();
                    ixk ixkVar = (ixk) obj9;
                    arrayList2.add(mio.h(ixkVar.c(a3), cex.i, ixkVar.d));
                }
                return kcu.G(arrayList2);
            case 5:
                return ((jjb) this.a).g((jiq) this.b, (jig) obj, true);
            case 6:
                Object obj10 = this.b;
                jlq jlqVar = (jlq) this.a;
                jiq jiqVar = jlqVar.a;
                jjb jjbVar = (jjb) obj10;
                return jco.i(jjbVar.g(jiqVar, jlqVar.b, jiqVar.e), new iul((llk) obj, 13), jjbVar.d);
            case 7:
                Object obj11 = this.b;
                ?? r22 = this.a;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                ArrayList arrayList5 = new ArrayList();
                for (jit jitVar : (List) obj) {
                    if (!r22.contains(jitVar)) {
                        jmi jmiVar = (jmi) obj11;
                        arrayList5.add(jco.j(jmiVar.g.e(jitVar), new fem(jmiVar, arrayList4, jitVar, atomicInteger, 3, null), jmiVar.b));
                    } else {
                        jmi jmiVar2 = (jmi) obj11;
                        arrayList5.add(jco.i(((jli) jmiVar2.e).c(jitVar), new iul(arrayList3, 14), jmiVar2.b));
                    }
                }
                jmi jmiVar3 = (jmi) obj11;
                jmiVar3.c.k();
                arrayList5.add(jco.i(jco.i(jmiVar3.f.c(), new fyn(jmiVar3, new ArrayList(), 17, null), jmiVar3.b), new iul(arrayList3, 15), jmiVar3.b));
                return jez.p(arrayList5).a(new eid(jmiVar3, atomicInteger, arrayList4, arrayList3, 5, (byte[]) null), jmiVar3.b);
            case 8:
                Void r32 = (Void) obj;
                jmi jmiVar4 = (jmi) this.b;
                return jco.j(jmiVar4.f.m(this.a), new cex(12), jmiVar4.b);
            case 9:
                Object obj12 = this.a;
                Object obj13 = this.b;
                jig jigVar = (jig) obj;
                if (jigVar != null) {
                    int i3 = jigVar.e;
                    nfh nfhVar = (nfh) obj12;
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    mgy mgyVar = (mgy) nfhVar.b;
                    mgy mgyVar2 = mgy.h;
                    mgyVar.a |= 2;
                    mgyVar.c = i3;
                }
                int i4 = ((jhv) obj13).a.ap;
                mgy mgyVar3 = (mgy) ((nfh) obj12).cz();
                return mkk.a;
            case 10:
                ?? r1 = this.a;
                Object obj14 = this.b;
                jig jigVar2 = (jig) obj;
                if (jigVar2 == null) {
                    return mkk.a;
                }
                return r1.a(jlq.a((jiq) obj14, jigVar2));
            case 11:
                Object obj15 = this.b;
                Void r33 = (Void) obj;
                PrintWriter printWriter = (PrintWriter) this.a;
                printWriter.println("MDD_STALE_FILE_GROUPS:");
                jkk jkkVar = (jkk) obj15;
                return jkkVar.m(jkkVar.b.e(), new ivo(printWriter, 13));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj16 = this.a;
                Object obj17 = this.b;
                if (((jig) obj) == null) {
                    return mkk.a;
                }
                jiq jiqVar2 = (jiq) obj17;
                String str = jiqVar2.b;
                String str2 = jiqVar2.c;
                int i5 = jmk.a;
                jkk jkkVar2 = (jkk) obj16;
                return jkkVar2.m(jkkVar2.b.i(jiqVar2), new cex(19));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj18 = this.a;
                jig jigVar3 = (jig) obj;
                jiq jiqVar3 = (jiq) this.b;
                String str3 = jiqVar3.b;
                int i6 = jmk.a;
                jkk.v(jigVar3);
                jkk jkkVar3 = (jkk) obj18;
                return jkkVar3.m(jkkVar3.k(jigVar3, 0, jigVar3.m.size()), new cvr(jkkVar3, jiqVar3, jigVar3, 20));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return !((Boolean) obj).booleanValue() ? kcu.J(new IOException("Failed to write updated group: ".concat(String.valueOf(((jiq) this.b).b)))) : this.a;
            case 15:
                Object obj19 = this.a;
                Object obj20 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    jiq jiqVar4 = (jiq) obj19;
                    jmk.d("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", jiqVar4.b, jiqVar4.d);
                    return kcu.J(new IOException("Failed to remove pending group: ".concat(String.valueOf(jiqVar4.b))));
                }
                llp.r(obj20);
                return mkk.a;
            case 16:
                Object obj21 = this.a;
                String str4 = ((jig) this.b).c;
                return ((jkk) obj21).l(mkk.a, new iul((jkj) obj, 17));
            case 17:
                Object obj22 = this.a;
                Object obj23 = this.b;
                Void r4 = (Void) obj;
                if (obj23 != null) {
                    jkk jkkVar4 = (jkk) obj22;
                    return jkkVar4.m(jkkVar4.l(jkkVar4.b.c(), new iul(lmz.g(), 18)), new jki(jkkVar4, (jig) obj23, 3));
                }
                return mkk.a;
            case 18:
                Object obj24 = this.a;
                Object obj25 = this.b;
                jig jigVar4 = (jig) obj;
                if (jigVar4 == null || !jkk.r((jig) obj25, jigVar4)) {
                    a = ((jkk) obj24).d.a();
                } else {
                    jif jifVar = jigVar4.b;
                    if (jifVar == null) {
                        jifVar = jif.g;
                    }
                    a = jifVar.c;
                }
                jif jifVar2 = ((jig) obj25).b;
                if (jifVar2 == null) {
                    jifVar2 = jif.g;
                }
                nfh nfhVar2 = (nfh) jifVar2.N(5);
                nfhVar2.cG(jifVar2);
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                jif jifVar3 = (jif) nfhVar2.b;
                jifVar3.a = 2 | jifVar3.a;
                jifVar3.c = a;
                jif jifVar4 = (jif) nfhVar2.cz();
                nfm nfmVar = (nfm) obj25;
                nfh nfhVar3 = (nfh) nfmVar.N(5);
                nfhVar3.cG(nfmVar);
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                jig jigVar5 = (jig) nfhVar3.b;
                jifVar4.getClass();
                jigVar5.b = jifVar4;
                jigVar5.a |= 1;
                return kcu.K((jig) nfhVar3.cz());
            case 19:
                Object obj26 = this.a;
                Void r34 = (Void) obj;
                jig jigVar6 = (jig) this.b;
                if (lre.aD(jigVar6)) {
                    return ((jkk) obj26).c(jigVar6);
                }
                return mkk.a;
            default:
                jkk jkkVar5 = (jkk) this.a;
                return jkkVar5.l(jkkVar5.b.i((jiq) this.b), new iul((lfb) obj, 16));
        }
    }
}

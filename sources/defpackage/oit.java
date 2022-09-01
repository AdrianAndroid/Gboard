package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* renamed from: oit  reason: default package */
/* loaded from: classes2.dex */
final class oit extends nuc {
    static final nrx b = nrx.a("state-info");
    private static final nvu e = nvu.b.f("no subchannels ready");
    public final ntv c;
    private nsl g;
    public final Map d = new HashMap();
    private ois h = new oip(e);
    private final Random f = new Random();

    public oit(ntv ntvVar) {
        this.c = ntvVar;
    }

    public static nsz d(nsz nszVar) {
        return new nsz(nszVar.b, nry.a);
    }

    public static oir e(ntz ntzVar) {
        oir oirVar = (oir) ntzVar.a().c(b);
        jdg.Q(oirVar, "STATE_INFO");
        return oirVar;
    }

    private final void h(nsl nslVar, ois oisVar) {
        if (nslVar != this.g || !oisVar.b(this.h)) {
            this.c.d(nslVar, oisVar);
            this.g = nslVar;
            this.h = oisVar;
        }
    }

    private static final void i(ntz ntzVar) {
        ntzVar.d();
        e(ntzVar).a = nsm.a(nsl.SHUTDOWN);
    }

    @Override // defpackage.nuc
    public final void a(nvu nvuVar) {
        if (this.g != nsl.READY) {
            h(nsl.TRANSIENT_FAILURE, new oip(nvuVar));
        }
    }

    @Override // defpackage.nuc
    public final void b(nty ntyVar) {
        int i;
        List<nsz> list = ntyVar.a;
        Set keySet = this.d.keySet();
        int size = list.size();
        HashMap hashMap = new HashMap(size + size);
        for (nsz nszVar : list) {
            hashMap.put(d(nszVar), nszVar);
        }
        Set keySet2 = hashMap.keySet();
        HashSet<nsz> hashSet = new HashSet(keySet);
        hashSet.removeAll(keySet2);
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            nsz nszVar2 = (nsz) entry.getKey();
            nsz nszVar3 = (nsz) entry.getValue();
            ntz ntzVar = (ntz) this.d.get(nszVar2);
            if (ntzVar != null) {
                ntzVar.f(Collections.singletonList(nszVar3));
            } else {
                nrw a = nry.a();
                a.b(b, new oir(nsm.a(nsl.IDLE)));
                ntv ntvVar = this.c;
                List singletonList = Collections.singletonList(nszVar3);
                nry a2 = a.a();
                jdg.Q(a2, "attrs");
                ntz b2 = ntvVar.b(nxo.p(singletonList, a2, (Object[][]) Array.newInstance(Object.class, 0, 2)));
                b2.e(new oio(this, b2, 0));
                this.d.put(nszVar2, b2);
                b2.c();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (nsz nszVar4 : hashSet) {
            arrayList.add((ntz) this.d.remove(nszVar4));
        }
        g();
        int size2 = arrayList.size();
        for (i = 0; i < size2; i++) {
            i((ntz) arrayList.get(i));
        }
    }

    @Override // defpackage.nuc
    public final void c() {
        for (ntz ntzVar : f()) {
            i(ntzVar);
        }
        this.d.clear();
    }

    final Collection f() {
        return this.d.values();
    }

    public final void g() {
        Collection<ntz> f = f();
        ArrayList arrayList = new ArrayList(f.size());
        for (ntz ntzVar : f) {
            if (((nsm) e(ntzVar).a).a == nsl.READY) {
                arrayList.add(ntzVar);
            }
        }
        if (arrayList.isEmpty()) {
            nvu nvuVar = e;
            boolean z = false;
            for (ntz ntzVar2 : f()) {
                nsm nsmVar = (nsm) e(ntzVar2).a;
                nsl nslVar = nsmVar.a;
                if (nslVar == nsl.CONNECTING || nslVar == nsl.IDLE) {
                    z = true;
                }
                if (nvuVar == e || !nvuVar.k()) {
                    nvuVar = nsmVar.b;
                }
            }
            h(z ? nsl.CONNECTING : nsl.TRANSIENT_FAILURE, new oip(nvuVar));
            return;
        }
        h(nsl.READY, new oiq(arrayList, this.f.nextInt(arrayList.size())));
    }
}

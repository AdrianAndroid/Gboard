package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jkz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jkz implements leq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jkz(String str, int i) {
        this.c = i;
        this.b = str;
        this.a = "";
    }

    public /* synthetic */ jkz(String str, jiu jiuVar, int i) {
        this.c = i;
        this.a = str;
        this.b = jiuVar;
    }

    public /* synthetic */ jkz(jla jlaVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.b = jlaVar;
        this.a = atomicReference;
    }

    public /* synthetic */ jkz(jmn jmnVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.b = jmnVar;
        this.a = atomicReference;
    }

    public /* synthetic */ jkz(kiq kiqVar, oos oosVar, int i) {
        this.c = i;
        this.b = kiqVar;
        this.a = oosVar;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            Object obj2 = this.a;
            Object obj3 = this.b;
            jiw jiwVar = (jiw) obj;
            nfh nfhVar = (nfh) jiwVar.N(5);
            nfhVar.cG(jiwVar);
            nfhVar.db((String) obj2, (jiu) obj3);
            return (jiw) nfhVar.cz();
        } else if (i == 1) {
            Object obj4 = this.b;
            Object obj5 = this.a;
            jiw jiwVar2 = (jiw) obj;
            ArrayList arrayList = new ArrayList();
            nfh nfhVar2 = (nfh) jiwVar2.N(5);
            nfhVar2.cG(jiwVar2);
            for (String str : Collections.unmodifiableMap(jiwVar2.a).keySet()) {
                try {
                    arrayList.add(jez.C(str, ((jla) obj4).a));
                } catch (jms e) {
                    nfhVar2.dc(str);
                    jmk.h(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                    lfy.e("|").k(str).size();
                }
            }
            ((AtomicReference) obj5).set(arrayList);
            return (jiw) nfhVar2.cz();
        } else if (i == 2) {
            Object obj6 = this.b;
            Object obj7 = this.a;
            jis jisVar = (jis) obj;
            Long valueOf = Long.valueOf(((jmn) obj6).a.a());
            nhy nhyVar = jisVar.b;
            if (nhyVar == null) {
                nhyVar = nhy.c;
            }
            Long valueOf2 = Long.valueOf(niu.a(nhyVar));
            nfh nfhVar3 = (nfh) jisVar.N(5);
            nfhVar3.cG(jisVar);
            nhy b = niu.b(valueOf.longValue());
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            jis jisVar2 = (jis) nfhVar3.b;
            b.getClass();
            jisVar2.b = b;
            jisVar2.a |= 1;
            jis jisVar3 = (jis) nfhVar3.cz();
            if ((jisVar.a & 1) != 0) {
                ((AtomicReference) obj7).set(lfb.g(Integer.valueOf(mhq.m(TimeUnit.MILLISECONDS.toDays(jmn.d(valueOf.longValue()) - jmn.d(valueOf2.longValue()))))));
            }
            return jisVar3;
        } else if (i == 3) {
            Object obj8 = this.b;
            Object obj9 = this.a;
            kig kigVar = (kig) obj;
            nfh nfhVar4 = (nfh) kigVar.N(5);
            nfhVar4.cG(kigVar);
            nfj nfjVar = (nfj) nfhVar4;
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            kig kigVar2 = (kig) nfjVar.b;
            kig kigVar3 = kig.c;
            obj9.getClass();
            kigVar2.b = (oos) obj9;
            kigVar2.a |= 1;
            kiq kiqVar = (kiq) obj8;
            String[] strArr = {kiqVar.b.getClass().getName()};
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(kiqVar.a, LifeboatReceiver.class));
            intent.setPackage(kiqVar.a.getPackageName());
            intent.putExtra("Transmitters", strArr);
            intent.putExtra("MetricSnapshot", ((kig) nfjVar.cz()).q());
            kiqVar.a.sendBroadcast(intent);
            return null;
        } else {
            Object obj10 = this.b;
            Object obj11 = this.a;
            kkg kkgVar = (kkg) obj;
            kjv kjvVar = kko.a;
            kke kkeVar = kke.d;
            ngu nguVar = kkgVar.a;
            if (nguVar.containsKey(obj10)) {
                kkeVar = (kke) nguVar.get(obj10);
            }
            nfh nfhVar5 = (nfh) kkeVar.N(5);
            nfhVar5.cG(kkeVar);
            if (!Collections.unmodifiableList(((kke) nfhVar5.b).b).contains(obj11)) {
                nfhVar5.de((String) obj11);
            }
            nfh nfhVar6 = (nfh) kkgVar.N(5);
            nfhVar6.cG(kkgVar);
            if (nfhVar5.c) {
                nfhVar5.cD();
                nfhVar5.c = false;
            }
            kke kkeVar2 = (kke) nfhVar5.b;
            kkeVar2.a = 1 | kkeVar2.a;
            kkeVar2.c = (String) obj11;
            nfhVar6.df((String) obj10, (kke) nfhVar5.cz());
            return (kkg) nfhVar6.cz();
        }
    }
}

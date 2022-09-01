package defpackage;

import android.text.TextUtils;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eoj  reason: default package */
/* loaded from: classes.dex */
public final class eoj implements jqk {
    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        jav i;
        eod e;
        enq enqVar;
        enq enqVar2;
        lmz lmzVar = (lmz) jsqVar.a("language_tags");
        if (lmzVar == null || lmzVar.isEmpty()) {
            return jqj.d;
        }
        HashSet<juc> hashSet = new HashSet();
        lsz it = lmzVar.iterator();
        while (it.hasNext()) {
            jav javVar = (jav) it.next();
            Collection<juc> i2 = jqmVar.i();
            ArrayList arrayList = new ArrayList();
            if (!hgw.f(i2)) {
                ArrayList arrayList2 = new ArrayList(eod.values().length);
                for (int i3 = 0; i3 < eod.values().length; i3++) {
                    arrayList2.add(new LinkedHashMap());
                }
                for (juc jucVar : i2) {
                    jav f = eot.f(jucVar);
                    if (f != null && (e = eot.e(jucVar)) != eod.UNKNOWN) {
                        String b = jucVar.n().b("tpu_revisions", null);
                        if (b != null) {
                            if (((Boolean) ith.a.c()).booleanValue()) {
                                Set set = (Set) DesugarArrays.stream(b.split(",")).map(eoe.a).filter(dzj.f).collect(Collectors.toSet());
                                if (enq.g != null) {
                                    enqVar2 = enq.g;
                                } else {
                                    synchronized (enq.class) {
                                        if (enq.g == null) {
                                            try {
                                                String property = System.getProperty("ro.board.platform");
                                                if (TextUtils.isEmpty(property)) {
                                                    enq.g = enq.UNKNOWN;
                                                } else if (property.equals("gs201")) {
                                                    enq.g = enq.WHI_PRO;
                                                } else {
                                                    if (property.equals("gs101")) {
                                                        String property2 = System.getProperty("ro.boot.hw.soc.rev");
                                                        if (property2 == null) {
                                                            enq.g = enq.UNKNOWN;
                                                        } else {
                                                            int parseInt = Integer.parseInt(property2);
                                                            enqVar = parseInt != 0 ? parseInt != 1 ? parseInt != 2 ? parseInt != 3 ? enq.UNKNOWN : enq.WHI_B1 : enq.WHI_B0 : enq.WHI_A1 : enq.WHI_A0;
                                                        }
                                                    } else {
                                                        enqVar = enq.UNKNOWN;
                                                    }
                                                    enq.g = enqVar;
                                                }
                                            } catch (NumberFormatException | SecurityException unused) {
                                                enq.g = enq.UNKNOWN;
                                            }
                                        }
                                    }
                                    enqVar2 = enq.g;
                                }
                                if (set.contains(enqVar2.h)) {
                                }
                            } else {
                                continue;
                            }
                        }
                        Map.EL.merge((java.util.Map) arrayList2.get(e.ordinal()), f, jucVar, hzk.b);
                    }
                }
                for (int i4 = 1; i4 < arrayList2.size(); i4++) {
                    eod eodVar = eod.values()[i4];
                    if (eot.g(eodVar)) {
                        java.util.Map map = (java.util.Map) arrayList2.get(i4);
                        juc jucVar2 = (juc) map.get(javVar);
                        if (jucVar2 != null) {
                            arrayList.add(jucVar2);
                        } else if (eot.h(eodVar) == 1 && (i = javVar.i(map.keySet())) != null) {
                            arrayList.add((juc) map.get(i));
                        }
                    }
                }
            }
            hashSet.addAll(arrayList);
        }
        jqi e2 = jqj.e();
        for (juc jucVar3 : hashSet) {
            juf g = jug.g();
            g.f(jucVar3);
            g.g(2);
            g.d(1);
            g.c(2);
            e2.c(g.a());
        }
        return e2.a();
    }
}

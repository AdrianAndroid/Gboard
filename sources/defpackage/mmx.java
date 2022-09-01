package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: mmx  reason: default package */
/* loaded from: classes2.dex */
public final class mmx extends mmo implements mny {
    private static final moi c = mnh.b;
    private final List f;
    private final mnc g;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    public final AtomicReference b = new AtomicReference();

    public mmx(Iterable iterable, Collection collection) {
        mnc mncVar = new mnc();
        this.g = mncVar;
        ArrayList<mmr> arrayList = new ArrayList();
        arrayList.add(mmr.d(mncVar, mnc.class, moc.class, mob.class));
        arrayList.add(mmr.d(this, mny.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mmr mmrVar = (mmr) it.next();
            if (mmrVar != null) {
                arrayList.add(mmrVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            arrayList2.add(obj);
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    mmu mmuVar = (mmu) ((moi) it2.next()).a();
                    if (mmuVar != null) {
                        arrayList.addAll(mmuVar.getComponents());
                        it2.remove();
                    }
                } catch (mnd e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.a.isEmpty()) {
                msc.m(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.a.keySet());
                arrayList4.addAll(arrayList);
                msc.m(arrayList4);
            }
            for (mmr mmrVar2 : arrayList) {
                this.a.put(mmrVar2, new mne(new mmv(this, mmrVar2, 0)));
            }
            ArrayList arrayList5 = new ArrayList();
            for (mmr mmrVar3 : arrayList) {
                if (mmrVar3.e()) {
                    moi moiVar = (moi) this.a.get(mmrVar3);
                    for (Class cls : mmrVar3.a) {
                        if (!this.d.containsKey(cls)) {
                            this.d.put(cls, moiVar);
                        } else {
                            arrayList5.add(new kht((mni) ((moi) this.d.get(cls)), moiVar, 13));
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                mmr mmrVar4 = (mmr) entry.getKey();
                if (!mmrVar4.e()) {
                    moi moiVar2 = (moi) entry.getValue();
                    for (Class cls2 : mmrVar4.a) {
                        if (!hashMap.containsKey(cls2)) {
                            hashMap.put(cls2, new HashSet());
                        }
                        ((Set) hashMap.get(cls2)).add(moiVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!this.e.containsKey(entry2.getKey())) {
                    this.e.put((Class) entry2.getKey(), mnf.b((Collection) entry2.getValue()));
                } else {
                    mnf mnfVar = (mnf) this.e.get(entry2.getKey());
                    for (moi moiVar3 : (Set) entry2.getValue()) {
                        arrayList6.add(new kht(mnfVar, moiVar3, 14));
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            for (mmr mmrVar5 : this.a.keySet()) {
                for (mmz mmzVar : mmrVar5.b) {
                    if (!mmzVar.d() || this.e.containsKey(mmzVar.a)) {
                        if (this.d.containsKey(mmzVar.a)) {
                            continue;
                        } else if (mmzVar.b == 1) {
                            throw new mng(String.format("Unsatisfied dependency for component %s: %s", mmrVar5, mmzVar.a));
                        } else {
                            if (!mmzVar.d()) {
                                this.d.put(mmzVar.a, new mni(mni.a));
                            }
                        }
                    } else {
                        this.e.put(mmzVar.a, mnf.b(Collections.emptySet()));
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList3.get(i)).run();
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            Map map = this.a;
            bool.booleanValue();
            e(map);
        }
    }

    @Override // defpackage.mms
    public final synchronized moi c(Class cls) {
        return (moi) this.d.get(cls);
    }

    @Override // defpackage.mms
    public final synchronized moi d(Class cls) {
        mnf mnfVar = (mnf) this.e.get(cls);
        if (mnfVar != null) {
            return mnfVar;
        }
        return c;
    }

    public final void e(Map map) {
        Queue<mnz> queue;
        for (Map.Entry entry : map.entrySet()) {
            mmr mmrVar = (mmr) entry.getKey();
            moi moiVar = (moi) entry.getValue();
        }
        mnc mncVar = this.g;
        synchronized (mncVar) {
            queue = mncVar.a;
            if (queue != null) {
                mncVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (mnz mnzVar : queue) {
                mnzVar.getClass();
                synchronized (mncVar) {
                    Queue queue2 = mncVar.a;
                    if (queue2 != null) {
                        queue2.add(mnzVar);
                    } else {
                        for (Map.Entry entry2 : mncVar.a()) {
                            ((Executor) entry2.getValue()).execute(new kvl(entry2, 13));
                        }
                    }
                }
            }
        }
    }
}

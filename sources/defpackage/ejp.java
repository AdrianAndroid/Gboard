package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: ejp  reason: default package */
/* loaded from: classes.dex */
public final class ejp {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/universalmedia/RecentEmojiFetcher");
    public static final llp b = llp.x("😀", "😁", "😂", "🤣", "😃", "😄", "😅", "😆", "😉", "😊", "😋", "😎", "😍", "😘", "🥰", "😗");
    public final ejo c;
    private final cpu d;

    public ejp(cpu cpuVar, ejo ejoVar) {
        this.d = cpuVar;
        this.c = ejoVar;
    }

    public static String[] b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (str != null && hashSet.add(str)) {
                arrayList2.add(str);
            }
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public final void a() {
        hiz b2 = this.d.b(50L);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new ehz(this, 4));
        e2.h(new ehz(this, 5));
        b2.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
    }
}

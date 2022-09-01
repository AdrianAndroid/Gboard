package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cfe  reason: default package */
/* loaded from: classes.dex */
public final class cfe implements jqd {
    private static final lug b = lug.i("SuperDelight");
    private final cfd c;

    public cfe(cfd cfdVar) {
        this.c = cfdVar;
    }

    @Override // defpackage.jqd
    public final Collection a(Collection collection, Collection collection2) {
        List<Locale> q;
        boolean z;
        ((luc) ((luc) b.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightMergingStrategy", "merge", 55, "SuperDelightMergingStrategy.java")).G("SuperDelightMergingStrategy#merge(): selected[%s] synced[%s]", collection, collection2);
        try {
            q = cfd.n();
            z = false;
        } catch (cen e) {
            q = llp.q();
            ((luc) ((luc) ((luc) b.c()).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightMergingStrategy", "merge", 'E', "SuperDelightMergingStrategy.java")).t("SuperDelightMergingStrategy#merge()");
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        lta listIterator = ((llp) collection2).listIterator();
        while (listIterator.hasNext()) {
            juc jucVar = (juc) listIterator.next();
            Locale g = cei.g(jucVar);
            if (g != null) {
                arrayList2.add(jucVar);
                arrayList.add(g);
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            juc jucVar2 = (juc) it.next();
            Locale g2 = cei.g(jucVar2);
            if (g2 != null) {
                if (!((jqx) ((bzr) this.c.j).k.get()).f.h(jucVar2.o()).exists()) {
                    ((luc) ((luc) b.c()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightMergingStrategy", "merge", 94, "SuperDelightMergingStrategy.java")).w("%s does not exists", jucVar2);
                } else if (!arrayList.contains(g2)) {
                    if (!z && !q.contains(g2)) {
                        for (Locale locale : q) {
                            if (TextUtils.equals(locale.getLanguage(), g2.getLanguage())) {
                                arrayList2.add(jucVar2);
                                arrayList.add(g2);
                                break;
                                break;
                            }
                        }
                    } else {
                        arrayList2.add(jucVar2);
                        arrayList.add(g2);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public final String toString() {
        return "SuperDelightMergingStrategy";
    }
}

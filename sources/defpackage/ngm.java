package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ngm  reason: default package */
/* loaded from: classes2.dex */
final class ngm extends ngo {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    static List a(Object obj, long j) {
        return (List) nih.h(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List e(Object obj, long j, int i) {
        ngk ngkVar;
        List arrayList;
        List a = a(obj, j);
        if (a.isEmpty()) {
            if (a instanceof ngl) {
                arrayList = new ngk(i);
            } else if (!(a instanceof nhg) || !(a instanceof nga)) {
                arrayList = new ArrayList(i);
            } else {
                arrayList = ((nga) a).e(i);
            }
            nih.u(obj, j, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(a.getClass())) {
            ArrayList arrayList2 = new ArrayList(a.size() + i);
            arrayList2.addAll(a);
            nih.u(obj, j, arrayList2);
            ngkVar = arrayList2;
        } else if (a instanceof nid) {
            ngk ngkVar2 = new ngk(a.size() + i);
            ngkVar2.addAll((nid) a);
            nih.u(obj, j, ngkVar2);
            ngkVar = ngkVar2;
        } else if (!(a instanceof nhg) || !(a instanceof nga)) {
            return a;
        } else {
            nga ngaVar = (nga) a;
            if (ngaVar.c()) {
                return a;
            }
            nga e = ngaVar.e(a.size() + i);
            nih.u(obj, j, e);
            return e;
        }
        return ngkVar;
    }

    @Override // defpackage.ngo
    public final List b(Object obj, long j) {
        return e(obj, j, 10);
    }

    @Override // defpackage.ngo
    public final void c(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) nih.h(obj, j);
        if (list instanceof ngl) {
            unmodifiableList = ((ngl) list).d();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof nhg) || !(list instanceof nga)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                nga ngaVar = (nga) list;
                if (!ngaVar.c()) {
                    return;
                }
                ngaVar.b();
                return;
            }
        }
        nih.u(obj, j, unmodifiableList);
    }

    @Override // defpackage.ngo
    public final void d(Object obj, Object obj2, long j) {
        List a = a(obj2, j);
        List e = e(obj, j, a.size());
        int size = e.size();
        int size2 = a.size();
        if (size > 0 && size2 > 0) {
            e.addAll(a);
        }
        if (size > 0) {
            a = e;
        }
        nih.u(obj, j, a);
    }
}

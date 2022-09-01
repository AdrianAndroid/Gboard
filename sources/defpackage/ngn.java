package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: ngn  reason: default package */
/* loaded from: classes2.dex */
final class ngn extends ngo {
    static nga a(Object obj, long j) {
        return (nga) nih.h(obj, j);
    }

    @Override // defpackage.ngo
    public final List b(Object obj, long j) {
        nga a = a(obj, j);
        if (!a.c()) {
            int size = a.size();
            nga e = a.e(size == 0 ? 10 : size + size);
            nih.u(obj, j, e);
            return e;
        }
        return a;
    }

    @Override // defpackage.ngo
    public final void c(Object obj, long j) {
        a(obj, j).b();
    }

    @Override // defpackage.ngo
    public final void d(Object obj, Object obj2, long j) {
        nga a = a(obj, j);
        nga a2 = a(obj2, j);
        int size = a.size();
        int size2 = a2.size();
        if (size > 0 && size2 > 0) {
            if (!a.c()) {
                a = a.e(size2 + size);
            }
            a.addAll(a2);
        }
        if (size > 0) {
            a2 = a;
        }
        nih.u(obj, j, a2);
    }
}

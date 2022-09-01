package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lls  reason: default package */
/* loaded from: classes.dex */
public class lls {
    Object[] a;
    int b;
    kcq c;

    public lls() {
        this(4);
    }

    private final llw b(boolean z) {
        kcq kcqVar;
        kcq kcqVar2;
        if (!z || (kcqVar2 = this.c) == null) {
            lrq r = lrq.r(this.b, this.a, this);
            if (z && (kcqVar = this.c) != null) {
                throw kcqVar.j();
            }
            return r;
        }
        throw kcqVar2.j();
    }

    private final void e(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, llf.a(length, i2));
        }
    }

    public void a(Object obj, Object obj2) {
        e(this.b + 1);
        jez.U(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final llw f() {
        return b(false);
    }

    public final void g(Map.Entry entry) {
        a(entry.getKey(), entry.getValue());
    }

    public final void h(lls llsVar) {
        jdg.u(llsVar);
        e(this.b + llsVar.b);
        Object[] objArr = llsVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = llsVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += llsVar.b;
    }

    public final void i(Iterable iterable) {
        if (iterable instanceof Collection) {
            e(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g((Map.Entry) it.next());
        }
    }

    public final void j(Map map) {
        i(map.entrySet());
    }

    @Deprecated
    public llw k() {
        return l();
    }

    public llw l() {
        return b(true);
    }

    public lls(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}

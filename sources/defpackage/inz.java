package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: inz  reason: default package */
/* loaded from: classes.dex */
public abstract class inz {
    private final Class a;
    public final imt g;

    /* JADX INFO: Access modifiers changed from: protected */
    public inz(Class cls, imt imtVar) {
        this.a = cls;
        this.g = imtVar;
    }

    private final void g(Object obj, int i) {
        Object b = this.g.b(i);
        lrv lrvVar = this.g.b;
        a(obj);
        h(b, lrvVar);
        b();
    }

    private final void h(Object obj, lqr lqrVar) {
        d(obj);
        for (Object obj2 : ((ljl) lqrVar).b(obj)) {
            c(obj2);
            if (this.a.isAssignableFrom(obj2.getClass())) {
                h(obj2, lqrVar);
            } else {
                String string = this.g.a(obj2).getString("PREFERENCE_FRAGMENT");
                if (!TextUtils.isEmpty(string)) {
                    g(obj2, f(string));
                }
            }
        }
        e(obj);
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    protected abstract void c(Object obj);

    protected void d(Object obj) {
    }

    protected void e(Object obj) {
    }

    protected abstract int f(String str);

    public final void i(int i) {
        g(null, i);
    }
}

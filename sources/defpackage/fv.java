package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fv  reason: default package */
/* loaded from: classes.dex */
public final class fv {
    aam b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final aan f = new fu(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (!this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aqq) arrayList.get(i)).i();
        }
        this.c = false;
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aqq aqqVar = (aqq) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                aqqVar.k(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) ((WeakReference) aqqVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                aqqVar.l(this.f);
            }
            View view2 = (View) ((WeakReference) aqqVar.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c() {
        if (!this.c) {
            this.d = 250L;
        }
    }

    public final void d(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
    }

    public final void e(aam aamVar) {
        if (!this.c) {
            this.b = aamVar;
        }
    }

    public final void f(aqq aqqVar) {
        if (!this.c) {
            this.a.add(aqqVar);
        }
    }
}

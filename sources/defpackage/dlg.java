package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import j$.util.Objects;
import j$.util.OptionalInt;
import j$.util.function.IntPredicate;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dlg  reason: default package */
/* loaded from: classes.dex */
public final class dlg extends ls implements dlc {
    public dlb d;
    public RecyclerView e;
    dlf f;
    private final deb i;
    private final int j;
    private final int k;
    private final Context l;
    private final int m;
    private final List h = new ArrayList();
    final dz g = new dld(this);
    private final View.OnLayoutChangeListener n = new dkr(this, 2);

    public dlg(Context context, deb debVar, int i, int i2, int i3) {
        this.l = context;
        this.i = debVar;
        this.j = i;
        this.k = i2;
        this.m = i3;
    }

    @Override // defpackage.ddw
    public final boolean D() {
        return false;
    }

    @Override // defpackage.ddw
    public final boolean E() {
        throw null;
    }

    @Override // defpackage.ded
    public final boolean F(hln hlnVar) {
        OptionalInt findFirst;
        final dlf dlfVar = this.f;
        if (dlfVar == null || hlnVar == null) {
            return false;
        }
        do {
            final int indexOf = dlfVar.a.indexOf(hlnVar);
            if (indexOf < 0) {
                findFirst = OptionalInt.empty();
            } else {
                findFirst = IntStream.CC.range(0, dlfVar.b.size()).filter(new IntPredicate() { // from class: dle
                    @Override // j$.util.function.IntPredicate
                    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                        return Objects.requireNonNull(intPredicate);
                    }

                    @Override // j$.util.function.IntPredicate
                    /* renamed from: negate */
                    public final /* synthetic */ IntPredicate mo33negate() {
                        return IntPredicate.CC.$default$negate(this);
                    }

                    @Override // j$.util.function.IntPredicate
                    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                        return Objects.requireNonNull(intPredicate);
                    }

                    @Override // j$.util.function.IntPredicate
                    public final boolean test(int i) {
                        return ((Integer) dlf.this.b.get(i)).intValue() >= indexOf;
                    }
                }).findFirst();
            }
            if (findFirst.isPresent()) {
                break;
            }
        } while (dlfVar.d());
        if (!findFirst.isPresent()) {
            return false;
        }
        RecyclerView recyclerView = this.e;
        if (recyclerView == null) {
            return true;
        }
        ly lyVar = recyclerView.m;
        if (!(lyVar instanceof LinearLayoutManager)) {
            return true;
        }
        ((LinearLayoutManager) lyVar).ab(findFirst.getAsInt(), 0);
        return true;
    }

    @Override // defpackage.dlc
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ddw
    public final int b() {
        return this.h.size();
    }

    @Override // defpackage.dlc
    public final int c() {
        return -1;
    }

    @Override // defpackage.ls
    public final /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = new LinearLayout(this.l);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, this.k));
        return new mo(linearLayout);
    }

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        return null;
    }

    @Override // defpackage.ded
    public final hln g() {
        return null;
    }

    @Override // defpackage.ded
    public final hln h() {
        return null;
    }

    @Override // defpackage.ls
    public final int ha() {
        dlf dlfVar = this.f;
        if (dlfVar != null) {
            return dlfVar.b.size();
        }
        return 0;
    }

    @Override // defpackage.ls
    public final void hb(RecyclerView recyclerView) {
        this.e = recyclerView;
        recyclerView.az(this.g);
        recyclerView.addOnLayoutChangeListener(this.n);
        y();
    }

    @Override // defpackage.ls
    public final void hc(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.n);
        recyclerView.aC(this.g);
        this.e = null;
    }

    @Override // defpackage.dlc
    public final void hd(dlb dlbVar) {
        this.d = dlbVar;
    }

    @Override // defpackage.ddw
    public final SoftKeyView i() {
        return null;
    }

    @Override // defpackage.ddw
    public final List k(List list) {
        throw null;
    }

    @Override // defpackage.ddw
    public final void l(List list) {
        this.h.addAll(list);
        y();
    }

    @Override // defpackage.ded
    public final void n() {
        this.h.clear();
        dlf dlfVar = this.f;
        if (dlfVar != null) {
            dlfVar.c();
        }
        this.f = null;
        hl(0, ha());
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        dlf dlfVar = this.f;
        if (dlfVar == null || this.e == null) {
            moVar.D(llp.q(), this.i, mhe.a);
        } else {
            moVar.D(this.h.subList(dlfVar.a(i), this.f.a(i + 1)), this.i, (mhe) this.f.c.get(i));
        }
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void t(mo moVar) {
        deb debVar = this.i;
        for (int i = 0; i < moVar.C().getChildCount(); i++) {
            debVar.k((SoftKeyView) moVar.C().getChildAt(i));
        }
        moVar.C().removeAllViews();
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
    }

    @Override // defpackage.ded
    public final void w(float f) {
        this.i.f = f;
    }

    @Override // defpackage.ddw
    public final void x(ddv ddvVar) {
        throw null;
    }

    public final void y() {
        dlf dlfVar = this.f;
        if (dlfVar != null) {
            dlfVar.c();
        }
        hl(0, ha());
        RecyclerView recyclerView = this.e;
        if (recyclerView == null || recyclerView.getWidth() <= 0) {
            return;
        }
        dlf dlfVar2 = new dlf(llp.o(this.h), this, this.i, this.e.getWidth() / this.j, this.m, this.e.getWidth());
        dlfVar2.b(2);
        this.f = dlfVar2;
    }
}

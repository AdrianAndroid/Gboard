package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: lv  reason: default package */
/* loaded from: classes.dex */
public final class lv {
    private static TimeInterpolator n;
    public ArrayList a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public opu l;
    private final ArrayList m;

    public lv(byte[] bArr) {
        this();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    public static void c(mo moVar) {
        int i = moVar.j;
        if (!moVar.t() && (i & 4) == 0) {
            int i2 = moVar.d;
            moVar.a();
        }
    }

    public static void j(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((mo) list.get(size)).a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public static final yx k() {
        return new yx();
    }

    public static final yx l(mo moVar) {
        yx k = k();
        k.d(moVar);
        return k;
    }

    private final void n(List list, mo moVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                jz jzVar = (jz) list.get(size);
                if (p(jzVar, moVar) && jzVar.a == null && jzVar.b == null) {
                    list.remove(jzVar);
                }
            } else {
                return;
            }
        }
    }

    private final void o(jz jzVar) {
        mo moVar = jzVar.a;
        if (moVar != null) {
            p(jzVar, moVar);
        }
        mo moVar2 = jzVar.b;
        if (moVar2 != null) {
            p(jzVar, moVar2);
        }
    }

    private final boolean p(jz jzVar, mo moVar) {
        if (jzVar.b == moVar) {
            jzVar.b = null;
        } else if (jzVar.a != moVar) {
            return false;
        } else {
            jzVar.a = null;
        }
        moVar.a.setAlpha(1.0f);
        moVar.a.setTranslationX(0.0f);
        moVar.a.setTranslationY(0.0f);
        a(moVar);
        return true;
    }

    public final void a(mo moVar) {
        opu opuVar = this.l;
        if (opuVar != null) {
            boolean z = true;
            moVar.n(true);
            if (moVar.h != null && moVar.i == null) {
                moVar.h = null;
            }
            moVar.i = null;
            if ((moVar.j & 16) != 0) {
                return;
            }
            Object obj = opuVar.a;
            View view = moVar.a;
            RecyclerView recyclerView = (RecyclerView) obj;
            recyclerView.af();
            jr jrVar = recyclerView.h;
            int C = jrVar.c.C(view);
            if (C == -1) {
                jrVar.l(view);
            } else if (jrVar.a.f(C)) {
                jrVar.a.g(C);
                jrVar.l(view);
                jrVar.c.F(C);
            } else {
                z = false;
            }
            if (z) {
                mo j = RecyclerView.j(view);
                recyclerView.e.n(j);
                recyclerView.e.l(j);
            }
            recyclerView.ag(!z);
            if (z || !moVar.x()) {
                return;
            }
            ((RecyclerView) opuVar.a).removeDetachedView(moVar.a, false);
        }
    }

    public final void b() {
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            ((lu) this.m.get(i)).a();
        }
        this.m.clear();
    }

    public final void d() {
        if (!i()) {
            b();
        }
    }

    public final void e(mo moVar) {
        View view = moVar.a;
        view.animate().cancel();
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ka) this.c.get(size)).a == moVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                a(moVar);
                this.c.remove(size);
            }
        }
        n(this.d, moVar);
        if (this.a.remove(moVar)) {
            view.setAlpha(1.0f);
            a(moVar);
        }
        if (this.b.remove(moVar)) {
            view.setAlpha(1.0f);
            a(moVar);
        }
        int size2 = this.g.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.g.get(size2);
            n(arrayList, moVar);
            if (arrayList.isEmpty()) {
                this.g.remove(size2);
            }
        }
        int size3 = this.f.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((ka) arrayList2.get(size4)).a == moVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    a(moVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f.remove(size3);
                    }
                }
            }
        }
        int size5 = this.e.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.e.get(size5);
                if (arrayList3.remove(moVar)) {
                    view.setAlpha(1.0f);
                    a(moVar);
                    if (arrayList3.isEmpty()) {
                        this.e.remove(size5);
                    }
                }
            } else {
                this.j.remove(moVar);
                this.h.remove(moVar);
                this.k.remove(moVar);
                this.i.remove(moVar);
                d();
                return;
            }
        }
    }

    public final void f() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ka kaVar = (ka) this.c.get(size);
            View view = kaVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            a(kaVar.a);
            this.c.remove(size);
        }
        int size2 = this.a.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a((mo) this.a.get(size2));
            this.a.remove(size2);
        }
        int size3 = this.b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            mo moVar = (mo) this.b.get(size3);
            moVar.a.setAlpha(1.0f);
            a(moVar);
            this.b.remove(size3);
        }
        int size4 = this.d.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            o((jz) this.d.get(size4));
        }
        this.d.clear();
        if (!i()) {
            return;
        }
        int size5 = this.f.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.f.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    ka kaVar2 = (ka) arrayList.get(size6);
                    View view2 = kaVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    a(kaVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.e.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.e.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    mo moVar2 = (mo) arrayList2.get(size8);
                    moVar2.a.setAlpha(1.0f);
                    a(moVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.e.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.g.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.g.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        o((jz) arrayList3.get(size10));
                        if (arrayList3.isEmpty()) {
                            this.g.remove(arrayList3);
                        }
                    }
                }
            } else {
                j(this.j);
                j(this.i);
                j(this.h);
                j(this.k);
                b();
                return;
            }
        }
    }

    public final void g(mo moVar) {
        if (n == null) {
            n = new ValueAnimator().getInterpolator();
        }
        moVar.a.animate().setInterpolator(n);
        e(moVar);
    }

    public final boolean h(mo moVar, int i, int i2, int i3, int i4) {
        View view = moVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) moVar.a.getTranslationY());
        g(moVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                a(moVar);
                return false;
            }
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.c.add(new ka(moVar, translationX, translationY, i3, i4));
        return true;
    }

    public final boolean i() {
        return !this.b.isEmpty() || !this.d.isEmpty() || !this.c.isEmpty() || !this.a.isEmpty() || !this.i.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.k.isEmpty() || !this.f.isEmpty() || !this.e.isEmpty() || !this.g.isEmpty();
    }

    public final boolean m(mo moVar, mo moVar2, yx yxVar, yx yxVar2) {
        int i;
        int i2;
        int i3 = yxVar.b;
        int i4 = yxVar.a;
        if (moVar2.A()) {
            int i5 = yxVar.b;
            i2 = yxVar.a;
            i = i5;
        } else {
            i = yxVar2.b;
            i2 = yxVar2.a;
        }
        if (moVar == moVar2) {
            return h(moVar, i3, i4, i, i2);
        }
        float translationX = moVar.a.getTranslationX();
        float translationY = moVar.a.getTranslationY();
        float alpha = moVar.a.getAlpha();
        g(moVar);
        int i6 = (int) ((i - i3) - translationX);
        int i7 = (int) ((i2 - i4) - translationY);
        moVar.a.setTranslationX(translationX);
        moVar.a.setTranslationY(translationY);
        moVar.a.setAlpha(alpha);
        if (moVar2 != null) {
            g(moVar2);
            moVar2.a.setTranslationX(-i6);
            moVar2.a.setTranslationY(-i7);
            moVar2.a.setAlpha(0.0f);
        }
        this.d.add(new jz(moVar, moVar2, i3, i4, i, i2));
        return true;
    }

    public lv() {
        this.l = null;
        this.m = new ArrayList();
    }
}

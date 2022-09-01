package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import j$.util.Collection$EL;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cuj  reason: default package */
/* loaded from: classes.dex */
public final class cuj extends ls {
    private final Context e;
    private final LayoutInflater f;
    private final llw g;
    private final llw h;
    private final ot j;
    public final List d = new ArrayList();
    private final List i = new ArrayList();

    public cuj(Context context, LayoutInflater layoutInflater, llw llwVar, ot otVar) {
        this.e = context;
        this.f = layoutInflater;
        this.j = otVar;
        lls h = llw.h();
        lls h2 = llw.h();
        lsz it = llwVar.entrySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int b = ((cuw) entry.getValue()).b();
            int i2 = i + b;
            ewj ewjVar = new ewj((cuw) entry.getValue(), i, i2 - 1);
            for (int i3 = 0; i3 < b; i3++) {
                h.a(Integer.valueOf(i + i3), ewjVar);
            }
            h2.a((Class) entry.getKey(), ewjVar);
            i = i2;
        }
        this.g = h.l();
        this.h = h2.l();
    }

    private final void P(List list, List list2) {
        fg a;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        fh fhVar;
        fi fiVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        fh fhVar2;
        lcv lcvVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        cup cupVar = new cup(list, list2);
        int b = cupVar.b();
        int a2 = cupVar.a();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new fh(b, a2));
        int i11 = b + a2;
        int i12 = 1;
        int i13 = 2;
        int i14 = (i11 + 1) / 2;
        int i15 = i14 + i14 + 1;
        int[] iArr = new int[i15];
        int i16 = i15 >> 1;
        int[] iArr2 = new int[i15];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            fh fhVar3 = (fh) arrayList6.remove(arrayList6.size() - 1);
            if (fhVar3.b() > 0 && fhVar3.a() > 0) {
                int b2 = ((fhVar3.b() + fhVar3.a()) + i12) / i13;
                int i17 = i16 + 1;
                iArr[i17] = fhVar3.a;
                iArr2[i17] = fhVar3.b;
                int i18 = 0;
                while (i18 < b2) {
                    int abs = Math.abs(fhVar3.b() - fhVar3.a()) % i13;
                    int b3 = fhVar3.b() - fhVar3.a();
                    int i19 = -i18;
                    int i20 = i19;
                    while (true) {
                        if (i20 > i18) {
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            i3 = b2;
                            fiVar = null;
                            break;
                        }
                        if (i20 != i19 && (i20 == i18 || iArr[i20 + 1 + i16] <= iArr[(i20 - 1) + i16])) {
                            i7 = iArr[(i20 - 1) + i16];
                            i8 = i7 + 1;
                        } else {
                            i7 = iArr[i20 + 1 + i16];
                            i8 = i7;
                        }
                        i3 = b2;
                        arrayList = arrayList6;
                        int i21 = (fhVar3.c + (i8 - fhVar3.a)) - i20;
                        if (i18 == 0 || i8 != i7) {
                            arrayList2 = arrayList7;
                            i9 = i21;
                        } else {
                            i9 = i21 - 1;
                            arrayList2 = arrayList7;
                        }
                        while (i8 < fhVar3.b && i21 < fhVar3.d && cupVar.d(i8, i21)) {
                            i8++;
                            i21++;
                        }
                        iArr[i20 + i16] = i8;
                        if (abs == 1) {
                            int i22 = b3 - i20;
                            i10 = abs;
                            if (i22 >= i19 + 1 && i22 <= i18 - 1 && iArr2[i22 + i16] <= i8) {
                                fiVar = new fi();
                                fiVar.a = i7;
                                fiVar.b = i9;
                                fiVar.c = i8;
                                fiVar.d = i21;
                                fiVar.e = false;
                                break;
                            }
                        } else {
                            i10 = abs;
                        }
                        i20 += 2;
                        b2 = i3;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        abs = i10;
                    }
                    if (fiVar != null) {
                        fhVar = fhVar3;
                        break;
                    }
                    int b4 = (fhVar3.b() - fhVar3.a()) % 2;
                    int b5 = fhVar3.b() - fhVar3.a();
                    int i23 = i19;
                    while (true) {
                        if (i23 > i18) {
                            fhVar = fhVar3;
                            fiVar = null;
                            break;
                        }
                        if (i23 != i19 && (i23 == i18 || iArr2[i23 + 1 + i16] >= iArr2[(i23 - 1) + i16])) {
                            i4 = iArr2[(i23 - 1) + i16];
                            i5 = i4 - 1;
                        } else {
                            i4 = iArr2[i23 + 1 + i16];
                            i5 = i4;
                        }
                        int i24 = fhVar3.d - ((fhVar3.b - i5) - i23);
                        int i25 = (i18 == 0 || i5 != i4) ? i24 : i24 + 1;
                        while (i5 > fhVar3.a && i24 > fhVar3.c) {
                            int i26 = i5 - 1;
                            fhVar = fhVar3;
                            int i27 = i24 - 1;
                            if (!cupVar.d(i26, i27)) {
                                break;
                            }
                            i24 = i27;
                            i5 = i26;
                            fhVar3 = fhVar;
                        }
                        fhVar = fhVar3;
                        iArr2[i23 + i16] = i5;
                        if (b4 == 0 && (i6 = b5 - i23) >= i19 && i6 <= i18 && iArr[i6 + i16] >= i5) {
                            fi fiVar2 = new fi();
                            fiVar2.a = i5;
                            fiVar2.b = i24;
                            fiVar2.c = i4;
                            fiVar2.d = i25;
                            fiVar2.e = true;
                            fiVar = fiVar2;
                            break;
                        }
                        i23 += 2;
                        fhVar3 = fhVar;
                    }
                    if (fiVar != null) {
                        break;
                    }
                    i18++;
                    b2 = i3;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    fhVar3 = fhVar;
                    i13 = 2;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            fhVar = fhVar3;
            fiVar = null;
            if (fiVar != null) {
                if (fiVar.a() > 0) {
                    int i28 = fiVar.d;
                    int i29 = fiVar.b;
                    int i30 = i28 - i29;
                    int i31 = fiVar.c;
                    int i32 = fiVar.a;
                    int i33 = i31 - i32;
                    if (i30 == i33) {
                        lcvVar = new lcv(i32, i29, i33, (char[]) null);
                    } else if (fiVar.e) {
                        lcvVar = new lcv(i32, i29, fiVar.a(), (char[]) null);
                    } else if (i30 <= i33) {
                        lcvVar = new lcv(i32 + 1, i29, fiVar.a(), (char[]) null);
                    } else {
                        lcvVar = new lcv(i32, i29 + 1, fiVar.a(), (char[]) null);
                    }
                    arrayList5.add(lcvVar);
                }
                if (arrayList2.isEmpty()) {
                    fhVar2 = new fh();
                    arrayList4 = arrayList2;
                } else {
                    arrayList4 = arrayList2;
                    fhVar2 = (fh) arrayList4.remove(arrayList2.size() - 1);
                }
                fh fhVar4 = fhVar;
                fhVar2.a = fhVar4.a;
                fhVar2.c = fhVar4.c;
                fhVar2.b = fiVar.a;
                fhVar2.d = fiVar.b;
                arrayList3 = arrayList;
                arrayList3.add(fhVar2);
                int i34 = fhVar4.b;
                int i35 = fhVar4.d;
                fhVar4.a = fiVar.c;
                fhVar4.c = fiVar.d;
                arrayList3.add(fhVar4);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                arrayList4.add(fhVar);
            }
            i12 = 1;
            i13 = 2;
            ArrayList arrayList8 = arrayList3;
            arrayList7 = arrayList4;
            arrayList6 = arrayList8;
        }
        Collections.sort(arrayList5, fj.a);
        ff ffVar = new ff(cupVar, arrayList5, iArr, iArr2);
        fd fdVar = new fd(new fc(this));
        int i36 = ffVar.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i37 = ffVar.e;
        int i38 = ffVar.f;
        int size = ffVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                lcv lcvVar2 = (lcv) ffVar.a.get(size);
                int a3 = lcvVar2.a();
                int b6 = lcvVar2.b();
                while (i37 > a3) {
                    i37--;
                    int i39 = ffVar.b[i37];
                    if ((i39 & 12) != 0) {
                        int i40 = i39 >> 4;
                        fg a4 = ff.a(arrayDeque, i40, false);
                        if (a4 != null) {
                            int i41 = (i36 - a4.b) - 1;
                            fdVar.b(i37, i41);
                            if ((i39 & 4) != 0) {
                                fdVar.c(i41, ffVar.d.e(i40));
                            }
                        } else {
                            arrayDeque.add(new fg(i37, (i36 - i37) - 1, true));
                        }
                    } else {
                        if (fdVar.b != 2 || (i2 = fdVar.c) < i37 || i2 > i37 + 1) {
                            fdVar.a();
                            fdVar.c = i37;
                            fdVar.d = 1;
                            fdVar.b = 2;
                        } else {
                            fdVar.d++;
                            fdVar.c = i37;
                        }
                        i36--;
                    }
                }
                while (i38 > b6) {
                    i38--;
                    int i42 = ffVar.c[i38];
                    if ((i42 & 12) == 0) {
                        if (fdVar.b == 1 && i37 >= (i = fdVar.c)) {
                            int i43 = fdVar.d;
                            if (i37 <= i + i43) {
                                fdVar.d = i43 + 1;
                                fdVar.c = Math.min(i37, i);
                                i36++;
                            }
                        }
                        fdVar.a();
                        fdVar.c = i37;
                        fdVar.d = 1;
                        fdVar.b = 1;
                        i36++;
                    } else {
                        if (ff.a(arrayDeque, i42 >> 4, true) == null) {
                            arrayDeque.add(new fg(i38, i36 - i37, false));
                        } else {
                            fdVar.b((i36 - a.b) - 1, i37);
                            if ((i42 & 4) != 0) {
                                fdVar.c(i37, ffVar.d.e(i38));
                            }
                        }
                    }
                }
                int i44 = lcvVar2.b;
                int i45 = lcvVar2.c;
                int i46 = i44;
                for (int i47 = 0; i47 < lcvVar2.a; i47++) {
                    if ((ffVar.b[i46] & 15) == 2) {
                        fdVar.c(i46, ffVar.d.e(i45));
                    }
                    i46++;
                    i45++;
                }
                i37 = lcvVar2.b;
                i38 = lcvVar2.c;
            } else {
                fdVar.a();
                return;
            }
        }
    }

    public final void A(Object obj) {
        obj.getClass();
        this.d.add(new cuq(obj));
        hi(this.d.size());
    }

    public final void B() {
        this.d.clear();
        fc();
    }

    public final void C(int i, Object obj) {
        if (i < 0 || i >= this.d.size()) {
            int size = this.d.size();
            throw new IndexOutOfBoundsException("Position: " + i + ", Size: " + size);
        }
        hh(i, obj);
    }

    public final void D(int i, Object obj) {
        ((cuq) this.d.get(i)).b = lfb.f(obj);
        hh(i, obj);
    }

    @Override // defpackage.ls
    /* renamed from: E */
    public final void o(cum cumVar, int i) {
        cumVar.t = this;
        cuq cuqVar = (cuq) this.d.get(i);
        cumVar.F(cuqVar.a, i);
        lfb lfbVar = cuqVar.b;
        if (lfbVar.e()) {
            cumVar.H(lfbVar.a());
        }
    }

    public final void F(int i) {
        this.d.remove(i);
        m(i);
    }

    public final void G(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            obj.getClass();
            arrayList.add(new cuq(obj));
        }
        llp o = llp.o(this.d);
        this.d.clear();
        this.d.addAll(arrayList);
        P(o, this.d);
    }

    public final boolean H() {
        return this.d.isEmpty();
    }

    public final void I(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.d.addAll(0, jez.S(collection, cli.u));
        hk(0, ((lrl) collection).c);
    }

    public final void J(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        int size = this.d.size();
        this.d.addAll(jez.S(collection, cli.u));
        hk(size, collection.size());
    }

    public final void K(Object obj) {
        this.d.set(0, new cuq(obj));
        hg(0);
    }

    public final void L(Collection collection) {
        llp o = llp.o(this.d);
        this.d.clear();
        this.d.addAll(jez.S(collection, cli.u));
        P(o, this.d);
    }

    public final void M(Iterable iterable) {
        J(llp.i(iterable));
    }

    public final void N(Object... objArr) {
        L(llp.p(objArr));
    }

    public final ewj O(Class cls) {
        ewj ewjVar = (ewj) this.h.get(cls);
        if (ewjVar == null) {
            for (Class superclass = cls.getSuperclass(); ewjVar == null && superclass != null; superclass = superclass.getSuperclass()) {
                ewjVar = (ewj) this.h.get(superclass);
            }
        }
        if (ewjVar != null) {
            return ewjVar;
        }
        throw new IllegalStateException("Binder is not registered for ".concat(String.valueOf(cls.getName())));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [cuw, java.lang.Object] */
    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        ewj ewjVar = (ewj) this.g.get(Integer.valueOf(i));
        if (ewjVar == null) {
            throw new IllegalStateException("Binder is not registered for " + i);
        }
        return ewjVar.b.d(this.e, this.f, viewGroup, i - ((Integer) ((Range) ewjVar.a).getLower()).intValue());
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.size();
    }

    @Override // defpackage.ls
    public final void hb(RecyclerView recyclerView) {
        ot otVar = this.j;
        if (otVar != null) {
            otVar.i(recyclerView);
        }
        this.i.add(recyclerView);
    }

    @Override // defpackage.ls
    public final void hc(RecyclerView recyclerView) {
        this.i.remove(recyclerView);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cuw, java.lang.Object] */
    @Override // defpackage.ls
    public final int he(int i) {
        Object obj = ((cuq) this.d.get(i)).a;
        ewj O = O(obj.getClass());
        int a = O.b.a(obj) + ((Integer) ((Range) O.a).getLower()).intValue();
        if (((Range) O.a).contains((Range) Integer.valueOf(a))) {
            return a;
        }
        String valueOf = String.valueOf(O.a);
        throw new IndexOutOfBoundsException("item view type " + a + " is outside bounds " + valueOf);
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void p(mo moVar, int i, List list) {
        cum cumVar = (cum) moVar;
        boolean z = false;
        for (Object obj : list) {
            z |= cumVar.H(obj);
        }
        if (!z) {
            o(cumVar, i);
        }
    }

    @Override // defpackage.ls
    public final /* synthetic */ void r(mo moVar) {
        ((cum) moVar).L();
    }

    @Override // defpackage.ls
    public final /* synthetic */ void s(mo moVar) {
        cum cumVar = (cum) moVar;
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void t(mo moVar) {
        cum cumVar = (cum) moVar;
        cumVar.G();
        cumVar.t = null;
    }

    public final llp x() {
        return llp.o(lre.H(this.d, cuv.b));
    }

    public final Stream y() {
        return Collection$EL.stream(this.d).map(byw.s);
    }

    public final Object z(Class cls, int i) {
        return cls.cast(((cuq) this.d.get(i)).a);
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: anm  reason: default package */
/* loaded from: classes.dex */
public final class anm implements ann, anv, aoc, apa {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final boolean e;
    private final List f;
    private final amy g;
    private List h;
    private aou i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anm(defpackage.amy r8, defpackage.aqf r9, defpackage.aqa r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            apr r6 = (defpackage.apr) r6
            anl r6 = r6.a(r8, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List r10 = r10.b
        L2b:
            int r0 = r10.size()
            if (r1 >= r0) goto L42
            java.lang.Object r0 = r10.get(r1)
            apr r0 = (defpackage.apr) r0
            boolean r2 = r0 instanceof defpackage.apn
            if (r2 == 0) goto L3f
            apn r0 = (defpackage.apn) r0
            r6 = r0
            goto L44
        L3f:
            int r1 = r1 + 1
            goto L2b
        L42:
            r10 = 0
            r6 = r10
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anm.<init>(amy, aqf, aqa):void");
    }

    @Override // defpackage.apa
    public final void a(Object obj, asj asjVar) {
        aou aouVar = this.i;
        if (aouVar != null) {
            aouVar.e(obj, asjVar);
        }
    }

    @Override // defpackage.ann
    public final void b(Canvas canvas, Matrix matrix, int i) {
        aoh aohVar;
        if (this.e) {
            return;
        }
        this.a.set(matrix);
        aou aouVar = this.i;
        if (aouVar != null) {
            this.a.preConcat(aouVar.a());
            i = (int) (((((this.i.e == null ? 100 : ((Integer) aohVar.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = this.f.get(size);
            if (obj instanceof ann) {
                ((ann) obj).b(canvas, this.a, i);
            }
        }
    }

    @Override // defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.a.set(matrix);
        aou aouVar = this.i;
        if (aouVar != null) {
            this.a.preConcat(aouVar.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                anl anlVar = (anl) this.f.get(size);
                if (anlVar instanceof ann) {
                    ((ann) anlVar).c(this.c, this.a, z);
                    rectF.union(this.c);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.aoc
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.apa
    public final void e(aoz aozVar, int i, List list, aoz aozVar2) {
        if (aozVar.e(this.d, i) || "__container".equals(this.d)) {
            if (!"__container".equals(this.d)) {
                aozVar2 = aozVar2.b(this.d);
                if (aozVar.d(this.d, i)) {
                    list.add(aozVar2.c(this));
                }
            }
            if (!aozVar.f(this.d, i)) {
                return;
            }
            int a = i + aozVar.a(this.d, i);
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                anl anlVar = (anl) this.f.get(i2);
                if (anlVar instanceof apa) {
                    ((apa) anlVar).e(aozVar, a, list, aozVar2);
                }
            }
        }
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(list);
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                anl anlVar = (anl) this.f.get(size);
                anlVar.f(arrayList, this.f.subList(0, size));
                arrayList.add(anlVar);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.anl
    public final String g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Matrix h() {
        aou aouVar = this.i;
        if (aouVar != null) {
            return aouVar.a();
        }
        this.a.reset();
        return this.a;
    }

    @Override // defpackage.anv
    public final Path i() {
        this.a.reset();
        aou aouVar = this.i;
        if (aouVar != null) {
            this.a.set(aouVar.a());
        }
        this.b.reset();
        if (this.e) {
            return this.b;
        }
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.b;
            }
            anl anlVar = (anl) this.f.get(size);
            if (anlVar instanceof anv) {
                this.b.addPath(((anv) anlVar).i(), this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.f.size(); i++) {
                anl anlVar = (anl) this.f.get(i);
                if (anlVar instanceof anv) {
                    this.h.add((anv) anlVar);
                }
            }
        }
        return this.h;
    }

    public anm(amy amyVar, aqf aqfVar, String str, boolean z, List list, apn apnVar) {
        new anj();
        new RectF();
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.g = amyVar;
        this.e = z;
        this.f = list;
        if (apnVar != null) {
            aou b = apnVar.b();
            this.i = b;
            b.c(aqfVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            anl anlVar = (anl) list.get(size);
            if (anlVar instanceof ans) {
                arrayList.add((ans) anlVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((ans) arrayList.get(size2)).h(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}

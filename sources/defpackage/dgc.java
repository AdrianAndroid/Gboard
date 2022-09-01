package defpackage;

import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingOverlayView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dgc  reason: default package */
/* loaded from: classes.dex */
public final class dgc implements dgg {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private int d = 500;
    private int e = 500;

    private static boolean j(gpf gpfVar) {
        return gpfVar.d() >= gpfVar.a() || gpfVar.b() >= gpfVar.c();
    }

    @Override // defpackage.dgg
    public final ArrayList a() {
        return this.a;
    }

    @Override // defpackage.dgg
    public final void b() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    @Override // defpackage.dgg
    public final void c(float f, gpq gpqVar, HandwritingOverlayView handwritingOverlayView, long j) {
        if (this.c.isEmpty()) {
            this.c.add(Integer.valueOf(gpqVar.size()));
        } else {
            ArrayList arrayList = this.c;
            if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < gpqVar.size()) {
                ArrayList arrayList2 = this.c;
                arrayList2.set(arrayList2.size() - 1, Integer.valueOf(gpqVar.size()));
            } else {
                ArrayList arrayList3 = this.c;
                if (((Integer) arrayList3.get(arrayList3.size() - 1)).intValue() > gpqVar.size()) {
                    this.c.clear();
                    this.c.add(Integer.valueOf(gpqVar.size()));
                }
            }
        }
        int size = this.c.size();
        int i = System.currentTimeMillis() - j > ((long) (this.e * (true != gqa.a(handwritingOverlayView.getContext()).f ? 1 : 3))) ? size - 1 : size - 2;
        int i2 = 0;
        for (int i3 = 0; i3 < size && ((Integer) this.c.get(i3)).intValue() <= this.a.size(); i3++) {
            int intValue = ((Integer) this.c.get(i3)).intValue();
            int intValue2 = ((Integer) this.a.get(intValue - 1)).intValue();
            if (intValue2 != 0 && i3 <= i) {
                float max = intValue2 / ((7650.0f / Math.max(handwritingOverlayView.f, 30.0f)) * ((i - i3) + 1));
                while (i2 < intValue) {
                    int intValue3 = ((Integer) this.a.get(i2)).intValue();
                    this.a.set(i2, Integer.valueOf(Math.max(intValue3 - ((int) ((intValue3 / max) * f)), 0)));
                    i2++;
                }
            }
            i2 = ((Integer) this.c.get(i3)).intValue();
        }
    }

    @Override // defpackage.dgg
    public final void d() {
        StringBuilder sb = new StringBuilder("<");
        for (int i = 0; i < this.a.size(); i++) {
            sb.append(this.a.get(i));
            sb.append(",");
        }
        sb.append(">");
    }

    @Override // defpackage.dgg
    public final void e(gpq gpqVar) {
        this.a.add(255);
        if (gpqVar.size() > 1) {
            int size = this.a.size() - 2;
            int i = -1;
            int size2 = this.a.size() - 1;
            if (((gpp) gpqVar.get(size)).a() != 0 && ((gpp) gpqVar.get(size2)).a() != 0) {
                i = (int) (((gpp) gpqVar.get(size2)).c().c - ((gpp) gpqVar.get(size)).d().c);
            }
            int i2 = this.d;
            if (i > i2 * 3) {
                return;
            }
            this.d = (int) ((i2 * 0.7f) + (i * 0.3f));
        }
    }

    @Override // defpackage.dgg
    public final void f(int i) {
        this.e = i;
    }

    @Override // defpackage.dgg
    public final void g(int[] iArr, gpq gpqVar, llp llpVar) {
        ArrayList arrayList;
        gpf gpfVar;
        ArrayList arrayList2;
        if (iArr == null) {
            return;
        }
        this.b.clear();
        for (int i : iArr) {
            if (i <= 0) {
                break;
            }
            this.b.add(Integer.valueOf(i));
        }
        if (this.b.isEmpty()) {
            this.b.add(Integer.valueOf(gpqVar.size()));
        }
        if (!this.b.isEmpty()) {
            if (((Integer) this.b.get(arrayList2.size() - 1)).intValue() > gpqVar.size()) {
                this.b.clear();
                this.b.add(Integer.valueOf(gpqVar.size()));
            }
        }
        if (this.b.size() == 1) {
            this.c.clear();
            this.c.add(Integer.valueOf(gpqVar.size()));
            return;
        }
        this.c.clear();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (i2 < this.b.size()) {
            int intValue = ((Integer) this.b.get(i2)).intValue();
            gpf gpfVar2 = new gpf();
            for (int intValue2 = i2 == 0 ? 0 : ((Integer) this.b.get(i2 - 1)).intValue(); intValue2 < intValue; intValue2++) {
                gpfVar2 = j(gpfVar2) ? (gpf) llpVar.get(intValue2) : gpfVar2.e((gpf) llpVar.get(intValue2));
            }
            arrayList3.add(gpfVar2);
            i2++;
        }
        gpf gpfVar3 = new gpf();
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            gpf gpfVar4 = (gpf) arrayList3.get(i3);
            if (!j(gpfVar3)) {
                if (gpfVar4.d() > gpfVar3.a() || gpfVar4.a() < gpfVar3.d() || gpfVar4.b() > gpfVar3.c() || gpfVar4.c() < gpfVar3.b()) {
                    gpfVar = new gpf(new float[]{0.0f, 0.0f, 0.0f, 0.0f});
                } else {
                    gpfVar = new gpf(gpfVar4.a);
                    if (gpfVar3.d() > gpfVar.d()) {
                        gpfVar.j(gpfVar3.d());
                    }
                    if (gpfVar3.a() < gpfVar.a()) {
                        gpfVar.g(gpfVar3.a());
                    }
                    if (gpfVar3.b() > gpfVar.b()) {
                        gpfVar.h(gpfVar3.b());
                    }
                    if (gpfVar3.c() < gpfVar.c()) {
                        gpfVar.i(gpfVar3.c());
                    }
                }
                if (j(gpfVar)) {
                    gpfVar3 = gpfVar3.e(gpfVar4);
                } else {
                    this.c.add((Integer) this.b.get(i3 - 1));
                }
            }
            gpfVar3 = gpfVar4;
        }
        this.c.add((Integer) this.b.get(arrayList.size() - 1));
    }

    @Override // defpackage.dgg
    public final boolean h() {
        if (!this.a.isEmpty()) {
            ArrayList arrayList = this.a;
            if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dgg
    public final boolean i() {
        return h();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }
}

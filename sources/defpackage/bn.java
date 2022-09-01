package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bn  reason: default package */
/* loaded from: classes.dex */
public final class bn {
    public final bo a;
    public final an b;
    public final azp d;
    private boolean e = false;
    public int c = -1;

    public bn(azp azpVar, bo boVar, an anVar, bm bmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = azpVar;
        this.a = boVar;
        this.b = anVar;
        anVar.i = null;
        anVar.j = null;
        anVar.y = 0;
        anVar.v = false;
        anVar.r = false;
        an anVar2 = anVar.n;
        anVar.o = anVar2 != null ? anVar2.l : null;
        anVar.n = null;
        Bundle bundle = bmVar.m;
        if (bundle != null) {
            anVar.h = bundle;
        } else {
            anVar.h = new Bundle();
        }
    }

    public bn(azp azpVar, bo boVar, an anVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = azpVar;
        this.a = boVar;
        this.b = anVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r1 >= r0.a.size()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        r4 = (defpackage.an) r0.a.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r4.N != r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        r4 = r4.O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        r3 = r2.indexOfChild(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            bo r0 = r7.a
            an r1 = r7.b
            android.view.ViewGroup r2 = r1.N
            r3 = -1
            if (r2 != 0) goto La
            goto L4e
        La:
            java.util.ArrayList r4 = r0.a
            int r1 = r4.indexOf(r1)
            int r4 = r1 + (-1)
        L12:
            if (r4 < 0) goto L2e
            java.util.ArrayList r5 = r0.a
            java.lang.Object r5 = r5.get(r4)
            an r5 = (defpackage.an) r5
            android.view.ViewGroup r6 = r5.N
            if (r6 != r2) goto L2b
            android.view.View r5 = r5.O
            if (r5 == 0) goto L2b
            int r0 = r2.indexOfChild(r5)
            int r3 = r0 + 1
            goto L4e
        L2b:
            int r4 = r4 + (-1)
            goto L12
        L2e:
            int r1 = r1 + 1
            java.util.ArrayList r4 = r0.a
            int r4 = r4.size()
            if (r1 >= r4) goto L4e
            java.util.ArrayList r4 = r0.a
            java.lang.Object r4 = r4.get(r1)
            an r4 = (defpackage.an) r4
            android.view.ViewGroup r5 = r4.N
            if (r5 != r2) goto L4d
            android.view.View r4 = r4.O
            if (r4 == 0) goto L4d
            int r3 = r2.indexOfChild(r4)
            goto L4e
        L4d:
            goto L2e
        L4e:
            an r0 = r7.b
            android.view.ViewGroup r1 = r0.N
            android.view.View r0 = r0.O
            r1.addView(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn.a():void");
    }

    final void b() {
        String str;
        if (this.b.u) {
            return;
        }
        if (bi.S(3)) {
            new StringBuilder("moveto CREATE_VIEW: ").append(this.b);
        }
        an anVar = this.b;
        LayoutInflater F = anVar.F(anVar.h);
        an anVar2 = this.b;
        ViewGroup viewGroup = anVar2.N;
        if (viewGroup == null) {
            int i = anVar2.E;
            if (i == 0) {
                viewGroup = null;
            } else if (i == -1) {
                throw new IllegalArgumentException("Cannot create fragment " + this.b + " for a container view with no id");
            } else {
                viewGroup = (ViewGroup) anVar2.z.j.a(i);
                if (viewGroup == null) {
                    an anVar3 = this.b;
                    if (!anVar3.w) {
                        try {
                            str = anVar3.fU().getResourceName(this.b.E);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.b.E) + " (" + str + ") for fragment " + this.b);
                    }
                } else if (!(viewGroup instanceof as)) {
                    aez.f(this.b, viewGroup);
                }
            }
        }
        an anVar4 = this.b;
        anVar4.N = viewGroup;
        anVar4.ga(F, viewGroup, anVar4.h);
        View view = this.b.O;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            an anVar5 = this.b;
            anVar5.O.setTag(R.id.f55630_resource_name_obfuscated_res_0x7f0b021f, anVar5);
            if (viewGroup != null) {
                a();
            }
            an anVar6 = this.b;
            if (anVar6.G) {
                anVar6.O.setVisibility(8);
            }
            if (aad.ag(this.b.O)) {
                aad.K(this.b.O);
            } else {
                View view2 = this.b.O;
                view2.addOnAttachStateChangeListener(new ge(view2, 1));
            }
            this.b.W();
            azp azpVar = this.d;
            an anVar7 = this.b;
            azpVar.E(anVar7, anVar7.O, anVar7.h, false);
            int visibility = this.b.O.getVisibility();
            this.b.y().l = this.b.O.getAlpha();
            an anVar8 = this.b;
            if (anVar8.N != null && visibility == 0) {
                View findFocus = anVar8.O.findFocus();
                if (findFocus != null) {
                    this.b.aa(findFocus);
                    if (bi.S(2)) {
                        StringBuilder sb = new StringBuilder("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(this.b);
                    }
                }
                this.b.O.setAlpha(0.0f);
            }
        }
        this.b.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        an anVar = this.b;
        if (!anVar.u || !anVar.v || anVar.x) {
            return;
        }
        if (bi.S(3)) {
            new StringBuilder("moveto CREATE_VIEW: ").append(this.b);
        }
        an anVar2 = this.b;
        anVar2.ga(anVar2.F(anVar2.h), null, this.b.h);
        View view = this.b.O;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        an anVar3 = this.b;
        anVar3.O.setTag(R.id.f55630_resource_name_obfuscated_res_0x7f0b021f, anVar3);
        an anVar4 = this.b;
        if (anVar4.G) {
            anVar4.O.setVisibility(8);
        }
        this.b.W();
        azp azpVar = this.d;
        an anVar5 = this.b;
        azpVar.E(anVar5, anVar5.O, anVar5.h, false);
        this.b.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x052a, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x076e, code lost:
        if (r6 != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x052a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 2432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn.d():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ClassLoader classLoader) {
        Bundle bundle = this.b.h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        an anVar = this.b;
        anVar.i = anVar.h.getSparseParcelableArray("android:view_state");
        an anVar2 = this.b;
        anVar2.j = anVar2.h.getBundle("android:view_registry_state");
        an anVar3 = this.b;
        anVar3.o = anVar3.h.getString("android:target_state");
        an anVar4 = this.b;
        if (anVar4.o != null) {
            anVar4.p = anVar4.h.getInt("android:target_req_state", 0);
        }
        an anVar5 = this.b;
        Boolean bool = anVar5.k;
        anVar5.Q = anVar5.h.getBoolean("android:user_visible_hint", true);
        an anVar6 = this.b;
        if (anVar6.Q) {
            return;
        }
        anVar6.P = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (this.b.O == null) {
            return;
        }
        if (bi.S(2)) {
            StringBuilder sb = new StringBuilder("Saving view state for fragment ");
            sb.append(this.b);
            sb.append(" with view ");
            sb.append(this.b.O);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.b.O.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.b.i = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.b.X.b.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.b.j = bundle;
    }

    public bn(azp azpVar, bo boVar, ClassLoader classLoader, at atVar, bm bmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = azpVar;
        this.a = boVar;
        an c = atVar.c(bmVar.a);
        Bundle bundle = bmVar.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        c.Z(bmVar.j);
        c.l = bmVar.b;
        c.u = bmVar.c;
        c.w = true;
        c.D = bmVar.d;
        c.E = bmVar.e;
        c.F = bmVar.f;
        c.I = bmVar.g;
        c.s = bmVar.h;
        c.H = bmVar.i;
        c.G = bmVar.k;
        c.W = afp.values()[bmVar.l];
        Bundle bundle2 = bmVar.m;
        if (bundle2 != null) {
            c.h = bundle2;
        } else {
            c.h = new Bundle();
        }
        this.b = c;
        if (bi.S(2)) {
            new StringBuilder("Instantiated fragment ").append(c);
        }
    }
}

package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hyg  reason: default package */
/* loaded from: classes.dex */
public final class hyg extends hyo {
    final /* synthetic */ hyh a;

    public hyg(hyh hyhVar) {
        this.a = hyhVar;
    }

    @Override // defpackage.hyo
    public final void a(int i) {
        hyh hyhVar = this.a;
        try {
            nfh t = hyb.l.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar = (hyb) t.b;
            boolean z = true;
            hybVar.a |= 1;
            hybVar.b = true;
            hyd hydVar = hyd.NATIVE_ANR;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar2 = (hyb) t.b;
            hybVar2.g = hydVar.h;
            hybVar2.a |= 32;
            long currentTimeMillis = System.currentTimeMillis();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar3 = (hyb) t.b;
            hybVar3.a |= 4;
            hybVar3.d = currentTimeMillis;
            boolean b = jai.b.b();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar4 = (hyb) t.b;
            hybVar4.a |= 2;
            hybVar4.c = b;
            if (hyhVar.h <= 0) {
                z = false;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar5 = (hyb) t.b;
            hybVar5.a |= 16;
            hybVar5.f = z;
            boolean z2 = hyhVar.i;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar6 = (hyb) t.b;
            int i2 = hybVar6.a | 64;
            hybVar6.a = i2;
            hybVar6.h = z2;
            hybVar6.a = i2 | 128;
            hybVar6.i = i;
            boolean z3 = hyhVar.j;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar7 = (hyb) t.b;
            int i3 = hybVar7.a | 256;
            hybVar7.a = i3;
            hybVar7.j = z3;
            int i4 = hyhVar.g;
            hybVar7.a = i3 | 512;
            hybVar7.k = i4;
            hyhVar.f.b.edit().putString("anr_" + i, Base64.encodeToString(((hyb) t.cz()).q(), 0)).commit();
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) hyh.a.c()).i(e)).k("com/google/android/libraries/inputmethod/lethe/CrashProtector", "saveNativeAnr", (char) 321, "CrashProtector.java")).t("Failed to save native ANR.");
        }
    }

    @Override // defpackage.hyo
    public final void d(int i) {
        try {
            SharedPreferences.Editor edit = this.a.f.b.edit();
            edit.remove("anr_" + i).commit();
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) hyh.a.c()).i(e)).k("com/google/android/libraries/inputmethod/lethe/CrashProtector", "deleteNativeAnr", (char) 334, "CrashProtector.java")).t("Failed to delete native ANR.");
        }
    }
}

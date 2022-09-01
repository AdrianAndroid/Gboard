package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: hub  reason: default package */
/* loaded from: classes.dex */
public final class hub implements hte {
    public final List a = lre.A();

    @Override // defpackage.hte
    public final void b() {
        for (hte hteVar : this.a) {
            hteVar.b();
        }
    }

    @Override // defpackage.hte
    public final boolean c(View view, View view2, String str, int i, String str2, int i2, Runnable runnable) {
        for (hte hteVar : this.a) {
            if (hteVar.c(view, view2, str, i, str2, i2, runnable)) {
                return true;
            }
        }
        runnable.run();
        return true;
    }

    @Override // defpackage.hte
    public final boolean d(View view, View view2, String str, int i, String str2, int i2) {
        for (hte hteVar : this.a) {
            if (hteVar.d(view, view2, str, i, str2, i2)) {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.translate.TranslateKeyboard;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ezb  reason: default package */
/* loaded from: classes.dex */
public final class ezb {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/translate/ServerStatusMonitor");
    public int b;
    public final Context c;
    public boolean d;
    final eyn f;
    public boolean j;
    private final eyx l;
    private final ezq m;
    public final irt g = new eza(this);
    public final mks h = gyc.b;
    public long i = 0;
    public final idk e = ieh.j();
    public eym k = eyz.a;

    public ezb(Context context, eyx eyxVar, eyn eynVar) {
        this.b = 0;
        this.c = context;
        this.l = eyxVar;
        this.f = eynVar;
        ezp a2 = ezq.a();
        a2.b("en");
        a2.c("es");
        a2.a = "hi";
        a2.d = false;
        a2.e = true;
        this.m = a2.a();
        if (!jam.t(context)) {
            this.b = 3;
        }
    }

    public static int a(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        return i == 2 ? 2 : 0;
    }

    public final int b() {
        if (this.j) {
            return 2;
        }
        return a(this.b);
    }

    public final void c() {
        if (this.j) {
            return;
        }
        if (!jam.t(this.c)) {
            f(3, false);
            return;
        }
        eyn eynVar = this.f;
        if (eynVar == null) {
            return;
        }
        eynVar.d(this.m, this.k);
    }

    public final void d(int i) {
        if (!this.d || this.l == null) {
            return;
        }
        int a2 = a(this.b);
        if (!eyh.b(i) || eyh.b(a2)) {
            if (eyh.b(a2)) {
                this.e.e(ezo.CONNECTION_FAIL, 2);
            } else {
                this.e.e(ezo.CONNECTION_FAIL, 5);
            }
            eyx eyxVar = this.l;
            ezx ezxVar = (ezx) eyxVar;
            TranslateKeyboard f = ezxVar.f();
            if (f == null) {
                return;
            }
            if (!ezxVar.af()) {
                ezxVar.u(1);
            }
            f.A(i);
            ezxVar.Y();
            if (!ezxVar.af()) {
                return;
            }
            ezxVar.ac(((dbk) eyxVar).a);
            return;
        }
        this.e.e(ezo.CONNECTION_FAIL, 3);
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/translate/ServerStatusMonitor", "doNotify", 282, "ServerStatusMonitor.java")).t("Status changed in delay period. Ignored this UI update.");
    }

    public final void e(boolean z) {
        if (jam.t(this.c)) {
            int i = 1;
            if (true == z) {
                i = 2;
            }
            f(i, false);
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/translate/ServerStatusMonitor", "update", 221, "ServerStatusMonitor.java")).t("Should not update status when no network.");
        }
        if (!z) {
            this.i = System.currentTimeMillis();
        }
    }

    public final void f(int i, boolean z) {
        if (!this.d) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/translate/ServerStatusMonitor", "updateStatusAndMaybeCheck", 231, "ServerStatusMonitor.java")).t("Ignores network action when deactivated.");
            return;
        }
        int i2 = this.b;
        this.b = i;
        int a2 = a(i);
        if (a(i2) != a2) {
            if (i == 3) {
                this.e.e(ezo.CONNECTION_FAIL, 0);
            } else if (i == 1) {
                this.e.e(ezo.CONNECTION_FAIL, 1);
            }
            this.h.a(new dob(this, a2, 4), this.b == 3 ? 5000L : 0L, TimeUnit.MILLISECONDS);
        }
        if (!z) {
            return;
        }
        c();
    }
}

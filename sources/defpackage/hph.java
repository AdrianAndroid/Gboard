package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hph  reason: default package */
/* loaded from: classes.dex */
public final class hph {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager");
    public final qv b = new qv();
    public final qv c = new qv();
    public final Context d;
    public final iav e;
    public final hoy f;
    public final hsz g;
    public boolean h;

    public hph(Context context, iav iavVar, hoy hoyVar, hsz hszVar) {
        this.d = context;
        this.e = iavVar;
        this.f = hoyVar;
        this.g = hszVar;
    }

    public static void d(qq qqVar, hsy hsyVar, ibm ibmVar, ibz ibzVar) {
        if (qqVar != null) {
            Iterator it = qqVar.iterator();
            while (it.hasNext()) {
                ((hov) it.next()).d(hsyVar, ibmVar, ibzVar);
            }
        }
    }

    public final htb a(ibz ibzVar) {
        htb T = this.f.T(ibzVar);
        if (T != null) {
            return T;
        }
        if (!this.e.f.c(ibzVar)) {
            return null;
        }
        return new hpg(this);
    }

    public final String b() {
        iss ab = this.f.ab();
        return ab == null ? "" : ((ess) ab).a;
    }

    public final void c(ibz ibzVar, hov hovVar) {
        qq qqVar = (qq) this.c.get(ibzVar);
        if (qqVar == null) {
            qq qqVar2 = new qq(1);
            qqVar2.add(hovVar);
            this.c.put(ibzVar, qqVar2);
        } else if (qqVar.add(hovVar)) {
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "addReceiver", 274, "KeyboardManager.java")).G("multiple calls of requestKeyboard() for the same keyboard %s from receiver %s", ibzVar, hovVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ibz ibzVar, hov hovVar) {
        qq qqVar = (qq) this.c.get(ibzVar);
        if (qqVar != null) {
            qqVar.remove(hovVar);
        }
    }

    public final void f(ibz ibzVar, ibr ibrVar) {
        if (this.h) {
            throw new lgj("requestBuiltInKeyboardDef is called after all keyboards are closed.");
        }
        if (!this.e.f.c(ibzVar)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "requestBuiltInKeyboardDef", 211, "KeyboardManager.java")).J("KeyboardType %s not available from ime=%s (%s)", ibzVar, this.e.b, lex.c(',').f(this.e.f.j.keySet()));
            return;
        }
        hqt S = this.f.S();
        if (S == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "requestBuiltInKeyboardDef", 221, "KeyboardManager.java")).t("No currentInputMethod entry is set.");
            return;
        }
        String b = b();
        ibu a2 = ibu.a(this.d);
        Context context = this.d;
        a2.c(context, ibrVar, gvv.c(context), b, i(S), this.e.f, ibzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        int i = this.b.d;
        for (int i2 = 0; i2 < i; i2++) {
            gvt.a(((htf) this.b.f(i2)).a);
        }
        this.b.clear();
        this.c.clear();
        this.h = false;
    }

    public final boolean h(ibz ibzVar, hov hovVar) {
        htf htfVar = (htf) this.b.get(ibzVar);
        boolean containsKey = this.c.containsKey(ibzVar);
        if (htfVar != null || containsKey) {
            htb T = this.f.T(ibzVar);
            if (T != null && !T.s(ibzVar)) {
                return false;
            }
            if (containsKey) {
                if (hovVar != null) {
                    c(ibzVar, hovVar);
                }
                return true;
            }
            if (hovVar != null) {
                hovVar.d(htfVar.a, htfVar.b, ibzVar);
            }
            return true;
        }
        return false;
    }

    public final jls i(hqt hqtVar) {
        return hqtVar.d(this.e, this.f.y());
    }
}

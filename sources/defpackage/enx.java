package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: enx  reason: default package */
/* loaded from: classes.dex */
public final class enx {
    public final eob e;
    public final hls f;
    public Runnable g;
    public boolean h;
    public boolean i;
    final int j;
    final int k;
    final int l;
    final int m;
    private Runnable p;
    private final Context q;
    private final Handler r;
    private String t;
    private enf u;
    private static final ltg n = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/suggestion/SpellCheckerSuggestionHandler");
    public static final hhl a = hhq.a("enable_trigger_spell_check_in_composing", false);
    public static final hhl b = hhq.f("trigger_spell_check_in_composing_delay", 3000);
    public static final hhl c = hhq.a("enable_trigger_spell_check_in_sentence", false);
    public static final hhl d = hhq.f("trigger_spell_check_in_sentence_delay", 2000);
    private final hqi o = new enw(this);
    private long s = -1;

    public enx(Context context, hls hlsVar) {
        Handler handler = new Handler();
        this.q = context;
        this.f = hlsVar;
        this.e = new eob(hlsVar);
        this.k = context.getResources().getColor(R.color.f26510_resource_name_obfuscated_res_0x7f0604c2);
        this.m = context.getResources().getColor(R.color.f25340_resource_name_obfuscated_res_0x7f0603b6);
        this.j = context.getResources().getColor(R.color.f30090_resource_name_obfuscated_res_0x7f0606fd);
        this.l = context.getResources().getColor(R.color.f26820_resource_name_obfuscated_res_0x7f0604f2);
        this.r = handler;
    }

    public static final boolean j(int i) {
        return i == -400001 || i == -400002 || i == -400003;
    }

    private final void k() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
        }
        this.g = null;
    }

    private final void l() {
        this.h = this.e.h();
        k();
        this.g = new emq(this, 3);
        long longValue = ((Long) eng.j.c()).longValue();
        if (longValue > 0) {
            this.r.postDelayed(this.g, longValue);
        } else {
            this.g.run();
        }
    }

    public final void a() {
        Runnable runnable = this.p;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
            this.p = null;
        }
    }

    public final void b() {
        k();
        this.f.O(hfd.d(new iay(-400000, null, null)));
        this.h = false;
    }

    public final void c() {
        l();
        this.o.f(gyc.b);
        boolean z = false;
        if (((Boolean) eng.q.c()).booleanValue() && !this.f.h().m()) {
            z = true;
        }
        this.i = z;
    }

    public final void d() {
        f();
        this.o.h();
    }

    public final void e(hqe hqeVar) {
        int i;
        int i2;
        if (hqeVar == hqe.IME) {
            return;
        }
        if (this.h) {
            i = this.e.b();
            i2 = this.e.a();
        } else {
            i = -1;
            i2 = -1;
        }
        if (hqeVar == hqe.OTHER) {
            this.e.g();
            l();
        } else {
            f();
        }
        if (!((Boolean) eng.l.c()).booleanValue()) {
            return;
        }
        int b2 = this.e.b();
        int a2 = this.e.a();
        if (i < 0) {
            return;
        }
        if (a2 >= 0 && i <= a2 && i2 >= b2) {
            return;
        }
        this.f.N();
    }

    public final void f() {
        b();
        this.e.g();
    }

    public final void g(long j) {
        emq emqVar = new emq(this, 2);
        this.p = emqVar;
        this.r.postDelayed(emqVar, j);
    }

    public final boolean h(hfd hfdVar) {
        ikh ikhVar;
        long j = -1;
        switch (hfdVar.b[0].c) {
            case -400003:
                ijl.b().g(new eoa(enz.UNDO_ADD_TO_DICT));
                a();
                if (this.s != -1) {
                    ikhVar = new ikh();
                    try {
                        ikhVar.e(this.s);
                        ikhVar.close();
                        this.s = -1L;
                        end b2 = ene.b();
                        if (b2 == null) {
                            ((ltd) ((ltd) n.d()).k("com/google/android/apps/inputmethod/libs/spellchecker/suggestion/SpellCheckerSuggestionHandler", "undoAddToDictionary", 298, "SpellCheckerSuggestionHandler.java")).t("No active spell checker cache.");
                        } else {
                            String str = this.t;
                            synchronized (b2) {
                                b2.b.remove(str);
                            }
                            try {
                                b2.e.put(str);
                                b2.f = str;
                            } catch (InterruptedException unused) {
                            }
                            enf enfVar = this.u;
                            if (enfVar != null) {
                                b2.g(this.t, enfVar);
                            } else {
                                b2.g(this.t, enf.b);
                            }
                        }
                    } finally {
                        try {
                            ikhVar.close();
                        } catch (Throwable th) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                        }
                    }
                }
                return true;
            case -400002:
                ijl.b().g(new eoa(enz.ADD_TO_DICT));
                iay f = hfdVar.f();
                if (f != null && f.c == -400002) {
                    CharSequence e = this.e.e();
                    if (e == null) {
                        ((ltd) ((ltd) n.d()).k("com/google/android/apps/inputmethod/libs/spellchecker/suggestion/SpellCheckerSuggestionHandler", "addToDictionary", 265, "SpellCheckerSuggestionHandler.java")).t("Current typo sequence is null.");
                    } else {
                        end b3 = ene.b();
                        String obj = e.toString();
                        this.t = obj;
                        if (b3 != null) {
                            this.u = b3.a(obj);
                            b3.f(this.t);
                        } else {
                            this.u = null;
                            ((ltd) ((ltd) n.d()).k("com/google/android/apps/inputmethod/libs/spellchecker/suggestion/SpellCheckerSuggestionHandler", "addToDictionary", 276, "SpellCheckerSuggestionHandler.java")).t("No active spell checker cache.");
                        }
                        ikhVar = new ikh();
                        try {
                            j = ikhVar.b(new ika(-1L, e.toString(), "", jav.d));
                            ikhVar.close();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                this.s = j;
                return true;
            case -400001:
                ijl.b().g(new eoa(enz.SELECT));
                iay f2 = hfdVar.f();
                if (f2 != null && f2.c == -400001) {
                    Object obj2 = f2.e;
                    if (!(obj2 instanceof String)) {
                        ((ltd) ((ltd) n.d()).k("com/google/android/apps/inputmethod/libs/spellchecker/suggestion/SpellCheckerSuggestionHandler", "selectSuggestion", 219, "SpellCheckerSuggestionHandler.java")).t("SPELL_CHECK_SELECT_SUGGESTION received with bad key data.");
                    } else {
                        String str2 = (String) obj2;
                        if (this.i) {
                            hsk b4 = hsx.b();
                            if (!((Boolean) eng.r.c()).booleanValue() || b4 == null) {
                                this.f.hu(this.e.d(), this.e.c(), str2, "", "", "", "");
                            } else {
                                kfp a2 = icn.a();
                                a2.e(this.e.d());
                                a2.d(this.e.c());
                                a2.h(str2);
                                a2.f();
                                a2.g(true);
                                b4.at(hfd.d(new iay(-10141, null, a2.c())));
                            }
                        } else {
                            this.f.hV(str2, false, 1);
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    public final int i(int i) {
        return (Build.VERSION.SDK_INT < 26 || !gwc.k(this.q)) ? i == 2 ? this.k : this.m : i == 2 ? this.j : this.l;
    }
}

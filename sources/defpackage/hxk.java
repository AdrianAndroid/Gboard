package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.util.Printer;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hxk  reason: default package */
/* loaded from: classes.dex */
public final class hxk implements gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/keypresseffect/PressEffectPlayer");
    private static volatile hxk g;
    public boolean b;
    public int c;
    public final int d;
    public boolean e;
    public float f;
    private final Context h;
    private final lgb i;
    private final lgb j;
    private final ino k;
    private final int l;
    private long m;
    private final inm n;
    private final inm o;
    private final inm p;
    private final inm q;
    private final llw r;

    private hxk(Context context) {
        lgb n = jdg.n(new etm(context, 18));
        lgb n2 = jdg.n(new etm(context, 19));
        ino M = ino.M(context);
        fdo fdoVar = new fdo(this, 7);
        this.n = fdoVar;
        fdo fdoVar2 = new fdo(this, 8);
        this.o = fdoVar2;
        fdo fdoVar3 = new fdo(this, 9);
        this.q = fdoVar3;
        lls h = llw.h();
        h.a(67, 7);
        h.a(66, 8);
        h.a(62, 6);
        this.r = h.l();
        this.h = context;
        this.k = M;
        this.i = n;
        this.j = n2;
        this.l = jbt.c(context, R.string.f175080_resource_name_obfuscated_res_0x7f140c4a, 200);
        String g2 = jbi.g(context.getResources(), R.array.f1760_resource_name_obfuscated_res_0x7f03004f, null);
        this.d = g2 != null ? Integer.parseInt(g2) : -1;
        d();
        M.X(fdoVar, R.string.f161040_resource_name_obfuscated_res_0x7f140688);
        M.X(fdoVar2, R.string.f161090_resource_name_obfuscated_res_0x7f14068d);
        fdo fdoVar4 = new fdo(this, 10);
        this.p = fdoVar4;
        M.X(fdoVar4, R.string.f162710_resource_name_obfuscated_res_0x7f140731);
        M.X(fdoVar3, R.string.f162560_resource_name_obfuscated_res_0x7f140721);
    }

    public static hxk a(Context context) {
        if (g == null) {
            synchronized (hxk.class) {
                if (g == null) {
                    gzt gztVar = gzt.a;
                    g = new hxk(context.getApplicationContext());
                    gztVar.a(g);
                }
            }
        }
        return g;
    }

    private final boolean g() {
        if (this.b) {
            return jam.c || f();
        }
        return false;
    }

    public final void c(View view, iay iayVar) {
        if (this.e) {
            ((AudioManager) this.i.a()).playSoundEffect(((Integer) this.r.getOrDefault(iayVar != null ? Integer.valueOf(iayVar.c) : null, 5)).intValue(), this.f);
        }
        b(view, 0);
    }

    public final void d() {
        this.e = this.k.aj(R.string.f161040_resource_name_obfuscated_res_0x7f140688);
        this.b = this.k.aj(R.string.f161090_resource_name_obfuscated_res_0x7f14068d);
        this.c = this.k.F(R.string.f162710_resource_name_obfuscated_res_0x7f140731, this.d);
        this.f = this.k.m(R.string.f162560_resource_name_obfuscated_res_0x7f140721, -1.0f);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean g2 = g();
        printer.println("isVibrationEnabled: " + g2);
        boolean z2 = jam.c;
        printer.println("systemHapticFeedbackEnabled: " + z2);
        boolean z3 = this.b;
        printer.println("vibrateOnPressEnabled memory: " + z3);
        boolean aj = this.k.aj(R.string.f161090_resource_name_obfuscated_res_0x7f14068d);
        printer.println("vibrateOnPressEnabled: " + aj);
        boolean z4 = PreferenceManager.getDefaultSharedPreferences(jbt.m(this.h)).getBoolean(this.h.getString(R.string.f161090_resource_name_obfuscated_res_0x7f14068d), aj);
        printer.println("vibrateOnPressEnabled DE: " + z4);
        boolean f = f();
        printer.println("isUserCustomizedVibrationDuration: " + f);
        int i = this.l;
        printer.println("hapticEffectCutoff: " + i);
        int i2 = this.c;
        printer.println("vibrationDuration: " + i2);
        int i3 = this.d;
        printer.println("systemDefaultVibrationDuration: " + i3);
        printer.println("keyReleaseEffectEnabled: ".concat(String.valueOf(String.valueOf(hxj.b.c()))));
        printer.println("longPressEffectEnabled: ".concat(String.valueOf(String.valueOf(hxj.a.c()))));
    }

    public final boolean e() {
        return jam.w() && g();
    }

    final boolean f() {
        return this.d != this.c;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "PressEffectPlayer";
    }

    public final void b(View view, int i) {
        if (view == null) {
            return;
        }
        if (i == 0) {
            if (!g()) {
                return;
            }
            Vibrator vibrator = (Vibrator) this.j.a();
            if (vibrator != null && (this.d != -1 || f())) {
                int i2 = this.c;
                if (i2 <= 0) {
                    return;
                }
                try {
                    vibrator.vibrate(i2);
                } catch (RuntimeException unused) {
                }
                this.m = SystemClock.uptimeMillis();
                return;
            }
            try {
                view.performHapticFeedback(3);
            } catch (RuntimeException unused2) {
            }
            this.m = SystemClock.uptimeMillis();
        } else if (i == 1) {
            if (!this.b || !((Boolean) hxj.b.c()).booleanValue() || !jam.c || f() || !jam.w() || SystemClock.uptimeMillis() - this.m <= this.l) {
                return;
            }
            view.performHapticFeedback(jam.d);
        } else if (i == 2) {
            if (!((Boolean) hxj.a.c()).booleanValue() || !e()) {
                return;
            }
            view.performHapticFeedback(0);
        } else if (!e()) {
        } else {
            view.performHapticFeedback(jam.e);
        }
    }
}

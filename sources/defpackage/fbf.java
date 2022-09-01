package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fbf  reason: default package */
/* loaded from: classes.dex */
public final class fbf {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager");
    static boolean b = false;
    private static fax k;
    public final Context c;
    public Runnable d;
    public long e;
    public final boolean g;
    public idn h;
    public boolean f = false;
    public boolean i = false;
    public final hqi j = new fbc(this);

    public fbf(Context context) {
        this.c = context;
        this.g = fay.i(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mev a(boolean z) {
        if (z) {
            return mev.BANNER;
        }
        return mev.SETTINGS;
    }

    public static void d() {
        fax faxVar = k;
        if (faxVar != null) {
            guh guhVar = faxVar.g;
            if (guhVar != null) {
                guhVar.f();
                faxVar.g = null;
            }
            guh guhVar2 = faxVar.h;
            if (guhVar2 != null) {
                guhVar2.f();
                faxVar.h = null;
            }
            k = null;
        }
    }

    public static void f(Context context) {
        if (!fay.i(context) || !fay.g(context, ((Long) fbh.w.c()).longValue())) {
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "maybeDisableVoiceDonation", 155, "VoiceDonationPromoManager.java")).t("reset voice donation preferences due to expired consent");
        h(context);
    }

    public static void g(Context context, hsk hskVar) {
        ins insVar = new ins(15);
        insVar.b(context, R.string.f162480_resource_name_obfuscated_res_0x7f140719, R.string.f161100_resource_name_obfuscated_res_0x7f14068e);
        hskVar.aC(insVar);
    }

    public static void h(Context context) {
        fay.f(context, false);
        fay.c(context, false);
        fay.b(context, false);
        fay.d(context, 0);
        fay.e(context, false);
    }

    public static void i(Animator animator, View view, int i) {
        ((ValueAnimator) animator).addUpdateListener(new fbd(view, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(Context context, IBinder iBinder, int i, boolean z) {
        d();
        fax faxVar = new fax(context, iBinder, i, z);
        if (z && !faxVar.b) {
            hqt b2 = hqp.b();
            if (b2 == null) {
                return;
            }
            jco.a(faxVar, b2.i());
            fbe fbeVar = new fbe(faxVar);
            context.registerReceiver(fbeVar, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            faxVar.setOnDismissListener(new faz(context, fbeVar, 0));
        }
        ieh.j().e(fbm.VOICE_DONATION_INTRO_DIALOG_SHOWN, a(z), 4, Integer.valueOf(fay.a(context)));
        if (faxVar.b) {
            k = faxVar;
            faxVar.f = bsd.i;
        }
        faxVar.show();
    }

    public static void k(Context context, View view, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "showIntroDialog", 499, "VoiceDonationPromoManager.java")).t("windowToken is null. Cannot show voice donation intro dialog.");
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        j(context, iBinder, rect.height(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "clearBanner", 169, "VoiceDonationPromoManager.java")).t("clear voice donation banner");
        c();
        e();
    }

    public final void c() {
        this.j.h();
        this.f = false;
        b = false;
        Runnable runnable = this.d;
        if (runnable != null) {
            kki.k(runnable);
        }
        this.d = null;
    }

    public final void e() {
        hkp.b(true != this.g ? "voice_donation_promo_banner" : "voice_donation_renewal_banner", false);
    }
}

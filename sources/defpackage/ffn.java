package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ffn */
/* loaded from: classes.dex */
public final class ffn implements ffi {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/extension/VoiceImeExtension");
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    private static final lfy j = lfy.c(',');
    public Runnable c;
    public final Context d;
    public final ino e;
    public final fbr f;
    public final ffh g;
    public boolean i;
    private final ino k;
    private lmz l;
    public final iqe h = iqe.e(fbh.d, 3);
    private final hhk m = new ffp(this, 1);
    private final hsw n = new ffk(this);
    private final irw o = new ffl(this);
    private final hst p = new ffm(this);
    private final ija q = ijf.c(new fci(this, 6), new fci(this, 7), gto.a);

    public ffn(Context context) {
        fbr fbrVar = new fbr(context);
        ffh ffhVar = new ffh(context);
        this.d = context;
        this.f = fbrVar;
        this.g = ffhVar;
        this.k = ino.M(context);
        this.e = ino.K(context, null);
    }

    public static /* bridge */ /* synthetic */ void f(ffn ffnVar) {
        ffnVar.c = null;
    }

    public final void c(boolean z) {
        if (!z) {
            fbf.h(this.d);
        }
    }

    public final void d(hhl hhlVar) {
        String str = (String) hhlVar.c();
        if (TextUtils.isEmpty(str)) {
            this.l = lrr.a;
        } else {
            this.l = lmz.p(j.k(str));
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Voice Mic status = ".concat(this.g.a()));
        String c = fao.c();
        if (!TextUtils.isEmpty(c)) {
            printer.println("  ".concat(c));
        }
    }

    public final boolean e() {
        hqt b2;
        lmz lmzVar;
        return ((Boolean) fbh.a.c()).booleanValue() && this.k.x(R.string.f161110_resource_name_obfuscated_res_0x7f14068f, true) && fbr.m(this.d) && (b2 = hqp.b()) != null && (lmzVar = this.l) != null && lmzVar.contains(b2.i().n) && !this.e.al("has_voice_promo_clicked", false, false) && this.e.b("voice_promo_notice_diaplay_times", 0) < 2 && fao.o(this.d, this.f.a());
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "VoiceImeExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        fao.j(new fbn(1));
        fao.k(new fbn(0));
        fay fayVar = new fay();
        synchronized (ffb.class) {
            ffb.a = fayVar;
        }
        this.n.e(mjl.a);
        this.p.g(mjl.a);
        this.o.f(gyc.b);
        this.q.e(gyc.b);
        d(fbh.c);
        fbh.c.e(this.m);
        jcg.b("VoiceImeExtension", new fbt());
        ijf.j(jcj.a);
    }

    @Override // defpackage.ifw
    public final void gn() {
        jcg.c("VoiceImeExtension");
        ijf.k(jcj.a);
        this.n.f();
        this.p.h();
        this.o.g();
        this.q.f();
        fbh.c.g(this.m);
    }
}

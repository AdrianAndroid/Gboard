package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bsi  reason: default package */
/* loaded from: classes.dex */
public final class bsi implements brz, idp {
    static final hhl a = hhq.a("enable_search_hint_in_gsa", false);
    static final hhl b = hhq.f("search_hint_start_delay_hours", 168);
    static final hhl c = hhq.f("search_hint_start_delay_hours_new_user", 168);
    static final hhl d = hhq.f("search_hint_start_delay_hours_from_last_click", 168);
    static final hhl e = hhq.f("search_hint_start_idle_seconds", 3);
    public boolean f;
    public final Context g;
    public final ino h;
    private EditorInfo l;
    final nzv k = new nzv();
    private final Runnable m = new Runnable() { // from class: bse
        /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, imn] */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, imn] */
        @Override // java.lang.Runnable
        public final void run() {
            Long l;
            View G;
            View findViewById;
            SoftKeyView softKeyView;
            bsi bsiVar = bsi.this;
            ieh.j().e(bsa.a, Integer.valueOf(bsiVar.h.ak("user_click_search") ? 1 : 0));
            Configuration c2 = irn.c();
            if (c2 == null || c2.orientation != 1 || gqa.a(bsiVar.g).f || !((Boolean) bsi.a.c()).booleanValue()) {
                return;
            }
            long abs = Math.abs(jam.i(guw.a()) - gva.c());
            long millis = TimeUnit.DAYS.toMillis(3L);
            TimeUnit timeUnit = TimeUnit.HOURS;
            if (abs < millis) {
                l = (Long) bsi.c.c();
            } else {
                l = (Long) bsi.b.c();
            }
            if (System.currentTimeMillis() - bsiVar.h.I("search_hint_module_install_time") < timeUnit.toMillis(l.longValue())) {
                return;
            }
            if (bsiVar.h.b("search_key_hint_show_count", 0) >= 5 || bsiVar.h.ak("user_click_search")) {
                long millis2 = TimeUnit.HOURS.toMillis(((Long) bsi.d.c()).longValue());
                if (millis2 <= 0 || System.currentTimeMillis() - bsiVar.h.I("user_click_search_timestamp") <= millis2) {
                    return;
                }
                bsiVar.h.f("user_click_search", false);
                bsiVar.h.h("search_key_hint_show_count", 0);
            }
            nzv nzvVar = bsiVar.k;
            bsd bsdVar = bsd.a;
            hsk b2 = hsx.b();
            if (b2 == null || (G = b2.G()) == null || (findViewById = G.findViewById(R.id.keyboard_holder)) == null || (softKeyView = (SoftKeyView) findViewById.findViewById(R.id.key_pos_ime_action)) == null || !softKeyView.isShown()) {
                return;
            }
            nzvVar.c = bsdVar;
            nzvVar.a = b2.aa();
            Context applicationContext = b2.getApplicationContext();
            Rect rect = new Rect(0, 0, softKeyView.getWidth(), softKeyView.getHeight());
            jdy.e(rect, softKeyView, findViewById);
            View a2 = nzvVar.a.a(R.layout.f144860_resource_name_obfuscated_res_0x7f0e050e);
            nzvVar.b = a2;
            a2.setEnabled(true);
            a2.setClickable(true);
            a2.setOnClickListener(new hk(nzvVar, 9, null, null, null));
            ImageView imageView = (ImageView) a2.findViewById(R.id.f68120_resource_name_obfuscated_res_0x7f0b08be);
            View findViewById2 = a2.findViewById(R.id.f68130_resource_name_obfuscated_res_0x7f0b08bf);
            findViewById2.setTranslationX(rect.centerX() - (findViewById.getWidth() / 2));
            findViewById2.setTranslationY((rect.top - (findViewById.getHeight() / 2)) - 25);
            imageView.setTranslationX(rect.centerX() - (findViewById.getWidth() / 2));
            imageView.setTranslationY(rect.centerY() - (findViewById.getHeight() / 2));
            View findViewById3 = a2.findViewById(R.id.f68100_resource_name_obfuscated_res_0x7f0b08bc);
            findViewById3.setOnClickListener(new hk(b2, 10));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById3.getLayoutParams();
            layoutParams.leftMargin = rect.left;
            layoutParams.topMargin = rect.top;
            layoutParams.rightMargin = findViewById.getWidth() - rect.right;
            layoutParams.bottomMargin = findViewById.getHeight() - rect.bottom;
            layoutParams.width = rect.width();
            layoutParams.height = rect.height();
            findViewById3.setLayoutParams(layoutParams);
            ((SoftKeyView) findViewById3.findViewById(R.id.f68110_resource_name_obfuscated_res_0x7f0b08bd)).n(softKeyView.b);
            akf a3 = akf.a(applicationContext, R.drawable.f50820_resource_name_obfuscated_res_0x7f080386);
            akf a4 = akf.a(applicationContext, R.drawable.f50840_resource_name_obfuscated_res_0x7f080388);
            if (a3 == null || a4 == null) {
                return;
            }
            imageView.setImageDrawable(a3);
            a3.c(new bsb(imageView, a4));
            a4.c(new bsc(a4));
            a3.start();
            nzvVar.a.e(a2, findViewById, 614, 0, 0, null);
            ieh.j().e(bsa.a, 2);
            ino inoVar = bsiVar.h;
            inoVar.h("search_key_hint_show_count", inoVar.D("search_key_hint_show_count") + 1);
            bsiVar.i.d(gyc.b);
        }
    };
    public final hqo i = new bsf(this);
    private final irm n = new bsg(this);
    final hqi j = new bsh(this);

    public bsi(Context context) {
        this.g = context;
        this.h = ino.M(context);
    }

    public static void g() {
        ieh.j().e(bsa.a, 3);
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (this.f && hfdVar.f() != null && hfdVar.f().c == -10018) {
            this.h.f("user_click_search", true);
            this.h.i("user_click_search_timestamp", System.currentTimeMillis());
            ieh.j().e(bsa.a, 4);
        }
        return false;
    }

    @Override // defpackage.idp
    public final Collection d(Context context, idi idiVar) {
        return llp.r(new brx(idiVar));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    public final void f() {
        this.k.l();
        this.i.f();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        if (!this.h.ai("search_hint_module_install_time")) {
            this.h.i("search_hint_module_install_time", System.currentTimeMillis());
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        this.l = null;
        l();
        this.j.h();
        this.f = false;
        f();
        this.n.h();
    }

    @Override // defpackage.hfx
    public final void j(EditorInfo editorInfo, boolean z) {
        f();
        if (this.f) {
            if (editorInfo == this.l) {
                m();
            } else {
                l();
            }
        }
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    public final void l() {
        kki.k(this.m);
    }

    public final void m() {
        kki.k(this.m);
        kki.i(this.m, TimeUnit.SECONDS.toMillis(((Long) e.c()).longValue()));
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        if (editorInfo == null || !han.AGSA.a(editorInfo) || ham.a(editorInfo) != 3) {
            return false;
        }
        this.f = true;
        this.j.f(gyc.b);
        this.l = editorInfo;
        this.n.f(gyc.b);
        return true;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.framework.firstrun.PageIndicatorView;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ecu  reason: default package */
/* loaded from: classes.dex */
public class ecu implements AutoCloseable {
    public final ect a;
    public final View b;
    protected final ViewGroup c;
    protected final ImageView d;
    public final BidiViewPager e;
    public final PageIndicatorView f;
    protected int[] g;
    protected int h;
    public boolean i;

    public ecu(ect ectVar, View view) {
        this.g = new int[]{R.string.f151890_resource_name_obfuscated_res_0x7f140244, R.string.f151910_resource_name_obfuscated_res_0x7f140246, R.string.f151930_resource_name_obfuscated_res_0x7f140248};
        this.a = ectVar;
        this.b = view;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.f55130_resource_name_obfuscated_res_0x7f0b01ea);
        if (viewStub != null) {
            viewStub.inflate();
        }
        this.c = (ViewGroup) aad.q(view, R.id.f55120_resource_name_obfuscated_res_0x7f0b01e9);
        this.d = (ImageView) aad.q(view, R.id.f56700_resource_name_obfuscated_res_0x7f0b02a0);
        this.e = (BidiViewPager) aad.q(view, R.id.f56730_resource_name_obfuscated_res_0x7f0b02a3);
        this.f = (PageIndicatorView) aad.q(view, R.id.f56710_resource_name_obfuscated_res_0x7f0b02a1);
        this.h = view.getResources().getDimensionPixelSize(R.dimen.f34110_resource_name_obfuscated_res_0x7f070184);
        if (((Boolean) ecq.u.c()).booleanValue()) {
            this.g = new int[]{R.string.f151890_resource_name_obfuscated_res_0x7f140244, R.string.f151930_resource_name_obfuscated_res_0x7f140248};
        }
    }

    public final int a() {
        return this.g.length;
    }

    public final void b() {
        if (this.c.getVisibility() == 0) {
            ViewGroup viewGroup = this.c;
            new elj(viewGroup, viewGroup.getLayoutParams().height).b(new ecr(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.d.setOnClickListener(new dbg(new dwx(this, 15), 0));
        BidiViewPager bidiViewPager = this.e;
        bidiViewPager.k(new edh(dbf.a(bidiViewPager.getContext()), this.g, null, null));
        this.e.e(new ecs(this, 0));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b();
        this.d.setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.e.m(0, true);
        if (this.b.getLayoutDirection() == 0) {
            this.a.d(0);
        }
        this.f.b(a());
        this.f.a(0);
        ede edeVar = (ede) this.a;
        edeVar.j();
        if (edeVar.i instanceof ecx) {
            int b = edeVar.d.b("pref_fast_access_bar_onboarding_v2_shown_count", 0);
            long currentTimeMillis = System.currentTimeMillis();
            edeVar.d.h("pref_fast_access_bar_onboarding_v2_shown_count", b + 1);
            edeVar.d.i("pref_fast_access_bar_onboarding_v2_last_shown_timestamp", currentTimeMillis);
        } else {
            edeVar.d.f("PREF_FAST_ACCESS_BAR_SHOWN", true);
        }
        if (((Boolean) ecq.t.c()).booleanValue()) {
            edeVar.f.set(false);
        }
        edeVar.f().hg(edeVar.f().ha() - 1);
        edeVar.g.g(R.string.f151950_resource_name_obfuscated_res_0x7f14024a, new Object[0]);
    }
}

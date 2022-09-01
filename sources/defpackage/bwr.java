package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bwr  reason: default package */
/* loaded from: classes.dex */
public final class bwr extends imo {
    public buk a;
    public int b;
    public View c;
    public boolean d;
    public Animator e;
    public AnimatorSet f;
    public AnimatorSet g;
    public long h = 0;
    public long i = 0;
    public final bwq j;

    public bwr(Context context, imn imnVar, bwq bwqVar) {
        super(context, imnVar);
        this.j = bwqVar;
    }

    private final void f() {
        g(this.g);
        g(this.f);
        g(this.e);
        this.g = null;
        this.f = null;
        this.e = null;
    }

    private static void g(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.end();
    }

    @Override // defpackage.imo
    public final int a() {
        return R.string.f166300_resource_name_obfuscated_res_0x7f1408cc;
    }

    @Override // defpackage.imo
    protected final View b(View view) {
        View b = this.m.b(this.k, true != this.d ? R.layout.f135120_resource_name_obfuscated_res_0x7f0e00eb : R.layout.f135150_resource_name_obfuscated_res_0x7f0e00ee);
        b.setEnabled(true);
        b.setClickable(true);
        b.setOnClickListener(new hk(this, 14));
        boolean z = (this.a.c() == 0 || this.a.a() == 0 || this.a.b() == 0) ? false : true;
        ino M = ino.M(b.getContext());
        View findViewById = b.findViewById(R.id.f56880_resource_name_obfuscated_res_0x7f0b02b7);
        View findViewById2 = b.findViewById(R.id.f56890_resource_name_obfuscated_res_0x7f0b02b8);
        long c = M.c("entity_notice_shown_count", 0L);
        if (!z || c >= ((Long) bwv.m.c()).longValue()) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            findViewById = findViewById2;
        } else {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById.findViewById(R.id.f56810_resource_name_obfuscated_res_0x7f0b02b0);
            if (appCompatTextView != null) {
                appCompatTextView.setMovementMethod(ScrollingMovementMethod.getInstance());
            }
            M.i("entity_notice_shown_count", c + 1);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById.findViewById(R.id.f56870_resource_name_obfuscated_res_0x7f0b02b6);
        appCompatTextView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        if (this.a.m()) {
            appCompatTextView2.setText(this.a.e());
            this.a.f = appCompatTextView2.getText();
        } else {
            String i = this.a.i();
            if (!TextUtils.isEmpty(i)) {
                appCompatTextView2.setText(i);
                if (z) {
                    ((ImageView) findViewById.findViewById(R.id.f56800_resource_name_obfuscated_res_0x7f0b02af)).setImageDrawable(this.k.getDrawable(this.a.a()));
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) findViewById.findViewById(R.id.f56820_resource_name_obfuscated_res_0x7f0b02b1);
                    String string = this.k.getString(this.a.b());
                    appCompatTextView3.setText(string);
                    appCompatTextView3.setContentDescription(string);
                    findViewById.findViewById(R.id.f56830_resource_name_obfuscated_res_0x7f0b02b2).setVisibility(0);
                }
            } else {
                String j = this.a.j();
                if (j != null) {
                    ImageView imageView = (ImageView) b.findViewById(R.id.f56840_resource_name_obfuscated_res_0x7f0b02b3);
                    hjq.a(this.k).j(j).r(imageView);
                    imageView.setOutlineProvider(new bws(this.k.getResources().getDimensionPixelSize(R.dimen.f36860_resource_name_obfuscated_res_0x7f070305)));
                    imageView.setClipToOutline(true);
                    imageView.setOnClickListener(bwk.a);
                    imageView.setContentDescription(this.j.d(this.a.e));
                    imageView.setVisibility(0);
                    findViewById.setVisibility(4);
                }
            }
        }
        b.findViewById(R.id.f56850_resource_name_obfuscated_res_0x7f0b02b4).setOnClickListener(new hk(this, 16));
        b.findViewById(R.id.f56790_resource_name_obfuscated_res_0x7f0b02ae).setOnClickListener(new hk(this, 15));
        View findViewById3 = b.findViewById(R.id.f56860_resource_name_obfuscated_res_0x7f0b02b5);
        View findViewById4 = b.findViewById(R.id.f56900_resource_name_obfuscated_res_0x7f0b02b9);
        if (this.a.l()) {
            findViewById3.setVisibility(8);
            findViewById4.setVisibility(0);
        } else {
            findViewById3.setVisibility(0);
            findViewById4.setVisibility(8);
        }
        hk hkVar = new hk(this, 17);
        findViewById3.setOnClickListener(hkVar);
        findViewById4.setOnClickListener(hkVar);
        return b;
    }

    public final void c() {
        f();
        super.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.imo
    public final void h(View view) {
        g(this.e);
        g(this.f);
        AnimatorSet animatorSet = this.g;
        if (animatorSet == null || !animatorSet.isRunning()) {
            this.m.c(view, this.g, true);
            if (this.g != null) {
                return;
            }
            this.j.v(this.b);
        }
    }

    @Override // defpackage.imo
    protected final void i(View view, View view2) {
        if (jam.o() && this.c != null) {
            View findViewById = view.findViewById(R.id.f56780_resource_name_obfuscated_res_0x7f0b02ad);
            View findViewById2 = view.findViewById(R.id.f56770_resource_name_obfuscated_res_0x7f0b02ac);
            if (findViewById != null && findViewById2 != null) {
                findViewById.setAlpha(0.0f);
                findViewById2.setAlpha(0.0f);
                f();
                Animator loadAnimator = AnimatorInflater.loadAnimator(this.k, R.animator.f710_resource_name_obfuscated_res_0x7f02002a);
                this.e = loadAnimator;
                loadAnimator.setTarget(view);
                this.e.addListener(new bwp(this, view));
            }
        }
        this.m.e(view, view2, 614, 0, 0, this.e);
        if (this.e == null) {
            this.j.w(this.b);
        }
    }

    @Override // defpackage.imo
    protected final boolean k() {
        return false;
    }
}

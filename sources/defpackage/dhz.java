package defpackage;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.hint.notice.NoticeHolderView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: dhz  reason: default package */
/* loaded from: classes.dex */
public final class dhz implements hwu, hws {
    public final dib a;
    public NoticeHolderView b;
    public final hww c;
    public String d;
    public final cir e;

    public dhz(hww hwwVar, dib dibVar) {
        cir cirVar = new cir(this, 3);
        this.e = cirVar;
        this.c = hwwVar;
        this.a = dibVar;
        hwwVar.g(ibz.a, ice.HEADER, this);
        hwwVar.g(ibz.c, ice.HEADER, this);
        hwwVar.h(ibz.a, ice.HEADER, R.id.key_pos_header_notice, this);
        hwwVar.h(ibz.c, ice.HEADER, R.id.key_pos_header_notice, this);
        ijl.b().h(cirVar, dic.class, gyc.b);
    }

    private final void j() {
        this.c.i(ice.HEADER, R.id.key_pos_header_notice, false, hwv.DEFAULT, true);
    }

    @Override // defpackage.hwu
    public final void a(ibz ibzVar, ice iceVar, View view) {
        if ((ibzVar == ibz.a || ibzVar == ibz.c) && iceVar == ice.HEADER && view != null) {
            this.b = (NoticeHolderView) view.findViewById(R.id.key_pos_header_notice);
        }
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hwu
    public final void c(boolean z) {
        NoticeHolderView noticeHolderView = this.b;
        if (noticeHolderView == null || noticeHolderView.getVisibility() != 0) {
            return;
        }
        h(false);
    }

    @Override // defpackage.hwu
    public final void d(View view) {
        if (jam.p(view.getContext()) || !i()) {
            return;
        }
        j();
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.hwu
    public final void f(ibz ibzVar) {
        c(false);
        g();
        this.b = null;
    }

    public final void g() {
        if (this.b != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                this.b.removeViewAt(i);
            }
            this.d = null;
        }
    }

    public final void h(boolean z) {
        this.c.e(ice.HEADER, R.id.key_pos_header_notice, false, z);
    }

    @Override // defpackage.hws
    public final /* synthetic */ void hL() {
    }

    @Override // defpackage.hws
    public final void hM() {
        NoticeHolderView noticeHolderView = this.b;
        if (noticeHolderView == null || noticeHolderView.getChildCount() <= 0) {
            return;
        }
        j();
    }

    public final boolean i() {
        NoticeHolderView noticeHolderView = this.b;
        if (noticeHolderView != null) {
            for (int i = 0; i < noticeHolderView.getChildCount(); i++) {
                noticeHolderView.removeViewAt(i);
            }
            hkt a = this.a.a(noticeHolderView.getContext());
            ict ictVar = null;
            if (a == null) {
                this.d = null;
                return false;
            }
            hks hksVar = a.f;
            if (hksVar == null || hksVar.a()) {
                gqa a2 = gqa.a(noticeHolderView.getContext());
                int i2 = a.l;
                if (i2 == 0) {
                    if (!TextUtils.isEmpty(a.k)) {
                        a2.i(a.k);
                    }
                } else {
                    a2.h(i2);
                }
                Runnable runnable = a.e;
                if (runnable != null) {
                    runnable.run();
                }
                long j = a.h;
                if (j <= 0) {
                    j = System.currentTimeMillis();
                }
                hkr b = a.b();
                b.h(j);
                b.b(true);
                hkt a3 = b.a();
                this.a.c(a3);
                this.d = a3.i;
                SoftKeyView softKeyView = new SoftKeyView(noticeHolderView.getContext());
                ViewGroup.LayoutParams layoutParams = softKeyView.getLayoutParams();
                if (layoutParams == null) {
                    softKeyView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
                } else {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                    softKeyView.requestLayout();
                }
                softKeyView.setFocusableInTouchMode(true);
                softKeyView.setSelected(false);
                softKeyView.setPressed(false);
                softKeyView.setPadding(0, 0, 0, 0);
                softKeyView.j(noticeHolderView.a);
                softKeyView.i(noticeHolderView.b);
                softKeyView.k(noticeHolderView.c);
                iaj c = ial.c();
                c.b = iah.PRESS;
                c.n(-10056, null, new dia(a3.i));
                ial b2 = c.b();
                if (b2 != null) {
                    ico d = ict.d();
                    d.u(b2);
                    d.t(a3.k);
                    d.s(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265, 0);
                    int i3 = a3.o;
                    if (i3 == 0) {
                        i3 = R.layout.f146120_resource_name_obfuscated_res_0x7f0e0598;
                    }
                    d.n = i3;
                    ictVar = d.c();
                }
                softKeyView.n(ictVar);
                noticeHolderView.addView(softKeyView);
                softKeyView.getLayoutParams().width = -1;
                return true;
            }
            this.d = null;
            return false;
        }
        return false;
    }

    @Override // defpackage.hws
    public final /* synthetic */ Animator m() {
        return null;
    }
}

package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bqa  reason: default package */
/* loaded from: classes.dex */
public final class bqa {
    public final hsy a;
    public final imn b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final View f;
    public final int g;
    public int j;
    public int k;
    public float l;
    public float m;
    private final Resources o;
    private final View p;
    private final View q;
    private final View.OnTouchListener r;
    public boolean h = false;
    public boolean i = false;
    public final GestureDetector n = new GestureDetector(new bpy(this));
    private final Animator.AnimatorListener s = new bpz(this);

    public bqa(Context context, hsy hsyVar, hsz hszVar) {
        bph bphVar = new bph(this, 2);
        this.r = bphVar;
        this.o = context.getResources();
        this.a = hsyVar;
        imn s = hszVar.s();
        this.b = s;
        View d = hszVar.d();
        this.p = d;
        this.q = d == null ? null : d.findViewById(R.id.keyboard_holder);
        this.g = jbt.e(context, R.attr.f5620_resource_name_obfuscated_res_0x7f040165);
        View b = s.b(context, R.layout.f143470_resource_name_obfuscated_res_0x7f0e0467);
        this.c = b;
        View b2 = s.b(context, R.layout.f143480_resource_name_obfuscated_res_0x7f0e0468);
        this.d = b2;
        b2.setEnabled(true);
        b2.setOnTouchListener(new bph(this, 3));
        ImageView imageView = (ImageView) b.findViewById(R.id.f65940_resource_name_obfuscated_res_0x7f0b07aa);
        this.e = imageView;
        imageView.setEnabled(true);
        imageView.setOnTouchListener(bphVar);
        this.f = b.findViewById(R.id.f65950_resource_name_obfuscated_res_0x7f0b07ab);
    }

    public static long a(float f, float f2) {
        if (f2 < 1.0E-323d) {
            return 500L;
        }
        if (f >= 0.0f) {
            return Math.min(f / f2, 500L);
        }
        return 0L;
    }

    public final void b() {
        c(500L);
    }

    public final void c(long j) {
        imn imnVar = this.b;
        if (imnVar == null || !imnVar.f(this.c) || this.h) {
            return;
        }
        this.h = true;
        this.e.animate().y(this.k + this.j).setDuration(j).setListener(this.s).start();
    }

    public final void d() {
        imn imnVar = this.b;
        if (imnVar == null || this.p == null || this.q == null || imnVar.f(this.c)) {
            return;
        }
        Context context = this.p.getContext();
        int min = Math.min((gvv.d(context) - this.o.getDimensionPixelSize(jbi.b(context, "status_bar_height", "dimen", "android", false))) - (this.p.getHeight() - this.q.getTop()), this.g);
        this.i = min != this.g;
        if (this.c.getHeight() != min) {
            this.c.getLayoutParams().height = min;
            this.c.requestLayout();
        }
        this.k = min;
        int i = (this.g - min) / 2;
        this.j = i;
        this.l = i;
        this.m = -i;
        this.b.e(this.d, this.q, 0, 0, 0, null);
        this.b.e(this.c, this.q, 19, 0, 0, null);
        this.f.setVisibility(0);
        this.e.setY(this.k + this.j);
        this.e.animate().y(this.m).setDuration(500L).start();
        this.a.fp(1024L, true);
    }
}

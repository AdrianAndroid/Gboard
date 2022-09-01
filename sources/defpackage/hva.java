package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* renamed from: hva  reason: default package */
/* loaded from: classes.dex */
public final class hva implements huq {
    public Rect a;
    public final Context c;
    public final gqa e;
    public final hus f;
    public final huz g;
    public final hxk h;
    public View j;
    public LinearLayout k;
    public KeyboardViewHolder l;
    public KeyboardViewHolder m;
    public imn n;
    public View o;
    public final ObjectAnimator p;
    public boolean q;
    public boolean r;
    public boolean s;
    private final View t;
    private final Animator.AnimatorListener v;
    private final View.OnTouchListener w;
    private View y;
    private ObjectAnimator z;
    public final Rect b = new Rect();
    public final View.OnLayoutChangeListener i = new huw(this, 0);
    private final View.OnTouchListener u = new hux(this);
    private final Runnable x = new hvg(this, 1);
    public final idk d = ieh.j();

    public hva(Context context, huz huzVar) {
        huy huyVar = new huy(this);
        this.v = huyVar;
        bph bphVar = new bph(this, 12);
        this.w = bphVar;
        this.c = context;
        this.g = huzVar;
        this.a = ((huv) huzVar).a.q();
        this.e = gqa.a(context);
        this.h = hxk.a(context);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat("scaleX", 0.3f, 1.0f), PropertyValuesHolder.ofFloat("translationX", gvv.f(context) / 2, 0.0f));
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.addListener(huyVar);
        this.p = ofPropertyValuesHolder;
        this.f = new hus(context, this);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setEnabled(true);
        frameLayout.setOnTouchListener(bphVar);
        frameLayout.setWillNotDraw(true);
        this.t = frameLayout;
    }

    @Override // defpackage.huq
    public final void a() {
        huv huvVar = (huv) this.g;
        huu huuVar = huvVar.a;
        int f = huvVar.f.f();
        huuVar.f.g(huuVar.y(huuVar.a, R.string.f161220_resource_name_obfuscated_res_0x7f14069a), huuVar.h);
        int x = huuVar.x();
        huuVar.f.g(huuVar.y(huuVar.a, R.string.f161240_resource_name_obfuscated_res_0x7f14069c), (huuVar.r - x) / ((huuVar.p - f) - x));
        int i = huuVar.q;
        int i2 = huuVar.i;
        float f2 = huuVar.h;
        huuVar.f.g(huuVar.y(huuVar.a, R.string.f161230_resource_name_obfuscated_res_0x7f14069b), i / (gvv.f(huuVar.a) - (i2 * f2)));
    }

    @Override // defpackage.huq
    public final void b(int i, int i2) {
        huv huvVar = (huv) this.g;
        huu huuVar = huvVar.a;
        int i3 = huuVar.r - i2;
        huuVar.r = i3;
        huuVar.r = Math.max(0, i3);
        huuVar.q += i;
        huvVar.f.m();
    }

    public final huu c() {
        return ((huv) this.g).a;
    }

    public final void d() {
        View view = this.y;
        if (view != null) {
            view.setOnTouchListener(null);
            this.y = null;
        }
    }

    public final void e() {
        this.f.f();
    }

    public final void f(boolean z) {
        k();
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.removeOnLayoutChangeListener(this.i);
        }
        imn imnVar = this.n;
        if (imnVar != null) {
            imnVar.c(this.y, null, true);
            this.n.c(this.t, null, true);
        }
        if (z) {
            d();
        }
    }

    public final void g(float f, int i) {
        View findViewById;
        ObjectAnimator objectAnimator = this.z;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.j;
        if (view == null || (findViewById = view.getRootView().findViewById(16908290)) == null) {
            return;
        }
        if (i <= 0) {
            findViewById.setAlpha(f);
            return;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById, PropertyValuesHolder.ofFloat("alpha", findViewById.getAlpha(), f));
        this.z = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(i);
        this.z.start();
    }

    public final void h() {
        LinearLayout linearLayout;
        if (this.n == null || (linearLayout = this.k) == null) {
            return;
        }
        if (linearLayout.getHeight() <= 0) {
            this.k.addOnLayoutChangeListener(this.i);
            return;
        }
        if (c().o) {
            View findViewById = this.k.findViewById(R.id.f58170_resource_name_obfuscated_res_0x7f0b046b);
            this.y = findViewById;
            findViewById.setOnTouchListener(this.u);
        } else {
            if (this.y == null) {
                View a = this.n.a(R.layout.f134760_resource_name_obfuscated_res_0x7f0e00bd);
                this.y = a;
                a.setEnabled(true);
                this.y.setOnTouchListener(this.u);
            }
            this.n.e(this.y, this.k, 851, 0, 0, null);
        }
        this.n.e(this.t, this.k, 614, 0, 0, null);
        i();
    }

    public final void i() {
        k();
        this.t.postDelayed(this.x, 5000L);
        this.s = false;
    }

    public final void j() {
        k();
        LinearLayout linearLayout = this.k;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getHeight() <= 0) {
            this.r = true;
            this.k.addOnLayoutChangeListener(this.i);
            return;
        }
        this.f.g(this.k, c());
        this.e.h(R.string.f166340_resource_name_obfuscated_res_0x7f1408d0);
        this.d.e(hvq.FLOATING_KEYBOARD_RESIZE_REPOSITION_ACTIVATED, new Object[0]);
        this.r = false;
    }

    public final void k() {
        this.t.removeCallbacks(this.x);
        g(1.0f, 0);
        this.s = true;
    }

    public final void l(int i) {
        KeyboardViewHolder keyboardViewHolder = this.l;
        if (keyboardViewHolder != null && keyboardViewHolder.f != i) {
            keyboardViewHolder.h(keyboardViewHolder.h);
            keyboardViewHolder.f = i;
            keyboardViewHolder.g = keyboardViewHolder.a(i);
            View view = keyboardViewHolder.g;
            int i2 = 8;
            keyboardViewHolder.h = view != null ? view.getVisibility() : 8;
            if (keyboardViewHolder.getVisibility() != 0) {
                i2 = 0;
            }
            keyboardViewHolder.h(i2);
        }
        KeyboardViewHolder keyboardViewHolder2 = this.m;
        if (keyboardViewHolder2 == null || keyboardViewHolder2.i == i) {
            return;
        }
        keyboardViewHolder2.i = i;
        keyboardViewHolder2.j = keyboardViewHolder2.a(i);
        keyboardViewHolder2.i();
    }
}

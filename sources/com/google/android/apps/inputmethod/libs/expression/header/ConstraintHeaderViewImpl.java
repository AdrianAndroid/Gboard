package com.google.android.apps.inputmethod.libs.expression.header;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintHeaderViewImpl extends ConstraintLayout implements View.OnLayoutChangeListener, cpe {
    public static final lug i = lug.i("ExprHeadView");
    private static final ViewOutlineProvider s = new cpb();
    private final int A;
    private final int B;
    private final int C;
    public ViewGroup j;
    public RecyclerView k;
    public ValueAnimator m;
    public float n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    private LinearLayout t;
    private cor u;
    private cpa v;
    private final cpg w;
    private View x;
    private final int z;
    public cpf l = coj.b();
    private boolean y = false;
    private final dz E = new cod(this);
    private final View.OnTouchListener D = new bph(this, 6);

    public ConstraintHeaderViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new cpg(context);
        this.A = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        Resources resources = context.getResources();
        this.o = resources.getDimensionPixelSize(R.dimen.f42220_resource_name_obfuscated_res_0x7f07069d);
        this.p = resources.getDimensionPixelSize(R.dimen.f33870_resource_name_obfuscated_res_0x7f07016a);
        this.q = resources.getDimensionPixelSize(R.dimen.f37100_resource_name_obfuscated_res_0x7f070322);
        this.B = resources.getDimensionPixelSize(R.dimen.f36470_resource_name_obfuscated_res_0x7f0702d1);
        this.z = gvv.f(context);
        this.C = jbt.e(context, R.attr.f4900_resource_name_obfuscated_res_0x7f04011c);
        this.r = jbt.e(context, R.attr.f3670_resource_name_obfuscated_res_0x7f04009f);
    }

    private final void A(ViewGroup viewGroup, coq coqVar, leq leqVar) {
        cop copVar = coqVar.c;
        coo cooVar = coqVar.b;
        com comVar = coqVar.d;
        if (copVar == null || comVar == null) {
            ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "setSearchBox", 463, "ConstraintHeaderViewImpl.java")).w("Element of type %s doesn't have required fields set.", coqVar.a);
            return;
        }
        if (this.l.c().a) {
            setOnTouchListener(this.D);
        }
        if (!w()) {
            this.k.az(this.E);
        }
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.f134480_resource_name_obfuscated_res_0x7f0e00a1, (ViewGroup) this, false);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewGroup2.findViewById(R.id.f54690_resource_name_obfuscated_res_0x7f0b01bc);
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setHint(getResources().getString(copVar.a));
        if (cooVar == null || TextUtils.isEmpty(cooVar.a)) {
            appCompatTextView.setText("");
            appCompatTextView.setContentDescription("");
        } else {
            appCompatTextView.setText(cooVar.a);
            appCompatTextView.setContentDescription(cooVar.b);
            if (cooVar.c != 0) {
                ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "setSearchBox", 489, "ConstraintHeaderViewImpl.java")).w("Element of type %s doesn't accept drawable resource on text info.", coqVar.a);
            }
        }
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.f54700_resource_name_obfuscated_res_0x7f0b01bd);
        imageView.setImageResource(comVar.a);
        String str = comVar.b;
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(comVar.c);
        }
        gqa.q(imageView, str);
        viewGroup.addView(viewGroup2);
        if (isLaidOut()) {
            q(viewGroup, ((Integer) leqVar.a(Integer.valueOf(getWidth()))).intValue());
        } else {
            post(new bue(this, viewGroup, leqVar, 7));
        }
    }

    private static boolean B(cpd cpdVar) {
        return cpdVar.d == 4;
    }

    private final View y(ViewGroup viewGroup, int i2) {
        return LayoutInflater.from(getContext()).inflate(i2, viewGroup, false);
    }

    private final void z() {
        RecyclerView recyclerView = this.k;
        getContext();
        recyclerView.ab(new coe(this));
    }

    public final int g() {
        int width = getWidth();
        if (width <= 0) {
            width = this.z;
        }
        return h(width);
    }

    public final int h(int i2) {
        return w() ? jbt.e(getContext(), R.attr.f3680_resource_name_obfuscated_res_0x7f0400a0) : i2 / 2;
    }

    public final com i() {
        coq coqVar = this.l.b().a;
        if (coqVar == null) {
            ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "getOriginalImageResourceInfo", 686, "ConstraintHeaderViewImpl.java")).t("getOriginalImageResourceInfo() : Cannot find original start element.");
            return null;
        }
        return coqVar.d;
    }

    @Override // defpackage.cpe
    public final cox j() {
        int i2 = this.u.e;
        if (i2 != -1) {
            return cox.b(i2);
        }
        int i3 = this.v.b;
        if (i3 != -1) {
            return cox.a(i3);
        }
        return cox.a;
    }

    public final void k(ValueAnimator valueAnimator, coq coqVar) {
        synchronized (this) {
            if (this.m != null) {
                ((luc) ((luc) i.d()).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "beginAnimation", 706, "ConstraintHeaderViewImpl.java")).t("Search box can't collapse twice at once.");
                return;
            }
            this.m = valueAnimator;
            valueAnimator.addUpdateListener(new op(this, 7));
            valueAnimator.addListener(new cof(this, coqVar));
            valueAnimator.start();
        }
    }

    public final void l() {
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.f450_resource_name_obfuscated_res_0x7f02000c);
        valueAnimator.setIntValues(this.j.getWidth(), this.q);
        com i2 = i();
        if (i2 == null) {
            ((luc) ((luc) i.c()).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "collapseSearchBox", 650, "ConstraintHeaderViewImpl.java")).t("collapseSearchBox() : Cannot find original image resource info.");
            return;
        }
        cog.c();
        k(valueAnimator, cog.b(i2.c));
        gqa.a(getContext()).g(R.string.f163260_resource_name_obfuscated_res_0x7f140777, new Object[0]);
    }

    @Override // defpackage.cpe
    public final void m() {
        cpd c = this.l.c();
        View findViewById = findViewById(R.id.f68180_resource_name_obfuscated_res_0x7f0b08c6);
        col colVar = col.UNSPECIFIED;
        int i2 = c.d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "notifyDisplayFlagsChanged", 796, "ConstraintHeaderViewImpl.java")).t("View received flag indicating UNSPECIFIED state");
                return;
            }
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    findViewById.setVisibility(0);
                    return;
                } else if (i3 != 4) {
                    return;
                }
            }
            findViewById.setVisibility(8);
            return;
        }
        throw null;
    }

    @Override // defpackage.cpe
    public final void n(coq coqVar, boolean z) {
        this.l.d(coqVar, z);
    }

    @Override // defpackage.cpe
    public final void o() {
        View y;
        synchronized (this) {
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.m = null;
            }
        }
        cov b = this.l.b();
        int i2 = 0;
        if (b.a == null) {
            this.k.setVisibility(0);
        }
        v(b.a);
        llp llpVar = b.d;
        LinearLayout linearLayout = this.t;
        int i3 = this.C;
        linearLayout.setPadding(0, i3, 0, i3);
        LinearLayout linearLayout2 = this.t;
        linearLayout2.setVisibility(true != llpVar.isEmpty() ? 0 : 8);
        linearLayout2.removeAllViews();
        lta listIterator = llpVar.listIterator();
        while (listIterator.hasNext()) {
            coq coqVar = (coq) listIterator.next();
            if (coqVar.a == col.IMAGE_RESOURCE) {
                com comVar = coqVar.d;
                if (comVar == null) {
                    ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "updateEndEdgeView", 358, "ConstraintHeaderViewImpl.java")).w("Element of type %s doesn't have required field set.", coqVar.a);
                } else {
                    Resources resources = getResources();
                    Drawable drawable = resources.getDrawable(comVar.a);
                    String string = !TextUtils.isEmpty(comVar.b) ? comVar.b : resources.getString(comVar.c);
                    if (B(this.l.c())) {
                        y = y(this, R.layout.f134340_resource_name_obfuscated_res_0x7f0e0093);
                    } else {
                        this.t.setPadding(0, 0, 0, 0);
                        y = y(this.t, comVar.e == 1 ? R.layout.f134380_resource_name_obfuscated_res_0x7f0e0097 : R.layout.f134370_resource_name_obfuscated_res_0x7f0e0096);
                    }
                    ImageView imageView = (ImageView) y.findViewById(R.id.f54560_resource_name_obfuscated_res_0x7f0b01af);
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(string);
                    this.t.addView(y);
                }
            } else {
                ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "updateEndEdgeView", 370, "ConstraintHeaderViewImpl.java")).w("Received unsupported type %s in end edge elements", coqVar.a);
            }
        }
        if (w()) {
            q(this.k, -1);
        }
        cpd c = this.l.c();
        this.w.a = c;
        if (this.k.e() == 0) {
            this.k.ay(this.w);
        }
        if (this.k.m == null) {
            z();
        }
        int i4 = b.c.c;
        if (c.b) {
            if (i4 > 1) {
                i2 = i4;
            }
            this.k.Y(i2);
        }
        x(B(c) ? cox.a : b.c);
        this.u.fc();
        if (w()) {
            View findViewById = findViewById(R.id.f68180_resource_name_obfuscated_res_0x7f0b08c6);
            if (findViewById.getVisibility() != 0) {
                return;
            }
            if (getWidth() == 0) {
                post(new bwt(this, findViewById, 14));
            } else {
                s(findViewById);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        KeyboardViewHolder keyboardViewHolder;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                keyboardViewHolder = null;
                break;
            } else if (!(parent instanceof KeyboardViewHolder)) {
                parent = parent.getParent();
            } else {
                keyboardViewHolder = (KeyboardViewHolder) parent;
                break;
            }
        }
        this.x = keyboardViewHolder;
        if (keyboardViewHolder == null) {
            return;
        }
        keyboardViewHolder.addOnLayoutChangeListener(this);
        this.x.setOutlineProvider(s);
        this.x.setElevation(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.x;
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this);
        this.x = null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.j = (ViewGroup) findViewById(R.id.f59420_resource_name_obfuscated_res_0x7f0b04f1);
        this.t = (LinearLayout) findViewById(R.id.f59370_resource_name_obfuscated_res_0x7f0b04eb);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.keyboard_expression_header_middle_element_container);
        this.k = recyclerView;
        recyclerView.ay(this.w);
        z();
        cpf cpfVar = this.l;
        RecyclerView recyclerView2 = this.k;
        Objects.requireNonNull(recyclerView2);
        this.u = new cor(this, cpfVar, new byi(recyclerView2, 17), !w());
        this.v = new cpa(this, this.l, this.t);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (w()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.y = false;
            this.n = motionEvent.getRawX();
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return false;
            }
            this.y = Math.abs(this.n - motionEvent.getRawX()) > ((float) this.A);
        }
        return this.y && this.l.c().a && this.j.findViewById(R.id.f54680_resource_name_obfuscated_res_0x7f0b01bb) != null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i3 == i7 && i5 == i9) {
            return;
        }
        view.invalidateOutline();
    }

    @Override // defpackage.cpe
    public final void p() {
        synchronized (this) {
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.m = null;
            }
        }
        this.j.removeAllViews();
        this.j.setOnClickListener(null);
        this.t.removeAllViews();
        this.t.setOnClickListener(null);
        this.k.gI();
        setOnTouchListener(null);
        this.u.fc();
    }

    public final void q(View view, int i2) {
        tc tcVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == i2) {
            return;
        }
        if (w()) {
            layoutParams.width = i2;
            view.setLayoutParams(layoutParams);
            return;
        }
        th thVar = new th();
        thVar.d(this);
        if (i2 == 0) {
            thVar.f(R.id.f59420_resource_name_obfuscated_res_0x7f0b04f1, 7, R.id.keyboard_expression_header_middle_element_container, 6, 0);
            i2 = 0;
        } else {
            HashMap hashMap = thVar.b;
            Integer valueOf = Integer.valueOf((int) R.id.f59420_resource_name_obfuscated_res_0x7f0b04f1);
            if (hashMap.containsKey(valueOf) && (tcVar = (tc) thVar.b.get(valueOf)) != null) {
                td tdVar = tcVar.d;
                tdVar.w = -1;
                tdVar.x = -1;
                tdVar.L = 0;
                tdVar.S = Integer.MIN_VALUE;
            }
        }
        thVar.b(R.id.f59420_resource_name_obfuscated_res_0x7f0b04f1).d.d = i2;
        thVar.c(this);
        this.k.L();
    }

    @Override // defpackage.cpe
    public final void r(cpf cpfVar) {
        this.l = cpfVar;
        cpf cpfVar2 = this.l;
        RecyclerView recyclerView = this.k;
        Objects.requireNonNull(recyclerView);
        this.u = new cor(this, cpfVar2, new byi(recyclerView, 17), !w());
        this.v = new cpa(this, this.l, this.t);
        this.k.aa(this.u);
    }

    public final void s(View view) {
        int width = (((getWidth() - this.o) - this.p) - findViewById(R.id.f59400_resource_name_obfuscated_res_0x7f0b04ef).getWidth()) - this.r;
        q(view, width);
        Resources resources = getContext().getResources();
        RecyclerView recyclerView = this.k;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f37100_resource_name_obfuscated_res_0x7f070322);
        q(recyclerView, ((width - (dimensionPixelSize + dimensionPixelSize)) - resources.getDimensionPixelSize(R.dimen.f37140_resource_name_obfuscated_res_0x7f070326)) - resources.getDimensionPixelSize(R.dimen.f37130_resource_name_obfuscated_res_0x7f070325));
    }

    @Override // defpackage.cpe
    public final void t(boolean z) {
        View view;
        if (itb.k() && (view = this.x) != null) {
            view.setElevation(z ? this.B : 0.0f);
        }
    }

    @Override // defpackage.cpe
    public final void u(int i2) {
        this.k.ae(i2);
    }

    public final void v(coq coqVar) {
        View y;
        ViewGroup viewGroup = this.j;
        viewGroup.setVisibility(coqVar == null ? 8 : 0);
        viewGroup.removeAllViews();
        if (coqVar == null) {
            return;
        }
        col colVar = col.UNSPECIFIED;
        int ordinal = coqVar.a.ordinal();
        if (ordinal == 4) {
            com comVar = coqVar.d;
            if (comVar == null) {
                ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "updateStartEdgeView", 319, "ConstraintHeaderViewImpl.java")).w("Element of type %s doesn't have required field set.", coqVar.a);
                return;
            }
            Resources resources = getResources();
            Drawable drawable = resources.getDrawable(comVar.a);
            String string = !TextUtils.isEmpty(comVar.b) ? comVar.b : resources.getString(comVar.c);
            ViewGroup viewGroup2 = this.j;
            if (!B(this.l.c())) {
                y = y(this, R.layout.f134360_resource_name_obfuscated_res_0x7f0e0095);
            } else {
                y = y(this, R.layout.f134350_resource_name_obfuscated_res_0x7f0e0094);
            }
            ImageView imageView = (ImageView) y.findViewById(R.id.f54560_resource_name_obfuscated_res_0x7f0b01af);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(string);
            viewGroup2.addView(y);
            q(viewGroup2, this.q);
        } else if (ordinal == 5) {
            A(viewGroup, coqVar, new byi(this, 15));
        } else if (ordinal == 6) {
            A(viewGroup, coqVar, new byi(this, 16));
        } else {
            ((luc) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "updateStartEdgeView", 338, "ConstraintHeaderViewImpl.java")).w("Received edge element of unsupported type %s", coqVar.a);
        }
        viewGroup.setOnClickListener(new bsx(this, coqVar, 9));
    }

    public final boolean w() {
        return findViewById(R.id.f59400_resource_name_obfuscated_res_0x7f0b04ef) != null;
    }

    @Override // defpackage.cpe
    public final boolean x(cox coxVar) {
        boolean z;
        boolean z2;
        if (coxVar == cox.a) {
            z = this.u.x(-1);
            z2 = this.v.b(-1);
        } else if (coxVar.b == cow.MIDDLE) {
            z2 = this.v.b(-1);
            boolean x = this.u.x(coxVar.c);
            int i2 = this.l.c().c;
            if (i2 != -1 && coxVar.c > i2 && this.j.findViewById(R.id.f54680_resource_name_obfuscated_res_0x7f0b01bb) != null && !w()) {
                l();
            }
            z = x;
        } else if (coxVar.b == cow.END) {
            z2 = this.v.b(coxVar.c);
            z = this.u.x(-1);
        } else {
            ((luc) ((luc) i.c()).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "setSelectedElement", 235, "ConstraintHeaderViewImpl.java")).t("setSelectElement(): invalid position group.");
            z = false;
            z2 = false;
        }
        return z || z2;
    }
}

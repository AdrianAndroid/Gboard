package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SoftKeyView extends FrameLayout {
    private static final lug g = hin.a;
    public jdq a;
    @ViewDebug.ExportedProperty(category = "ime", deepExport = true, prefix = "skd_")
    public ict b;
    public boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final int h;
    private ViewGroup i;
    private CopyOnWriteArrayList j;
    private gqc k;
    private boolean l;
    private boolean m;
    private float n;
    private boolean o;
    private boolean p;
    private boolean q;
    private final qo r;
    private jdr s;

    public SoftKeyView(Context context) {
        this(context, null);
    }

    private static int a(int i) {
        return i == 0 ? R.id.f56210_resource_name_obfuscated_res_0x7f0b0265 : i;
    }

    private static int p(int i) {
        return i == 0 ? R.id.f65200_resource_name_obfuscated_res_0x7f0b0745 : i;
    }

    private static void q(ViewGroup viewGroup, float f) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setPadding(childAt.getPaddingLeft(), (int) (childAt.getPaddingTop() * f), childAt.getPaddingRight(), (int) (childAt.getPaddingBottom() * f));
            if (childAt instanceof ViewGroup) {
                q((ViewGroup) childAt, f);
            } else if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, textView.getTextSize() * f);
            }
        }
    }

    private final void r() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
    }

    private final void s() {
        setVisibility(0);
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (this.b.e != 0) {
            try {
                View.inflate(getContext(), this.b.e, b());
                if (this.b != null) {
                    float f = this.n;
                    if (f < 1.0f) {
                        q(b(), f);
                    }
                }
                this.o = false;
                v();
                w(true);
            } catch (InflateException e) {
                throw new InflateException("Failed to inflate SoftKeyView: ".concat(String.valueOf(String.valueOf(this.b))), e);
            }
        } else {
            b().removeAllViews();
            getContext();
            ((luc) ((luc) g.c()).k("com/google/android/libraries/inputmethod/widgets/SoftKeyView", "initView", 411, "SoftKeyView.java")).w("The layout id is 0 for SoftKeyDef %s", jbi.i(this.b.c));
        }
        u();
    }

    private final void t() {
        setEnabled(false);
        setClickable(false);
        setLongClickable(false);
        setSelected(false);
        for (hjr hjrVar : this.r.values()) {
            hjrVar.r();
        }
        this.r.clear();
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setEnabled(false);
            this.i.setSelected(false);
            this.i.removeAllViews();
        } else {
            removeAllViews();
        }
        setContentDescription(null);
    }

    private final void u() {
        String str;
        CharSequence[] charSequenceArr;
        CharSequence charSequence;
        ict ictVar = this.b;
        String str2 = null;
        if (ictVar == null || (str = ictVar.t) == null) {
            str = null;
        }
        int i = 2;
        if (str != null) {
            if (true != str.isEmpty()) {
                i = 1;
            }
            aad.U(this, i);
            setContentDescription(str);
            this.q = str.isEmpty();
            return;
        }
        if (ictVar != null && (charSequenceArr = ictVar.n) != null && charSequenceArr.length > 0 && (charSequence = charSequenceArr[0]) != null) {
            str2 = charSequence.toString();
        }
        if (TextUtils.isEmpty(str2)) {
            aad.U(this, 2);
            setContentDescription("");
            this.q = true;
            return;
        }
        aad.U(this, 1);
        this.q = false;
    }

    private final void v() {
        ict ictVar = this.b;
        Object[] objArr = ictVar.p;
        int[] iArr = ictVar.q;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            ImageView imageView = (ImageView) findViewById(a(iArr[i]));
            Object obj = objArr[i];
            if (imageView != null) {
                hjr hjrVar = (hjr) this.r.get(imageView);
                if (hjrVar == null) {
                    hjrVar = new hjr(imageView);
                    this.r.put(imageView, hjrVar);
                }
                if (obj instanceof Integer) {
                    int intValue = ((Integer) obj).intValue();
                    if (intValue != 0) {
                        hjrVar.u(intValue, true);
                        imageView.setImageAlpha(this.b.u);
                        imageView.setVisibility(0);
                        aad.U(imageView, 2);
                    }
                    imageView.setVisibility(8);
                } else {
                    if (obj instanceof Bitmap) {
                        hjrVar.s();
                        ((ImageView) hjrVar.a).setImageBitmap((Bitmap) obj);
                    } else if (obj instanceof Drawable) {
                        hjrVar.k((Drawable) obj);
                    } else {
                        if (obj instanceof ats) {
                            ((ats) obj).s(hjrVar);
                        }
                        imageView.setVisibility(8);
                    }
                    imageView.setImageAlpha(this.b.u);
                    imageView.setVisibility(0);
                    aad.U(imageView, 2);
                }
            }
        }
        ict ictVar2 = this.b;
        CharSequence[] charSequenceArr = ictVar2.n;
        int[] iArr2 = ictVar2.o;
        int length2 = charSequenceArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            View findViewById = findViewById(p(iArr2[i2]));
            CharSequence charSequence = charSequenceArr[i2];
            if (findViewById != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    if (findViewById instanceof TextView) {
                        ((TextView) findViewById).setText(charSequence);
                    } else if (findViewById instanceof EmojiView) {
                        ((EmojiView) findViewById).d(hei.a(charSequence.toString()));
                    }
                    findViewById.setVisibility(0);
                } else {
                    findViewById.setVisibility(8);
                }
                aad.U(findViewById, 2);
            }
        }
    }

    private final void w(boolean z) {
        boolean z2 = this.l;
        ict ictVar = this.b;
        boolean z3 = false;
        this.l = ictVar != null && ictVar.e();
        if (ictVar != null) {
            if (!ictVar.f(iah.LONG_PRESS)) {
                ict ictVar2 = this.b;
                for (iah iahVar : iah.values()) {
                    ial b = ictVar2.b(iahVar);
                    if (b == null || !b.f) {
                    }
                }
            }
            z3 = true;
            break;
        }
        this.m = z3;
        if (z || z2 != this.l) {
            setEnabled(true);
            h();
            ViewGroup viewGroup = this.i;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(this.l);
        }
    }

    public final ViewGroup b() {
        ViewGroup viewGroup = this.i;
        return viewGroup != null ? viewGroup : this;
    }

    public final ial c(iah iahVar) {
        ict ictVar = this.b;
        if (ictVar == null) {
            return null;
        }
        return ictVar.b(iahVar);
    }

    public final ial d(iah iahVar) {
        ict ictVar = this.b;
        if (ictVar == null) {
            return null;
        }
        return ictVar.c(iahVar);
    }

    public final iay e() {
        ial b;
        ict ictVar = this.b;
        if (ictVar == null || (b = ictVar.b(iah.PRESS)) == null) {
            return null;
        }
        return b.d();
    }

    public final void f(jdp jdpVar) {
        if (this.j == null) {
            this.j = new CopyOnWriteArrayList();
        }
        this.j.add(jdpVar);
    }

    public final void g(jdp jdpVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(jdpVar);
            if (!this.j.isEmpty()) {
                return;
            }
            this.j = null;
        }
    }

    @Override // android.view.View
    public final CharSequence getContentDescription() {
        l();
        return super.getContentDescription();
    }

    public final void h() {
        setClickable(this.l);
        setLongClickable(this.m);
    }

    public final void i(gqc gqcVar) {
        if (gqcVar == null) {
            gqcVar = gqc.b;
        }
        this.k = gqcVar;
    }

    public final void j(jdr jdrVar) {
        setOnTouchListener(jdrVar);
        setOnClickListener(jdrVar);
        setOnLongClickListener(jdrVar);
        setOnHoverListener(jdrVar);
        jdr jdrVar2 = this.s;
        if (jdrVar2 != null) {
            removeOnLayoutChangeListener(jdrVar2);
        }
        if (jdrVar != null) {
            addOnLayoutChangeListener(jdrVar);
        }
        this.s = jdrVar;
    }

    public final void k(float f) {
        if (f != this.n) {
            this.n = f;
            this.o = true;
        }
    }

    public final void l() {
        CharSequence charSequence;
        String str;
        CharSequence[] charSequenceArr;
        if (this.q) {
            return;
        }
        ict ictVar = this.b;
        String str2 = null;
        if (ictVar == null || (charSequenceArr = ictVar.n) == null || charSequenceArr.length <= 0 || (charSequence = charSequenceArr[0]) == null) {
            charSequence = null;
        }
        if (ictVar != null && (str = ictVar.t) != null) {
            str2 = str;
        }
        setContentDescription(this.k.b(charSequence, str2));
        this.q = true;
    }

    public final void m(int i, CharSequence charSequence) {
        View findViewById = findViewById(i);
        if (findViewById instanceof TextView) {
            TextView textView = (TextView) findViewById;
            if (TextUtils.equals(textView.getText(), charSequence)) {
                return;
            }
            textView.setText(charSequence);
        } else if (!(findViewById instanceof EmojiView)) {
        } else {
            EmojiView emojiView = (EmojiView) findViewById;
            if (TextUtils.equals(emojiView.a(), charSequence)) {
                return;
            }
            emojiView.d(hei.a(charSequence.toString()));
        }
    }

    public final void n(ict ictVar) {
        ict ictVar2 = this.b;
        if (ictVar == ictVar2) {
            return;
        }
        if (ictVar == null || ictVar.c == R.id.f85450_resource_name_obfuscated_res_0x7f0b0f9b) {
            t();
            setVisibility(this.h);
            ViewGroup viewGroup = this.i;
            if (viewGroup != null) {
                viewGroup.setVisibility(this.h);
            }
            this.b = null;
        } else if (ictVar2 == null || ictVar2.e != ictVar.e || this.o) {
            t();
            this.b = ictVar;
            s();
        } else {
            this.b = ictVar;
            v();
            w(false);
            u();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((jdp) it.next()).b(this);
        }
    }

    public final void o() {
        this.c = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((jdp) it.next()).a(this);
            }
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jdq jdqVar = this.a;
        if (jdqVar != null) {
            jdqVar.a(this);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            this.i = (ViewGroup) findViewById(R.id.host);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ict ictVar;
        boolean z = false;
        if (this.k.p() && (ictVar = this.b) != null) {
            ial b = ictVar.b(iah.PRESS);
            iay d = b != null ? b.d() : null;
            if (d != null && !iaz.g(d.c)) {
                z = true;
            }
        }
        this.p = z;
        l();
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("com.android.inputmethod.keyboard.Key");
        if (this.p && !TextUtils.isEmpty(accessibilityEvent.getContentDescription())) {
            accessibilityEvent.setContentDescription(getContext().getString(R.string.f150430_resource_name_obfuscated_res_0x7f14019e));
        }
        if (accessibilityEvent.getEventType() == 32768) {
            accessibilityEvent.setEnabled(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.p && !TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription())) {
            accessibilityNodeInfo.setContentDescription(getContext().getString(R.string.f150430_resource_name_obfuscated_res_0x7f14019e));
        }
        accessibilityNodeInfo.setEnabled(true);
        ict ictVar = this.b;
        if ((ictVar == null || !ictVar.k) && this.k.q()) {
            abj b = abj.b(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 29) {
                b.b.setTextEntryKey(true);
            } else {
                b.f(8, true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((jdp) it.next()).c(this);
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.k.q()) {
            if (i == 64) {
                sendAccessibilityEvent(32768);
                return true;
            } else if (i == 128) {
                sendAccessibilityEvent(65536);
                return true;
            }
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEvent(int i) {
        if (!this.k.q()) {
            if (i == 128) {
                setClickable(false);
                setLongClickable(false);
            } else if (i == 256) {
                h();
                i = 256;
            }
        }
        if (i == 4 || i == 8) {
            return;
        }
        super.sendAccessibilityEvent(i);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        ict ictVar = this.b;
        if (ictVar != null) {
            for (int i : ictVar.q) {
                ImageView imageView = (ImageView) findViewById(a(i));
                if (imageView != null) {
                    imageView.setEnabled(z);
                }
            }
            for (int i2 : this.b.o) {
                View findViewById = findViewById(p(i2));
                if (findViewById != null) {
                    findViewById.setEnabled(z);
                }
            }
        }
    }

    public SoftKeyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SoftKeyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = gqc.b;
        this.c = false;
        this.n = 1.0f;
        this.p = false;
        this.r = new qo();
        this.h = attributeSet != null ? getVisibility() : 4;
        r();
        if (attributeSet == null) {
            this.d = false;
            this.e = false;
            this.f = false;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jdl.e);
        this.d = obtainStyledAttributes.getBoolean(2, false);
        this.e = obtainStyledAttributes.getBoolean(0, false);
        this.f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    public SoftKeyView(Context context, boolean z, int i) {
        super(context, null, 0);
        this.k = gqc.b;
        this.c = false;
        this.n = 1.0f;
        this.p = false;
        this.r = new qo();
        this.h = 4;
        r();
        this.d = z;
        this.e = false;
        this.f = false;
        ico d = ict.d();
        d.n = i;
        this.b = d.c();
    }
}

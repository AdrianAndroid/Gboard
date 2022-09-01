package com.google.android.libraries.inputmethod.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PageableEmojiListHolderView extends FrameLayout implements her {
    protected final Context a;
    protected final heu b;
    public final int c;
    public final ViewPager2 d;
    public List e;
    public int f;
    public final int g;
    public int h;
    public hej i;
    public int j;
    public LayoutInflater k;
    public boolean l;
    private final boolean m;
    private heq n;

    public PageableEmojiListHolderView(Context context) {
        this(context, null);
    }

    @Override // defpackage.her
    public final void a(boolean z) {
        ViewPager2 viewPager2 = this.d;
        viewPager2.j = z;
        viewPager2.m.o();
    }

    @Override // defpackage.heq
    public final int c() {
        return this.f * this.j;
    }

    @Override // defpackage.heq
    public final void f(hej hejVar) {
        this.i = hejVar;
    }

    @Override // defpackage.heq
    public final void g(List list) {
        if (this.e != list) {
            this.e = list;
            int i = 0;
            this.h = 0;
            if (list == null) {
                list = llp.q();
            }
            if (this.n == null) {
                this.n = (heq) View.inflate(this.a, this.c, null);
            }
            heq heqVar = this.n;
            if (list != null && !list.isEmpty()) {
                this.j = heqVar.c();
                int size = list.size();
                int i2 = this.j;
                i = ((size + i2) - 1) / i2;
            }
            this.f = i;
            this.b.fc();
            ViewPager2 viewPager2 = this.d;
            int i3 = this.h;
            viewPager2.g();
            viewPager2.h(i3);
        }
    }

    @Override // defpackage.heq
    public final void h(boolean z) {
        this.l = z;
    }

    @Override // defpackage.heq
    public final void i(LayoutInflater layoutInflater) {
        this.k = layoutInflater;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m) {
            g(null);
        }
    }

    public PageableEmojiListHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        heu heuVar = new heu(this);
        this.b = heuVar;
        this.l = true;
        if (attributeSet != null) {
            this.a = context;
            LayoutInflater from = LayoutInflater.from(context);
            this.k = from;
            ViewPager2 viewPager2 = (ViewPager2) from.inflate(R.layout.f134160_resource_name_obfuscated_res_0x7f0e0081, (ViewGroup) this, false);
            this.d = viewPager2;
            addView(viewPager2);
            int attributeIntValue = attributeSet.getAttributeIntValue(null, "offscreen_page_limit", -1);
            if (attributeIntValue > 0 || attributeIntValue == -1) {
                viewPager2.k = attributeIntValue;
                viewPager2.f.requestLayout();
                int attributeIntValue2 = attributeSet.getAttributeIntValue(null, "page_margin_ratio", -1);
                this.g = attributeIntValue2;
                if (attributeIntValue2 > 0) {
                    opu opuVar = new opu(this);
                    if (!viewPager2.i) {
                        lv lvVar = viewPager2.f.B;
                        viewPager2.i = true;
                    }
                    viewPager2.f.aw();
                    alr alrVar = viewPager2.h;
                    if (opuVar != alrVar.a) {
                        alrVar.a = opuVar;
                        if (alrVar.a != null) {
                            double d = viewPager2.g.d();
                            int i = (int) d;
                            double d2 = i;
                            Double.isNaN(d2);
                            float f = (float) (d - d2);
                            viewPager2.h.f(i, f, Math.round(viewPager2.b() * f));
                        }
                    }
                }
                int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "page_layout", 0);
                this.c = attributeResourceValue;
                if (attributeResourceValue == 0) {
                    throw new IllegalArgumentException("SubView must have a valid layout id.");
                }
                this.m = jgd.o(context, attributeSet, null, "clear_on_detach", false);
                ls lsVar = viewPager2.f.l;
                viewPager2.m.f(lsVar);
                if (lsVar != null) {
                    lsVar.hn(viewPager2.l);
                }
                viewPager2.f.aa(heuVar);
                viewPager2.c = 0;
                viewPager2.d();
                viewPager2.m.e(heuVar);
                heuVar.hm(viewPager2.l);
                viewPager2.b.h(new het(this));
                return;
            }
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        throw new IllegalArgumentException("PageableSoftKeyListHolder needs attributes.");
    }
}

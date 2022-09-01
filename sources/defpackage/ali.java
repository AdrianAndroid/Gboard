package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* renamed from: ali  reason: default package */
/* loaded from: classes.dex */
public final class ali extends yd {
    final /* synthetic */ ViewPager a;

    public ali(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        ald aldVar = this.a.b;
        return aldVar != null && aldVar.a() > 1;
    }

    @Override // defpackage.yd
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        ald aldVar;
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() != 4096 || (aldVar = this.a.b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(aldVar.a());
        accessibilityEvent.setFromIndex(this.a.c);
        accessibilityEvent.setToIndex(this.a.c);
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        super.b(view, abjVar);
        abjVar.h("androidx.viewpager.widget.ViewPager");
        abjVar.l(j());
        if (this.a.canScrollHorizontally(1)) {
            abjVar.d(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            abjVar.d(8192);
        }
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        if (super.h(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.a.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager = this.a;
            viewPager.l(viewPager.c - 1);
            return true;
        } else if (!this.a.canScrollHorizontally(1)) {
            return false;
        } else {
            ViewPager viewPager2 = this.a;
            viewPager2.l(viewPager2.c + 1);
            return true;
        }
    }
}

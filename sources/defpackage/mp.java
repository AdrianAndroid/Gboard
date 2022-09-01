package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: mp  reason: default package */
/* loaded from: classes2.dex */
public final class mp extends yd {
    final mq a;
    public final Map b = new WeakHashMap();

    public mp(mq mqVar) {
        this.a = mqVar;
    }

    @Override // defpackage.yd
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            ydVar.a(view, accessibilityEvent);
        } else {
            super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        ly lyVar;
        if (this.a.k() || (lyVar = this.a.a.m) == null) {
            super.b(view, abjVar);
            return;
        }
        lyVar.aP(view, abjVar);
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            ydVar.b(view, abjVar);
        } else {
            super.b(view, abjVar);
        }
    }

    @Override // defpackage.yd
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            ydVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.yd
    public final void d(View view, int i) {
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            ydVar.d(view, i);
        } else {
            super.d(view, i);
        }
    }

    @Override // defpackage.yd
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            ydVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.yd
    public final boolean f(View view, AccessibilityEvent accessibilityEvent) {
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            return ydVar.f(view, accessibilityEvent);
        }
        return super.f(view, accessibilityEvent);
    }

    @Override // defpackage.yd
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        yd ydVar = (yd) this.b.get(viewGroup);
        if (ydVar != null) {
            return ydVar.g(viewGroup, view, accessibilityEvent);
        }
        return super.g(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        if (this.a.k() || this.a.a.m == null) {
            return super.h(view, i, bundle);
        }
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            if (ydVar.h(view, i, bundle)) {
                return true;
            }
        } else if (super.h(view, i, bundle)) {
            return true;
        }
        ly lyVar = this.a.a.m;
        RecyclerView recyclerView = lyVar.s;
        me meVar = recyclerView.e;
        ml mlVar = recyclerView.J;
        return lyVar.bv(view, i);
    }

    @Override // defpackage.yd
    public final aqq i(View view) {
        yd ydVar = (yd) this.b.get(view);
        if (ydVar != null) {
            return ydVar.i(view);
        }
        return super.i(view);
    }
}

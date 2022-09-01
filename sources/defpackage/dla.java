package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: dla  reason: default package */
/* loaded from: classes.dex */
public final class dla extends ListView implements AbsListView.RecyclerListener {
    public final int a;
    public int b;
    public int c;
    public int e;
    public final deb f;
    public final dfj i;
    private final dfk k;
    public final List g = new ArrayList();
    public int h = -1;
    public int d = 6;
    public final dkz j = new dkz(this);

    public dla(Context context, deb debVar, int i, int i2, int i3) {
        super(context);
        this.e = i2;
        this.a = i;
        this.b = i3;
        this.f = debVar;
        this.i = new dfj(debVar);
        dfk dfkVar = new dfk(context);
        this.k = dfkVar;
        dfkVar.a = 2;
        setRecyclerListener(this);
    }

    public final SoftKeyView a(List list) {
        SoftKeyView softKeyView = null;
        if (this.c == 0) {
            return null;
        }
        this.g.addAll(list);
        dfj dfjVar = this.i;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.b;
        dfjVar.b = i;
        dfjVar.c = i2;
        dfjVar.d();
        dfjVar.g.b(dfjVar.b, dfjVar.c, i3);
        for (hln hlnVar : this.g) {
            dfj dfjVar2 = this.i;
            int i4 = dfjVar2.d;
            dfjVar2.d = i4 + 1;
            SoftKeyView g = dfjVar2.a.g(i4, hlnVar);
            if (!dfjVar2.g.c(g)) {
                dfjVar2.e();
                dfjVar2.g.c(g);
            }
            softKeyView = g;
        }
        this.i.e();
        this.j.notifyDataSetChanged();
        if (getAdapter() == null) {
            setAdapter((ListAdapter) this.j);
        }
        requestLayout();
        return softKeyView;
    }

    public final llp b() {
        llk e = llp.e();
        for (int i = 0; i < this.i.a(); i++) {
            int b = this.i.b(i);
            e.h(llp.o(this.g.subList(b, this.i.c(i) + b)));
        }
        return e.g();
    }

    public final void c() {
        this.g.clear();
        this.h = -1;
        setAdapter((ListAdapter) null);
        if (this.c != 0) {
            this.i.d();
        }
    }

    public final void d(int i) {
        int i2;
        this.h = i;
        this.j.notifyDataSetChanged();
        dfj dfjVar = this.i;
        if (i < 0 || i >= dfjVar.e.size()) {
            i2 = -1;
        } else {
            i2 = Collections.binarySearch(dfjVar.f, Integer.valueOf(i));
            if (i2 < 0) {
                i2 = (-i2) - 2;
            }
        }
        if (i2 != -1) {
            setSelection(i2);
        } else {
            setSelectionAfterHeaderView();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return ScrollView.class.getName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getAccessibilityClassName());
        accessibilityEvent.setCurrentItemIndex(-1);
        accessibilityEvent.setItemCount(-1);
        accessibilityEvent.setFromIndex(-1);
        accessibilityEvent.setToIndex(-1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCollectionInfo(null);
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public final void onMovedToScrapHeap(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            this.f.k((SoftKeyView) linearLayout.getChildAt(i));
        }
        linearLayout.removeAllViews();
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.k.a(motionEvent);
        return onTouchEvent;
    }
}

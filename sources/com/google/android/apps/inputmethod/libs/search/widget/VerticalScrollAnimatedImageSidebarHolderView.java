package com.google.android.apps.inputmethod.libs.search.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VerticalScrollAnimatedImageSidebarHolderView extends ekx {
    public final boolean ah;
    private final int ai;
    private StaggeredGridLayoutManager aj;
    private int ak = 1;

    public VerticalScrollAnimatedImageSidebarHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Throwable th;
        TypedArray typedArray;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, ele.d);
            try {
                this.ai = typedArray.getInt(2, -1);
                typedArray.getInt(0, -1);
                this.ah = typedArray.getBoolean(1, false);
                if (typedArray == null) {
                    return;
                }
                typedArray.recycle();
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ekt
    public final ly a() {
        if (this.aj == null) {
            this.aj = new StaggeredGridLayoutManager(this.ai);
        }
        return this.aj;
    }

    @Override // defpackage.ekt
    public final void aF() {
        eks eksVar = (eks) this.l;
        if (this.p) {
            scrollBy(0, Integer.MIN_VALUE);
        }
        if (eksVar != null) {
            eksVar.C();
        }
    }

    @Override // defpackage.ekx
    public final void aM() {
        if (this.ak != 1) {
            this.ak = 1;
            ab(a());
        }
        aa(new elp(this));
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ab(ly lyVar) {
        super.ab(lyVar);
        this.e.q().j();
    }
}

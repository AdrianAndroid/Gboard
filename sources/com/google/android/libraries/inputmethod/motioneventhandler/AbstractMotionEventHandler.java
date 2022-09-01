package com.google.android.libraries.inputmethod.motioneventhandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractMotionEventHandler implements igx {
    protected final Context k;
    public final igy l;

    public AbstractMotionEventHandler(Context context, igy igyVar) {
        this.k = context;
        this.l = igyVar;
    }

    @Override // defpackage.igx
    public boolean A(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.igx
    public boolean B(MotionEvent motionEvent) {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.igx
    public void e() {
    }

    @Override // defpackage.igx
    public void g() {
    }

    @Override // defpackage.igx
    public void gP(long j, long j2) {
    }

    @Override // defpackage.igx
    public void gQ(EditorInfo editorInfo) {
    }

    @Override // defpackage.igx
    public /* synthetic */ boolean gR() {
        return false;
    }

    @Override // defpackage.igx
    public void j() {
    }

    @Override // defpackage.igx
    public void k(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.igx
    public void m() {
    }

    @Override // defpackage.igx
    public void n(SoftKeyboardView softKeyboardView) {
    }

    public final int x() {
        return icu.b(this.l.b());
    }

    @Override // defpackage.igx
    public final void y() {
    }

    @Override // defpackage.igx
    public void z(MotionEvent motionEvent) {
    }
}

package com.google.android.libraries.inputmethod.keyboard.impl;

import android.content.Context;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractKeyboard implements hsy {
    protected final ibz s;
    public final ino t;
    public final Context u;
    public final hsz v;
    public final ibm w;
    public final iav x;
    public long y;
    private final List fa = new ArrayList();
    public boolean z = true;

    public AbstractKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        this.u = context;
        this.v = hszVar;
        this.t = ino.M(context);
        this.w = ibmVar;
        this.x = iavVar;
        this.s = ibzVar;
    }

    @Override // defpackage.hsy
    public /* synthetic */ boolean C(hln hlnVar, boolean z) {
        return false;
    }

    @Override // defpackage.hsy
    public void J() {
    }

    @Override // defpackage.hsy
    public final void Z(hfh hfhVar) {
        this.fa.add(hfhVar);
    }

    @Override // defpackage.hsy
    public final void ad(hfh hfhVar) {
        this.fa.remove(hfhVar);
    }

    @Override // defpackage.hsy
    public final void ae(long j) {
        this.y = j;
    }

    @Override // defpackage.hsy
    public final void ag() {
        this.z = false;
    }

    public boolean c(hfd hfdVar) {
        for (hfh hfhVar : this.fa) {
            if (hfhVar.c(hfdVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.hsy
    public void fu(int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gqc fx() {
        return this.v.h();
    }

    @Override // defpackage.hsy
    public /* synthetic */ void s(CursorAnchorInfo cursorAnchorInfo, int[] iArr) {
    }
}

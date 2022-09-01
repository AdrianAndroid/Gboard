package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: dp  reason: default package */
/* loaded from: classes.dex */
public final class dp {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public gm h;
    gi i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public dp(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(gm gmVar) {
        gi giVar;
        gm gmVar2 = this.h;
        if (gmVar == gmVar2) {
            return;
        }
        if (gmVar2 != null) {
            gmVar2.m(this.i);
        }
        this.h = gmVar;
        if (gmVar == null || (giVar = this.i) == null) {
            return;
        }
        gmVar.g(giVar);
    }
}

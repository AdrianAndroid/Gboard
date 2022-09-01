package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: dlk  reason: default package */
/* loaded from: classes.dex */
final class dlk implements imn {
    final /* synthetic */ dlq a;

    public dlk(dlq dlqVar) {
        this.a = dlqVar;
    }

    @Override // defpackage.imn
    public final View a(int i) {
        return b(this.a.b, i);
    }

    @Override // defpackage.imn
    public final View b(Context context, int i) {
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
    }

    @Override // defpackage.imn
    public final void c(View view, Animator animator, boolean z) {
    }

    @Override // defpackage.imn
    public final /* synthetic */ void d(View view, Animator animator, boolean z) {
    }

    @Override // defpackage.imn
    public final void e(View view, View view2, int i, int i2, int i3, Animator animator) {
    }

    @Override // defpackage.imn
    public final boolean f(View view) {
        return false;
    }
}

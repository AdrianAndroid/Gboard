package defpackage;

import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;

/* compiled from: PG */
/* renamed from: ddy  reason: default package */
/* loaded from: classes.dex */
public final class ddy implements alj {
    final /* synthetic */ BidiViewPager a;
    private final alj b;

    public ddy(BidiViewPager bidiViewPager, alj aljVar) {
        this.a = bidiViewPager;
        this.b = aljVar;
    }

    @Override // defpackage.alj
    public final void a(int i) {
        this.b.a(i);
    }

    @Override // defpackage.alj
    public final void b(int i, float f, int i2) {
        this.b.b(this.a.v(i), f, i2);
    }

    @Override // defpackage.alj
    public final void c(int i) {
        this.b.c(this.a.v(i));
    }
}

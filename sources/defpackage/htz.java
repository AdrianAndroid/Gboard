package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: htz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class htz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ CharSequence g;
    public final /* synthetic */ CharSequence h;
    private final /* synthetic */ int i;

    public /* synthetic */ htz(hmd hmdVar, int i, int i2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, int i3) {
        this.i = i3;
        this.e = hmdVar;
        this.a = i;
        this.b = i2;
        this.f = charSequence;
        this.d = charSequence2;
        this.c = charSequence3;
        this.g = charSequence4;
        this.h = charSequence5;
    }

    public /* synthetic */ htz(hua huaVar, hte hteVar, View view, View view2, String str, int i, String str2, int i2, int i3) {
        this.i = i3;
        this.c = huaVar;
        this.d = hteVar;
        this.e = view;
        this.f = view2;
        this.g = str;
        this.a = i;
        this.h = str2;
        this.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.i == 0) {
            Object obj = this.c;
            ?? r1 = this.d;
            Object obj2 = this.e;
            Object obj3 = this.f;
            CharSequence charSequence = this.g;
            int i = this.a;
            CharSequence charSequence2 = this.h;
            int i2 = this.b;
            r1.b();
            hua huaVar = (hua) obj;
            huaVar.a = r1;
            String str = (String) charSequence;
            View view = (View) obj3;
            View view2 = (View) obj2;
            r1.c(view2, view, str, i, (String) charSequence2, i2, huaVar.c);
            return;
        }
        Object obj4 = this.e;
        ((hmd) obj4).a.hu(this.a, this.b, this.f, this.d, this.c, this.g, this.h);
    }
}
